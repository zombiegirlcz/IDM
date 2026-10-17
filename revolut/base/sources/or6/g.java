package or6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f228069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f228070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f228071c;
    public final String d;
    public final e e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f228072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f228073h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wi0.b f228074j;

    public g(String str, String str2, c cVar, String str3, e eVar, f fVar, Boolean bool, String str4, String str5, wi0.b bVar) {
        this.f228069a = str;
        this.f228070b = str2;
        this.f228071c = cVar;
        this.d = str3;
        this.e = eVar;
        this.f = fVar;
        this.f228072g = bool;
        this.f228073h = str4;
        this.i = str5;
        this.f228074j = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f228069a, gVar.f228069a) && Intrinsics.f(this.f228070b, gVar.f228070b) && Intrinsics.f(this.f228071c, gVar.f228071c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && Intrinsics.f(this.f228072g, gVar.f228072g) && Intrinsics.f(this.f228073h, gVar.f228073h) && Intrinsics.f(this.i, gVar.i) && Intrinsics.f(this.f228074j, gVar.f228074j);
    }

    public final int hashCode() {
        String str = this.f228069a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f228070b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        c cVar = this.f228071c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        e eVar = this.e;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        f fVar = this.f;
        int iHashCode6 = (iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Boolean bool = this.f228072g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f228073h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        wi0.b bVar = this.f228074j;
        return iHashCode9 + (bVar != null ? bVar.f297794a.hashCode() : 0);
    }
}
