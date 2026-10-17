package czc;

import com.revolut.feature.selfserve.sot.api.models.EvidenceDocument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EvidenceDocument f110222a;

    public x(EvidenceDocument evidenceDocument) {
        Intrinsics.checkNotNullParameter(evidenceDocument, "evidenceDocument");
        this.f110222a = evidenceDocument;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    @Override // czc.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.selfserve.sot.api.models.DocumentType a() {
        /*
            r4 = this;
            com.revolut.feature.selfserve.sot.api.models.EvidenceDocument r0 = r4.f110222a
            com.revolut.feature.selfserve.sot.api.models.DocumentType r1 = r0.f85866b
            com.revolut.feature.selfserve.sot.api.models.EvidenceDocumentDetails r2 = r0.d
            if (r2 == 0) goto L16
            java.lang.String r2 = r2.f85869a
            if (r2 == 0) goto L16
            int r3 = r2.length()
            if (r3 <= 0) goto L13
            goto L14
        L13:
            r2 = 0
        L14:
            if (r2 != 0) goto L1a
        L16:
            com.revolut.feature.selfserve.sot.api.models.DocumentType r0 = r0.f85866b
            java.lang.String r2 = r0.d
        L1a:
            com.revolut.feature.selfserve.sot.api.models.DocumentType r0 = com.revolut.feature.selfserve.sot.api.models.DocumentType.a(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: czc.x.a():com.revolut.feature.selfserve.sot.api.models.DocumentType");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f110222a, ((x) obj2).f110222a);
    }

    public final int hashCode() {
        return this.f110222a.hashCode();
    }
}
