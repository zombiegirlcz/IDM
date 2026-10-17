package pgm;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;

/* JADX INFO: loaded from: classes14.dex */
public final class x extends Maybe implements lgm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flowable f236176a;

    public x(Flowable flowable) {
        this.f236176a = flowable;
    }

    @Override // lgm.c
    public final Flowable b() {
        return new v(this.f236176a, 0);
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public final void e(fgm.e eVar) {
        this.f236176a.j(new w(eVar));
    }
}
