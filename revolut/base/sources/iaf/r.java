package iaf;

import cli.y;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.SelectedAssetsListScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends oki.h implements m {
    public final SelectedAssetsListScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f160016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f160017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f160018r;

    public r(SelectedAssetsListScreenContract$InputData inputData, k mapper, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.o = inputData;
        this.f160016p = mapper;
        this.f160017q = bottomExpandableDialogControllerExtension;
        this.f160018r = mra.d.b(this, new j(r0.g(), inputData.f91602a, false), mapper, new a(), false, 8);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f160018r;
    }
}
