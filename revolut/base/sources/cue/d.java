package cue;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements Serializable {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108993c;
    public final String d;
    public final String e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f108994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f108995h;
    public final a i;

    public d(String paymentId, String str, String str2, String str3, String str4, c cVar, Map map, Map map2, a aVar) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        this.f108991a = paymentId;
        this.f108992b = str;
        this.f108993c = str2;
        this.d = str3;
        this.e = str4;
        this.f = cVar;
        this.f108994g = map;
        this.f108995h = map2;
        this.i = aVar;
    }

    public static d a(d dVar, String str, String str2, int i) {
        String paymentId = dVar.f108991a;
        String str3 = dVar.f108992b;
        String str4 = dVar.f108993c;
        if ((i & 8) != 0) {
            str = dVar.d;
        }
        String str5 = str;
        if ((i & 16) != 0) {
            str2 = dVar.e;
        }
        c cVar = dVar.f;
        Map map = dVar.f108994g;
        Map map2 = dVar.f108995h;
        a aVar = dVar.i;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        return new d(paymentId, str3, str4, str5, str2, cVar, map, map2, aVar);
    }

    public final boolean b() {
        Map map = this.f108994g;
        return map != null && map.containsKey("payment_method_id");
    }

    public final boolean c() {
        return (this.d == null || this.f == null) ? false : true;
    }

    public final boolean d() {
        Map map = this.f108994g;
        return Intrinsics.f(map != null ? (String) map.get("origin") : null, "CPG");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f108991a, dVar.f108991a) && Intrinsics.f(this.f108992b, dVar.f108992b) && Intrinsics.f(this.f108993c, dVar.f108993c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f108994g, dVar.f108994g) && Intrinsics.f(this.f108995h, dVar.f108995h) && this.i == dVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.f108991a.hashCode() * 31;
        String str = this.f108992b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f108993c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        c cVar = this.f;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Map map = this.f108994g;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f108995h;
        int iHashCode8 = (iHashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
        a aVar = this.i;
        return iHashCode8 + (aVar != null ? aVar.hashCode() : 0);
    }
}
