package gcm;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class j0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f142687b;

    public /* synthetic */ j0(Object obj2, int i) {
        this.f142686a = i;
        this.f142687b = obj2;
    }

    public abstract void a();

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f142686a) {
            case 0:
                ecm.v vVar = (ecm.v) this.f142687b;
                ecm.v vVarA = vVar.a();
                try {
                    b();
                    return;
                } finally {
                    vVar.c(vVarA);
                }
            default:
                hcm.d dVar = (hcm.d) this.f142687b;
                try {
                    if (dVar.i == null) {
                        throw new IOException("Unable to perform write due to unavailable sink.");
                    }
                    a();
                    return;
                } catch (Exception e) {
                    ((hcm.t) dVar.d).n(e);
                    return;
                }
        }
    }
}
