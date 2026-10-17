package vf;

import com.google.firebase.perf.util.Timer;
import xf.q;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f288368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Timer f288369c;

    public /* synthetic */ a(b bVar, Timer timer, int i) {
        this.f288367a = i;
        this.f288368b = bVar;
        this.f288369c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f288367a) {
            case 0:
                Timer timer = this.f288369c;
                b bVar = this.f288368b;
                q qVarF = bVar.f(timer);
                if (qVarF != null) {
                    bVar.f288372a.add(qVarF);
                }
                break;
            default:
                Timer timer2 = this.f288369c;
                b bVar2 = this.f288368b;
                q qVarF2 = bVar2.f(timer2);
                if (qVarF2 != null) {
                    bVar2.f288372a.add(qVarF2);
                }
                break;
        }
    }
}
