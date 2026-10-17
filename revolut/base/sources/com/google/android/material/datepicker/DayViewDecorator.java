package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class DayViewDecorator implements Parcelable {
    public ColorStateList getBackgroundColor(@NonNull Context context, int i, int i2, int i3, boolean z, boolean z3) {
        return null;
    }

    public Drawable getCompoundDrawableBottom(@NonNull Context context, int i, int i2, int i3, boolean z, boolean z3) {
        return null;
    }

    public Drawable getCompoundDrawableLeft(@NonNull Context context, int i, int i2, int i3, boolean z, boolean z3) {
        return null;
    }

    public Drawable getCompoundDrawableRight(@NonNull Context context, int i, int i2, int i3, boolean z, boolean z3) {
        return null;
    }

    public Drawable getCompoundDrawableTop(@NonNull Context context, int i, int i2, int i3, boolean z, boolean z3) {
        return null;
    }

    public CharSequence getContentDescription(@NonNull Context context, int i, int i2, int i3, boolean z, boolean z3, CharSequence charSequence) {
        return charSequence;
    }

    public ColorStateList getTextColor(@NonNull Context context, int i, int i2, int i3, boolean z, boolean z3) {
        return null;
    }

    public void initialize(@NonNull Context context) {
    }
}
