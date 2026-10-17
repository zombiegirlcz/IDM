package pgm;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes14.dex */
public final class i0 extends Completable implements lgm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f236075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f236076b;

    public i0(b0 b0Var, igm.o oVar) {
        this.f236075a = b0Var;
        this.f236076b = oVar;
    }

    @Override // lgm.c
    public final Flowable b() {
        return new g0(this.f236075a, this.f236076b);
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void i(fgm.b bVar) {
        this.f236075a.j(new h0(bVar, this.f236076b));
    }
}
