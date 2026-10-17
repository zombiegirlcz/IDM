package fu0;

import android.animation.ValueAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f138052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f138053b;

    public d(e eVar) {
        this.f138053b = eVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.f138052a || animation.getAnimatedFraction() <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.f138053b.invalidate();
        this.f138052a = true;
    }
}
