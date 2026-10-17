package czc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentType f110189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110191c;

    public d(DocumentType documentType, int i) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f110189a = documentType;
        this.f110190b = i;
        String str = documentType.d;
        this.f110191c = str == null ? documentType.f85860b : str;
    }

    @Override // czc.g
    public final DocumentType a() {
        return this.f110189a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f110189a, dVar.f110189a) && this.f110190b == dVar.f110190b;
    }

    @Override // czc.g
    public final String getTitle() {
        return this.f110191c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110190b) + (this.f110189a.hashCode() * 31);
    }
}
