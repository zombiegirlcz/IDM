package wrk;

import kotlin.jvm.internal.Intrinsics;
import uqk.e;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f299624b;

    public a(String ref2, e period) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f299623a = ref2;
        this.f299624b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f299623a, aVar.f299623a) && this.f299624b == aVar.f299624b;
    }

    public final int hashCode() {
        return this.f299624b.hashCode() + (this.f299623a.hashCode() * 31);
    }
}
