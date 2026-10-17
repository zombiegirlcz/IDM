package rzf;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\u0007\u0010\nR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lrzf/q;", "", "", "toString", "()Ljava/lang/String;", "", "Lrzf/r;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "start", "b", "end", "Lrzf/s;", "Lrzf/s;", "()Lrzf/s;", "pickup", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("start")
    @NotNull
    private final List<r> start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("end")
    @NotNull
    private final List<r> end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pickup")
    private final s pickup;

    public q(ArrayList start, ArrayList end2, s sVar) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.start = start;
        this.end = end2;
        this.pickup = sVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final s getPickup() {
        return this.pickup;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getStart() {
        return this.start;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.start, qVar.start) && Intrinsics.f(this.end, qVar.end) && Intrinsics.f(this.pickup, qVar.pickup);
    }

    public final int hashCode() {
        int iD = p.a.d(this.start.hashCode() * 31, 31, this.end);
        s sVar = this.pickup;
        return iD + (sVar == null ? 0 : sVar.hashCode());
    }
}
