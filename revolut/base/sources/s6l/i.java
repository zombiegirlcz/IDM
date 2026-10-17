package s6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"Ls6l/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "type", "", "b", "Z", "()Z", "reached", "", "I", "()I", "threshold", "", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "unblockDate", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("reached")
    private final boolean reached;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("threshold")
    private final int threshold;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("unblockDate")
    private final Long unblockDate;

    public i(int i, Long l2, String type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.reached = z;
        this.threshold = i;
        this.unblockDate = l2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getReached() {
        return this.reached;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getThreshold() {
        return this.threshold;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getUnblockDate() {
        return this.unblockDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.type, iVar.type) && this.reached == iVar.reached && this.threshold == iVar.threshold && Intrinsics.f(this.unblockDate, iVar.unblockDate);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.threshold, j6.a.c(this.type.hashCode() * 31, 31, this.reached), 31);
        Long l2 = this.unblockDate;
        return iB + (l2 == null ? 0 : l2.hashCode());
    }
}
