package vs;

import aw0.o9;
import aw0.t0;
import com.revolut.biometric_verification.impl.ui.step.document.card_details.BiometricVerificationMyNumberCardDetailsScreenContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.time.LocalDate;
import java.time.chrono.JapaneseChronology;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
public final class r implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationMyNumberCardDetailsScreenContract$InputData f291708a;

    public r(BiometricVerificationMyNumberCardDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f291708a = inputData;
    }

    public static CellDetailsDelegate.Model a(String str, f fVar, int i, String str2) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, fVar, null, null, 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true, false, null, null, 29624);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        DateTimeFormatter dateTimeFormatterOfPattern;
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.vision_nfc_my_number_details_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.vision_nfc_my_number_details_subtitle, null, null, 14);
        f fVar = f.DATE_OF_BIRTH;
        int i = R$string.vision_nfc_document_information_date_of_birth;
        BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails biometricVerificationDocumentStepFlowContract$MyNumberCardDetails = this.f291708a.f50520a;
        LocalDate localDate = biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.f50545a;
        int i2 = q.f291707a[biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.d.ordinal()];
        if (i2 == 1) {
            dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy MMM d", Locale.getDefault());
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("G y MMM d", Locale.getDefault()).withChronology(JapaneseChronology.INSTANCE);
        }
        String str = dateTimeFormatterOfPattern.format(localDate);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        List listK = v.k(a("MY_NUMBER_CARD_DATE_OF_BIRTH", fVar, i, str), a("MY_NUMBER_CARD_EXPIRY_YEAR", f.EXPIRY_YEAR, R$string.vision_nfc_document_information_date_of_expiry, String.valueOf(biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.f50546b.getYear())), a("MY_NUMBER_CARD_SECURITY_CODE", f.SECURITY_CODE, R$string.vision_nfc_my_number_details_security_code, biometricVerificationDocumentStepFlowContract$MyNumberCardDetails.f50547c));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new n(textLocalisedClause, textLocalisedClause2, listK);
    }
}
