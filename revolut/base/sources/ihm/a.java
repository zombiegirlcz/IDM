package ihm;

import e8.q;
import efm.y;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ifm.c, zfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f161431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f161432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f161433c;
    public boolean d;
    public q e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f161434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f161435h;

    public a(y yVar, b bVar) {
        this.f161431a = yVar;
        this.f161432b = bVar;
    }

    public final void a(long j2, Object obj2) {
        if (this.f161434g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                try {
                    if (this.f161434g) {
                        return;
                    }
                    if (this.f161435h == j2) {
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
                    this.f161433c = true;
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
        if (this.f161434g) {
            return;
        }
        this.f161434g = true;
        this.f161432b.g(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f161434g;
    }

    @Override // kfm.p
    public final boolean test(Object obj2) {
        return this.f161434g || zfm.m.a(this.f161431a, obj2);
    }
}
