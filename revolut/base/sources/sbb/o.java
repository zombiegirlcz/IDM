package sbb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bng.b f261555l;

    public o(bng.b accountLockManager) {
        Intrinsics.checkNotNullParameter(accountLockManager, "accountLockManager");
        this.f261555l = accountLockManager;
    }

    @Override // yji.n
    public final void D2() {
        T2(new n(this, null), new rnb.u(1, this, o.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 20));
    }
}
