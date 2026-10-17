package pfm;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AtomicInteger implements efm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.d f235724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f235725c;
    public final ifm.c d;

    public e(efm.d dVar, Iterator it8) {
        this.f235723a = 0;
        this.f235724b = dVar;
        this.f235725c = it8;
        this.d = new lfm.b(1);
    }

    public void a() {
        efm.d dVar = this.f235724b;
        lfm.b bVar = (lfm.b) this.d;
        if (!bVar.isDisposed() && getAndIncrement() == 0) {
            Iterator it8 = (Iterator) this.f235725c;
            while (!bVar.isDisposed()) {
                try {
                    if (!it8.hasNext()) {
                        dVar.onComplete();
                        return;
                    }
                    try {
                        Object next = it8.next();
                        mfm.f.b(next, "The CompletableSource returned is null");
                        ((efm.f) next).d(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        dVar.onError(th10);
                        return;
                    }
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    dVar.onError(th11);
                    return;
                }
            }
        }
    }

    @Override // efm.d
    public final void onComplete() {
        switch (this.f235723a) {
            case 0:
                a();
                break;
            default:
                if (decrementAndGet() == 0 && ((AtomicBoolean) this.f235725c).compareAndSet(false, true)) {
                    this.f235724b.onComplete();
                    break;
                }
                break;
        }
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        switch (this.f235723a) {
            case 0:
                this.f235724b.onError(th10);
                break;
            default:
                ((ifm.b) this.d).dispose();
                if (!((AtomicBoolean) this.f235725c).compareAndSet(false, true)) {
                    mo3.a.m(th10);
                } else {
                    this.f235724b.onError(th10);
                }
                break;
        }
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f235723a) {
            case 0:
                lfm.b bVar = (lfm.b) this.d;
                bVar.getClass();
                lfm.d.c(bVar, cVar);
                break;
            default:
                ((ifm.b) this.d).a(cVar);
                break;
        }
    }

    public e(efm.d dVar, AtomicBoolean atomicBoolean, ifm.b bVar, int i) {
        this.f235723a = 1;
        this.f235724b = dVar;
        this.f235725c = atomicBoolean;
        this.d = bVar;
        lazySet(i);
    }
}
