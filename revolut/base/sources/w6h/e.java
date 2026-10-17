package w6h;

import a82.l;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.feature.wealth.gia.margin_trading.impl.navigation.internal_destinations.MarginStatusDestination;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingStatus;
import com.revolut.feature.wealth.models.margin.WealthMarginStatus;
import ip0.v7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import r10.r;
import x8h.k;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends w5h.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w5h.d f295439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r f295440m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f295441n;
    public final vki.a o;

    public e(w5h.d inputData, r wealthMarginBorrowingStatusInteractor, k displayCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthMarginBorrowingStatusInteractor, "wealthMarginBorrowingStatusInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        this.f295439l = inputData;
        this.f295440m = wealthMarginBorrowingStatusInteractor;
        this.f295441n = displayCurrencyInteractor;
        this.o = pyd.c.a(this, new w5h.c(null));
    }

    public static final w5h.f b3(e eVar, od0.i iVar) {
        w5h.e eVar2;
        WealthMarginBorrowingStatus wealthMarginBorrowingStatus;
        udh.c cVar;
        WealthMarginStatus wealthMarginStatus = (WealthMarginStatus) iVar.g();
        if (wealthMarginStatus == null || (wealthMarginBorrowingStatus = wealthMarginStatus.e) == null || (cVar = wealthMarginBorrowingStatus.f95670a) == null) {
            eVar2 = null;
        } else {
            int i = c.f295437a[cVar.ordinal()];
            if (i == 1) {
                eVar2 = w5h.e.GOOD;
            } else if (i == 2) {
                eVar2 = w5h.e.WARNING;
            } else if (i == 3 || i == 4) {
                eVar2 = w5h.e.LIQUIDATION;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar2 = null;
            }
        }
        WealthMarginStatus wealthMarginStatus2 = (WealthMarginStatus) iVar.g();
        Double dO = wealthMarginStatus2 != null ? x5d.b.o(wealthMarginStatus2) : null;
        if (eVar2 == null || dO == null) {
            return null;
        }
        return new w5h.f(eVar2, dO.doubleValue());
    }

    @Override // yji.n
    public final void H2() {
        String portfolioId = this.f295439l.f295271a;
        r rVar = this.f295440m;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        n.l2(this, v7.y("MarginStatusWidgetControllerModelExtension", "user margin onboarded error", c6d.b.i(u0.m(nim.a.v(rVar.u(portfolioId, null, loadingStrategy), new l(26)), this.f295441n.b()), new w3c.n(this, 8))), null, new w50.g(this, (Continuation) null, 3), 3);
    }

    @Override // w5h.b
    public final void Z2(BannerDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.k instanceof i) {
            A2(new MarginStatusDestination(this.f295439l.f295271a));
        }
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
