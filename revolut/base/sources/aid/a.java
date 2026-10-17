package aid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5232b;

    public a(String query, long j2) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f5231a = query;
        this.f5232b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f5231a, aVar.f5231a) && this.f5232b == aVar.f5232b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5232b) + (this.f5231a.hashCode() * 31);
    }
}
