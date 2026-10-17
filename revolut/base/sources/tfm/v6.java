package tfm;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class v6 extends AtomicLong implements efm.y, ifm.c, w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lfm.b f270899c = new lfm.b(1);
    public final AtomicReference d = new AtomicReference();

    public v6(efm.y yVar, kfm.o oVar) {
        this.f270897a = yVar;
        this.f270898b = oVar;
    }

    @Override // tfm.w6
    public final void a(Throwable th10, long j2) {
        if (!compareAndSet(j2, Long.MAX_VALUE)) {
            mo3.a.m(th10);
        } else {
            lfm.d.a(this.d);
            this.f270897a.onError(th10);
        }
    }

    @Override // tfm.z6
    public final void b(long j2) {
        if (compareAndSet(j2, Long.MAX_VALUE)) {
            lfm.d.a(this.d);
            this.f270897a.onError(new TimeoutException());
        }
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.d);
        lfm.b bVar = this.f270899c;
        bVar.getClass();
        lfm.d.a(bVar);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) this.d.get());
    }

    @Override // efm.y
    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            lfm.b bVar = this.f270899c;
            bVar.getClass();
            lfm.d.a(bVar);
            this.f270897a.onComplete();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            mo3.a.m(th10);
            return;
        }
        lfm.b bVar = this.f270899c;
        bVar.getClass();
        lfm.d.a(bVar);
        this.f270897a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        long j2 = get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (compareAndSet(j2, j3)) {
                lfm.b bVar = this.f270899c;
                ifm.c cVar = (ifm.c) bVar.get();
                if (cVar != null) {
                    cVar.dispose();
                }
                efm.y yVar = this.f270897a;
                yVar.onNext(obj2);
                try {
                    Object objApply = this.f270898b.apply(obj2);
                    mfm.f.b(objApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                    efm.w wVar = (efm.w) objApply;
                    s sVar = new s(j3, this);
                    if (lfm.d.c(bVar, sVar)) {
                        wVar.subscribe(sVar);
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    ((ifm.c) this.d.get()).dispose();
                    getAndSet(Long.MAX_VALUE);
                    yVar.onError(th10);
                }
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this.d, cVar);
    }
}
