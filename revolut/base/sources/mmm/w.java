package mmm;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class w extends v0 {
    public v0 e;

    public w(v0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.e = delegate;
    }

    @Override // mmm.v0
    public final v0 a() {
        return this.e.a();
    }

    @Override // mmm.v0
    public final v0 b() {
        return this.e.b();
    }

    @Override // mmm.v0
    public final long c() {
        return this.e.c();
    }

    @Override // mmm.v0
    public final v0 d(long j2) {
        return this.e.d(j2);
    }

    @Override // mmm.v0
    public final boolean e() {
        return this.e.e();
    }

    @Override // mmm.v0
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // mmm.v0
    public final v0 g(long j2, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.e.g(j2, unit);
    }

    @Override // mmm.v0
    public final long h() {
        return this.e.h();
    }
}
