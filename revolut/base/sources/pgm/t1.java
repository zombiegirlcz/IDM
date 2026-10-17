package pgm;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes14.dex */
public final class t1 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f236151c;

    public t1(Flowable flowable, long j2) {
        super(flowable);
        this.f236151c = j2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        this.f236000b.j(new s1(aVar, this.f236151c));
    }
}
