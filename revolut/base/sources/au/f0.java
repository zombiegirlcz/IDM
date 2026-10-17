package au;

import com.revolut.biometric_verification.impl.ui.step.nfc.flow.BiometricVerificationNfcFlowContract$AuthData;
import com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.BiometricVerificationNfcV2ConsolidatedScreenContract$InputData;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.qe0;
import ip0.we0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class f0 implements cli.n {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationNfcV2ConsolidatedScreenContract$InputData f9114a;

    public f0(BiometricVerificationNfcV2ConsolidatedScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f9114a = inputData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        int i2;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        yt.a documentType = domainState.getDocumentType();
        int[] iArr = e0.f9110a;
        int i3 = iArr[documentType.ordinal()];
        if (i3 == 1) {
            i = R$string.vision_nfc_intro_v2_title;
        } else if (i3 == 2) {
            i = R$string.vision_nfc_intro_v2_identity_card_title;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.vision_nfc_intro_v2_residence_permit_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        BiometricVerificationNfcV2ConsolidatedScreenContract$InputData biometricVerificationNfcV2ConsolidatedScreenContract$InputData = this.f9114a;
        boolean z = biometricVerificationNfcV2ConsolidatedScreenContract$InputData.f50628a;
        boolean zK0 = domainState.k0();
        boolean z3 = biometricVerificationNfcV2ConsolidatedScreenContract$InputData.f50630c instanceof BiometricVerificationNfcFlowContract$AuthData.ICAO;
        List listC = zhm.u.c(new we0("NFC_INTRO_ILLUSTRATION_ID", new qe0(-2, LottieImage.Companion.a(LottieImage.INSTANCE, uc0.b.a("mobile/computer_vision/animations/nfc", "document_nfc"), true, false, new LottieImage.ColorOverride.TintedWithAttr(R$attr.uikit_colorForeground), null, 208))));
        yt.a documentType2 = domainState.getDocumentType();
        RowDelegate.Model model = new RowDelegate.Model("NFC_INTRO_HINT_1", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_passport_chip, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 60), new TextLocalisedClause(R$string.vision_nfc_intro_v2_document_hint_1_title, null, null, 14), null, 0, new TextLocalisedClause(iArr[documentType2.ordinal()] == 1 ? R$string.vision_nfc_intro_v2_passport_hint_1_description : R$string.vision_nfc_intro_v2_document_hint_1_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yt.a documentType3 = domainState.getDocumentType();
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.vision_nfc_intro_v2_document_hint_2_title, null, null, 14);
        int i5 = iArr[documentType3.ordinal()];
        if (i5 == 1) {
            i2 = R$string.vision_nfc_intro_v2_passport_hint_2_description;
        } else if (i5 == 2) {
            i2 = R$string.vision_nfc_intro_v2_identity_card_hint_2_description;
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.vision_nfc_intro_v2_residence_permit_hint_2_description;
        }
        List listK = zhm.v.k(model, new RowDelegate.Model("NFC_INTRO_HINT_2", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_smartphone, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 60), textLocalisedClause2, null, 0, new TextLocalisedClause(i2, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("NFC_INTRO_HINT_3", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_contactless, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 0 == true ? 1 : 0, false, null, false, 60), new TextLocalisedClause(R$string.vision_nfc_intro_v2_document_hint_3_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.vision_nfc_intro_v2_document_hint_3_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        i26.l.E(listK);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new v(zhm.d0.E0(listK, listC), textLocalisedClause, z, zK0, z3);
    }
}
