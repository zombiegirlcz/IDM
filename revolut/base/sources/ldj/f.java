package ldj;

import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details.PriceTargetsDetailsScreenContract$InputData;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a61.a f194151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pcj.a f194152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final PriceTargetsDetailsScreenContract$InputData f194153r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z0h.d f194154s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f194155t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a61.a commodityPriceTargetsInteractor, pcj.a priceTargetsWidgetExtension, PriceTargetsDetailsScreenContract$InputData inputData, z0h.d wealthDisclaimersDataProvider, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(commodityPriceTargetsInteractor, "commodityPriceTargetsInteractor");
        Intrinsics.checkNotNullParameter(priceTargetsWidgetExtension, "priceTargetsWidgetExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthDisclaimersDataProvider, "wealthDisclaimersDataProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f194151p = commodityPriceTargetsInteractor;
        this.f194152q = priceTargetsWidgetExtension;
        this.f194153r = inputData;
        this.f194154s = wealthDisclaimersDataProvider;
        this.f194155t = new c(0);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, this.f194154s.s1(), null, null, new e(this, continuation, 0), 3);
        PriceTargetsDetailsScreenContract$InputData priceTargetsDetailsScreenContract$InputData = this.f194153r;
        xi0.b bVar = priceTargetsDetailsScreenContract$InputData.f100157a;
        xi0.b bVar2 = priceTargetsDetailsScreenContract$InputData.f100158b;
        l.a1(this, this.f194151p.O(bVar, bVar2, false), null, null, new e(this, continuation, 1), 3);
        l.a1(this, this.f194152q.f3(priceTargetsDetailsScreenContract$InputData.f100157a, bVar2), null, null, new e(this, continuation, 2), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f194155t;
    }
}
