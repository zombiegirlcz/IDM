package tfm;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class j3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.r f270563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f270565c;
    public final efm.c0 d;

    public j3(efm.r rVar, long j2, TimeUnit timeUnit, efm.c0 c0Var) {
        this.f270563a = rVar;
        this.f270564b = j2;
        this.f270565c = timeUnit;
        this.d = c0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f270563a.replay(this.f270564b, this.f270565c, this.d);
    }
}
