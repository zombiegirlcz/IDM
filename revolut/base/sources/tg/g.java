package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import smd.s;

/* JADX INFO: loaded from: classes17.dex */
public final class g extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f271006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Marker f271007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LatLng f271008c;
    public final LatLng d;
    public boolean e;
    public ug.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f271009g;

    public g(m mVar, j jVar, LatLng latLng, LatLng latLng2) {
        this.f271009g = mVar;
        this.f271006a = jVar;
        this.f271007b = jVar.f271018a;
        this.f271008c = latLng;
        this.d = latLng2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.e) {
            m mVar = this.f271009g;
            s sVar = mVar.i;
            Marker marker = this.f271007b;
            sVar.V(marker);
            mVar.f271034l.V(marker);
            this.f.c(marker);
        }
        this.f271006a.f271019b = this.d;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        LatLng latLng = this.d;
        double d = latLng.latitude;
        LatLng latLng2 = this.f271008c;
        double d5 = latLng2.latitude;
        double d6 = animatedFraction;
        double d10 = ((d - d5) * d6) + d5;
        double dSignum = latLng.longitude - latLng2.longitude;
        if (Math.abs(dSignum) > 180.0d) {
            dSignum -= Math.signum(dSignum) * 360.0d;
        }
        this.f271007b.setPosition(new LatLng(d10, (dSignum * d6) + latLng2.longitude));
    }
}
