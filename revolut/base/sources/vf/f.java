package vf;

import com.google.firebase.perf.util.Timer;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f288383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Timer f288384c;

    public /* synthetic */ f(g gVar, Timer timer, int i) {
        this.f288382a = i;
        this.f288383b = gVar;
        this.f288384c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f288382a) {
            case 0:
                Timer timer = this.f288384c;
                g gVar = this.f288383b;
                xf.f fVarF = gVar.f(timer);
                if (fVarF != null) {
                    gVar.f288386b.add(fVarF);
                }
                break;
            default:
                Timer timer2 = this.f288384c;
                g gVar2 = this.f288383b;
                xf.f fVarF2 = gVar2.f(timer2);
                if (fVarF2 != null) {
                    gVar2.f288386b.add(fVarF2);
                }
                break;
        }
    }
}
