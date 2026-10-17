package pjb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f236719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f236720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236721c;
    public final String d;
    public final a e;

    public b(long j2, Long l2, String title, String deeplink, a type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f236719a = j2;
        this.f236720b = l2;
        this.f236721c = title;
        this.d = deeplink;
        this.e = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f236719a == bVar.f236719a && Intrinsics.f(this.f236720b, bVar.f236720b) && Intrinsics.f(this.f236721c, bVar.f236721c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f236719a) * 31;
        Long l2 = this.f236720b;
        return this.e.hashCode() + p.a.c(p.a.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f236721c), 31, this.d);
    }
}
