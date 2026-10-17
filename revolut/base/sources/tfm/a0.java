package tfm;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f270329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f270330b;

    public a0(c0 c0Var, Collection collection) {
        this.f270330b = c0Var;
        this.f270329a = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f270330b) {
            this.f270330b.f270380l.remove(this.f270329a);
        }
        c0 c0Var = this.f270330b;
        c0Var.i(this.f270329a, c0Var.k);
    }
}
