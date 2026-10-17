package czc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentType f110223a;

    public y(DocumentType documentType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f110223a = documentType;
    }

    @Override // czc.z
    public final DocumentType a() {
        return this.f110223a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f110223a, ((y) obj2).f110223a);
    }

    public final int hashCode() {
        return this.f110223a.hashCode();
    }
}
