package sm5;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import sdl.y;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] k = {null, null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new y(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264351c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f264352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f264353h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f264354j;

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4, String str5, String str6, c cVar, String str7, String str8, Map map) {
        if (1023 != (i & 1023)) {
            j1.f(d.f264348a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f264349a = str;
        this.f264350b = str2;
        this.f264351c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f264352g = cVar;
        this.f264353h = str7;
        this.i = str8;
        this.f264354j = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f264349a, fVar.f264349a) && Intrinsics.f(this.f264350b, fVar.f264350b) && Intrinsics.f(this.f264351c, fVar.f264351c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f264352g, fVar.f264352g) && Intrinsics.f(this.f264353h, fVar.f264353h) && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f264354j, fVar.f264354j);
    }

    public final int hashCode() {
        int iHashCode = this.f264349a.hashCode() * 31;
        String str = this.f264350b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f264351c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        c cVar = this.f264352g;
        int iHashCode7 = (iHashCode6 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str6 = this.f264353h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map map = this.f264354j;
        return iHashCode9 + (map != null ? map.hashCode() : 0);
    }
}
