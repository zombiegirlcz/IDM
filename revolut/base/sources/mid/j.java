package mid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f205716b;

    public j(String query, long j2) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f205715a = query;
        this.f205716b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f205715a, jVar.f205715a) && this.f205716b == jVar.f205716b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f205716b) + (this.f205715a.hashCode() * 31);
    }
}
