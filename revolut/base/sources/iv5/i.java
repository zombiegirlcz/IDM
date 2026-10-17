package iv5;

import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$AssetModelExtension;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends ut5.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ut5.l f168723c;
    public final jv5.a d;
    public final nv5.a e;
    public final mv5.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qv5.a f168724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pv5.a f168725h;
    public final ov5.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SplitAccountsWidgetContract$AssetModelExtension f168726j;
    public final ut5.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l0 f168727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f168728m;

    public i(ut5.l view, jv5.a autoEarnEligibleWidgetControllerModelExtension, nv5.a mainAccountsWidgetControllerPresentationModel, mv5.a earnAccountsWidgetControllerPresentationModel, qv5.a spotMarginTradingWidgetControllerPresentationModel, pv5.a perpetualsWidgetControllerPresentationModel, ov5.b mainAccountsClassicWidgetControllerPresentationModel, SplitAccountsWidgetContract$AssetModelExtension splitAccountsWidgetAssetModelExtension, ut5.i popupModelExtension, l0 popupMenuDialogDisplayer, j60.a bottomDialog) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(autoEarnEligibleWidgetControllerModelExtension, "autoEarnEligibleWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(mainAccountsWidgetControllerPresentationModel, "mainAccountsWidgetControllerPresentationModel");
        Intrinsics.checkNotNullParameter(earnAccountsWidgetControllerPresentationModel, "earnAccountsWidgetControllerPresentationModel");
        Intrinsics.checkNotNullParameter(spotMarginTradingWidgetControllerPresentationModel, "spotMarginTradingWidgetControllerPresentationModel");
        Intrinsics.checkNotNullParameter(perpetualsWidgetControllerPresentationModel, "perpetualsWidgetControllerPresentationModel");
        Intrinsics.checkNotNullParameter(mainAccountsClassicWidgetControllerPresentationModel, "mainAccountsClassicWidgetControllerPresentationModel");
        Intrinsics.checkNotNullParameter(splitAccountsWidgetAssetModelExtension, "splitAccountsWidgetAssetModelExtension");
        Intrinsics.checkNotNullParameter(popupModelExtension, "popupModelExtension");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f168723c = view;
        this.d = autoEarnEligibleWidgetControllerModelExtension;
        this.e = mainAccountsWidgetControllerPresentationModel;
        this.f = earnAccountsWidgetControllerPresentationModel;
        this.f168724g = spotMarginTradingWidgetControllerPresentationModel;
        this.f168725h = perpetualsWidgetControllerPresentationModel;
        this.i = mainAccountsClassicWidgetControllerPresentationModel;
        this.f168726j = splitAccountsWidgetAssetModelExtension;
        this.k = popupModelExtension;
        this.f168727l = popupMenuDialogDisplayer;
        this.f168728m = bottomDialog;
    }

    @Override // yji.d
    public final void M() {
        ut5.l lVar = this.f168723c;
        yji.d.H(this, rd0.e.b(lVar.T()), new d(this, null), 3);
        yji.d.H(this, rd0.e.b(lVar.S()), new e(this, null), 3);
        yji.d.H(this, rd0.e.b(lVar.W1()), new f(this, null), 3);
        yji.d.H(this, rd0.e.b(lVar.Y()), new g(this, null), 3);
        yji.d.H(this, rd0.e.b(lVar.t()), new h(this, null, 0), 3);
        yji.d.H(this, rd0.e.b(this.f168728m.E()), new iaf.d(this, null, 21), 3);
        yji.d.H(this, rd0.e.b(this.f168727l.f256113c), new h(this, null, 1), 3);
    }
}
