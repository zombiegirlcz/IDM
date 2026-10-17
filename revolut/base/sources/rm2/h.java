package rm2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f255186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f255187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f255188c;
    public final em2.b d;
    public final boolean e;

    public h(Map map, String str, boolean z, em2.b bVar, boolean z3) {
        this.f255186a = map;
        this.f255187b = str;
        this.f255188c = z;
        this.d = bVar;
        this.e = z3;
    }

    public static h a(h hVar, Map map, String str, boolean z, em2.b bVar, int i) {
        if ((i & 1) != 0) {
            map = hVar.f255186a;
        }
        Map map2 = map;
        if ((i & 2) != 0) {
            str = hVar.f255187b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = hVar.f255188c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            bVar = hVar.d;
        }
        boolean z4 = hVar.e;
        hVar.getClass();
        return new h(map2, str2, z3, bVar, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f255186a, hVar.f255186a) && Intrinsics.f(this.f255187b, hVar.f255187b) && this.f255188c == hVar.f255188c && this.d == hVar.d && this.e == hVar.e;
    }

    public final int hashCode() {
        Map map = this.f255186a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.f255187b;
        int iC = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f255188c);
        em2.b bVar = this.d;
        return Boolean.hashCode(this.e) + ((iC + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }
}
