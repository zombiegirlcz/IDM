package bgf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f15197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f15198c;

    public h(String id10, i type, e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f15196a = id10;
        this.f15197b = type;
        this.f15198c = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f15196a, hVar.f15196a) && this.f15197b == hVar.f15197b && Intrinsics.f(this.f15198c, hVar.f15198c);
    }

    public final int hashCode() {
        int iHashCode = (this.f15197b.hashCode() + (this.f15196a.hashCode() * 31)) * 31;
        e eVar = this.f15198c;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
