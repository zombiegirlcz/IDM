package uz;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import mx0.w5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class r {

    @NotNull
    private static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uu9.b f284548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f284549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f284550c;
    public final ValueAnimator d;
    public int e;

    public r(uu9.b onColorUpdated) {
        Intrinsics.checkNotNullParameter(onColorUpdated, "onColorUpdated");
        this.f284548a = onColorUpdated;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new w5(this, 16));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        this.d = valueAnimatorOfFloat;
    }
}
