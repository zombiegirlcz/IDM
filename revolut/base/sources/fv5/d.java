package fv5;

import a94.q;
import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature_crypto_order_details.api.CryptoOrderDetailsApi$Toggles$CryptoOrderDetailsPager;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.feature_crypto_order_details.api.navigation.TPSLOrderDetailsFeatureConfig;
import com.revolut.feature_exchange.api.navigation.OrderDetailsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import dv5.l;
import efm.r;
import fs2.k;
import io3.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import pt5.m;
import pu5.e;
import pu5.f;
import qua.p;
import skm.p0;
import te0.w;
import tof.a3;
import tof.fc;
import tof.i7;
import tof.o7;
import tof.u9;
import tof.v6;
import tof.va;
import tof.y6;
import w4l.h;
import zhm.d0;
import zkm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends m {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f138349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final iva.a f138350n;
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f138351p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pu5.a f138352q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lt5.a f138353r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pt5.c f138354s;

    public d(l presentationModel, iva.a recurringBuysNavigationProvider, f revXOrderDetailsNavigationProvider, e cryptoTransactionDetailsNavigator, pu5.a cryptoOrderDetailsNavigator, lt5.a source) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(recurringBuysNavigationProvider, "recurringBuysNavigationProvider");
        Intrinsics.checkNotNullParameter(revXOrderDetailsNavigationProvider, "revXOrderDetailsNavigationProvider");
        Intrinsics.checkNotNullParameter(cryptoTransactionDetailsNavigator, "cryptoTransactionDetailsNavigator");
        Intrinsics.checkNotNullParameter(cryptoOrderDetailsNavigator, "cryptoOrderDetailsNavigator");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f138349m = presentationModel;
        this.f138350n = recurringBuysNavigationProvider;
        this.o = revXOrderDetailsNavigationProvider;
        this.f138351p = cryptoTransactionDetailsNavigator;
        this.f138352q = cryptoOrderDetailsNavigator;
        this.f138353r = source;
        this.f138354s = new pt5.c(CryptoInvestmentsFeatureConfig.CurrencyMode.AllCurrencies.f71404a);
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f138354s;
    }

    @Override // pt5.m
    public final vkm.d e3() {
        CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode = ((pt5.c) b3()).f239614a;
        CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency singleCurrency = currencyMode instanceof CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency ? (CryptoInvestmentsFeatureConfig.CurrencyMode.SingleCurrency) currencyMode : null;
        return rd0.e.b(this.f138349m.b(singleCurrency != null ? singleCurrency.f71405a : null));
    }

    @Override // pt5.m
    public final vkm.d f3(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        final l lVar = this.f138349m;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        r rVarW = nim.a.w(osg.b.g(lVar.f118045b, h.f294642c, null, null, i.INTERNAL, null, null, null, LDSFile.EF_DG4_TAG), new q(26, currency));
        final int i = 1;
        r rVarW2 = nim.a.w(rVarW, new Function1() { // from class: dv5.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                l lVar2 = lVar;
                switch (i2) {
                    case 0:
                        i7 it8 = (i7) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return whf.b.a(lVar2.f118044a, w.h(it8), null, null, null, 10);
                    default:
                        Set pocketSet = (Set) obj2;
                        Intrinsics.checkNotNullParameter(pocketSet, "pocketSet");
                        lVar2.getClass();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : pocketSet) {
                            if (((io3.d) obj3).e != io3.l.STAKING) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((io3.d) it9.next()).f163145a);
                        }
                        Set setI1 = d0.i1(arrayList2);
                        i7.c cVar = i7.Companion;
                        y6[] y6VarArr = {y6.COLLECTION_EXCHANGE};
                        cVar.getClass();
                        return i7.c.b(i7.c.a(new u9(false), new o7(), new va(setI1), i7.c.d(y6.REVX_EXCHANGE), i7.c.c(v6.PENDING), fc.b(i7.c.d(y6VarArr))));
                }
            }
        });
        final int i2 = 0;
        return rd0.e.b(pd.b.r(rVarW2, new Function1() { // from class: dv5.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                l lVar2 = lVar;
                switch (i22) {
                    case 0:
                        i7 it8 = (i7) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return whf.b.a(lVar2.f118044a, w.h(it8), null, null, null, 10);
                    default:
                        Set pocketSet = (Set) obj2;
                        Intrinsics.checkNotNullParameter(pocketSet, "pocketSet");
                        lVar2.getClass();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : pocketSet) {
                            if (((io3.d) obj3).e != io3.l.STAKING) {
                                arrayList.add(obj3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((io3.d) it9.next()).f163145a);
                        }
                        Set setI1 = d0.i1(arrayList2);
                        i7.c cVar = i7.Companion;
                        y6[] y6VarArr = {y6.COLLECTION_EXCHANGE};
                        cVar.getClass();
                        return i7.c.b(i7.c.a(new u9(false), new o7(), new va(setI1), i7.c.d(y6.REVX_EXCHANGE), i7.c.c(v6.PENDING), fc.b(i7.c.d(y6VarArr))));
                }
            }
        }));
    }

    @Override // pt5.m
    public final pfm.h g3(pt5.b activityTab) {
        Intrinsics.checkNotNullParameter(activityTab, "activityTab");
        return n3(new FeatureCommand(new CryptoInvestmentsFeatureConfig.Activity(activityTab, ((pt5.c) b3()).f239614a, this.f138353r, null)));
    }

    @Override // pt5.m
    public final pfm.h h3(ExchangeOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        pu5.a aVar = this.f138352q;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(order, "order");
        if (!((jte.d) aVar.f239824a).c(CryptoOrderDetailsApi$Toggles$CryptoOrderDetailsPager.f96656c)) {
            return n3(new FeatureCommand(hx7.q.P(order) ? new TPSLOrderDetailsFeatureConfig(order) : new OrderDetailsFeatureConfig(order)));
        }
        pfm.h hVar = new pfm.h(new f0d.m(this, order, 16), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // pt5.m
    public final efm.b i3(p payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        boolean zC = ((jte.d) this.f138352q.f239824a).c(CryptoOrderDetailsApi$Toggles$CryptoOrderDetailsPager.f96656c);
        iva.a aVar = this.f138350n;
        if (!zC) {
            pfm.a aVar2 = new pfm.a(((pva.d) aVar).b(payment), new fs5.d(21, new k(this, 14)), 4);
            Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
            return aVar2;
        }
        CryptoOrderDetailsInputData.RecurringInputData recurringInputDataA = ((pva.d) aVar).a(payment);
        if (recurringInputDataA != null) {
            pfm.h hVar = new pfm.h(new f0d.m(this, recurringInputDataA, 14), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        pfm.a aVar3 = new pfm.a(((pva.d) aVar).b(payment), new fs5.d(21, new k(this, 14)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
        return aVar3;
    }

    @Override // pt5.m
    public final pfm.a j3(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        p0 p0Var = p0.f264001a;
        return ue0.e.v(pd.b.n(o.f323119a.e, new c(this, orderId, null)));
    }

    @Override // pt5.m
    public final efm.b k3(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        if (!this.f138351p.b(transaction)) {
            return n3(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(transaction), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124)));
        }
        CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode = ((pt5.c) b3()).f239614a;
        ft5.a params = new ft5.a(null, 7);
        l lVar = this.f138349m;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        Intrinsics.checkNotNullParameter(params, "params");
        efm.d0 d0VarFirstOrError = m70.a.g(lVar.e.a(currencyMode, params), null, new fv0.c(1), 1).firstOrError();
        fs5.d dVar = new fs5.d(22, new a(this, transaction, 0));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(new pfm.a(d0VarFirstOrError, dVar, 4), new fs5.d(23, new a(this, transaction, 1)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        return aVar;
    }

    @Override // pt5.m
    public final vkm.d l3() {
        return rd0.e.b(pt5.l.a(this.f138349m, ((pt5.c) b3()).f239614a, null, null, 12));
    }

    @Override // pt5.m
    public final void m3(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        d3(new dv5.p(16, currency));
    }

    public final pfm.h n3(NaviCommand naviCommand) {
        pfm.h hVar = new pfm.h(new f0d.m(this, naviCommand, 15), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
