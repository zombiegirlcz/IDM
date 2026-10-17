package sx8;

import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f266374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocType f266375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gt8.a f266376c;
    public final String d;

    public f(File file, DocType docType, gt8.a completionDialog, String checkId) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(completionDialog, "completionDialog");
        Intrinsics.checkNotNullParameter(checkId, "checkId");
        this.f266374a = file;
        this.f266375b = docType;
        this.f266376c = completionDialog;
        this.d = checkId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f266374a, fVar.f266374a) && Intrinsics.f(this.f266375b, fVar.f266375b) && this.f266376c == fVar.f266376c && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f266376c.hashCode() + p.a.c(this.f266374a.hashCode() * 31, 31, this.f266375b.f77926a)) * 31);
    }
}
