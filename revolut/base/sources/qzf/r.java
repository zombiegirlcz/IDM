package qzf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0006\u0010\u0011R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lqzf/r;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "d", "()Z", "refundable", "b", "c", "freeCancellation", "", "Lizf/a;", "Ljava/util/List;", "()Ljava/util/List;", "cancellationConditions", "Lqzf/s;", "cancellationWindows", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("refundable")
    private final boolean refundable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("freeCancellation")
    private final boolean freeCancellation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationConditions")
    @NotNull
    private final List<izf.a> cancellationConditions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cancellationWindows")
    @NotNull
    private final List<s> cancellationWindows;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCancellationConditions() {
        return this.cancellationConditions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCancellationWindows() {
        return this.cancellationWindows;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getFreeCancellation() {
        return this.freeCancellation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRefundable() {
        return this.refundable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.refundable == rVar.refundable && this.freeCancellation == rVar.freeCancellation && Intrinsics.f(this.cancellationConditions, rVar.cancellationConditions) && Intrinsics.f(this.cancellationWindows, rVar.cancellationWindows);
    }

    public final int hashCode() {
        return this.cancellationWindows.hashCode() + p.a.d(j6.a.c(Boolean.hashCode(this.refundable) * 31, 31, this.freeCancellation), 31, this.cancellationConditions);
    }
}
