package tfm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class g3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.r f270484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f270485b;

    public g3(efm.r rVar, int i) {
        this.f270484a = rVar;
        this.f270485b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f270484a.replay(this.f270485b);
    }
}
