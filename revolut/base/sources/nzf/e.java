package nzf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lnzf/e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "totalCount", "Ljava/lang/String;", "countStatus", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalCount")
    private final int totalCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("countStatus")
    @NotNull
    private final String countStatus;

    public e(int i, String countStatus) {
        Intrinsics.checkNotNullParameter(countStatus, "countStatus");
        this.totalCount = i;
        this.countStatus = countStatus;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountStatus() {
        return this.countStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.totalCount == eVar.totalCount && Intrinsics.f(this.countStatus, eVar.countStatus);
    }

    public final int hashCode() {
        return this.countStatus.hashCode() + (Integer.hashCode(this.totalCount) * 31);
    }
}
