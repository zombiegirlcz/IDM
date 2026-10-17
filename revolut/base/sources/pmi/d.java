package pmi;

import com.revolut.nfc_reader_documents.NfcDocument$PassportRaw;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e, kmi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NfcDocument$PassportRaw f237589a;

    public d(NfcDocument$PassportRaw result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f237589a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f237589a, ((d) obj2).f237589a);
    }

    public final int hashCode() {
        return this.f237589a.hashCode();
    }
}
