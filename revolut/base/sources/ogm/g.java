package ogm;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends Completable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f225217a = new g();

    @Override // io.reactivex.rxjava3.core.Completable
    public final void i(fgm.b bVar) {
        bVar.onSubscribe(jgm.c.INSTANCE);
        bVar.onComplete();
    }
}
