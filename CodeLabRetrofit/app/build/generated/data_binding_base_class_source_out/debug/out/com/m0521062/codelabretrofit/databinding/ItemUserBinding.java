// Generated by view binder compiler. Do not edit!
package com.m0521062.codelabretrofit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.m0521062.codelabretrofit.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemUserBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cvUser;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvId;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvPhone;

  @NonNull
  public final TextView tvUsername;

  @NonNull
  public final TextView tvWeb;

  private ItemUserBinding(@NonNull CardView rootView, @NonNull CardView cvUser,
      @NonNull TextView tvEmail, @NonNull TextView tvId, @NonNull TextView tvName,
      @NonNull TextView tvPhone, @NonNull TextView tvUsername, @NonNull TextView tvWeb) {
    this.rootView = rootView;
    this.cvUser = cvUser;
    this.tvEmail = tvEmail;
    this.tvId = tvId;
    this.tvName = tvName;
    this.tvPhone = tvPhone;
    this.tvUsername = tvUsername;
    this.tvWeb = tvWeb;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cvUser = (CardView) rootView;

      id = R.id.tvEmail;
      TextView tvEmail = ViewBindings.findChildViewById(rootView, id);
      if (tvEmail == null) {
        break missingId;
      }

      id = R.id.tvId;
      TextView tvId = ViewBindings.findChildViewById(rootView, id);
      if (tvId == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tvPhone;
      TextView tvPhone = ViewBindings.findChildViewById(rootView, id);
      if (tvPhone == null) {
        break missingId;
      }

      id = R.id.tvUsername;
      TextView tvUsername = ViewBindings.findChildViewById(rootView, id);
      if (tvUsername == null) {
        break missingId;
      }

      id = R.id.tvWeb;
      TextView tvWeb = ViewBindings.findChildViewById(rootView, id);
      if (tvWeb == null) {
        break missingId;
      }

      return new ItemUserBinding((CardView) rootView, cvUser, tvEmail, tvId, tvName, tvPhone,
          tvUsername, tvWeb);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
