package q12;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.feature.apm.core.api.ApmToggles$ApmBreakdown;
import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteBreakdownItem;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeFee;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeTax;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteRate;
import com.revolut.feature.apm.core.ui.api.navigation.PaymentsBreakdownNavigation$Descriptor;
import com.revolut.feature.apm.core.ui.api.navigation.PaymentsBreakdownNavigation$InputData;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature_market_data_api.navigation.ExchangeBreakdownFeatureConfig;
import com.revolut.feature_market_data_api.navigation.FeeBreakdownFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import com.revolut.shared.feature.market_data.models.domain.models.OrderRate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements x02.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f241333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2j.a f241334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f241335c;
    public final qpk.b d;

    public l(fk3.a configurationInteractor, l2j.a currencyChooserFlowFactory, gte.a featureToggleInteractor, qpk.b rateDetailsFeatureConfigProvider) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(rateDetailsFeatureConfigProvider, "rateDetailsFeatureConfigProvider");
        this.f241333a = configurationInteractor;
        this.f241334b = currencyChooserFlowFactory;
        this.f241335c = featureToggleInteractor;
        this.d = rateDetailsFeatureConfigProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(m02.b r6, x02.c r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof q12.i
            if (r0 == 0) goto L13
            r0 = r8
            q12.i r0 = (q12.i) r0
            int r1 = r0.f241328x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241328x = r1
            goto L18
        L13:
            q12.i r0 = new q12.i
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241328x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            l2j.a r6 = r0.u
            yhm.o.b(r8)
            goto L44
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r8)
            l2j.a r8 = r5.f241334b
            r0.u = r8
            r0.f241328x = r3
            java.lang.Object r6 = r5.b(r6, r7, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r4 = r8
            r8 = r6
            r6 = r4
        L44:
            com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination$InputData r8 = (com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination.InputData) r8
            com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow r6 = r6.a(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q12.l.a(m02.b, x02.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(m02.b r20, x02.c r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q12.l.b(m02.b, x02.c, gim.c):java.lang.Object");
    }

    public final BridgeDestination c(ApmQuote apmQuote) {
        ApmQuoteChargeTax apmQuoteChargeTax;
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(apmQuote, "apmQuote");
        ApmQuoteCharges apmQuoteCharges = apmQuote.d;
        boolean z = ((apmQuoteCharges == null || (apmQuoteChargeTax = apmQuoteCharges.f62224c) == null || (dVar = apmQuoteChargeTax.f62220a) == null) ? 0L : dVar.f115082a) > 0;
        OrderQuoteParams orderQuoteParamsD = k12.a.d(apmQuote);
        Intrinsics.checkNotNullParameter(apmQuote, "<this>");
        ApmQuoteCharges apmQuoteCharges2 = apmQuote.d;
        if (apmQuoteCharges2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Amount amountA = k12.a.a(apmQuoteCharges2.f62222a);
        ArrayList arrayListE0 = d0.E0(apmQuoteCharges2.f62224c.f62221b, apmQuoteCharges2.f62223b.f62219c);
        ArrayList arrayList = new ArrayList(w.t(arrayListE0, 10));
        Iterator it8 = arrayListE0.iterator();
        while (true) {
            Amount amountA2 = null;
            if (!it8.hasNext()) {
                return u0.c(new FeeBreakdownFeatureConfig(orderQuoteParamsD, new ChargeBreakdown(amountA, arrayList, (Amount) null, 12), c4i.a.EXCHANGE, (AnalyticsProduct.Retail) null, (xi0.b) null, !z, (Clause) null, (HtmlLocalisedClause) null, 1976));
            }
            ApmQuoteBreakdownItem apmQuoteBreakdownItem = (ApmQuoteBreakdownItem) it8.next();
            String str = apmQuoteBreakdownItem.f62216c;
            String str2 = apmQuoteBreakdownItem.f62214a;
            String str3 = apmQuoteBreakdownItem.f62215b;
            Amount amountA3 = k12.a.a(apmQuoteBreakdownItem.d);
            dj0.d dVar2 = apmQuoteBreakdownItem.e;
            if (dVar2 != null) {
                amountA2 = k12.a.a(dVar2);
            }
            arrayList.add(new ChargeEntry(str2, str, str3, amountA3, amountA2));
        }
    }

    public final ParcelableDestination d(dj0.d recipientAmount, FundingSource fundingSource, ApmQuoteDirection direction, ApmQuote apmQuote) {
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(apmQuote, "apmQuote");
        if (((jte.d) this.f241335c).c(ApmToggles$ApmBreakdown.f61777c)) {
            Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
            Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(apmQuote, "apmQuote");
            return new ControllerDestination.Modal(new PaymentsBreakdownNavigation$Descriptor(new PaymentsBreakdownNavigation$InputData(recipientAmount, fundingSource, direction, apmQuote)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        if (Intrinsics.f(recipientAmount.f115083b, fundingSource.f92241b)) {
            return c(apmQuote);
        }
        Intrinsics.checkNotNullParameter(apmQuote, "apmQuote");
        OrderQuoteParams orderQuoteParamsD = k12.a.d(apmQuote);
        Intrinsics.checkNotNullParameter(apmQuote, "<this>");
        ApmQuoteRate apmQuoteRate = apmQuote.f62209a;
        dj0.d dVar = apmQuote.f62210b;
        dj0.d dVar2 = apmQuote.f62211c;
        if (apmQuoteRate == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        double d = apmQuoteRate.f62228a;
        ApmQuoteCharges apmQuoteCharges = apmQuote.d;
        if (apmQuoteCharges == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ApmQuoteChargeTax apmQuoteChargeTax = apmQuoteCharges.f62224c;
        ApmQuoteChargeFee apmQuoteChargeFee = apmQuoteCharges.f62223b;
        f8l.b bVar = f8l.b.TO;
        f8l.b bVar2 = f8l.b.FROM;
        Amount amountA = k12.a.a(dVar2);
        Amount amountA2 = k12.a.a(pyd.c.O(dVar2, apmQuoteCharges.f62222a));
        Amount amountA3 = k12.a.a(dVar);
        Amount amountA4 = k12.a.a(dVar);
        Amount amountA5 = k12.a.a(apmQuoteChargeFee.f62217a);
        ArrayList arrayList = apmQuoteChargeFee.f62219c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(k12.a.c((ApmQuoteBreakdownItem) it8.next()));
        }
        ChargeBreakdown chargeBreakdown = new ChargeBreakdown(amountA5, arrayList2, (Amount) null, 12);
        Amount amountA6 = k12.a.a(apmQuoteChargeTax.f62220a);
        List list = apmQuoteChargeTax.f62221b;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList3.add(k12.a.c((ApmQuoteBreakdownItem) it9.next()));
        }
        return u0.c(new ExchangeBreakdownFeatureConfig(orderQuoteParamsD, new OrderQuote(bVar, bVar2, amountA, amountA2, amountA3, amountA4, new Charges(chargeBreakdown, new ChargeBreakdown(amountA6, arrayList3, (Amount) null, 12), null), f0.f322471a, apmQuoteRate.d, new OrderRate(new BigDecimal(String.valueOf(d)), new BigDecimal(String.valueOf(d)), null, new Amount(new BigDecimal(0), k12.a.b(apmQuoteRate.f62230c)), true), f8l.e.MARKET, null, 33234944), c4i.a.EXCHANGE, null, null, null, null, null, null, null, 4088));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof q12.k
            if (r0 == 0) goto L13
            r0 = r7
            q12.k r0 = (q12.k) r0
            int r1 = r0.f241332w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241332w = r1
            goto L18
        L13:
            q12.k r0 = new q12.k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241332w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6c
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            w4l.h r7 = w4l.h.f294642c
            fk3.a r2 = r6.f241333a
            ik3.c r2 = (ik3.c) r2
            e7l.g$b r4 = e7l.g.b.f123407a
            efm.r r7 = r2.l(r4, r7)
            r2 = 3
            r4 = 0
            efm.r r7 = m70.a.g(r7, r4, r4, r2)
            efm.d0 r7 = r7.firstOrError()
            q09.a r2 = new q09.a
            r4 = 13
            r2.<init>(r4)
            q09.c r4 = new q09.c
            r5 = 6
            r4.<init>(r5, r2)
            r7.getClass()
            ufm.i r2 = new ufm.i
            r5 = 1
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r0.f241332w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q12.l.e(gim.c):java.lang.Object");
    }

    public final BridgeDestination f(ApmQuoteRate rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        return u0.c(dpk.a.a(this.d, rate.f62229b, rate.f62230c, false, false));
    }
}
