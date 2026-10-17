package tfm;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends AtomicReference implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f270735a;

    public q(r rVar) {
        this.f270735a = rVar;
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == lfm.d.DISPOSED;
    }

    @Override // efm.y
    public final void onComplete() {
        lazySet(lfm.d.DISPOSED);
        r rVar = this.f270735a;
        rVar.e.b(this);
        if (rVar.e.f() == 0) {
            lfm.d.a(rVar.f);
            rVar.f270762h = true;
            rVar.b();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        lazySet(lfm.d.DISPOSED);
        r rVar = this.f270735a;
        lfm.d.a(rVar.f);
        rVar.e.b(this);
        rVar.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        r rVar = this.f270735a;
        rVar.getClass();
        try {
            Object objCall = rVar.f270759b.call();
            mfm.f.b(objCall, "The bufferSupplier returned a null Collection");
            Collection collection = (Collection) objCall;
            Object objApply = rVar.d.apply(obj2);
            mfm.f.b(objApply, "The bufferClose returned a null ObservableSource");
            efm.w wVar = (efm.w) objApply;
            long j2 = rVar.k;
            rVar.k = 1 + j2;
            synchronized (rVar) {
                try {
                    LinkedHashMap linkedHashMap = rVar.f270764l;
                    if (linkedHashMap == null) {
                        return;
                    }
                    linkedHashMap.put(Long.valueOf(j2), collection);
                    s sVar = new s(rVar, j2);
                    rVar.e.a(sVar);
                    wVar.subscribe(sVar);
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        } catch (Throwable th11) {
            m70.a.u(th11);
            lfm.d.a(rVar.f);
            rVar.onError(th11);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }
}
