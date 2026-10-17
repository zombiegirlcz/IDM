package sgm;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class c3 implements igm.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f262736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f262737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f262738c;

    public c3(Observable observable, int i, boolean z) {
        this.f262736a = observable;
        this.f262737b = i;
        this.f262738c = z;
    }

    @Override // igm.q
    public final Object get() {
        return this.f262736a.replay(this.f262737b, this.f262738c);
    }
}
