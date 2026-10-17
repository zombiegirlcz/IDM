package com.google.android.material.resources;

import a41.g0;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;

/* JADX INFO: loaded from: classes16.dex */
public class TypefaceUtils {
    private TypefaceUtils() {
    }

    public static Typeface maybeCopyWithFontWeightAdjustment(@NonNull Context context, @NonNull Typeface typeface) {
        return maybeCopyWithFontWeightAdjustment(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface maybeCopyWithFontWeightAdjustment(@NonNull Configuration configuration, @NonNull Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || g0.a(configuration) == Integer.MAX_VALUE || g0.a(configuration) == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, MathUtils.clamp(g0.a(configuration) + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }
}
