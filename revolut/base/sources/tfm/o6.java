package tfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class o6 extends AtomicInteger implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f270704b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r4 f270705c = new r4(this, 1);
    public final zfm.c d = new zfm.c();

    public o6(efm.y yVar) {
        this.f270703a = yVar;
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.f270704b);
        lfm.d.a(this.f270705c);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) this.f270704b.get());
    }

    @Override // efm.y
    public final void onComplete() {
        lfm.d.a(this.f270705c);
        jh.d.o(this.f270703a, this, this.d);
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        lfm.d.a(this.f270705c);
        jh.d.p(this.f270703a, th10, this, this.d);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        jh.d.q(this.f270703a, obj2, this, this.d);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this.f270704b, cVar);
    }
}
