package fja;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lfja/d;", "Lfja/e;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "workflowId", "feature_product_lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("workflowId")
    @NotNull
    private final String workflowId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getWorkflowId() {
        return this.workflowId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.workflowId, ((d) obj2).workflowId);
    }

    public final int hashCode() {
        return this.workflowId.hashCode();
    }
}
