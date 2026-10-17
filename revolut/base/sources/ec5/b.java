package ec5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f124429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f124430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f124431c;
    public final f d;
    public final List e;
    public final a f;

    public b(g cryptoEntity, c cVar, Set set, f fVar, ArrayList arrayList, a aVar) {
        Intrinsics.checkNotNullParameter(cryptoEntity, "cryptoEntity");
        this.f124429a = cryptoEntity;
        this.f124430b = cVar;
        this.f124431c = set;
        this.d = fVar;
        this.e = arrayList;
        this.f = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f124429a == bVar.f124429a && Intrinsics.f(this.f124430b, bVar.f124430b) && Intrinsics.f(this.f124431c, bVar.f124431c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f124429a.hashCode() * 31;
        c cVar = this.f124430b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Set set = this.f124431c;
        int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        f fVar = this.d;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : Boolean.hashCode(fVar.f124440a))) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        a aVar = this.f;
        return iHashCode5 + (aVar != null ? Boolean.hashCode(aVar.f124428a) : 0);
    }
}
