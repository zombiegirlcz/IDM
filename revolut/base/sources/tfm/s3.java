package tfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class s3 extends AtomicInteger implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f270807b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rfm.a0 f270808c = new rfm.a0(this, 2);
    public final zfm.c d = new zfm.c();
    public volatile boolean e;
    public volatile boolean f;

    public s3(efm.y yVar) {
        this.f270806a = yVar;
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.f270807b);
        lfm.d.a(this.f270808c);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) this.f270807b.get());
    }

    @Override // efm.y
    public final void onComplete() {
        this.e = true;
        if (this.f) {
            jh.d.o(this.f270806a, this, this.d);
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        lfm.d.a(this.f270808c);
        jh.d.p(this.f270806a, th10, this, this.d);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        jh.d.q(this.f270806a, obj2, this, this.d);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this.f270807b, cVar);
    }
}
