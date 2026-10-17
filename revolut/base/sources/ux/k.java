package ux;

import cli.o;
import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$InputData;
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
public final class k implements cli.n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarcodeReaderFlowContract$InputData f283713a;

    public k(BarcodeReaderFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f283713a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        IconNavBarMenuItem iconNavBarMenuItemA;
        int i;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        BarcodeReaderFlowContract$InputData barcodeReaderFlowContract$InputData = this.f283713a;
        Clause clause = barcodeReaderFlowContract$InputData.f50754a.f50762a;
        xv.a aVar = domainState.f283706a;
        if (aVar != xv.a.DISABLED) {
            IconNavBarMenuItem.Companion companion = IconNavBarMenuItem.INSTANCE;
            int i2 = j.f283712a[aVar.ordinal()];
            if (i2 == 1) {
                i = R$drawable.uikit_icn_24_lightning_off;
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_lightning;
            }
            iconNavBarMenuItemA = IconNavBarMenuItem.Companion.a(companion, "SCREEN_FLASH_MENU_ITEM_ID", new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
        } else {
            iconNavBarMenuItemA = null;
        }
        return new h(clause, barcodeReaderFlowContract$InputData.f50754a.f50763b, v.l(iconNavBarMenuItemA));
    }
}
