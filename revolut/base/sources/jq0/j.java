package jq0;

import androidx.dynamicanimation.animation.SpringAnimation;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f177369b;

    public /* synthetic */ j(p pVar, int i) {
        this.f177368a = i;
        this.f177369b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f177368a) {
            case 0:
                p pVar = this.f177369b;
                pVar.i = true;
                SpringAnimation springAnimation = pVar.f177389r;
                springAnimation.cancel();
                springAnimation.setSpring(pVar.f177388q);
                springAnimation.setStartValue(pVar.f177378a.getScaleX());
                springAnimation.start();
                break;
            case 1:
                p pVar2 = this.f177369b;
                pVar2.b();
                pVar2.f177385m = null;
                break;
            case 2:
                p pVar3 = this.f177369b;
                pVar3.f177382h = false;
                j jVar = pVar3.f177385m;
                if (jVar != null) {
                    jVar.run();
                }
                break;
            default:
                this.f177369b.a();
                break;
        }
    }
}
