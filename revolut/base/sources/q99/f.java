package q99;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lq99/f;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "getDocumentIds", "()Ljava/util/List;", "documentIds", "b", "Ljava/lang/String;", "getWorkflowStepId", "workflowStepId", "c", "getSignatureProcessType", "signatureProcessType", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentIds")
    @NotNull
    private final List<String> documentIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("workflowStepId")
    private final String workflowStepId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("signatureProcessType")
    private final String signatureProcessType;

    public f(String str, String str2, List documentIds) {
        Intrinsics.checkNotNullParameter(documentIds, "documentIds");
        this.documentIds = documentIds;
        this.workflowStepId = str;
        this.signatureProcessType = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.documentIds, fVar.documentIds) && Intrinsics.f(this.workflowStepId, fVar.workflowStepId) && Intrinsics.f(this.signatureProcessType, fVar.signatureProcessType);
    }

    public final int hashCode() {
        int iHashCode = this.documentIds.hashCode() * 31;
        String str = this.workflowStepId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.signatureProcessType;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
