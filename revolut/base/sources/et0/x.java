package et0;

import android.animation.ValueAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes19.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f129143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f129144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f129145c;
    public final /* synthetic */ kp0.u d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public x(z zVar, z zVar2, long j2, boolean z, kp0.u uVar, int i, int i2) {
        this.f129143a = zVar2;
        this.f129144b = j2;
        this.f129145c = z;
        this.d = uVar;
        this.e = i;
        this.f = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar = this.f129143a;
        jq0.q qVar = zVar.k;
        qVar.setMoveDuration(this.f129144b);
        qVar.f154305c = this.f129145c;
        kp0.u uVar = this.d;
        qVar.endAnimation(uVar);
        int height = zVar.f129151b.getHeight() - uVar.itemView.getTop();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(450L);
        y yVar = new y(valueAnimatorOfFloat, zVar, this.e, this.f, this.d, height);
        valueAnimatorOfFloat.addListener(yVar);
        valueAnimatorOfFloat.addUpdateListener(yVar);
        valueAnimatorOfFloat.start();
        zVar.f(450L, false);
    }
}
