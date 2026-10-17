package tfm;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class h3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.r f270505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f270506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f270507c;
    public final TimeUnit d;
    public final efm.c0 e;

    public h3(efm.r rVar, int i, long j2, TimeUnit timeUnit, efm.c0 c0Var) {
        this.f270505a = rVar;
        this.f270506b = i;
        this.f270507c = j2;
        this.d = timeUnit;
        this.e = c0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f270505a.replay(this.f270506b, this.f270507c, this.d, this.e);
    }
}
