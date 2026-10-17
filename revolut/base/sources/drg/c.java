package drg;

import com.revolut.feature.vaults.common.SavingsDocumentToAccept;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsDocumentToAccept f117124a;

    public c(SavingsDocumentToAccept document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f117124a = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f117124a, ((c) obj2).f117124a);
    }

    public final int hashCode() {
        return this.f117124a.hashCode();
    }
}
