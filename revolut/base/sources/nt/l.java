package nt;

import cli.n;
import cli.o;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.qe0;
import ip0.we0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentType f218941a;

    public l(BiometricVerificationDocumentType documentType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f218941a = documentType;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.vision_document_liveness_intro_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.vision_document_liveness_intro_description, null, null, 14);
        BiometricVerificationDocumentType biometricVerificationDocumentType = this.f218941a;
        List listC = u.c(new we0("image_view_list_id", new qe0(-2, com.revolut.core.ui_kit_core.displayers.image.models.b.c(biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.Passport ? "3D003" : "3D186", null, null, null, 30))));
        List listK = v.k(new RowDelegate.Model("ID_DOCUMENT_LIVENESS_HINT_1", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_arrow_top_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62), new TextLocalisedClause(Intrinsics.f(biometricVerificationDocumentType, BiometricVerificationDocumentType.Passport.f50387a) ? R$string.vision_document_liveness_intro_hint1_passport : Intrinsics.f(biometricVerificationDocumentType, BiometricVerificationDocumentType.IdentityCard.f50386a) ? R$string.vision_document_liveness_intro_hint1_identity_card : Intrinsics.f(biometricVerificationDocumentType, BiometricVerificationDocumentType.ResidencePermit.f50388a) ? R$string.vision_document_liveness_intro_hint1_residence_permit : R$string.vision_document_liveness_intro_hint1_document, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("ID_DOCUMENT_LIVENESS_HINT_2", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_lightbulb, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62), new TextLocalisedClause(R$string.vision_document_liveness_intro_hint3_flash_light_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.vision_document_liveness_intro_hint3_flash_light_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        i26.l.E(listK);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new i(textLocalisedClause, textLocalisedClause2, d0.E0(listK, listC));
    }
}
