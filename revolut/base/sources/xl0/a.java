package xl0;

import wl0.j;
import wl0.k;
import wl0.l;
import wl0.o;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f306894b;

    public /* synthetic */ a(b bVar, int i) {
        this.f306893a = i;
        this.f306894b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f306893a) {
            case 0:
                b bVar = this.f306894b;
                bVar.f306895a.a(new k((o) bVar.e.getValue()));
                break;
            case 1:
                this.f306894b.f306895a.a(j.f298355a);
                break;
            case 2:
                this.f306894b.f306895a.a(l.f298357a);
                break;
            default:
                b bVar2 = this.f306894b;
                bVar2.f306895a.a(new k((o) bVar2.e.getValue()));
                break;
        }
    }
}
