package zt;

import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.nfc_reader_documents.NfcDocument$PassportRaw;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NfcDocument$PassportRaw f324997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiometricVerificationDocument f324998b;

    public e(NfcDocument$PassportRaw documentRawData, BiometricVerificationDocument document) {
        Intrinsics.checkNotNullParameter(documentRawData, "documentRawData");
        Intrinsics.checkNotNullParameter(document, "document");
        this.f324997a = documentRawData;
        this.f324998b = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f324997a, eVar.f324997a) && Intrinsics.f(this.f324998b, eVar.f324998b);
    }

    public final int hashCode() {
        return this.f324998b.hashCode() + (this.f324997a.hashCode() * 31);
    }
}
