package rei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f253628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f253629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f253630c;
    public final String d;

    public p(o type, n source, m idType, String id10) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f253628a = type;
        this.f253629b = source;
        this.f253630c = idType;
        this.d = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f253628a == pVar.f253628a && this.f253629b == pVar.f253629b && this.f253630c == pVar.f253630c && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f253630c.hashCode() + ((this.f253629b.hashCode() + (this.f253628a.hashCode() * 31)) * 31)) * 31);
    }
}
