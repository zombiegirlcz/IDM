package ut;

import android.os.Parcelable;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.q7;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
public final class s implements cli.n {

    @NotNull
    public static final r Companion = new r();

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        g state = (g) jVar;
        Intrinsics.checkNotNullParameter(state, "domainState");
        aim.e eVarB = u.b();
        Intrinsics.checkNotNullParameter(state, "state");
        wi0.b bVar = state.f283000a;
        BiometricVerificationDocument biometricVerificationDocument = state.f283002c;
        String str = bVar.f297794a;
        qd0.b.Companion.getClass();
        String lowerCase = str.toLowerCase(qd0.a.f244819b);
        String strP = t61.a.p(lowerCase, "toLowerCase(...)", "nationality.", lowerCase);
        wi0.b bVar2 = state.f283000a;
        BiometricVerificationDocument biometricVerificationDocument2 = biometricVerificationDocument;
        InputTextDelegate.Model model = new InputTextDelegate.Model("NEW_DOCUMENT_PICKER_COUNTRY_DROPDOWN_ID", new TextLocalisedClause(strP, (List) null, (Clause) new CountryClause(bVar2, null), false, 22), new TextLocalisedClause(R$string.vision_new_document_picker_citizenchip, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(yp0.r.a(model));
        eVarB.add(new ListSubheaderDelegate.Model("NEW_DOCUMENT_PICKER_DOCUMENTS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.vision_new_document_picker_methods_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, 0, 0, 0, 61434));
        Intrinsics.checkNotNullParameter(state, "state");
        List list = state.f283001b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            BiometricVerificationDocument biometricVerificationDocument3 = (BiometricVerificationDocument) obj2;
            String strN = a0.d.n("NEW_DOCUMENT_PICKER_DOCUMENT_ITEM_ID_", i);
            String strN2 = a0.d.n("NEW_DOCUMENT_PICKER_DOCUMENT_DETAILS_ITEM_ID_", i);
            CountryImage countryImage = new CountryImage(biometricVerificationDocument3.f50376b.f297794a, Integer.valueOf(R$drawable.uikit_icn_24_globe), (ez0.e) null, 10);
            BiometricVerificationDocumentType biometricVerificationDocumentType = biometricVerificationDocument3.f50375a;
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
            CellDetailsListDelegate.Model model2 = new CellDetailsListDelegate.Model(strN2, null, u.c(new q7(textLocalisedClause, countryImage)), null, null, null, 2042);
            BiometricVerificationDocument biometricVerificationDocument4 = biometricVerificationDocument2;
            arrayList.add(new SelectableDelegate.Model(strN, model2, biometricVerificationDocument3.equals(biometricVerificationDocument4) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, true, null, biometricVerificationDocument3, null, false, 32456));
            i = i2;
            biometricVerificationDocument2 = biometricVerificationDocument4;
        }
        BiometricVerificationDocument biometricVerificationDocument5 = biometricVerificationDocument2;
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        return new p(u.a(eVarB), new TextLocalisedClause(R$string.vision_new_document_picker_pick_method, null, null, 14), new TextLocalisedClause(R$string.vision_new_document_picker_subtitle, u.c(new CountryClause(bVar2, null)), null, 12), biometricVerificationDocument5 != null);
    }
}
