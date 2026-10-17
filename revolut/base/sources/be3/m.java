package be3;

import bb2.t;
import com.revolut.data.model.Data;
import com.revolut.feature.cashback.impl.ui.yourcashback.withdraw.CashbackWithdrawMetalScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends jki.g implements g {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k61.a f14667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bd3.a f14668q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.n f14669r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jd3.k f14670s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w80.b f14671t;
    public final f u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p stateMapper, CashbackWithdrawMetalScreenContract$InputData inputData, k61.a transferInteractor, bd3.a cashbackInteractor, wsg.n walletInteractor, jd3.k productAccountProvider, w80.b amountFormatter) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(productAccountProvider, "productAccountProvider");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f14667p = transferInteractor;
        this.f14668q = cashbackInteractor;
        this.f14669r = walletInteractor;
        this.f14670s = productAccountProvider;
        this.f14671t = amountFormatter;
        this.u = new f(inputData.f65739a, 0L, true, new Data(null, null, true, 3, null), null);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(nim.a.w(osg.b.e(this.f14669r, false, null, null, null, null, null, null, 126), new i(this, 1))), null, null, new k(this, null, 0), 3);
        this.f14670s.getClass();
        yji.l.a1(this, mo3.a.g(jd3.k.b(), null, new t(12), 1), null, null, new k(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }
}
