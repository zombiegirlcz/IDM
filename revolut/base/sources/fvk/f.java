package fvk;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.etf_details_overview.EtfDetailsOverviewController;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements s2h.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138432a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListCellDelegate f138433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListSubheaderDelegate f138434c;
    public final PlainTextDelegate d;

    public f(EtfDetailsOverviewController etfDetailsOverviewController) {
        this.f138433b = etfDetailsOverviewController.X;
        this.f138434c = etfDetailsOverviewController.Y;
        this.d = etfDetailsOverviewController.f103932a0;
    }

    @Override // s2h.f
    public final ListSubheaderDelegate b() {
        switch (this.f138432a) {
        }
        return this.f138434c;
    }

    @Override // s2h.f
    public final ListCellDelegate l() {
        switch (this.f138432a) {
        }
        return this.f138433b;
    }

    @Override // s2h.f
    public final PlainTextDelegate o() {
        switch (this.f138432a) {
        }
        return this.d;
    }

    public f(BondDetailsController bondDetailsController) {
        this.f138433b = bondDetailsController.Z;
        this.f138434c = bondDetailsController.f103888b0;
        this.d = bondDetailsController.c0;
    }
}
