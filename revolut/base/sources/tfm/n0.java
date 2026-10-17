package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends AtomicReference implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgm.d f270665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f270666b;

    public n0(bgm.d dVar, o0 o0Var) {
        this.f270665a = dVar;
        this.f270666b = o0Var;
    }

    @Override // efm.y
    public final void onComplete() {
        o0 o0Var = this.f270666b;
        o0Var.f270692g = false;
        o0Var.a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270666b.dispose();
        this.f270665a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270665a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.c(this, cVar);
    }
}
