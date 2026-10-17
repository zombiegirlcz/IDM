package tfm;

import efm.c0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f270528c;
    public final c0.a d;
    public final boolean e;
    public ifm.c f;

    public i1(efm.y yVar, long j2, TimeUnit timeUnit, c0.a aVar, boolean z) {
        this.f270526a = yVar;
        this.f270527b = j2;
        this.f270528c = timeUnit;
        this.d = aVar;
        this.e = z;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f.dispose();
        this.d.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        this.d.b(new g1(this), this.f270527b, this.f270528c);
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.d.b(new h1(this, th10), this.e ? this.f270527b : 0L, this.f270528c);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.d.b(new r8.d(this, obj2, 8), this.f270527b, this.f270528c);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f, cVar)) {
            this.f = cVar;
            this.f270526a.onSubscribe(this);
        }
    }
}
