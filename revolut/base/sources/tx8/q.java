package tx8;

import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocType f275360c;
    public final List d;
    public final my8.v e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(DocType docType, List steps, my8.v nfcType) {
        super("onfido", 7);
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(nfcType, "nfcType");
        this.f275360c = docType;
        this.d = steps;
        this.e = nfcType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f275360c, qVar.f275360c) && Intrinsics.f(this.d, qVar.d) && this.e == qVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(this.f275360c.f77926a.hashCode() * 31, 31, this.d);
    }
}
