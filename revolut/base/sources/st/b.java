package st;

import com.revolut.biometric_verification.api.models.BiometricVerificationAcceptedDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b {
    public static BiometricVerificationDocumentType a(wi0.b country, BiometricVerificationDocumentType document, ArrayList availableDocuments) {
        Object obj2;
        Object next;
        BiometricVerificationDocumentType biometricVerificationDocumentType;
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(availableDocuments, "availableDocuments");
        Iterator it8 = availableDocuments.iterator();
        while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            BiometricVerificationAcceptedDocument biometricVerificationAcceptedDocument = (BiometricVerificationAcceptedDocument) next;
            if (Intrinsics.f(biometricVerificationAcceptedDocument.f50372a, document) && biometricVerificationAcceptedDocument.f50373b.contains(country)) {
                break;
            }
        }
        if (((BiometricVerificationAcceptedDocument) next) != null) {
            return document;
        }
        Iterator it9 = availableDocuments.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next2 = it9.next();
            if (((BiometricVerificationAcceptedDocument) next2).f50373b.contains(country)) {
                obj2 = next2;
                break;
            }
        }
        BiometricVerificationAcceptedDocument biometricVerificationAcceptedDocument2 = (BiometricVerificationAcceptedDocument) obj2;
        if (biometricVerificationAcceptedDocument2 == null || (biometricVerificationDocumentType = biometricVerificationAcceptedDocument2.f50372a) == null) {
            throw new IllegalStateException(p.a.p("No document with ", country.f297794a, " found"));
        }
        return biometricVerificationDocumentType;
    }
}
