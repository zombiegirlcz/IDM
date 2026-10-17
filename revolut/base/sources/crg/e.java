package crg;

import com.revolut.feature.vaults.common.SavingsDocumentToAccept;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsDocumentToAccept f108381a;

    public e(SavingsDocumentToAccept document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f108381a = document;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f108381a, ((e) obj2).f108381a);
    }

    public final int hashCode() {
        return this.f108381a.hashCode();
    }
}
