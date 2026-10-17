package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class w7 implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ofm.p f270923a;

    public w7(ofm.p pVar) {
        this.f270923a = pVar;
    }

    @Override // efm.y
    public final void onComplete() {
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        ofm.p pVar = this.f270923a;
        lfm.d.a((AtomicReference) pVar.d);
        ((bgm.d) pVar.f224943b).onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270923a.lazySet(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e((AtomicReference) this.f270923a.e, cVar);
    }
}
