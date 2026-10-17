package ox0;

import androidx.dynamicanimation.animation.DynamicAnimation;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class o implements DynamicAnimation.OnAnimationUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f230495b;

    public /* synthetic */ o(t tVar, int i) {
        this.f230494a = i;
        this.f230495b = tVar;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f4) {
        switch (this.f230494a) {
            case 0:
                this.f230495b.e(f);
                break;
            default:
                t tVar = this.f230495b;
                tVar.f230504c.setScaleX(f);
                tVar.f230504c.setScaleY(f);
                break;
        }
    }
}
