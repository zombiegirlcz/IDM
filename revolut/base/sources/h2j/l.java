package h2j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f148841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f148842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1j.b f148843c;

    public l(List items, j jVar, u1j.b bVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f148841a = items;
        this.f148842b = jVar;
        this.f148843c = bVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f148841a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f148841a, lVar.f148841a) && Intrinsics.f(this.f148842b, lVar.f148842b) && Intrinsics.f(this.f148843c, lVar.f148843c);
    }

    public final int hashCode() {
        int iHashCode = this.f148841a.hashCode() * 31;
        j jVar = this.f148842b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        u1j.b bVar = this.f148843c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
