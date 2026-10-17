package zr2;

import com.revolut.data.model.Data;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.BlockMerchantScreenContract$InputData;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import tof.r9;
import znd.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends jki.g implements e {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BlockMerchantScreenContract$InputData f324540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f324541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ur2.c f324542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f324543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sf0.h f324544t;
    public final j60.a u;
    public final oce.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a2 f324545w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f324546x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(jki.p stateMapper, BlockMerchantScreenContract$InputData inputData, com.revolut.domain.interactors.transactions.a transactionsInteractor, ur2.c blockedMerchantsInteractor, t pricingPlanInteractor, sf0.h serverErrorParser, j60.a bottomExpandableDialogControllerExtension, oce.e blockMerchantDialogProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(blockedMerchantsInteractor, "blockedMerchantsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(blockMerchantDialogProvider, "blockMerchantDialogProvider");
        this.f324540p = inputData;
        this.f324541q = transactionsInteractor;
        this.f324542r = blockedMerchantsInteractor;
        this.f324543s = pricingPlanInteractor;
        this.f324544t = serverErrorParser;
        this.u = bottomExpandableDialogControllerExtension;
        this.v = blockMerchantDialogProvider;
        this.f324546x = new c(new Data(null, null, true, 3, null), false);
    }

    @Override // yji.l
    public final void I1() {
        BlockMerchantScreenContract$InputData blockMerchantScreenContract$InputData = this.f324540p;
        Continuation continuation = null;
        if (blockMerchantScreenContract$InputData.f64241b) {
            l2(new k(this, continuation, 0), new yi5.b(26));
            efm.r rVarFilter = this.u.E().filter(new zmg.c(new u0(25), 15));
            Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
            yji.l.a1(this, rd0.e.b(rVarFilter), null, null, new l(this, null), 3);
            return;
        }
        yji.l.a1(this, rd0.e.b(nim.a.w(com.revolut.domain.interactors.transactions.a.d(this.f324541q, new r9(blockMerchantScreenContract$InputData.f64240a.f188642a), null, 1, null, null, 26), new u0(26))), null, null, new i(this, continuation, 0), 3);
        efm.r map = this.f324543s.v(w4l.h.f294642c).map(new zmg.c(new u0(27), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        yji.l.a1(this, rd0.e.b(map), null, null, new i(this, continuation, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f324546x;
    }
}
