package au;

import com.revolut.nfc_reader_documents.NfcDocument$PassportRaw;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NfcDocument$PassportRaw f9119a;

    public j(NfcDocument$PassportRaw documentRawData) {
        Intrinsics.checkNotNullParameter(documentRawData, "documentRawData");
        this.f9119a = documentRawData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f9119a, ((j) obj2).f9119a);
    }

    public final int hashCode() {
        return this.f9119a.hashCode();
    }
}
