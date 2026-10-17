package a71;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1729c;

    public e(String id10, String lastIpAddress, String lastOpen) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(lastIpAddress, "lastIpAddress");
        Intrinsics.checkNotNullParameter(lastOpen, "lastOpen");
        this.f1727a = id10;
        this.f1728b = lastIpAddress;
        this.f1729c = lastOpen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f1727a, eVar.f1727a) && Intrinsics.f(this.f1728b, eVar.f1728b) && Intrinsics.f(this.f1729c, eVar.f1729c);
    }

    public final int hashCode() {
        return this.f1729c.hashCode() + p.a.c(this.f1727a.hashCode() * 31, 31, this.f1728b);
    }
}
