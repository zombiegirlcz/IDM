package pgm;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes14.dex */
public final class o1 extends Single implements lgm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f236121a;

    public o1(a aVar) {
        this.f236121a = aVar;
    }

    @Override // lgm.c
    public final Flowable b() {
        return new m1(this.f236121a);
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(fgm.p pVar) {
        this.f236121a.j(new n1(pVar));
    }
}
