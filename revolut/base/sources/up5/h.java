package up5;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.remittance.models.domain.fees.CryptoWithdrawFeesBreakdownDetail;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoFeesBreakdown;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoFeesBreakdownDetail;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection_custom.CustomBillScreen;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import eq5.n1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281895a;

    public /* synthetic */ h(int i) {
        this.f281895a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FiatCryptoMoney fiatCryptoMoney;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = null;
        switch (this.f281895a) {
            case 0:
                n1 it8 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f128296b;
            case 1:
                return h30.l.q("it", (od0.i) obj2);
            case 2:
                od0.i it9 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return zi0.c.P(((FundingSource) it9.c()).getF92243g(), false, null, 3);
            case 3:
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                eq5.q qVar = (eq5.q) it10.getContent();
                if (qVar == null || (fiatCryptoMoney = qVar.f128301a) == null) {
                    return null;
                }
                return fiatCryptoMoney.f71113b;
            case 4:
                Data it11 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (CryptoAddress) it11.getContent();
            case 5:
                d step = (d) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                return Boolean.valueOf(step == d.REVIEW);
            case 6:
                CryptoAddress it12 = (CryptoAddress) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                od0.h hVar = od0.i.Companion;
                CryptoWithdrawLimits cryptoWithdrawLimits = it12.f71067n;
                hVar.getClass();
                return od0.h.a(cryptoWithdrawLimits);
            case 7:
                n1 it13 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f128295a;
            case 8:
                CryptoWithdrawFeesBreakdown it14 = (CryptoWithdrawFeesBreakdown) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return zi0.c.P(it14, false, null, 3);
            case 9:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                CryptoWithdrawFeesBreakdown cryptoWithdrawFeesBreakdown = (CryptoWithdrawFeesBreakdown) rVar.f314201a;
                List exchangeRates = (List) rVar.f314202b;
                xi0.b to6 = (xi0.b) rVar.f314203c;
                n9l.a aVar = (n9l.a) zhm.d0.d0(exchangeRates);
                if (aVar == null) {
                    throw new IllegalStateException("CryptoWithdrawToAddressPresentationModel.observeFeesBreakdown() error: exchangeRates are empty!");
                }
                xi0.b cryptoCurrency = aVar.f213661a;
                if (Intrinsics.f(cryptoCurrency, to6)) {
                    xi0.b baseCurrency = aVar.f213662b;
                    Intrinsics.checkNotNullParameter(cryptoWithdrawFeesBreakdown, "<this>");
                    Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                    Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                    dj0.d dVar = cryptoWithdrawFeesBreakdown.f71089a;
                    FiatCryptoMoney fiatCryptoMoneyB = dVar != null ? hx7.i.B(dVar, exchangeRates, baseCurrency) : null;
                    dj0.d dVar2 = cryptoWithdrawFeesBreakdown.f71090b;
                    FiatCryptoMoney fiatCryptoMoneyB2 = dVar2 != null ? hx7.i.B(dVar2, exchangeRates, baseCurrency) : null;
                    dj0.d dVar3 = cryptoWithdrawFeesBreakdown.f71091c;
                    FiatCryptoMoney fiatCryptoMoneyB3 = dVar3 != null ? hx7.i.B(dVar3, exchangeRates, baseCurrency) : null;
                    dj0.d dVar4 = cryptoWithdrawFeesBreakdown.d;
                    FiatCryptoMoney fiatCryptoMoneyB4 = dVar4 != null ? hx7.i.B(dVar4, exchangeRates, baseCurrency) : null;
                    FiatCryptoMoney fiatCryptoMoneyB5 = hx7.i.B(cryptoWithdrawFeesBreakdown.e, exchangeRates, baseCurrency);
                    List list = cryptoWithdrawFeesBreakdown.f;
                    if (list != null) {
                        List<CryptoWithdrawFeesBreakdownDetail> list2 = list;
                        arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                        for (CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail : list2) {
                            FiatCryptoMoney amount = hx7.i.B(cryptoWithdrawFeesBreakdownDetail.d, exchangeRates, baseCurrency);
                            Intrinsics.checkNotNullParameter(cryptoWithdrawFeesBreakdownDetail, "<this>");
                            Intrinsics.checkNotNullParameter(amount, "amount");
                            arrayList3.add(new FiatCryptoFeesBreakdownDetail(cryptoWithdrawFeesBreakdownDetail.f70990a, cryptoWithdrawFeesBreakdownDetail.f70991b, cryptoWithdrawFeesBreakdownDetail.f70992c, amount, cryptoWithdrawFeesBreakdownDetail.e));
                        }
                    }
                    return new FiatCryptoFeesBreakdown(fiatCryptoMoneyB, fiatCryptoMoneyB2, fiatCryptoMoneyB3, fiatCryptoMoneyB4, fiatCryptoMoneyB5, arrayList3);
                }
                ArrayList swappedExchangeRates = edl.a.u(exchangeRates);
                if (Intrinsics.f(cryptoWithdrawFeesBreakdown.e.f115083b, cryptoCurrency)) {
                    Intrinsics.checkNotNullParameter(cryptoWithdrawFeesBreakdown, "<this>");
                    Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                    Intrinsics.checkNotNullParameter(to6, "to");
                    dj0.d dVar5 = cryptoWithdrawFeesBreakdown.f71089a;
                    dj0.d dVarD = dVar5 != null ? hx7.i.d(dVar5, exchangeRates, to6) : null;
                    dj0.d dVar6 = cryptoWithdrawFeesBreakdown.f71090b;
                    dj0.d dVarD2 = dVar6 != null ? hx7.i.d(dVar6, exchangeRates, to6) : null;
                    dj0.d dVar7 = cryptoWithdrawFeesBreakdown.f71091c;
                    dj0.d dVarD3 = dVar7 != null ? hx7.i.d(dVar7, exchangeRates, to6) : null;
                    dj0.d dVar8 = cryptoWithdrawFeesBreakdown.d;
                    dj0.d dVarD4 = dVar8 != null ? hx7.i.d(dVar8, exchangeRates, to6) : null;
                    dj0.d dVarG0 = hx7.i.g0(hx7.i.d(cryptoWithdrawFeesBreakdown.e, exchangeRates, to6), to6);
                    List list3 = cryptoWithdrawFeesBreakdown.f;
                    if (list3 != null) {
                        List<CryptoWithdrawFeesBreakdownDetail> list4 = list3;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                        for (CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail2 : list4) {
                            dj0.d amount2 = hx7.i.g0(hx7.i.d(cryptoWithdrawFeesBreakdownDetail2.d, exchangeRates, to6), to6);
                            String title = cryptoWithdrawFeesBreakdownDetail2.f70990a;
                            String description = cryptoWithdrawFeesBreakdownDetail2.f70991b;
                            String shortDescription = cryptoWithdrawFeesBreakdownDetail2.f70992c;
                            dj0.d dVar9 = cryptoWithdrawFeesBreakdownDetail2.e;
                            Intrinsics.checkNotNullParameter(title, "title");
                            Intrinsics.checkNotNullParameter(description, "description");
                            Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
                            Intrinsics.checkNotNullParameter(amount2, "amount");
                            arrayList4.add(new CryptoWithdrawFeesBreakdownDetail(title, description, shortDescription, amount2, dVar9));
                            to6 = to6;
                        }
                        arrayList2 = arrayList4;
                    } else {
                        arrayList2 = null;
                    }
                    cryptoWithdrawFeesBreakdown = new CryptoWithdrawFeesBreakdown(dVarD, dVarD2, dVarD3, dVarD4, dVarG0, arrayList2);
                }
                Intrinsics.checkNotNullParameter(cryptoWithdrawFeesBreakdown, "<this>");
                Intrinsics.checkNotNullParameter(swappedExchangeRates, "swappedExchangeRates");
                Intrinsics.checkNotNullParameter(cryptoCurrency, "cryptoCurrency");
                dj0.d dVar10 = cryptoWithdrawFeesBreakdown.f71089a;
                FiatCryptoMoney fiatCryptoMoneyC = dVar10 != null ? hx7.i.C(dVar10, swappedExchangeRates, cryptoCurrency) : null;
                dj0.d dVar11 = cryptoWithdrawFeesBreakdown.f71090b;
                FiatCryptoMoney fiatCryptoMoneyC2 = dVar11 != null ? hx7.i.C(dVar11, swappedExchangeRates, cryptoCurrency) : null;
                dj0.d dVar12 = cryptoWithdrawFeesBreakdown.f71091c;
                FiatCryptoMoney fiatCryptoMoneyC3 = dVar12 != null ? hx7.i.C(dVar12, swappedExchangeRates, cryptoCurrency) : null;
                dj0.d dVar13 = cryptoWithdrawFeesBreakdown.d;
                FiatCryptoMoney fiatCryptoMoneyC4 = dVar13 != null ? hx7.i.C(dVar13, swappedExchangeRates, cryptoCurrency) : null;
                FiatCryptoMoney fiatCryptoMoneyC5 = hx7.i.C(cryptoWithdrawFeesBreakdown.e, swappedExchangeRates, cryptoCurrency);
                List list5 = cryptoWithdrawFeesBreakdown.f;
                if (list5 != null) {
                    List<CryptoWithdrawFeesBreakdownDetail> list6 = list5;
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(list6, 10));
                    for (CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail3 : list6) {
                        FiatCryptoMoney amount3 = hx7.i.C(cryptoWithdrawFeesBreakdownDetail3.d, swappedExchangeRates, cryptoCurrency);
                        Intrinsics.checkNotNullParameter(cryptoWithdrawFeesBreakdownDetail3, "<this>");
                        Intrinsics.checkNotNullParameter(amount3, "amount");
                        arrayList5.add(new FiatCryptoFeesBreakdownDetail(cryptoWithdrawFeesBreakdownDetail3.f70990a, cryptoWithdrawFeesBreakdownDetail3.f70991b, cryptoWithdrawFeesBreakdownDetail3.f70992c, amount3, cryptoWithdrawFeesBreakdownDetail3.e));
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                return new FiatCryptoFeesBreakdown(fiatCryptoMoneyC, fiatCryptoMoneyC2, fiatCryptoMoneyC3, fiatCryptoMoneyC4, fiatCryptoMoneyC5, arrayList);
            case 10:
                return h30.l.q("it", (od0.i) obj2);
            case 11:
                od0.i it15 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return (xi0.b) it15.c();
            case 12:
                FiatCryptoMoney it16 = (FiatCryptoMoney) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f71113b;
            case 13:
                Data it17 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17.getContent() != null);
            case 14:
                Data it18 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return (xi0.b) it18.getContent();
            case 15:
                return h30.l.q("it", (od0.i) obj2);
            case 16:
                return (FundingSource) ((od0.i) obj2).f224257a;
            case 17:
                FundingSource fundingSource = (FundingSource) obj2;
                Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
                PocketSource pocketSource = fundingSource instanceof PocketSource ? (PocketSource) fundingSource : null;
                io3.d dVar14 = pocketSource != null ? pocketSource.d : null;
                if (dVar14 != null) {
                    return new wp5.l(dVar14, dVar14.f == io3.k.ACTIVE);
                }
                return wp5.m.f299131a;
            case 18:
                od0.i it19 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(it19.f224257a != null);
            case 19:
                FundingSource fundingSource2 = (FundingSource) ((od0.i) obj2).f224257a;
                if (fundingSource2 != null) {
                    return fundingSource2.f92240a;
                }
                return null;
            case 20:
                nqi.c it20 = (nqi.c) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f218471a.f115083b;
            case 21:
                List it21 = (List) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return zi0.c.P(it21, false, null, 3);
            case 22:
                od0.i it22 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return (FundingSource) it22.f224257a;
            case 23:
                List it23 = (List) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return zi0.c.P(it23, false, null, 3);
            case 24:
                PaymentPocketInfo it24 = (PaymentPocketInfo) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return zi0.c.P(it24, false, null, 3);
            case 25:
                Throwable it25 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return new Data(null, it25, false, 5, null);
            case 26:
                CryptoAddress it26 = (CryptoAddress) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return it26.f71059a;
            case 27:
                do3.n it27 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return do3.q.y(it27);
            case 28:
                KProperty[] kPropertyArr = CustomBillScreen.f79238d0;
                Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "it");
                return Unit.f186387a;
            default:
                KProperty[] kPropertyArr2 = CustomBillScreen.f79238d0;
                Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "it");
                return Unit.f186387a;
        }
    }
}
