package ylm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class l implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f314773a;

    public l(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f314773a = new y(this, null, e, 2);
    }

    @Override // ylm.z
    public final s a() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // ylm.z, zlm.d
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // ylm.z
    public final y d() {
        return this.f314773a;
    }

    @Override // ylm.z
    public final y f() {
        return this.f314773a;
    }

    @Override // ylm.z
    public final z g() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // ylm.z
    public final boolean isReady() {
        return false;
    }
}
