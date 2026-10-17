package ip0;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.animation.OvershootInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class yd0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sp0.e f167303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sp0.e f167304c;

    public /* synthetic */ yd0(sp0.e eVar, sp0.e eVar2, int i) {
        this.f167302a = i;
        this.f167303b = eVar;
        this.f167304c = eVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f167302a;
        sp0.e eVar = this.f167304c;
        sp0.e eVar2 = this.f167303b;
        switch (i) {
            case 0:
                return zd0.a(zd0.k(eVar2, BitmapDescriptorFactory.HUE_RED, 1.0f, new OvershootInterpolator(4.5f)), zd0.g(eVar2, BitmapDescriptorFactory.HUE_RED, 1.0f, 300L, 0L), zd0.g(this.f167304c, BitmapDescriptorFactory.HUE_RED, 1.0f, 150L, 150L));
            case 1:
                sp0.e.Companion.getClass();
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar2, PropertyValuesHolder.ofKeyframe(sp0.e.f264859h, Keyframe.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f), Keyframe.ofFloat(0.5f, 1.13f), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe(sp0.e.i, Keyframe.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f), Keyframe.ofFloat(0.5f, 1.13f), Keyframe.ofFloat(1.0f, 1.0f)));
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(...)");
                objectAnimatorOfPropertyValuesHolder.setDuration(300L);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(new FastOutSlowInInterpolator());
                return zd0.a(objectAnimatorOfPropertyValuesHolder, zd0.j(eVar));
            case 2:
                return zd0.a(zd0.g(eVar2, 1.0f, BitmapDescriptorFactory.HUE_RED, 300L, 0L), zd0.g(eVar, 1.0f, BitmapDescriptorFactory.HUE_RED, 300L, 0L), zd0.k(eVar, 1.0f, 0.75f, new FastOutSlowInInterpolator()));
            default:
                return zd0.a(zd0.k(eVar2, BitmapDescriptorFactory.HUE_RED, 1.0f, new OvershootInterpolator()), zd0.j(eVar));
        }
    }
}
