package czc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentType f110220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110221b;

    public w(DocumentType documentType, int i) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f110220a = documentType;
        this.f110221b = i;
    }

    @Override // czc.z
    public final DocumentType a() {
        return this.f110220a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f110220a, wVar.f110220a) && this.f110221b == wVar.f110221b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110221b) + (this.f110220a.hashCode() * 31);
    }
}
