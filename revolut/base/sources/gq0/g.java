package gq0;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.HorizontalStepsProgressView;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pair f145496a;

    private g() {
    }

    public static void a(View view, AccessibilityNodeInfo accessibilityNodeInfo, float f, float f4, float f5, int i, boolean z) {
        accessibilityNodeInfo.setClassName("android.widget.ProgressBar");
        int i2 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.setRangeInfo(i2 >= 30 ? com.google.android.material.color.a.n(f, f4, f5, i) : AccessibilityNodeInfo.RangeInfo.obtain(i, f, f4, f5));
        if (i2 < 30 || view.getStateDescription() != null) {
            return;
        }
        float f6 = f4 - f;
        if (f6 < BitmapDescriptorFactory.HUE_RED) {
            f6 = 0.0f;
        }
        float f32 = (f5 - f) / f6;
        if (Math.abs(f32) > Float.MAX_VALUE) {
            f32 = 0.0f;
        }
        if (!z) {
            f32 = kotlin.ranges.f.f(f32, BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
        double d = f32;
        Locale locale = view.getContext().getResources().getConfiguration().getLocales().get(0);
        Intrinsics.checkNotNullExpressionValue(locale, "get(...)");
        Pair pair = f145496a;
        if (pair == null || !Intrinsics.f(locale, pair.f186385a)) {
            Pair pair2 = new Pair(locale, NumberFormat.getPercentInstance(locale));
            f145496a = pair2;
            pair = pair2;
        }
        String str = ((NumberFormat) pair.f186386b).format(d);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        accessibilityNodeInfo.setStateDescription(str);
    }

    public static void b(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        info.setClassName("android.widget.Button");
    }

    public static void c(AccessibilityNodeInfoCompat info, boolean z) {
        Intrinsics.checkNotNullParameter(info, "info");
        info.setClassName("android.widget.CheckBox");
        info.setCheckable(true);
        info.setChecked(z);
    }

    public static void d(HorizontalStepsProgressView host, AccessibilityNodeInfo info, float f, float f4) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        a(host, info, BitmapDescriptorFactory.HUE_RED, f, f4, 1, false);
    }

    public static void e(AccessibilityNodeInfoCompat info, boolean z, SpannableStringBuilder spannableStringBuilder) {
        Intrinsics.checkNotNullParameter(info, "info");
        info.setClassName("android.widget.RadioButton");
        info.setCheckable(true);
        info.setChecked(z);
        if (spannableStringBuilder != null) {
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, spannableStringBuilder));
        }
    }
}
