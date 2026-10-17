package ft;

import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.q7;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        int i;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f137745a;
        BiometricVerificationDocument biometricVerificationDocument = domainState.f137746b;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i2 = 0;
        for (Object obj2 : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            BiometricVerificationDocument biometricVerificationDocument2 = (BiometricVerificationDocument) obj2;
            String strN = a0.d.n("DOCUMENT_ITEM_ID", i2);
            BiometricVerificationDocumentType biometricVerificationDocumentType = biometricVerificationDocument2.f50375a;
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
            List listC = u.c(new q7(textLocalisedClause, new CountryImage(biometricVerificationDocument2.f50376b.f297794a, Integer.valueOf(R$drawable.uikit_icn_24_globe), (ez0.e) null, 10)));
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            BiometricVerificationDocumentType biometricVerificationDocumentType2 = biometricVerificationDocument2.f50375a;
            if (biometricVerificationDocumentType2 instanceof BiometricVerificationDocumentType.DrivingLicence) {
                i = R$drawable.uikit_icn_24_driving_licence;
            } else if (biometricVerificationDocumentType2 instanceof BiometricVerificationDocumentType.IdentityCard) {
                i = R$drawable.uikit_icn_24_national_id;
            } else if (biometricVerificationDocumentType2 instanceof BiometricVerificationDocumentType.Passport) {
                i = R$drawable.uikit_icn_24_passport;
            } else if (biometricVerificationDocumentType2 instanceof BiometricVerificationDocumentType.ResidencePermit) {
                i = R$drawable.uikit_icn_24_residence_permit;
            } else if (biometricVerificationDocumentType2 instanceof BiometricVerificationDocumentType.Visa) {
                i = R$drawable.uikit_icn_24_visa_document;
            } else {
                if (!(biometricVerificationDocumentType2 instanceof BiometricVerificationDocumentType.BirthCertificate)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_passport;
            }
            CellDetailsListDelegate.Model model = new CellDetailsListDelegate.Model(strN, companion.i(i, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), listC, null, null, biometricVerificationDocument2, YearClass.CLASS_2008);
            qd0 qd0Var = Intrinsics.f(biometricVerificationDocument, biometricVerificationDocument2) ? qd0.SELECTED : null;
            if (qd0Var == null) {
                qd0Var = qd0.UNSELECTED;
            }
            arrayList.add(new SelectableDelegate.Model(strN, model, qd0Var, null, vd0.RADIO, false, null, null, null, false, 32744));
            i2 = i3;
        }
        return new l(arrayList, biometricVerificationDocument != null);
    }
}
