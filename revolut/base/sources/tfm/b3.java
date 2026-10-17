package tfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class b3 extends AtomicReference implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f270363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f270364b;

    /* JADX WARN: Multi-variable type inference failed */
    public b3(z2 z2Var, boolean z) {
        this.f270363a = (AtomicInteger) z2Var;
        this.f270364b = z;
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) get());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, tfm.z2] */
    @Override // efm.y
    public final void onComplete() {
        this.f270363a.e(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, tfm.z2] */
    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270363a.b(th10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, tfm.z2] */
    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270363a.c(obj2, this.f270364b);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }
}
