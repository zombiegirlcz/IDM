package b93;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e93.e f13633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13635c;
    public final String d;
    public final i93.d e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e93.b f13636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13637h;
    public final c93.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f13638j;
    public final boolean k;

    public h(e93.e virtualCardDesign, String str, String str2, String str3, i93.d dVar, Set set, e93.b bVar, String str4, c93.j jVar, dj0.d dVar2, boolean z) {
        Intrinsics.checkNotNullParameter(virtualCardDesign, "virtualCardDesign");
        this.f13633a = virtualCardDesign;
        this.f13634b = str;
        this.f13635c = str2;
        this.d = str3;
        this.e = dVar;
        this.f = set;
        this.f13636g = bVar;
        this.f13637h = str4;
        this.i = jVar;
        this.f13638j = dVar2;
        this.k = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f13633a, hVar.f13633a) && Intrinsics.f(this.f13634b, hVar.f13634b) && Intrinsics.f(this.f13635c, hVar.f13635c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && Intrinsics.f(this.f, hVar.f) && this.f13636g == hVar.f13636g && Intrinsics.f(this.f13637h, hVar.f13637h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f13638j, hVar.f13638j) && this.k == hVar.k;
    }

    public final int hashCode() {
        int iHashCode = this.f13633a.hashCode() * 31;
        String str = this.f13634b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f13635c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        i93.d dVar = this.e;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Set set = this.f;
        int iHashCode6 = (iHashCode5 + (set == null ? 0 : set.hashCode())) * 31;
        e93.b bVar = this.f13636g;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str4 = this.f13637h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        c93.j jVar = this.i;
        int iHashCode9 = (iHashCode8 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        dj0.d dVar2 = this.f13638j;
        return Boolean.hashCode(this.k) + ((iHashCode9 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
    }
}
