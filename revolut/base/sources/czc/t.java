package czc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentType f110218a;

    public t(DocumentType documentType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f110218a = documentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f110218a, ((t) obj2).f110218a);
    }

    public final int hashCode() {
        return this.f110218a.hashCode();
    }
}
