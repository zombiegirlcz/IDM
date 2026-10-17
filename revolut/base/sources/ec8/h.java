package ec8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f124466b;

    public h(String juniorId, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f124465a = juniorId;
        this.f124466b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f124465a, hVar.f124465a) && Intrinsics.f(this.f124466b, hVar.f124466b);
    }

    public final int hashCode() {
        int iHashCode = this.f124465a.hashCode() * 31;
        xi0.b bVar = this.f124466b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
