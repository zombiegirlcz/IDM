package tfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class a3 extends AtomicReference implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f270336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f270337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f270338c;

    /* JADX WARN: Multi-variable type inference failed */
    public a3(z2 z2Var, boolean z, int i) {
        this.f270336a = (AtomicInteger) z2Var;
        this.f270337b = z;
        this.f270338c = i;
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
        this.f270336a.d(this.f270337b, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, tfm.z2] */
    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270336a.a(th10);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.atomic.AtomicInteger, tfm.z2] */
    @Override // efm.y
    public final void onNext(Object obj2) {
        if (lfm.d.a(this)) {
            this.f270336a.d(this.f270337b, this);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }
}
