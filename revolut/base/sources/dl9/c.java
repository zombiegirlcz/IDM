package dl9;

import com.revolut.core.ui_kit.delegates.CellDetailsAttachmentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.retail.feature.payments.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import cw0.g;
import cw0.h;
import cw0.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements al9.c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zq.a f115717a;

    public c(zq.a payWithPhotoFeatureChecker) {
        Intrinsics.checkNotNullParameter(payWithPhotoFeatureChecker, "payWithPhotoFeatureChecker");
        this.f115717a = payWithPhotoFeatureChecker;
    }

    public final IconNavBarMenuItem a() {
        if (this.f115717a.s()) {
            return new IconNavBarMenuItem("PAY_WITH_PHOTO_MENU_ID", new ResourceImage(R$drawable.uikit_icn_24_camera, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.payments_pay_with_photo_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        }
        return null;
    }

    public final List b(ScannedBillDetails scannedBillDetails, boolean z) {
        if (this.f115717a.s() && scannedBillDetails != null) {
            List listC = u.c(new CellDetailsAttachmentDelegate.Model("SCANNED_FILE_DETAILS_FROM_ID", new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.payments_pay_with_photo_transaction_attachment_from, null, null, 14), u.c(new i("ATTACHMENT_ID", new FileImage(scannedBillDetails.f92265a, R$drawable.uikit_icn_40_document_shape, new ImageTransformations(null, null, null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_SOD_TAG)), new g.c(z ? h.REMOVABLE : h.DEFAULT), scannedBillDetails, 8)), null, false, 0, 0, 0, 16360));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        return f0.f322471a;
    }
}
