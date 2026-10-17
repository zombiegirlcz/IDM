package q90;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lq90/m;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "validated", "", "Lq90/n;", "Ljava/util/List;", "()Ljava/util/List;", "issues", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("validated")
    private final boolean validated;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("issues")
    private final List<n> issues;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getIssues() {
        return this.issues;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getValidated() {
        return this.validated;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.validated == mVar.validated && Intrinsics.f(this.issues, mVar.issues);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.validated) * 31;
        List<n> list = this.issues;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
