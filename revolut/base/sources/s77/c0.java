package s77;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260532c;
    public final g d;
    public final j e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f260533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f260534h;
    public final d i;

    public /* synthetic */ c0(int i, String str, String str2, String str3, g gVar, j jVar, j jVar2, j jVar3, j jVar4, d dVar) {
        if (511 != (i & 511)) {
            j1.f(a0.f260528a.getDescriptor(), i, 511);
            throw null;
        }
        this.f260530a = str;
        this.f260531b = str2;
        this.f260532c = str3;
        this.d = gVar;
        this.e = jVar;
        this.f = jVar2;
        this.f260533g = jVar3;
        this.f260534h = jVar4;
        this.i = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f260530a, c0Var.f260530a) && Intrinsics.f(this.f260531b, c0Var.f260531b) && Intrinsics.f(this.f260532c, c0Var.f260532c) && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e) && Intrinsics.f(this.f, c0Var.f) && Intrinsics.f(this.f260533g, c0Var.f260533g) && Intrinsics.f(this.f260534h, c0Var.f260534h) && Intrinsics.f(this.i, c0Var.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f260530a.hashCode() * 31, 31, this.f260531b), 31, this.f260532c);
        g gVar = this.d;
        int iHashCode = (iC + (gVar == null ? 0 : gVar.hashCode())) * 31;
        j jVar = this.e;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        j jVar2 = this.f;
        int iHashCode3 = (iHashCode2 + (jVar2 == null ? 0 : jVar2.hashCode())) * 31;
        j jVar3 = this.f260533g;
        int iHashCode4 = (iHashCode3 + (jVar3 == null ? 0 : jVar3.hashCode())) * 31;
        j jVar4 = this.f260534h;
        int iHashCode5 = (iHashCode4 + (jVar4 == null ? 0 : jVar4.hashCode())) * 31;
        d dVar = this.i;
        return iHashCode5 + (dVar != null ? dVar.hashCode() : 0);
    }

    public c0(String name, String region, String countryCode, g gVar, j jVar, j jVar2, j jVar3, j jVar4, d dVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f260530a = name;
        this.f260531b = region;
        this.f260532c = countryCode;
        this.d = gVar;
        this.e = jVar;
        this.f = jVar2;
        this.f260533g = jVar3;
        this.f260534h = jVar4;
        this.i = dVar;
    }
}
