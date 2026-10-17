package b4b;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdInputValue;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CfdOrderData f12227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CfdInputValue f12228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12229c;
    public final Data d;
    public final Data e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f12230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f12231h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f12232j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Data f12233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f12234m;

    public n(CfdOrderData cfdOrderData, CfdInputValue inputState, boolean z, Data marginQuote, Data orderLimits, Set availableOrderTypes, Data portfolio, Data unrealisedPerformance, Data availableToInvest, Data instrumentTicker, boolean z3, Data exitStrategiesWidgetData, t tutorialSettings) {
        Intrinsics.checkNotNullParameter(cfdOrderData, "cfdOrderData");
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(marginQuote, "marginQuote");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        Intrinsics.checkNotNullParameter(availableOrderTypes, "availableOrderTypes");
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
        Intrinsics.checkNotNullParameter(availableToInvest, "availableToInvest");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(exitStrategiesWidgetData, "exitStrategiesWidgetData");
        Intrinsics.checkNotNullParameter(tutorialSettings, "tutorialSettings");
        this.f12227a = cfdOrderData;
        this.f12228b = inputState;
        this.f12229c = z;
        this.d = marginQuote;
        this.e = orderLimits;
        this.f = availableOrderTypes;
        this.f12230g = portfolio;
        this.f12231h = unrealisedPerformance;
        this.i = availableToInvest;
        this.f12232j = instrumentTicker;
        this.k = z3;
        this.f12233l = exitStrategiesWidgetData;
        this.f12234m = tutorialSettings;
    }

    public static n a(n nVar, CfdOrderData cfdOrderData, CfdInputValue cfdInputValue, Data data, Data data2, Set set, Data data3, Data data4, Data data5, Data data6, boolean z, Data data7, t tVar, int i) {
        if ((i & 1) != 0) {
            cfdOrderData = nVar.f12227a;
        }
        CfdOrderData cfdOrderData2 = cfdOrderData;
        CfdInputValue inputState = (i & 2) != 0 ? nVar.f12228b : cfdInputValue;
        boolean z3 = nVar.f12229c;
        Data marginQuote = (i & 8) != 0 ? nVar.d : data;
        Data orderLimits = (i & 16) != 0 ? nVar.e : data2;
        Set availableOrderTypes = (i & 32) != 0 ? nVar.f : set;
        Data portfolio = (i & 64) != 0 ? nVar.f12230g : data3;
        Data unrealisedPerformance = (i & 128) != 0 ? nVar.f12231h : data4;
        Data availableToInvest = (i & 256) != 0 ? nVar.i : data5;
        Data instrumentTicker = (i & 512) != 0 ? nVar.f12232j : data6;
        boolean z4 = (i & 1024) != 0 ? nVar.k : z;
        Data exitStrategiesWidgetData = (i & 2048) != 0 ? nVar.f12233l : data7;
        t tutorialSettings = (i & 4096) != 0 ? nVar.f12234m : tVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(cfdOrderData2, "cfdOrderData");
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(marginQuote, "marginQuote");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        Intrinsics.checkNotNullParameter(availableOrderTypes, "availableOrderTypes");
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
        Intrinsics.checkNotNullParameter(availableToInvest, "availableToInvest");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(exitStrategiesWidgetData, "exitStrategiesWidgetData");
        Intrinsics.checkNotNullParameter(tutorialSettings, "tutorialSettings");
        return new n(cfdOrderData2, inputState, z3, marginQuote, orderLimits, availableOrderTypes, portfolio, unrealisedPerformance, availableToInvest, instrumentTicker, z4, exitStrategiesWidgetData, tutorialSettings);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f12227a, nVar.f12227a) && Intrinsics.f(this.f12228b, nVar.f12228b) && this.f12229c == nVar.f12229c && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f12230g, nVar.f12230g) && Intrinsics.f(this.f12231h, nVar.f12231h) && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f12232j, nVar.f12232j) && this.k == nVar.k && Intrinsics.f(this.f12233l, nVar.f12233l) && Intrinsics.f(this.f12234m, nVar.f12234m);
    }

    public final int hashCode() {
        return this.f12234m.hashCode() + kii.e.c(this.f12233l, j6.a.c(kii.e.c(this.f12232j, kii.e.c(this.i, kii.e.c(this.f12231h, kii.e.c(this.f12230g, p.a.f(kii.e.c(this.e, kii.e.c(this.d, j6.a.c((this.f12228b.hashCode() + (this.f12227a.hashCode() * 31)) * 31, 31, this.f12229c), 31), 31), 31, this.f), 31), 31), 31), 31), 31, this.k), 31);
    }
}
