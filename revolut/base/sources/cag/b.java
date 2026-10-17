package cag;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcag/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "refundable", "freeCancellation", "", "Lcag/c;", "c", "Ljava/util/List;", "()Ljava/util/List;", "windows", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("refundable")
    private final boolean refundable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("freeCancellation")
    private final boolean freeCancellation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("windows")
    @NotNull
    private final List<c> windows;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getFreeCancellation() {
        return this.freeCancellation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getRefundable() {
        return this.refundable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getWindows() {
        return this.windows;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.refundable == bVar.refundable && this.freeCancellation == bVar.freeCancellation && Intrinsics.f(this.windows, bVar.windows);
    }

    public final int hashCode() {
        return this.windows.hashCode() + j6.a.c(Boolean.hashCode(this.refundable) * 31, 31, this.freeCancellation);
    }
}
