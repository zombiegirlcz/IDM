package lhb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ghb.d f195231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ghb.b f195232c;
    public final a d;

    public b(String id10, ghb.d status, ghb.b method, a artifact) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(artifact, "artifact");
        this.f195230a = id10;
        this.f195231b = status;
        this.f195232c = method;
        this.d = artifact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f195230a, bVar.f195230a) && this.f195231b == bVar.f195231b && this.f195232c == bVar.f195232c && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f195232c.hashCode() + ((this.f195231b.hashCode() + (this.f195230a.hashCode() * 31)) * 31)) * 31);
    }
}
