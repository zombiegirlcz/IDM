package xyh;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderPocketInfo;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$InputData;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends c {

    @NotNull
    private static final p Companion = new p();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Set f309739q;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CryptoExchangeScreenContract$InputData f309740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f309741m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jva.a f309742n;
    public final czh.l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x0i.l f309743p;

    static {
        io3.l[] elements = {io3.l.CURRENT, io3.l.UNKNOWN, io3.l.REVX_FIAT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f309739q = kotlin.collections.d.y0(elements);
    }

    public t(CryptoExchangeScreenContract$InputData inputData, a controllerModel, jva.a recurringBuysEnabledStateChecker, czh.l takeProfitStopLossUpdateProvider, x0i.l takeProfitStopLossStorageInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        Intrinsics.checkNotNullParameter(recurringBuysEnabledStateChecker, "recurringBuysEnabledStateChecker");
        Intrinsics.checkNotNullParameter(takeProfitStopLossUpdateProvider, "takeProfitStopLossUpdateProvider");
        Intrinsics.checkNotNullParameter(takeProfitStopLossStorageInteractor, "takeProfitStopLossStorageInteractor");
        this.f309740l = inputData;
        this.f309741m = controllerModel;
        this.f309742n = recurringBuysEnabledStateChecker;
        this.o = takeProfitStopLossUpdateProvider;
        this.f309743p = takeProfitStopLossStorageInteractor;
    }

    public static final boolean b3(t tVar, CryptoOrderDraft cryptoOrderDraft, boolean z) {
        tVar.getClass();
        if (z) {
            return false;
        }
        int i = q.f309737a[cryptoOrderDraft.e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (cryptoOrderDraft.f != wd6.h.MARKET || !Intrinsics.f(oyh.b.b(cryptoOrderDraft.f96690b.e), AccountId.Personal.f51414a)) {
            return false;
        }
        Set set = f309739q;
        CryptoOrderPocketInfo cryptoOrderPocketInfo = cryptoOrderDraft.f96696m;
        return d0.T(set, cryptoOrderPocketInfo != null ? cryptoOrderPocketInfo.f96705c : null);
    }

    @Override // yji.n
    public final void H2() {
        if (this.f309740l.f96723c == wd6.e.BUY) {
            Continuation continuation = null;
            yji.n.l2(this, this.o.f110258b, null, new mt8.b(this, continuation, 19), 3);
            yji.n.l2(this, vkm.q.q(new wyd.f(vkm.q.s(((com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f309741m).O2(), new xx9.f(15), vkm.q.f290100b), this, 18)), null, new rf9.h(this, continuation, 25), 3);
        }
    }

    @Override // xyh.c
    public final void Z2() {
        V2(new r(this, null), new yi5.b(29));
    }
}
