package gcm;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class v0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f142905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f142906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f142907c = new ArrayList();

    public v0(c0 c0Var) {
        this.f142905a = c0Var;
    }

    @Override // gcm.c0
    public final void a(a31.a aVar) {
        if (this.f142906b) {
            this.f142905a.a(aVar);
        } else {
            e(new au0.x5(13, (Object) this, false, (Object) aVar));
        }
    }

    @Override // gcm.c0
    public final void b(ecm.m1 m1Var) {
        e(new ch.p(10, this, false, m1Var));
    }

    @Override // gcm.c0
    public final void c(ecm.g2 g2Var, b0 b0Var, ecm.m1 m1Var) {
        e(new a(this, g2Var, b0Var, m1Var, 1));
    }

    @Override // gcm.c0
    public final void d() {
        if (this.f142906b) {
            this.f142905a.d();
        } else {
            e(new com.bumptech.glide.k(this, 3));
        }
    }

    public final void e(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f142906b) {
                    runnable.run();
                } else {
                    this.f142907c.add(runnable);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
