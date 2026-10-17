package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends AtomicReference implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270794a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f270796c;

    public s(long j2, w6 w6Var) {
        this.f270795b = j2;
        this.f270796c = w6Var;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270794a) {
            case 0:
                lfm.d.a(this);
                break;
            default:
                lfm.d.a(this);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270794a) {
            case 0:
                return get() == lfm.d.DISPOSED;
            default:
                return lfm.d.b((ifm.c) get());
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, tfm.z6] */
    @Override // efm.y
    public final void onComplete() {
        switch (this.f270794a) {
            case 0:
                Object obj2 = get();
                lfm.d dVar = lfm.d.DISPOSED;
                if (obj2 != dVar) {
                    lazySet(dVar);
                    ((r) this.f270796c).a(this, this.f270795b);
                }
                break;
            default:
                Object obj3 = get();
                lfm.d dVar2 = lfm.d.DISPOSED;
                if (obj3 != dVar2) {
                    lazySet(dVar2);
                    this.f270796c.b(this.f270795b);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, tfm.w6] */
    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270794a) {
            case 0:
                Object obj2 = get();
                lfm.d dVar = lfm.d.DISPOSED;
                if (obj2 == dVar) {
                    mo3.a.m(th10);
                } else {
                    lazySet(dVar);
                    r rVar = (r) this.f270796c;
                    lfm.d.a(rVar.f);
                    rVar.e.b(this);
                    rVar.onError(th10);
                }
                break;
            default:
                Object obj3 = get();
                lfm.d dVar2 = lfm.d.DISPOSED;
                if (obj3 == dVar2) {
                    mo3.a.m(th10);
                } else {
                    lazySet(dVar2);
                    this.f270796c.a(th10, this.f270795b);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, tfm.z6] */
    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270794a) {
            case 0:
                ifm.c cVar = (ifm.c) get();
                lfm.d dVar = lfm.d.DISPOSED;
                if (cVar != dVar) {
                    lazySet(dVar);
                    cVar.dispose();
                    ((r) this.f270796c).a(this, this.f270795b);
                }
                break;
            default:
                ifm.c cVar2 = (ifm.c) get();
                lfm.d dVar2 = lfm.d.DISPOSED;
                if (cVar2 != dVar2) {
                    cVar2.dispose();
                    lazySet(dVar2);
                    this.f270796c.b(this.f270795b);
                }
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270794a) {
            case 0:
                lfm.d.e(this, cVar);
                break;
            default:
                lfm.d.e(this, cVar);
                break;
        }
    }

    public s(r rVar, long j2) {
        this.f270796c = rVar;
        this.f270795b = j2;
    }
}
