package yx;

import com.revolut.camerakit.revolut.ui.barcodeqr.models.BarcodeQrReaderScreenSettings;
import com.revolut.camerakit.revolut.ui.barcodeqr.screen.BarcodeQrReaderScreenContract$InputData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes16.dex */
public final class p implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarcodeQrReaderScreenContract$InputData f317513a;

    public p(BarcodeQrReaderScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f317513a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        IconNavBarMenuItem iconNavBarMenuItemA;
        int i;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        BarcodeQrReaderScreenContract$InputData barcodeQrReaderScreenContract$InputData = this.f317513a;
        Clause clause = barcodeQrReaderScreenContract$InputData.f50777a.f50771a;
        xv.a aVar = domainState.f317502a;
        if (aVar != xv.a.DISABLED) {
            IconNavBarMenuItem.Companion companion = IconNavBarMenuItem.INSTANCE;
            int i2 = o.f317512a[aVar.ordinal()];
            if (i2 == 1) {
                i = R$drawable.uikit_icn_24_lightning_off;
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_lightning;
            }
            iconNavBarMenuItemA = IconNavBarMenuItem.Companion.a(companion, "TORCH_MENU_ITEM_ID", new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
        } else {
            iconNavBarMenuItemA = null;
        }
        List listL = v.l(iconNavBarMenuItemA);
        BarcodeQrReaderScreenSettings barcodeQrReaderScreenSettings = barcodeQrReaderScreenContract$InputData.f50777a;
        return new m(clause, listL, barcodeQrReaderScreenSettings.d, barcodeQrReaderScreenSettings.e);
    }
}
