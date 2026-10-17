package czc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentType f110196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110197b;

    public f(DocumentType documentType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f110196a = documentType;
        this.f110197b = documentType.f85860b;
    }

    @Override // czc.g
    public final DocumentType a() {
        return this.f110196a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f110196a, ((f) obj2).f110196a);
    }

    @Override // czc.g
    public final String getTitle() {
        return this.f110197b;
    }

    public final int hashCode() {
        return this.f110196a.hashCode();
    }
}
