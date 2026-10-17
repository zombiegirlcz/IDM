package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class z6 {

    @NotNull
    public static final y6 Companion = new y6();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f153393j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153396c;
    public final g8 d;
    public final y5 e;
    public final y5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f153397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r4 f153398h;
    public final List i;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f153393j = new Lazy[]{null, null, null, null, null, null, yhm.j.c(kVar, new q0(13)), null, yhm.j.c(kVar, new q0(14))};
    }

    public /* synthetic */ z6(int i, String str, String str2, String str3, g8 g8Var, y5 y5Var, y5 y5Var2, List list, r4 r4Var, List list2) {
        if (511 != (i & 511)) {
            qlm.j1.f(x6.f153366a.getDescriptor(), i, 511);
            throw null;
        }
        this.f153394a = str;
        this.f153395b = str2;
        this.f153396c = str3;
        this.d = g8Var;
        this.e = y5Var;
        this.f = y5Var2;
        this.f153397g = list;
        this.f153398h = r4Var;
        this.i = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj2;
        return Intrinsics.f(this.f153394a, z6Var.f153394a) && Intrinsics.f(this.f153395b, z6Var.f153395b) && Intrinsics.f(this.f153396c, z6Var.f153396c) && Intrinsics.f(this.d, z6Var.d) && Intrinsics.f(this.e, z6Var.e) && Intrinsics.f(this.f, z6Var.f) && Intrinsics.f(this.f153397g, z6Var.f153397g) && Intrinsics.f(this.f153398h, z6Var.f153398h) && Intrinsics.f(this.i, z6Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f153394a.hashCode() * 31, 31, this.f153395b), 31, this.f153396c)) * 31;
        y5 y5Var = this.e;
        int iHashCode2 = (iHashCode + (y5Var == null ? 0 : y5Var.hashCode())) * 31;
        y5 y5Var2 = this.f;
        int iHashCode3 = (this.f153398h.hashCode() + p.a.d((iHashCode2 + (y5Var2 == null ? 0 : y5Var2.hashCode())) * 31, 31, this.f153397g)) * 31;
        List list = this.i;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }
}
