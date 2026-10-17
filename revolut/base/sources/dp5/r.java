package dp5;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f116802j = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new dmj.b(6)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116805c;
    public final bl5.b d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f116806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f116807h;
    public final String i;

    public /* synthetic */ r(int i, String str, String str2, String str3, bl5.b bVar, List list, boolean z, String str4, d0 d0Var, String str5) {
        if (511 != (i & 511)) {
            qlm.j1.f(p.f116791a.getDescriptor(), i, 511);
            throw null;
        }
        this.f116803a = str;
        this.f116804b = str2;
        this.f116805c = str3;
        this.d = bVar;
        this.e = list;
        this.f = z;
        this.f116806g = str4;
        this.f116807h = d0Var;
        this.i = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f116803a, rVar.f116803a) && Intrinsics.f(this.f116804b, rVar.f116804b) && Intrinsics.f(this.f116805c, rVar.f116805c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && this.f == rVar.f && Intrinsics.f(this.f116806g, rVar.f116806g) && Intrinsics.f(this.f116807h, rVar.f116807h) && Intrinsics.f(this.i, rVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f116803a.hashCode() * 31, 31, this.f116804b), 31, this.f116805c);
        bl5.b bVar = this.d;
        int iC2 = p.a.c(j6.a.c(p.a.d((iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f116806g);
        d0 d0Var = this.f116807h;
        int iHashCode = (iC2 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        String str = this.i;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
