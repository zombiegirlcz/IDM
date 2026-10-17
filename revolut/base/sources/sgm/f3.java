package sgm;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class f3 implements igm.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f262827a;

    public f3(Observable observable) {
        this.f262827a = observable;
    }

    @Override // igm.q
    public final Object get() {
        return this.f262827a.replay();
    }
}
