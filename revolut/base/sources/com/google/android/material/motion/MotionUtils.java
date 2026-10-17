package com.google.android.material.motion;

import a0.d;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.core.graphics.PathParser;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.resources.MaterialAttributes;
import j6.a;

/* JADX INFO: loaded from: classes.dex */
public class MotionUtils {
    private static final String EASING_TYPE_FORMAT_START = "(";
    private static final String EASING_TYPE_FORMAT_END = ")";
    private static final String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    private static final String EASING_TYPE_PATH = "path";

    private MotionUtils() {
    }

    private static float getLegacyControlPoint(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    private static String getLegacyEasingContent(String str, String str2) {
        return d.o(str, 1, str2.length() + 1);
    }

    private static TimeInterpolator getLegacyThemeInterpolator(String str) {
        if (!isLegacyEasingType(str, "cubic-bezier")) {
            if (isLegacyEasingType(str, "path")) {
                return PathInterpolatorCompat.create(PathParser.createPathFromPathData(getLegacyEasingContent(str, "path")));
            }
            throw new IllegalArgumentException(a.q("Invalid motion easing type: ", str));
        }
        String[] strArrSplit = getLegacyEasingContent(str, "cubic-bezier").split(",");
        if (strArrSplit.length == 4) {
            return PathInterpolatorCompat.create(getLegacyControlPoint(strArrSplit, 0), getLegacyControlPoint(strArrSplit, 1), getLegacyControlPoint(strArrSplit, 2), getLegacyControlPoint(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    private static boolean isLegacyEasingAttribute(String str) {
        return isLegacyEasingType(str, "cubic-bezier") || isLegacyEasingType(str, "path");
    }

    private static boolean isLegacyEasingType(String str, String str2) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str2);
        sb6.append("(");
        return str.startsWith(sb6.toString()) && str.endsWith(")");
    }

    public static int resolveThemeDuration(@NonNull Context context, int i, int i2) {
        return MaterialAttributes.resolveInteger(context, i, i2);
    }

    @NonNull
    public static TimeInterpolator resolveThemeInterpolator(@NonNull Context context, int i, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return isLegacyEasingAttribute(strValueOf) ? getLegacyThemeInterpolator(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }
}
