package c1b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20442b;

    public m(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f20441a = id10;
        this.f20442b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f20441a, mVar.f20441a) && Intrinsics.f(this.f20442b, mVar.f20442b);
    }

    public final int hashCode() {
        return this.f20442b.hashCode() + (this.f20441a.hashCode() * 31);
    }
}
