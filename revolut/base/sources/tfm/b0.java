package tfm;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f270355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f270356b;

    public b0(c0 c0Var, Collection collection) {
        this.f270356b = c0Var;
        this.f270355a = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f270356b) {
            this.f270356b.f270380l.remove(this.f270355a);
        }
        c0 c0Var = this.f270356b;
        c0Var.i(this.f270355a, c0Var.k);
    }
}
