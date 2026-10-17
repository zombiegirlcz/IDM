package tx8;

import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocType f275350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DocType docType) {
        super("fourthline", 7);
        Intrinsics.checkNotNullParameter(docType, "docType");
        this.f275350c = docType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f275350c, ((g) obj2).f275350c);
    }

    public final int hashCode() {
        return this.f275350c.f77926a.hashCode();
    }
}
