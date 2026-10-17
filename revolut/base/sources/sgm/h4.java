package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class h4 extends AtomicInteger implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ggm.b f262881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ObservableSource f262882c;

    public h4(fgm.l lVar, ggm.b bVar, ObservableSource observableSource) {
        this.f262880a = lVar;
        this.f262881b = bVar;
        this.f262882c = observableSource;
    }

    @Override // fgm.l
    public final void onComplete() {
        try {
            throw null;
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.f262880a.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f262880a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f262880a.onNext(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        ggm.b bVar = this.f262881b;
        bVar.getClass();
        jgm.b.c(bVar, disposable);
    }
}
