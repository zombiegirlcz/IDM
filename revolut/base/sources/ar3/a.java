package ar3;

import as1.g;
import ba6.p;
import ba6.r;
import ba6.t;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.swish.impl.domain.SwishPaymentLimits;
import com.revolut.feature.apm.swish.impl.ui.home.domain.AreaContent;
import com.revolut.feature.card_management.impl.cardlimit.domain.CardLimitSetData;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.rev_points.models.SpareChangeRefund;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreenContract$ValidationResult;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$CheckoutPrice;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPrice;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import dj0.d;
import gca.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kye.m;
import lh6.h;
import m1c.w1;
import m1c.y;
import m1c.z;
import od0.i;
import org.jmrtd.lds.LDSFile;
import pz2.n;
import t6c.o;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f8511b;

    public /* synthetic */ a(int i, d dVar) {
        this.f8510a = i;
        this.f8511b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        RevPoints revPointsB;
        Object next;
        int i = this.f8510a;
        d downPayment = this.f8511b;
        switch (i) {
            case 0:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : pockets) {
                    xi0.b bVar = downPayment.f115083b;
                    xi0.a aVar = xi0.b.Companion;
                    String str = ((io3.d) obj3).f163147c;
                    aVar.getClass();
                    if (!Intrinsics.f(bVar, xi0.a.a(str))) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((io3.d) it8.next()).f163147c);
                }
                List<String> listU = d0.U(arrayList2);
                ArrayList arrayList3 = new ArrayList(w.t(listU, 10));
                for (String str2 : listU) {
                    xi0.b bVar2 = downPayment.f115083b;
                    xi0.b.Companion.getClass();
                    arrayList3.add(new Pair(bVar2, xi0.a.a(str2)));
                }
                return arrayList3;
            case 1:
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(downPayment.f115083b, downPayment);
                List<n9l.a> list = exchangeRates;
                ArrayList arrayList4 = new ArrayList(w.t(list, 10));
                for (n9l.a aVar2 : list) {
                    arrayList4.add(pyd.c.K(downPayment, aVar2.f213663c, aVar2.f213662b));
                }
                for (Object obj4 : arrayList4) {
                    linkedHashMap.put(((d) obj4).f115083b, obj4);
                }
                return linkedHashMap;
            case 2:
                return g.a((g) obj2, null, null, null, this.f8511b, 31);
            case 3:
                Quote quote = (Quote) obj2;
                Intrinsics.checkNotNullParameter(quote, "quote");
                return new EsimCheckoutPrice(quote, quote.f84399b, downPayment);
            case 4:
                Quote quote2 = (Quote) obj2;
                Intrinsics.checkNotNullParameter(quote2, "quote");
                return new EsimCheckoutPrice(quote2, quote2.f84399b, downPayment);
            case 5:
                Quote quote3 = (Quote) obj2;
                Intrinsics.checkNotNullParameter(quote3, "quote");
                return new EsimCheckoutPrice(quote3, quote3.f84399b, downPayment);
            case 6:
                e85.g update = (e85.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e85.g.a(update, null, downPayment, 3);
            case 7:
                CryptoWithdrawLimits limits = (CryptoWithdrawLimits) obj2;
                Intrinsics.checkNotNullParameter(limits, "limits");
                d dVar = limits.f71095g;
                return Boolean.valueOf(Intrinsics.f(dVar != null ? dVar.f115083b : null, downPayment.f115083b) && downPayment.compareTo(dVar) < 0);
            case 8:
                Quote quote4 = (Quote) obj2;
                Intrinsics.checkNotNullParameter(quote4, "quote");
                return new CheckoutRevPayControllerExtensionContract$CheckoutPrice(quote4, quote4.f84399b, downPayment);
            case 9:
                fw4.d update2 = (fw4.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                d minDownPayment = update2.f138574b;
                d maxDownPayment = update2.f138575c;
                Intrinsics.checkNotNullParameter(downPayment, "downPayment");
                Intrinsics.checkNotNullParameter(minDownPayment, "minDownPayment");
                Intrinsics.checkNotNullParameter(maxDownPayment, "maxDownPayment");
                return new fw4.d(downPayment, minDownPayment, maxDownPayment);
            case 10:
                Intrinsics.h(downPayment);
                return f.a((f) obj2, null, downPayment, null, LDSFile.EF_DG15_TAG);
            case 11:
                Quote quote5 = (Quote) obj2;
                Intrinsics.checkNotNullParameter(quote5, "quote");
                return new com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$CheckoutPrice(quote5, quote5.f84399b, downPayment);
            case 12:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new go.g(downPayment, 2);
            case 13:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return downPayment;
            case 14:
                d dVar2 = this.f8511b;
                Intrinsics.h(dVar2);
                return kd3.f.a((kd3.f) obj2, null, null, null, null, null, dVar2, null, 95);
            case 15:
                return m.a((m) obj2, false, null, null, null, null, this.f8511b, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -33, 63);
            case 16:
                return m.a((m) obj2, false, null, null, null, null, null, null, null, this.f8511b, false, null, null, false, null, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -257, 63);
            case 17:
                h update3 = (h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return h.a(update3, null, downPayment, null, 45);
            case 18:
                h update4 = (h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return h.a(update4, downPayment, null, null, 54);
            case 19:
                lxe.d update5 = (lxe.d) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                CheckoutCustomAmountScreenContract$ValidationResult checkoutCustomAmountScreenContract$ValidationResult = update5.f200560b;
                update5.getClass();
                Intrinsics.checkNotNullParameter(downPayment, "customAmount");
                return new lxe.d(downPayment, checkoutCustomAmountScreenContract$ValidationResult);
            case 20:
                z accountState = (z) obj2;
                Intrinsics.checkNotNullParameter(accountState, "accountState");
                if (accountState instanceof y) {
                    revPointsB = ((y) accountState).f201475a.f201472c;
                } else {
                    if (!(accountState instanceof z.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("RevPointsAccountStatus shouldn't be Inactive");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    revPointsB = qvb.a.b(0L);
                }
                w1 w1Var = w1.NOT_REQUESTED;
                d.Companion.getClass();
                return new SpareChangeRefund("", w1Var, this.f8511b, d.d, revPointsB.f83960a, null, null);
            case 21:
                OrderQuote it11 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new qrb.a(downPayment, e1.m(it11));
            case 22:
                pe2.g update6 = (pe2.g) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                AreaContent areaContent = (AreaContent) zi0.c.I(update6.f235320a);
                SwishPaymentLimits swishPaymentLimits = areaContent.f62929b;
                d payToMerchantLimit = swishPaymentLimits.f62899b;
                d maxPayToPersonLimit = swishPaymentLimits.f62900c;
                Intrinsics.checkNotNullParameter(downPayment, "payToPersonLimit");
                Intrinsics.checkNotNullParameter(payToMerchantLimit, "payToMerchantLimit");
                Intrinsics.checkNotNullParameter(maxPayToPersonLimit, "maxPayToPersonLimit");
                SwishPaymentLimits paymentLimits = new SwishPaymentLimits(downPayment, payToMerchantLimit, maxPayToPersonLimit);
                String phone = areaContent.f62928a;
                Intrinsics.checkNotNullParameter(phone, "phone");
                Intrinsics.checkNotNullParameter(paymentLimits, "paymentLimits");
                Data areaContent2 = zi0.c.P(new AreaContent(phone, paymentLimits), false, null, 3);
                Intrinsics.checkNotNullParameter(areaContent2, "areaContent");
                return new pe2.g(areaContent2);
            case 23:
                pz2.h update7 = (pz2.h) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                CardLimitSetData data = CardLimitSetData.a(update7.f240873a, downPayment);
                boolean zI2 = n.I2(CardLimitSetData.a(update7.f240873a, downPayment));
                Intrinsics.checkNotNullParameter(data, "data");
                return new pz2.h(data, zI2);
            case 24:
                i paymentMethod = (i) obj2;
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                PaymentMethod paymentMethod2 = (PaymentMethod) paymentMethod.f224257a;
                if (paymentMethod2 == null) {
                    return downPayment;
                }
                if (paymentMethod2 instanceof PaymentMethod.Pocket) {
                    obj = ((PaymentMethod.Pocket) paymentMethod2).i;
                } else if (!(paymentMethod2 instanceof PaymentMethod.RevolutAccount) && !(paymentMethod2 instanceof PaymentMethod.Card) && !(paymentMethod2 instanceof PaymentMethod.BankAccount)) {
                    throw new NoWhenBranchMatchedException();
                }
                return obj == null ? downPayment : obj;
            case 25:
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                o.Companion.getClass();
                Intrinsics.checkNotNullParameter(downPayment, "total");
                return new o(u.c(new t6c.f(downPayment, null, null, null)), null, false);
            case 26:
                List campaigns = (List) obj2;
                Intrinsics.checkNotNullParameter(campaigns, "campaigns");
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : campaigns) {
                    r rVar = (r) obj5;
                    Intrinsics.checkNotNullParameter(rVar, "<this>");
                    if (rVar.d == p.LOCKED) {
                        arrayList5.add(obj5);
                    }
                }
                Iterator it13 = arrayList5.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        r rVar2 = (r) it13.next();
                        Iterator it14 = rVar2.e.iterator();
                        while (true) {
                            if (it14.hasNext()) {
                                next = it14.next();
                                if (Intrinsics.f(((d) next).f115083b, downPayment.f115083b)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        d dVar3 = (d) next;
                        t tVar = dVar3 != null ? new t(rVar2, downPayment.e(dVar3)) : null;
                        if (tVar != null) {
                            obj = tVar;
                        }
                    }
                }
                i.Companion.getClass();
                return od0.h.a(obj);
            case 27:
                se1.d updateState = (se1.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return se1.d.a(updateState, this.f8511b, null, false, null, null, 30);
            case 28:
                return se1.d.a((se1.d) obj2, null, null, false, this.f8511b, null, 23);
            default:
                List amounts = (List) obj2;
                Intrinsics.checkNotNullParameter(amounts, "amounts");
                d dVar4 = (d) d0.d0(amounts);
                return Boolean.valueOf((dVar4 != null ? dVar4.f115082a : 0L) > downPayment.f115082a);
        }
    }

    public /* synthetic */ a(d dVar, n nVar) {
        this.f8510a = 23;
        this.f8511b = dVar;
    }
}
