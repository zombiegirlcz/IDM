package enk;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearSmoothScroller;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends LinearSmoothScroller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127832a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, int i) {
        super(context);
        this.f127832a = i;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int calculateDtToFit(int i, int i2, int i3, int i5, int i6) {
        switch (this.f127832a) {
            case 1:
                int i21 = i5 - i2;
                if (i21 < 0) {
                    return i21 - ((i5 - i3) / 2);
                }
                return 0;
            case 2:
                int i22 = i5 - i2;
                if (i22 < 0) {
                    return i22 - ((i5 - i3) / 2);
                }
                return 0;
            default:
                return super.calculateDtToFit(i, i2, i3, i5, i6);
        }
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        switch (this.f127832a) {
            case 0:
                Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.calculateSpeedPerPixel(displayMetrics);
        }
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int getVerticalSnapPreference() {
        switch (this.f127832a) {
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        this.f127832a = 0;
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
