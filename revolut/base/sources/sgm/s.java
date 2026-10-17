package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class s extends AtomicReference implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f263133a;

    public s(t tVar) {
        this.f263133a = tVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == jgm.b.DISPOSED;
    }

    @Override // fgm.l
    public final void onComplete() {
        lazySet(jgm.b.DISPOSED);
        t tVar = this.f263133a;
        tVar.e.b(this);
        if (tVar.e.f() == 0) {
            jgm.b.a(tVar.f);
            tVar.f263164h = true;
            tVar.b();
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        lazySet(jgm.b.DISPOSED);
        t tVar = this.f263133a;
        jgm.b.a(tVar.f);
        tVar.e.b(this);
        tVar.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        t tVar = this.f263133a;
        tVar.getClass();
        try {
            Object obj3 = tVar.f263161b.get();
            Objects.requireNonNull(obj3, "The bufferSupplier returned a null Collection");
            Collection collection = (Collection) obj3;
            Object objApply = tVar.d.apply(obj2);
            Objects.requireNonNull(objApply, "The bufferClose returned a null ObservableSource");
            ObservableSource observableSource = (ObservableSource) objApply;
            long j2 = tVar.k;
            tVar.k = 1 + j2;
            synchronized (tVar) {
                try {
                    LinkedHashMap linkedHashMap = tVar.f263166l;
                    if (linkedHashMap == null) {
                        return;
                    }
                    linkedHashMap.put(Long.valueOf(j2), collection);
                    u uVar = new u(tVar, j2);
                    tVar.e.a(uVar);
                    observableSource.subscribe(uVar);
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        } catch (Throwable th11) {
            ce9.m.F(th11);
            jgm.b.a(tVar.f);
            tVar.onError(th11);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }
}
