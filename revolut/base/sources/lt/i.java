package lt;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.biometric_verification.impl.ui.step.document.intro.BiometricVerificationDocumentIntroScreenContract$InputData;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.qe0;
import ip0.we0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDocumentIntroScreenContract$InputData f199725a;

    public i(BiometricVerificationDocumentIntroScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f199725a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listC = u.c(new we0("image_view_list_id", new qe0(-2, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D186", null, null, null, 30))));
        int i = R$string.vision_capture_document_title;
        BiometricVerificationDocumentType biometricVerificationDocumentType = this.f199725a.f50595a.f50375a;
        if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.DrivingLicence) {
            textLocalisedClause = new TextLocalisedClause(R$string.vision_document_driving_license_name, null, null, 14);
        } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.IdentityCard) {
            textLocalisedClause = new TextLocalisedClause(R$string.vision_document_identity_card_name, null, null, 14);
        } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.Passport) {
            textLocalisedClause = new TextLocalisedClause(R$string.vision_document_passport_name, null, null, 14);
        } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.ResidencePermit) {
            textLocalisedClause = new TextLocalisedClause(R$string.vision_document_residence_permit_name, null, null, 14);
        } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.Visa) {
            textLocalisedClause = new TextLocalisedClause(R$string.vision_document_visa_name, null, null, 14);
        } else {
            if (!(biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.BirthCertificate)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.vision_document_birth_certificate_name, null, null, 14);
        }
        return new f(new TextLocalisedClause(i, u.c(textLocalisedClause), null, 12), listC);
    }
}
