package ly8;

import com.revolut.feature.kyc_documents_scan.api.models.WorkflowDocumentScanCofiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkflowDocumentScanCofiguration.Incode f200746a;

    public a(WorkflowDocumentScanCofiguration.Incode configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f200746a = configuration;
    }

    public final WorkflowDocumentScanCofiguration.Incode b() {
        return this.f200746a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f200746a, ((a) obj2).f200746a);
    }

    public final int hashCode() {
        return this.f200746a.hashCode();
    }
}
