package mid;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f205711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f205712b;

    public i(b day, ArrayList intervals) {
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        this.f205711a = day;
        this.f205712b = intervals;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f205711a == iVar.f205711a && this.f205712b.equals(iVar.f205712b);
    }

    public final int hashCode() {
        return this.f205712b.hashCode() + (this.f205711a.hashCode() * 31);
    }
}
