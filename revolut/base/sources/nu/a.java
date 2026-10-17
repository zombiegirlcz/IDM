package nu;

import com.revolut.biometric_verification.api.models.BiometricVerificationAcceptedDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentNfcChip;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wi0.b;

/* JADX INFO: loaded from: classes17.dex */
public final class a {
    private a() {
    }

    public static Boolean a(List list, b selectedCountry, BiometricVerificationDocumentType docType) {
        Object next;
        BiometricVerificationDocumentNfcChip biometricVerificationDocumentNfcChip;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            BiometricVerificationAcceptedDocument biometricVerificationAcceptedDocument = (BiometricVerificationAcceptedDocument) next;
            if (biometricVerificationAcceptedDocument.f50373b.contains(selectedCountry) && Intrinsics.f(docType, biometricVerificationAcceptedDocument.f50372a)) {
                break;
            }
        }
        BiometricVerificationAcceptedDocument biometricVerificationAcceptedDocument2 = (BiometricVerificationAcceptedDocument) next;
        if (biometricVerificationAcceptedDocument2 == null || (biometricVerificationDocumentNfcChip = biometricVerificationAcceptedDocument2.e) == null) {
            return null;
        }
        return Boolean.valueOf(biometricVerificationDocumentNfcChip.f50378a);
    }
}
