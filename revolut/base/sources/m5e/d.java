package m5e;

import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.structured_note.details.impl.ui.screens.overview.NoteDetailsOverviewController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements h8b.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202902a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate f202903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProgressStepVerticalDelegate f202904c;
    public final LargeActionButtonDelegate d;
    public final CellDetailsDelegate e;
    public final TwinHorizontalButtonDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CalendarRowDelegate f202905g;

    public d(NoteDetailsOverviewController noteDetailsOverviewController) {
        this.f202903b = noteDetailsOverviewController.T;
        this.f202904c = noteDetailsOverviewController.f88890a0;
        this.d = noteDetailsOverviewController.Z;
        this.e = noteDetailsOverviewController.Y;
        this.f = noteDetailsOverviewController.f88891b0;
        this.f202905g = noteDetailsOverviewController.X;
    }

    @Override // h8b.i
    public final ListSubheaderDelegate b() {
        switch (this.f202902a) {
        }
        return this.f202903b;
    }

    @Override // h8b.i
    public final CalendarRowDelegate c() {
        switch (this.f202902a) {
        }
        return this.f202905g;
    }

    @Override // h8b.i
    public final CellDetailsDelegate d() {
        switch (this.f202902a) {
        }
        return this.e;
    }

    @Override // h8b.i
    public final ProgressStepVerticalDelegate e() {
        switch (this.f202902a) {
        }
        return this.f202904c;
    }

    @Override // h8b.i
    public final LargeActionButtonDelegate f() {
        switch (this.f202902a) {
        }
        return this.d;
    }

    @Override // h8b.i
    public final TwinHorizontalButtonDelegate g() {
        switch (this.f202902a) {
        }
        return this.f;
    }

    public d(BondDetailsController bondDetailsController) {
        this.f202903b = bondDetailsController.f103888b0;
        this.f202904c = bondDetailsController.q0;
        this.d = bondDetailsController.f103895r0;
        this.e = bondDetailsController.S;
        this.f = bondDetailsController.f103897t0;
        this.f202905g = bondDetailsController.f103896s0;
    }

    public d(StockDetailsOverviewController stockDetailsOverviewController) {
        this.f202903b = stockDetailsOverviewController.S;
        this.f202904c = stockDetailsOverviewController.R;
        this.d = stockDetailsOverviewController.X;
        this.e = stockDetailsOverviewController.Z;
        this.f = stockDetailsOverviewController.f104047a0;
        this.f202905g = stockDetailsOverviewController.Y;
    }
}
