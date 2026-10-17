package d8f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f112247c;
    public final h d;
    public final ilc.a e;

    public i(List pagerItems, String str, o oVar, h hVar, ilc.a aVar) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f112245a = pagerItems;
        this.f112246b = str;
        this.f112247c = oVar;
        this.d = hVar;
        this.e = aVar;
    }

    public static i a(i iVar, String str) {
        List pagerItems = iVar.f112245a;
        o oVar = iVar.f112247c;
        h hVar = iVar.d;
        ilc.a aVar = iVar.e;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        return new i(pagerItems, str, oVar, hVar, aVar);
    }

    @Override // oki.a
    public final List W() {
        return this.f112245a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f112245a, iVar.f112245a) && Intrinsics.f(this.f112246b, iVar.f112246b) && this.f112247c == iVar.f112247c && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f112245a.hashCode() * 31;
        String str = this.f112246b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        o oVar = this.f112247c;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        h hVar = this.d;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        ilc.a aVar = this.e;
        return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // oki.a
    public final String z() {
        return this.f112246b;
    }
}
