package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class u {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274412c;
    public final String d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f274413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f274414h;
    public final t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f274415j;
    public final Boolean k;

    public /* synthetic */ u(int i, String str, String str2, String str3, String str4, String str5, Long l2, Long l3, Integer num, t tVar, Boolean bool, Boolean bool2) {
        if (2047 != (i & 2047)) {
            qlm.j1.f(p.f274391a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f274410a = str;
        this.f274411b = str2;
        this.f274412c = str3;
        this.d = str4;
        this.e = str5;
        this.f = l2;
        this.f274413g = l3;
        this.f274414h = num;
        this.i = tVar;
        this.f274415j = bool;
        this.k = bool2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f274410a, uVar.f274410a) && Intrinsics.f(this.f274411b, uVar.f274411b) && Intrinsics.f(this.f274412c, uVar.f274412c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e) && Intrinsics.f(this.f, uVar.f) && Intrinsics.f(this.f274413g, uVar.f274413g) && Intrinsics.f(this.f274414h, uVar.f274414h) && Intrinsics.f(this.i, uVar.i) && Intrinsics.f(this.f274415j, uVar.f274415j) && Intrinsics.f(this.k, uVar.k);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f274410a.hashCode() * 31, 31, this.f274411b), 31, this.f274412c), 31, this.d), 31, this.e);
        Long l2 = this.f;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f274413g;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.f274414h;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        t tVar = this.i;
        int iHashCode4 = (iHashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Boolean bool = this.f274415j;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.k;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
