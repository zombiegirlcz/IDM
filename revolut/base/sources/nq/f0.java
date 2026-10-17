package nq;

import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.nfc_reader_documents.NfcDocument$PassportRaw;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f0 extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f218292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NfcDocument$PassportRaw f218293c;
    public final BiometricVerificationDocument d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(List mediaKeys, NfcDocument$PassportRaw documentRawData, BiometricVerificationDocument document) {
        super(mediaKeys);
        Intrinsics.checkNotNullParameter(mediaKeys, "mediaKeys");
        Intrinsics.checkNotNullParameter(documentRawData, "documentRawData");
        Intrinsics.checkNotNullParameter(document, "document");
        this.f218292b = mediaKeys;
        this.f218293c = documentRawData;
        this.d = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f218292b, f0Var.f218292b) && Intrinsics.f(this.f218293c, f0Var.f218293c) && Intrinsics.f(this.d, f0Var.d);
    }

    @Override // nq.i0
    public final List f() {
        return this.f218292b;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f218293c.hashCode() + (this.f218292b.hashCode() * 31)) * 31);
    }
}
