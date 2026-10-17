package qzh;

import android.os.Parcelable;
import aw0.o9;
import c0i.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.exchange.models.ExchangeResult;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.common.StatusDialogViewPayload;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.exchange.MarketOrderExchangeContract$ExchangeResultPayload;
import com.revolut.feature_crypto_order_flow.impl.order_summary.models.ExchangeStakingData;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kyh.k;
import nii.h0;
import nii.j0;
import nii.u1;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f250641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r10.a f250642n;
    public final xvh.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f250643p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h marketOrderInteractor, r10.a stakingDataInteractor, xvh.c autoInvestInteractor, g marketOrderExchangeStateViewConfigMapper, rzh.b orderFlowStatusDialogConfigurationProvider) {
        super(orderFlowStatusDialogConfigurationProvider);
        Intrinsics.checkNotNullParameter(marketOrderInteractor, "marketOrderInteractor");
        Intrinsics.checkNotNullParameter(stakingDataInteractor, "stakingDataInteractor");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(marketOrderExchangeStateViewConfigMapper, "marketOrderExchangeStateViewConfigMapper");
        Intrinsics.checkNotNullParameter(orderFlowStatusDialogConfigurationProvider, "orderFlowStatusDialogConfigurationProvider");
        Intrinsics.checkNotNullParameter(orderFlowStatusDialogConfigurationProvider, "orderFlowStatusDialogConfigurationProvider");
        this.f250641m = marketOrderInteractor;
        this.f250642n = stakingDataInteractor;
        this.o = autoInvestInteractor;
        this.f250643p = marketOrderExchangeStateViewConfigMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nzh.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qzh.b
            if (r0 == 0) goto L13
            r0 = r7
            qzh.b r0 = (qzh.b) r0
            int r1 = r0.f250637y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f250637y = r1
            goto L18
        L13:
            qzh.b r0 = new qzh.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f250635w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f250637y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            qzh.e r6 = r0.v
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r2 = r0.u
            yhm.o.b(r7)
            goto L4e
        L3a:
            yhm.o.b(r7)
            r0.u = r6
            r0.v = r5
            r0.f250637y = r4
            c0i.h r7 = r5.f250641m
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L4c
            goto L67
        L4c:
            r2 = r6
            r6 = r5
        L4e:
            com.revolut.feature.exchange.models.ExchangeResult r7 = (com.revolut.feature.exchange.models.ExchangeResult) r7
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails r2 = kyh.k.d(r2)
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails$BalanceIdentifier r2 = r2.e
            com.revolut.core.model.account.AccountId r2 = oyh.b.b(r2)
            r4 = 0
            r0.u = r4
            r0.v = r4
            r0.f250637y = r3
            java.lang.Object r6 = r6.d3(r7, r2, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qzh.e.b3(com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, gim.c):java.lang.Object");
    }

    @Override // nzh.c
    public final j0 c3(Object obj2, CryptoOrderDraft draft) {
        TextLocalisedClause textLocalisedClause;
        MarketOrderExchangeContract$ExchangeResultPayload result = (MarketOrderExchangeContract$ExchangeResultPayload) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(draft, "draft");
        AccountId accountId = oyh.b.b(k.d(draft).e);
        ExchangeResult exchangeResult = result.f96789a;
        ExchangeStakingData exchangeStakingData = result.f96790b;
        if (!(exchangeResult instanceof ExchangeResult.Success)) {
            return null;
        }
        ExchangeResult.Success result2 = (ExchangeResult.Success) exchangeResult;
        boolean z = result.f96791c;
        g gVar = this.f250643p;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(result2, "result");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        dj0.d dVar = result2.f72153a;
        dj0.d dVar2 = result2.f72154b;
        wd6.e eVar = result2.f72155c;
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254);
        MoneyClause moneyClause = new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8);
        xi0.b bVar = dVar.f115083b;
        String str = bVar.f306286a;
        Clause clauseQ = Intrinsics.f(str, "PTS") ? nub.a.q(new RevPoints(dVar.a()), custom, null, o9.SENSITIVE, 2) : new MoneyClause(dVar.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8);
        int i = f.f250644a[eVar.ordinal()];
        if (i == 1 && Intrinsics.f(str, "PTS")) {
            textLocalisedClause = new TextLocalisedClause(R$string.cryptobuysell_exchange_result_success_title_rev_points_buy_format, v.k(moneyClause, clauseQ), null, 12);
        } else if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature_exchange.api.R$string.exchange_result_success_title_buy_format, v.k(moneyClause, clauseQ), null, 12);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature_exchange.api.R$string.exchange_result_success_title_sell_format, v.k(clauseQ, moneyClause), null, 12);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        Pair pair = (eVar == wd6.e.BUY && Intrinsics.f(str, "PTS")) ? new Pair(u1.b.f216225a, "ID_NO_BUTTON") : gVar.f250645a.a(accountId, true, exchangeStakingData, z);
        return new j0((Clause) textLocalisedClause2, (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) new StatusDialogViewPayload((String) pair.f186386b, exchangeStakingData, bVar, result2.f72154b.f115083b), (u1) pair.f186385a, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4070);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(com.revolut.feature.exchange.models.ExchangeResult r10, com.revolut.core.model.account.AccountId r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qzh.e.d3(com.revolut.feature.exchange.models.ExchangeResult, com.revolut.core.model.account.AccountId, gim.c):java.lang.Object");
    }
}
