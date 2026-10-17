package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class u extends AtomicReference implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263189a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f263191c;

    public u(long j2, h6 h6Var) {
        this.f263190b = j2;
        this.f263191c = h6Var;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f263189a) {
            case 0:
                jgm.b.a(this);
                break;
            default:
                jgm.b.a(this);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f263189a) {
            case 0:
                return get() == jgm.b.DISPOSED;
            default:
                return jgm.b.b((Disposable) get());
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, sgm.k6] */
    @Override // fgm.l
    public final void onComplete() {
        switch (this.f263189a) {
            case 0:
                Object obj2 = get();
                jgm.b bVar = jgm.b.DISPOSED;
                if (obj2 != bVar) {
                    lazySet(bVar);
                    ((t) this.f263191c).a(this, this.f263190b);
                }
                break;
            default:
                Object obj3 = get();
                jgm.b bVar2 = jgm.b.DISPOSED;
                if (obj3 != bVar2) {
                    lazySet(bVar2);
                    this.f263191c.b(this.f263190b);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, sgm.h6] */
    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f263189a) {
            case 0:
                Object obj2 = get();
                jgm.b bVar = jgm.b.DISPOSED;
                if (obj2 == bVar) {
                    jb3.l.v(th10);
                } else {
                    lazySet(bVar);
                    t tVar = (t) this.f263191c;
                    jgm.b.a(tVar.f);
                    tVar.e.b(this);
                    tVar.onError(th10);
                }
                break;
            default:
                Object obj3 = get();
                jgm.b bVar2 = jgm.b.DISPOSED;
                if (obj3 == bVar2) {
                    jb3.l.v(th10);
                } else {
                    lazySet(bVar2);
                    this.f263191c.a(th10, this.f263190b);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, sgm.k6] */
    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f263189a) {
            case 0:
                Disposable disposable = (Disposable) get();
                jgm.b bVar = jgm.b.DISPOSED;
                if (disposable != bVar) {
                    lazySet(bVar);
                    disposable.dispose();
                    ((t) this.f263191c).a(this, this.f263190b);
                }
                break;
            default:
                Disposable disposable2 = (Disposable) get();
                jgm.b bVar2 = jgm.b.DISPOSED;
                if (disposable2 != bVar2) {
                    disposable2.dispose();
                    lazySet(bVar2);
                    this.f263191c.b(this.f263190b);
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f263189a) {
            case 0:
                jgm.b.e(this, disposable);
                break;
            default:
                jgm.b.e(this, disposable);
                break;
        }
    }

    public u(t tVar, long j2) {
        this.f263191c = tVar;
        this.f263190b = j2;
    }
}
