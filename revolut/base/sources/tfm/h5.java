package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class h5 extends AtomicReference implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i5 f270511a;

    public h5(i5 i5Var) {
        this.f270511a = i5Var;
    }

    @Override // efm.y
    public final void onComplete() {
        i5 i5Var = this.f270511a;
        lfm.d.a(i5Var.f);
        jh.d.o(i5Var.f270537a, i5Var, i5Var.f270539c);
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        i5 i5Var = this.f270511a;
        lfm.d.a(i5Var.f);
        jh.d.p(i5Var.f270537a, th10, i5Var, i5Var.f270539c);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270511a.a();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }
}
