package qo5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f248022c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f248023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f248024h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f248025j;
    public final Long k;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5, String str6, j jVar, String str7, String str8, g gVar, Long l2) {
        if (1023 != (i & 1023)) {
            j1.f(a.f248019a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f248020a = str;
        this.f248021b = str2;
        this.f248022c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f248023g = jVar;
        this.f248024h = str7;
        this.i = str8;
        this.f248025j = gVar;
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f248020a, cVar.f248020a) && Intrinsics.f(this.f248021b, cVar.f248021b) && Intrinsics.f(this.f248022c, cVar.f248022c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f248023g, cVar.f248023g) && Intrinsics.f(this.f248024h, cVar.f248024h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f248025j, cVar.f248025j) && Intrinsics.f(this.k, cVar.k);
    }

    public final int hashCode() {
        int iHashCode = this.f248020a.hashCode() * 31;
        String str = this.f248021b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f248022c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        j jVar = this.f248023g;
        int iHashCode7 = (iHashCode6 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str6 = this.f248024h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        g gVar = this.f248025j;
        int iHashCode10 = (iHashCode9 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Long l2 = this.k;
        return iHashCode10 + (l2 != null ? l2.hashCode() : 0);
    }

    public c(String id10, String str, String str2, String str3, String str4, String str5, j jVar, String str6, String str7, g gVar, Long l2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f248020a = id10;
        this.f248021b = str;
        this.f248022c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f248023g = jVar;
        this.f248024h = str6;
        this.i = str7;
        this.f248025j = gVar;
        this.k = l2;
    }
}
