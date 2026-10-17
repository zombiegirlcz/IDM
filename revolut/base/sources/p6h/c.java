package p6h;

import cam.f;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest.WealthMarginBorrowingInterestScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest.WealthMarginBorrowingInterestScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;
import p5a.m;
import r10.r;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends u5h.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u5h.d f233310l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r f233311m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f233312n;

    public c(u5h.d inputData, r wealthMarginInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthMarginInteractor, "wealthMarginInteractor");
        this.f233310l = inputData;
        this.f233311m = wealthMarginInteractor;
        this.f233312n = pyd.c.a(this, new u5h.c(null));
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, com.revolut.data.database.models.openbanking.d.x("MarginBorrowingInterestRateWidgetControllerModelExtension", "interest widget observe borrowing limit", nim.a.v(vzg.a.e(this.f233311m, this.f233310l.f277453a), new m(6))), null, new ox5.r(this, null, 12), 3);
    }

    @Override // u5h.b
    public final void Z2(CellDetailsActionDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.f51787l;
        if (obj2 instanceof d) {
            n.P2(this, new WealthMarginBorrowingInterestScreen(new WealthMarginBorrowingInterestScreenContract$InputData(this.f233310l.f277453a, ((d) obj2).f233313a)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        }
    }

    @Override // vki.b
    public final f getState() {
        return this.f233312n;
    }
}
