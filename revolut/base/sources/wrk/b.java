package wrk;

import kotlin.jvm.internal.Intrinsics;
import uqk.e;
import uqk.l;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f299626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f299627c;

    public b(String ref2, l statementType, e period) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f299625a = ref2;
        this.f299626b = statementType;
        this.f299627c = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f299625a, bVar.f299625a) && this.f299626b == bVar.f299626b && this.f299627c == bVar.f299627c;
    }

    public final int hashCode() {
        return this.f299627c.hashCode() + ((this.f299626b.hashCode() + (this.f299625a.hashCode() * 31)) * 31);
    }
}
