package tfm;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class u6 extends AtomicReference implements efm.y, ifm.c, w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lfm.b f270869c = new lfm.b(1);
    public final AtomicLong d = new AtomicLong();
    public final AtomicReference e = new AtomicReference();
    public efm.w f;

    public u6(efm.w wVar, efm.y yVar, kfm.o oVar) {
        this.f270867a = yVar;
        this.f270868b = oVar;
        this.f = wVar;
    }

    @Override // tfm.w6
    public final void a(Throwable th10, long j2) {
        if (!this.d.compareAndSet(j2, Long.MAX_VALUE)) {
            mo3.a.m(th10);
        } else {
            lfm.d.a(this);
            this.f270867a.onError(th10);
        }
    }

    @Override // tfm.z6
    public final void b(long j2) {
        if (this.d.compareAndSet(j2, Long.MAX_VALUE)) {
            lfm.d.a(this.e);
            efm.w wVar = this.f;
            this.f = null;
            wVar.subscribe(new g4(this.f270867a, this, 1));
        }
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.e);
        lfm.d.a(this);
        lfm.b bVar = this.f270869c;
        bVar.getClass();
        lfm.d.a(bVar);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            lfm.b bVar = this.f270869c;
            bVar.getClass();
            lfm.d.a(bVar);
            this.f270867a.onComplete();
            bVar.getClass();
            lfm.d.a(bVar);
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.d.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            mo3.a.m(th10);
            return;
        }
        lfm.b bVar = this.f270869c;
        bVar.getClass();
        lfm.d.a(bVar);
        this.f270867a.onError(th10);
        bVar.getClass();
        lfm.d.a(bVar);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        AtomicLong atomicLong = this.d;
        long j2 = atomicLong.get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (atomicLong.compareAndSet(j2, j3)) {
                lfm.b bVar = this.f270869c;
                ifm.c cVar = (ifm.c) bVar.get();
                if (cVar != null) {
                    cVar.dispose();
                }
                efm.y yVar = this.f270867a;
                yVar.onNext(obj2);
                try {
                    Object objApply = this.f270868b.apply(obj2);
                    mfm.f.b(objApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                    efm.w wVar = (efm.w) objApply;
                    s sVar = new s(j3, this);
                    if (lfm.d.c(bVar, sVar)) {
                        wVar.subscribe(sVar);
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    ((ifm.c) this.e.get()).dispose();
                    atomicLong.getAndSet(Long.MAX_VALUE);
                    yVar.onError(th10);
                }
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this.e, cVar);
    }
}
