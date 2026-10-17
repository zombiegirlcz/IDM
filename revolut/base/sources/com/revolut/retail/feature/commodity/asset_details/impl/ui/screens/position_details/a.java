package com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details;

import cli.y;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPosition;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.CommodityPositionDetailsControllerContract$InputData;
import e7l.g;
import i2l.n0;
import i6j.e;
import i6j.f;
import i6j.o;
import i6j.s;
import ik3.c;
import io3.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import oki.h;
import ou5.b;
import wsg.n;
import x8h.k;
import ybl.l;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements e {
    public final CommodityPositionDetailsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f99793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f99794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f99795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f99796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fk3.a f99797t;
    public final lal.a u;
    public final b6j.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f99798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f99799x;

    public a(CommodityPositionDetailsControllerContract$InputData inputData, b commoditiesPortfolioBalanceInteractor, l tradingConfigInteractor, k displayCurrencyInteractor, n walletInteractor, fk3.a configurationInteractor, lal.a commodityPositionsInteractor, b6j.a actionsPanelExtension, s stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(commoditiesPortfolioBalanceInteractor, "commoditiesPortfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(commodityPositionsInteractor, "commodityPositionsInteractor");
        Intrinsics.checkNotNullParameter(actionsPanelExtension, "actionsPanelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f99793p = commoditiesPortfolioBalanceInteractor;
        this.f99794q = tradingConfigInteractor;
        this.f99795r = displayCurrencyInteractor;
        this.f99796s = walletInteractor;
        this.f99797t = configurationInteractor;
        this.u = commodityPositionsInteractor;
        this.v = actionsPanelExtension;
        this.f99798w = d.b(this, new f(0), stateMapper, null, false, 12);
        this.f99799x = hx7.e.a(this, new n0(this, 20));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f99799x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        k kVar = this.f99795r;
        final int i = 0;
        Continuation continuation = null;
        yji.l.b1(this, boh.f.e(kVar.b(), new Function1(this) { // from class: i6j.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a f159032b;

            {
                this.f159032b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                Object next2;
                switch (i) {
                    case 0:
                        xi0.b baseCurrency = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                        com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a aVar = this.f159032b;
                        return rd0.e.b(ou5.b.u(aVar.f99793p, aVar.o.f99790a, baseCurrency));
                    case 1:
                        xi0.b selectedCurrency = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
                        return rd0.e.b(this.f159032b.u.z(selectedCurrency));
                    case 2:
                        CryptoCommodityPositions commodityPositions = (CryptoCommodityPositions) obj2;
                        Intrinsics.checkNotNullParameter(commodityPositions, "commodityPositions");
                        Iterator it8 = commodityPositions.f71383b.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((CryptoCommodityPosition) next).f71379a, this.f159032b.o.f99790a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        return (CryptoCommodityPosition) next;
                    case 3:
                        List it9 = (List) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Iterator it10 = it9.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next2 = it10.next();
                                if (Intrinsics.f(((io3.d) next2).f163147c, this.f159032b.o.f99790a.f306286a)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        return (io3.d) next2;
                    default:
                        e7l.f config = (e7l.f) obj2;
                        Intrinsics.checkNotNullParameter(config, "config");
                        LinkedHashSet linkedHashSet = config.M;
                        CommodityPositionDetailsControllerContract$InputData commodityPositionDetailsControllerContract$InputData = this.f159032b.o;
                        return Boolean.valueOf(linkedHashSet.contains(commodityPositionDetailsControllerContract$InputData.f99790a.f306286a) || config.T.contains(commodityPositionDetailsControllerContract$InputData.f99790a));
                }
            }
        }), null, new o(this, continuation, i), 3);
        io3.l lVar = io3.l.CURRENT;
        i iVar = i.INTERNAL;
        n nVar = this.f99796s;
        w4l.h hVar = w4l.h.f294642c;
        vkm.d dVarB = rd0.e.b(osg.b.g(nVar, hVar, lVar, null, iVar, null, null, null, 116));
        final int i2 = 3;
        yji.l.b1(this, nim.a.v(dVarB, new Function1(this) { // from class: i6j.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a f159032b;

            {
                this.f159032b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                Object next2;
                switch (i2) {
                    case 0:
                        xi0.b baseCurrency = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                        com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a aVar = this.f159032b;
                        return rd0.e.b(ou5.b.u(aVar.f99793p, aVar.o.f99790a, baseCurrency));
                    case 1:
                        xi0.b selectedCurrency = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
                        return rd0.e.b(this.f159032b.u.z(selectedCurrency));
                    case 2:
                        CryptoCommodityPositions commodityPositions = (CryptoCommodityPositions) obj2;
                        Intrinsics.checkNotNullParameter(commodityPositions, "commodityPositions");
                        Iterator it8 = commodityPositions.f71383b.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((CryptoCommodityPosition) next).f71379a, this.f159032b.o.f99790a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        return (CryptoCommodityPosition) next;
                    case 3:
                        List it9 = (List) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Iterator it10 = it9.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next2 = it10.next();
                                if (Intrinsics.f(((io3.d) next2).f163147c, this.f159032b.o.f99790a.f306286a)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        return (io3.d) next2;
                    default:
                        e7l.f config = (e7l.f) obj2;
                        Intrinsics.checkNotNullParameter(config, "config");
                        LinkedHashSet linkedHashSet = config.M;
                        CommodityPositionDetailsControllerContract$InputData commodityPositionDetailsControllerContract$InputData = this.f159032b.o;
                        return Boolean.valueOf(linkedHashSet.contains(commodityPositionDetailsControllerContract$InputData.f99790a.f306286a) || config.T.contains(commodityPositionDetailsControllerContract$InputData.f99790a));
                }
            }
        }), null, new o(this, continuation, i2), 3);
        final int i3 = 4;
        yji.l.b1(this, l.d(this.f99794q), null, new o(this, continuation, i3), 3);
        yji.l.b1(this, nim.a.v(rd0.e.b(((c) this.f99797t).l(g.b.f123407a, hVar)), new Function1(this) { // from class: i6j.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a f159032b;

            {
                this.f159032b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                Object next2;
                switch (i3) {
                    case 0:
                        xi0.b baseCurrency = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                        com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a aVar = this.f159032b;
                        return rd0.e.b(ou5.b.u(aVar.f99793p, aVar.o.f99790a, baseCurrency));
                    case 1:
                        xi0.b selectedCurrency = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
                        return rd0.e.b(this.f159032b.u.z(selectedCurrency));
                    case 2:
                        CryptoCommodityPositions commodityPositions = (CryptoCommodityPositions) obj2;
                        Intrinsics.checkNotNullParameter(commodityPositions, "commodityPositions");
                        Iterator it8 = commodityPositions.f71383b.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((CryptoCommodityPosition) next).f71379a, this.f159032b.o.f99790a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        return (CryptoCommodityPosition) next;
                    case 3:
                        List it9 = (List) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Iterator it10 = it9.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next2 = it10.next();
                                if (Intrinsics.f(((io3.d) next2).f163147c, this.f159032b.o.f99790a.f306286a)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        return (io3.d) next2;
                    default:
                        e7l.f config = (e7l.f) obj2;
                        Intrinsics.checkNotNullParameter(config, "config");
                        LinkedHashSet linkedHashSet = config.M;
                        CommodityPositionDetailsControllerContract$InputData commodityPositionDetailsControllerContract$InputData = this.f159032b.o;
                        return Boolean.valueOf(linkedHashSet.contains(commodityPositionDetailsControllerContract$InputData.f99790a.f306286a) || config.T.contains(commodityPositionDetailsControllerContract$InputData.f99790a));
                }
            }
        }), null, new o(this, continuation, 2), 3);
        final int i5 = 1;
        Flow flowE = boh.f.e(kVar.b(), new Function1(this) { // from class: i6j.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a f159032b;

            {
                this.f159032b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                Object next2;
                switch (i5) {
                    case 0:
                        xi0.b baseCurrency = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                        com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a aVar = this.f159032b;
                        return rd0.e.b(ou5.b.u(aVar.f99793p, aVar.o.f99790a, baseCurrency));
                    case 1:
                        xi0.b selectedCurrency = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
                        return rd0.e.b(this.f159032b.u.z(selectedCurrency));
                    case 2:
                        CryptoCommodityPositions commodityPositions = (CryptoCommodityPositions) obj2;
                        Intrinsics.checkNotNullParameter(commodityPositions, "commodityPositions");
                        Iterator it8 = commodityPositions.f71383b.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((CryptoCommodityPosition) next).f71379a, this.f159032b.o.f99790a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        return (CryptoCommodityPosition) next;
                    case 3:
                        List it9 = (List) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Iterator it10 = it9.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next2 = it10.next();
                                if (Intrinsics.f(((io3.d) next2).f163147c, this.f159032b.o.f99790a.f306286a)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        return (io3.d) next2;
                    default:
                        e7l.f config = (e7l.f) obj2;
                        Intrinsics.checkNotNullParameter(config, "config");
                        LinkedHashSet linkedHashSet = config.M;
                        CommodityPositionDetailsControllerContract$InputData commodityPositionDetailsControllerContract$InputData = this.f159032b.o;
                        return Boolean.valueOf(linkedHashSet.contains(commodityPositionDetailsControllerContract$InputData.f99790a.f306286a) || config.T.contains(commodityPositionDetailsControllerContract$InputData.f99790a));
                }
            }
        });
        final int i6 = 2;
        yji.l.b1(this, nim.a.v(flowE, new Function1(this) { // from class: i6j.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a f159032b;

            {
                this.f159032b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                Object next2;
                switch (i6) {
                    case 0:
                        xi0.b baseCurrency = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                        com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.a aVar = this.f159032b;
                        return rd0.e.b(ou5.b.u(aVar.f99793p, aVar.o.f99790a, baseCurrency));
                    case 1:
                        xi0.b selectedCurrency = (xi0.b) obj2;
                        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
                        return rd0.e.b(this.f159032b.u.z(selectedCurrency));
                    case 2:
                        CryptoCommodityPositions commodityPositions = (CryptoCommodityPositions) obj2;
                        Intrinsics.checkNotNullParameter(commodityPositions, "commodityPositions");
                        Iterator it8 = commodityPositions.f71383b.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((CryptoCommodityPosition) next).f71379a, this.f159032b.o.f99790a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        return (CryptoCommodityPosition) next;
                    case 3:
                        List it9 = (List) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        Iterator it10 = it9.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next2 = it10.next();
                                if (Intrinsics.f(((io3.d) next2).f163147c, this.f159032b.o.f99790a.f306286a)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        return (io3.d) next2;
                    default:
                        e7l.f config = (e7l.f) obj2;
                        Intrinsics.checkNotNullParameter(config, "config");
                        LinkedHashSet linkedHashSet = config.M;
                        CommodityPositionDetailsControllerContract$InputData commodityPositionDetailsControllerContract$InputData = this.f159032b.o;
                        return Boolean.valueOf(linkedHashSet.contains(commodityPositionDetailsControllerContract$InputData.f99790a.f306286a) || config.T.contains(commodityPositionDetailsControllerContract$InputData.f99790a));
                }
            }
        }), null, new o(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f99798w;
    }
}
