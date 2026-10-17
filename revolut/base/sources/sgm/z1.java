package sgm;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class z1 extends Maybe implements lgm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f263317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263318b;

    public z1(Observable observable, long j2) {
        this.f263317a = observable;
        this.f263318b = j2;
    }

    @Override // lgm.d
    public final Observable a() {
        return new x1(this.f263317a, this.f263318b, null, false);
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public final void e(fgm.e eVar) {
        this.f263317a.subscribe(new y1(eVar, this.f263318b));
    }
}
