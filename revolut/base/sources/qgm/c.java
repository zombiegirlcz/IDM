package qgm;

import io.reactivex.rxjava3.core.Maybe;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends Maybe implements bhm.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f246367a = new c();

    @Override // io.reactivex.rxjava3.core.Maybe
    public final void e(fgm.e eVar) {
        eVar.onSubscribe(jgm.c.INSTANCE);
        eVar.onComplete();
    }

    @Override // igm.q
    public final Object get() {
        return null;
    }
}
