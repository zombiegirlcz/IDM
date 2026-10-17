package pra;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f238971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f238972c;

    public a(String id10, int i, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f238970a = id10;
        this.f238971b = i;
        this.f238972c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f238970a, aVar.f238970a) && this.f238971b == aVar.f238971b && this.f238972c == aVar.f238972c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f238972c) + j6.a.b(this.f238971b, this.f238970a.hashCode() * 31, 31);
    }
}
