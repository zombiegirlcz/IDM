package y71;

import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f311317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f311318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f311319c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f311320g;

    public b(d from, d to6, double d, String groupId, String legId, String str, String walletId) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f311317a = from;
        this.f311318b = to6;
        this.f311319c = d;
        this.d = groupId;
        this.e = legId;
        this.f = str;
        this.f311320g = walletId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f311317a, bVar.f311317a) && Intrinsics.f(this.f311318b, bVar.f311318b) && Double.compare(this.f311319c, bVar.f311319c) == 0 && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f311320g, bVar.f311320g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(m72.b.c(v7.c(this.f311317a.hashCode() * 31, 31, this.f311318b), this.f311319c, 31), 31, this.d), 31, this.e);
        String str = this.f;
        return this.f311320g.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
