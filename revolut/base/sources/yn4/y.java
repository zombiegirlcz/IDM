package yn4;

import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0007\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0012"}, d2 = {"Lyn4/y;", "", "", "toString", "()Ljava/lang/String;", "", "Lyn4/x;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "repaidInstalments", "Ljava/time/LocalDate;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "nextMaturingDate", "previousLastMaturingDate", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaidInstalments")
    @NotNull
    private final List<x> repaidInstalments;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextMaturingDate")
    @NotNull
    private final LocalDate nextMaturingDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("previousLastMaturingDate")
    @NotNull
    private final LocalDate previousLastMaturingDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getNextMaturingDate() {
        return this.nextMaturingDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getPreviousLastMaturingDate() {
        return this.previousLastMaturingDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getRepaidInstalments() {
        return this.repaidInstalments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.repaidInstalments, yVar.repaidInstalments) && Intrinsics.f(this.nextMaturingDate, yVar.nextMaturingDate) && Intrinsics.f(this.previousLastMaturingDate, yVar.previousLastMaturingDate);
    }

    public final int hashCode() {
        return this.previousLastMaturingDate.hashCode() + wp5.y.a(this.repaidInstalments.hashCode() * 31, 31, this.nextMaturingDate);
    }
}
