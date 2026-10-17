package szh;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.common.StatusDialogViewPayload;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.move_money.MoveMoneyContract$MoveMoneyResultPayload;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import h6i.o;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import rea.m;
import zhm.v;
import zjh.f;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f266818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o8l.c f266819n;
    public final r10.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xvh.c f266820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nzh.b f266821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f266822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f266823s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v8i.a f266824t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m pocketDetailsInteractor, rzh.b orderFlowStatusDialogConfigurationProvider, o8l.c moveMoneyInteractor, r10.a stakingDataInteractor, xvh.c autoInvestInteractor, nzh.b commonBuyActionsMapper, f cryptoExchangeSecondaryPocketRepository, o moveMoneyAccountProvider, v8i.a moveMoneyOrderQuoteMapper) {
        super(orderFlowStatusDialogConfigurationProvider);
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(orderFlowStatusDialogConfigurationProvider, "orderFlowStatusDialogConfigurationProvider");
        Intrinsics.checkNotNullParameter(moveMoneyInteractor, "moveMoneyInteractor");
        Intrinsics.checkNotNullParameter(stakingDataInteractor, "stakingDataInteractor");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(commonBuyActionsMapper, "commonBuyActionsMapper");
        Intrinsics.checkNotNullParameter(cryptoExchangeSecondaryPocketRepository, "cryptoExchangeSecondaryPocketRepository");
        Intrinsics.checkNotNullParameter(moveMoneyAccountProvider, "moveMoneyAccountProvider");
        Intrinsics.checkNotNullParameter(moveMoneyOrderQuoteMapper, "moveMoneyOrderQuoteMapper");
        Intrinsics.checkNotNullParameter(orderFlowStatusDialogConfigurationProvider, "orderFlowStatusDialogConfigurationProvider");
        this.f266818m = pocketDetailsInteractor;
        this.f266819n = moveMoneyInteractor;
        this.o = stakingDataInteractor;
        this.f266820p = autoInvestInteractor;
        this.f266821q = commonBuyActionsMapper;
        this.f266822r = cryptoExchangeSecondaryPocketRepository;
        this.f266823s = moveMoneyAccountProvider;
        this.f266824t = moveMoneyOrderQuoteMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[PHI: r1 r2 r5 r7
      0x0042: PHI (r1v19 java.lang.String) = (r1v17 java.lang.String), (r1v25 java.lang.String) binds: [B:51:0x015f, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r2v18 java.lang.Object) = (r2v17 java.lang.Object), (r2v1 java.lang.Object) binds: [B:51:0x015f, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r5v20 com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft) = 
      (r5v18 com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft)
      (r5v21 com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft)
     binds: [B:51:0x015f, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r7v5 long) = (r7v3 long), (r7v6 long) binds: [B:51:0x015f, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0192 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // nzh.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r22, gim.c r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: szh.e.b3(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, gim.c):java.lang.Object");
    }

    @Override // nzh.c
    public final j0 c3(Object obj2, CryptoOrderDraft draft) {
        MoveMoneyContract$MoveMoneyResultPayload result = (MoveMoneyContract$MoveMoneyResultPayload) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(draft, "draft");
        Pair pairA = this.f266821q.a(AccountId.Personal.f51414a, false, result.f96793b, result.f96794c);
        u1 u1Var = (u1) pairA.f186385a;
        String str = (String) pairA.f186386b;
        long j2 = result.f96792a;
        xi0.b bVar = draft.f96690b.f96683a;
        CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails = draft.f96689a;
        xi0.b bVar2 = cryptoExchangeContract$MoneyDetails.f96683a;
        return new j0((Clause) new TextLocalisedClause(R$string.cryptobuysell_exchange_result_success_title_buy_primary_amount_only_format, v.k(new MoneyClause(new dj0.d(j2, bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8), new CurrencyClause(bVar2, CurrencyClause.Format.Ticker.f57756a, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254))), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) new StatusDialogViewPayload(str, result.f96793b, draft.f96690b.f96683a, cryptoExchangeContract$MoneyDetails.f96683a), u1Var, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4070);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r12, j8l.l r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: szh.e.d3(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, j8l.l, gim.c):java.lang.Object");
    }
}
