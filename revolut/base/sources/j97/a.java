package j97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f172310b;

    public a(String query, long j2) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f172309a = query;
        this.f172310b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f172309a, aVar.f172309a) && this.f172310b == aVar.f172310b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f172310b) + (this.f172309a.hashCode() * 31);
    }
}
