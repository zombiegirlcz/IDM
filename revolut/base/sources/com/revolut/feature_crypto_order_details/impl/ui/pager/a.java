package com.revolut.feature_crypto_order_details.impl.ui.pager;

import cli.y;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$OrderPage;
import efm.r;
import hy2.k;
import hyh.b;
import hyh.c;
import hyh.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import md6.s;
import mra.d;
import oki.h;
import rd0.e;
import yji.l;
import yua.q;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final CryptoOrderDetailsPagerFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p0i.b f96671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xua.a f96672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t70.b f96673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f96674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ali.b f96675t;

    public a(CryptoOrderDetailsPagerFlowContract$InputData inputData, p0i.b fxOrderInteractor, xua.a recurringPaymentInteractor, t70.b currenciesLocalization, g saveStateDelegate) {
        String str;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        this.o = inputData;
        this.f96671p = fxOrderInteractor;
        this.f96672q = recurringPaymentInteractor;
        this.f96673r = currenciesLocalization;
        CryptoOrderDetailsInputData cryptoOrderDetailsInputData = inputData.f96664a;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailsInputData, "<this>");
        if (cryptoOrderDetailsInputData instanceof CryptoOrderDetailsInputData.TpslInputData) {
            str = ((CryptoOrderDetailsInputData.TpslInputData) cryptoOrderDetailsInputData).f96662a.getF72134a().f72137a;
        } else if (cryptoOrderDetailsInputData instanceof CryptoOrderDetailsInputData.StopLimitInputData) {
            str = ((CryptoOrderDetailsInputData.StopLimitInputData) cryptoOrderDetailsInputData).f96661a.getF72134a().f72137a;
        } else {
            if (!(cryptoOrderDetailsInputData instanceof CryptoOrderDetailsInputData.RecurringInputData)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((CryptoOrderDetailsInputData.RecurringInputData) cryptoOrderDetailsInputData).f96658a;
        }
        CryptoOrderDetailsInputData cryptoOrderDetailsInputData2 = inputData.f96664a;
        Intrinsics.checkNotNullParameter(cryptoOrderDetailsInputData2, "<this>");
        Object recurring = null;
        if (cryptoOrderDetailsInputData2 instanceof CryptoOrderDetailsInputData.TpslInputData) {
            ExchangeOrder exchangeOrder = ((CryptoOrderDetailsInputData.TpslInputData) cryptoOrderDetailsInputData2).f96662a;
            ExchangeOrder.Active active = exchangeOrder instanceof ExchangeOrder.Active ? (ExchangeOrder.Active) exchangeOrder : null;
            if (active != null) {
                recurring = new CryptoOrderDetailsPagerFlowContract$OrderPage.Exchange(active);
            }
        } else if (cryptoOrderDetailsInputData2 instanceof CryptoOrderDetailsInputData.StopLimitInputData) {
            ExchangeOrder exchangeOrder2 = ((CryptoOrderDetailsInputData.StopLimitInputData) cryptoOrderDetailsInputData2).f96661a;
            ExchangeOrder.Active active2 = exchangeOrder2 instanceof ExchangeOrder.Active ? (ExchangeOrder.Active) exchangeOrder2 : null;
            if (active2 != null) {
                recurring = new CryptoOrderDetailsPagerFlowContract$OrderPage.Exchange(active2);
            }
        } else {
            if (!(cryptoOrderDetailsInputData2 instanceof CryptoOrderDetailsInputData.RecurringInputData)) {
                throw new NoWhenBranchMatchedException();
            }
            recurring = new CryptoOrderDetailsPagerFlowContract$OrderPage.Recurring((CryptoOrderDetailsInputData.RecurringInputData) cryptoOrderDetailsInputData2);
        }
        this.f96674s = d.b(this, new c(str, v.l(recurring)), new hyh.h(), saveStateDelegate, false, 8);
        this.f96675t = s.b(this, new hy2.b(7));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f96675t;
    }

    @Override // yji.l
    public final void I1() {
        final int i = 0;
        r rVarW = nim.a.w(((x0i.g) this.f96671p).f301642a.e.f(Unit.f186387a, true), new Function1(this) { // from class: hyh.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature_crypto_order_details.impl.ui.pager.a f156879b;

            {
                this.f156879b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        List orders = (List) obj2;
                        Intrinsics.checkNotNullParameter(orders, "orders");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : orders) {
                            ExchangeOrder exchangeOrder = (ExchangeOrder) obj3;
                            if (cp5.d.z(exchangeOrder.getF72134a().e) || cp5.d.z(exchangeOrder.getF72134a().f)) {
                                xi0.b bVar = this.f156879b.o.f96666c;
                                if (bVar == null || Intrinsics.f(exchangeOrder.getF72134a().e, bVar) || Intrinsics.f(exchangeOrder.getF72134a().f, bVar)) {
                                    arrayList.add(obj3);
                                }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : arrayList) {
                            if (obj4 instanceof ExchangeOrder.Active) {
                                arrayList2.add(obj4);
                            }
                        }
                        List listP0 = d0.P0(arrayList2, new f());
                        ArrayList arrayList3 = new ArrayList(w.t(listP0, 10));
                        Iterator it8 = listP0.iterator();
                        while (it8.hasNext()) {
                            arrayList3.add(new CryptoOrderDetailsPagerFlowContract$OrderPage.Exchange((ExchangeOrder.Active) it8.next()));
                        }
                        return arrayList3;
                    default:
                        com.revolut.feature_crypto_order_details.impl.ui.pager.a aVar = this.f156879b;
                        t70.b bVar2 = aVar.f96673r;
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        ArrayList arrayListE0 = d0.E0((List) pair.f186385a, (List) pair.f186386b);
                        String str = aVar.o.f96665b;
                        if (kotlin.text.d0.W(str)) {
                            return arrayListE0;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj5 : arrayListE0) {
                            CryptoOrderDetailsPagerFlowContract$OrderPage cryptoOrderDetailsPagerFlowContract$OrderPage = (CryptoOrderDetailsPagerFlowContract$OrderPage) obj5;
                            if (cryptoOrderDetailsPagerFlowContract$OrderPage instanceof CryptoOrderDetailsPagerFlowContract$OrderPage.Exchange) {
                                ExchangeOrder.Active active = ((CryptoOrderDetailsPagerFlowContract$OrderPage.Exchange) cryptoOrderDetailsPagerFlowContract$OrderPage).f96667a;
                                if (jli.g.h(bVar2.c(active.f72129a.e), str) || jli.g.h(bVar2.c(active.f72129a.f), str)) {
                                    arrayList4.add(obj5);
                                }
                            } else {
                                if (!(cryptoOrderDetailsPagerFlowContract$OrderPage instanceof CryptoOrderDetailsPagerFlowContract$OrderPage.Recurring)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                CryptoOrderDetailsInputData.RecurringInputData recurringInputData = ((CryptoOrderDetailsPagerFlowContract$OrderPage.Recurring) cryptoOrderDetailsPagerFlowContract$OrderPage).f96668a;
                                if (jli.g.h(bVar2.c(recurringInputData.d), str) || jli.g.h(bVar2.c(recurringInputData.f), str)) {
                                    arrayList4.add(obj5);
                                }
                            }
                        }
                        return arrayList4;
                }
            }
        });
        xi0.b bVar = this.o.f96666c;
        q qVar = (q) this.f96672q;
        r rVarD = u1.d(rVarW, nim.a.w(nim.a.w(qVar.s(false, qua.y.f249342a, false), new vgc.b(qVar, bVar, 17)), new k(this, 3)));
        final int i2 = 1;
        l.a1(this, e.b(nim.a.w(rVarD, new Function1(this) { // from class: hyh.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature_crypto_order_details.impl.ui.pager.a f156879b;

            {
                this.f156879b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        List orders = (List) obj2;
                        Intrinsics.checkNotNullParameter(orders, "orders");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : orders) {
                            ExchangeOrder exchangeOrder = (ExchangeOrder) obj3;
                            if (cp5.d.z(exchangeOrder.getF72134a().e) || cp5.d.z(exchangeOrder.getF72134a().f)) {
                                xi0.b bVar2 = this.f156879b.o.f96666c;
                                if (bVar2 == null || Intrinsics.f(exchangeOrder.getF72134a().e, bVar2) || Intrinsics.f(exchangeOrder.getF72134a().f, bVar2)) {
                                    arrayList.add(obj3);
                                }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : arrayList) {
                            if (obj4 instanceof ExchangeOrder.Active) {
                                arrayList2.add(obj4);
                            }
                        }
                        List listP0 = d0.P0(arrayList2, new f());
                        ArrayList arrayList3 = new ArrayList(w.t(listP0, 10));
                        Iterator it8 = listP0.iterator();
                        while (it8.hasNext()) {
                            arrayList3.add(new CryptoOrderDetailsPagerFlowContract$OrderPage.Exchange((ExchangeOrder.Active) it8.next()));
                        }
                        return arrayList3;
                    default:
                        com.revolut.feature_crypto_order_details.impl.ui.pager.a aVar = this.f156879b;
                        t70.b bVar22 = aVar.f96673r;
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        ArrayList arrayListE0 = d0.E0((List) pair.f186385a, (List) pair.f186386b);
                        String str = aVar.o.f96665b;
                        if (kotlin.text.d0.W(str)) {
                            return arrayListE0;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj5 : arrayListE0) {
                            CryptoOrderDetailsPagerFlowContract$OrderPage cryptoOrderDetailsPagerFlowContract$OrderPage = (CryptoOrderDetailsPagerFlowContract$OrderPage) obj5;
                            if (cryptoOrderDetailsPagerFlowContract$OrderPage instanceof CryptoOrderDetailsPagerFlowContract$OrderPage.Exchange) {
                                ExchangeOrder.Active active = ((CryptoOrderDetailsPagerFlowContract$OrderPage.Exchange) cryptoOrderDetailsPagerFlowContract$OrderPage).f96667a;
                                if (jli.g.h(bVar22.c(active.f72129a.e), str) || jli.g.h(bVar22.c(active.f72129a.f), str)) {
                                    arrayList4.add(obj5);
                                }
                            } else {
                                if (!(cryptoOrderDetailsPagerFlowContract$OrderPage instanceof CryptoOrderDetailsPagerFlowContract$OrderPage.Recurring)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                CryptoOrderDetailsInputData.RecurringInputData recurringInputData = ((CryptoOrderDetailsPagerFlowContract$OrderPage.Recurring) cryptoOrderDetailsPagerFlowContract$OrderPage).f96668a;
                                if (jli.g.h(bVar22.c(recurringInputData.d), str) || jli.g.h(bVar22.c(recurringInputData.f), str)) {
                                    arrayList4.add(obj5);
                                }
                            }
                        }
                        return arrayList4;
                }
            }
        })), null, null, new hp2.d(this, null, 20), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f96674s;
    }
}
