package cc0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22914b;

    public b(String searchQuery, long j2) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f22913a = searchQuery;
        this.f22914b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f22913a, bVar.f22913a) && this.f22914b == bVar.f22914b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22914b) + (this.f22913a.hashCode() * 31);
    }
}
