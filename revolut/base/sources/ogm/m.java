package ogm;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends Completable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Completable f225232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.g f225233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.g f225234c;
    public final igm.a d;
    public final igm.a e;

    public m(Completable completable, igm.g gVar, igm.g gVar2, igm.a aVar, igm.a aVar2) {
        this.f225232a = completable;
        this.f225233b = gVar;
        this.f225234c = gVar2;
        this.d = aVar;
        this.e = aVar2;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void i(fgm.b bVar) {
        this.f225232a.c(new l(this, bVar));
    }
}
