package v60;

import e8.q;
import efm.y;
import zfm.m;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ifm.c, zfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f286253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f286254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f286255c;
    public boolean d;
    public q e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f286256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f286257h;

    public h(y yVar, i iVar) {
        this.f286253a = yVar;
        this.f286254b = iVar;
    }

    public final void a(long j2, Object obj2) {
        if (this.f286256g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                try {
                    if (this.f286256g) {
                        return;
                    }
                    if (this.f286257h == j2) {
                        return;
                    }
                    if (this.d) {
                        q qVar = this.e;
                        if (qVar == null) {
                            qVar = new q(4, (byte) 0);
                            this.e = qVar;
                        }
                        qVar.c(obj2);
                        return;
                    }
                    this.f286255c = true;
                    this.f = true;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
        test(obj2);
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f286256g) {
            return;
        }
        this.f286256g = true;
        this.f286254b.e(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f286256g;
    }

    @Override // kfm.p
    public final boolean test(Object obj2) {
        boolean z = this.f286256g || m.a(this.f286253a, obj2);
        if (!z) {
            this.f286254b.f(null);
        }
        return z;
    }
}
