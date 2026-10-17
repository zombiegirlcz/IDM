package zkf;

import chc.c0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f322974a;

    public p(h0 commonDataSource, q pixWithdrawAndChangeMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(pixWithdrawAndChangeMapper, "pixWithdrawAndChangeMapper");
        this.f322974a = commonDataSource;
    }

    public final cmf.p a() {
        h0 h0Var = this.f322974a;
        return new cmf.p(new t38.e(h0Var.c(), 24, h0Var.d(), new y69.e(this, null, 8)), new c0(23), f0.f322471a, "PixWithdrawAndChange");
    }
}
