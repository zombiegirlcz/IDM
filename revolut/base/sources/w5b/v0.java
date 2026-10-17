package w5b;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f295042g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f295045c;
    public final List d;
    public final ld7.f e;
    public final List f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f295042g = new Lazy[]{null, null, null, yhm.j.c(kVar, new w56.a(10)), null, yhm.j.c(kVar, new w56.a(11))};
    }

    public /* synthetic */ v0(int i, String str, String str2, s0 s0Var, List list, ld7.f fVar, List list2) {
        if (63 != (i & 63)) {
            qlm.j1.f(t0.f295011a.getDescriptor(), i, 63);
            throw null;
        }
        this.f295043a = str;
        this.f295044b = str2;
        this.f295045c = s0Var;
        this.d = list;
        this.e = fVar;
        this.f = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f295043a, v0Var.f295043a) && Intrinsics.f(this.f295044b, v0Var.f295044b) && Intrinsics.f(this.f295045c, v0Var.f295045c) && Intrinsics.f(this.d, v0Var.d) && Intrinsics.f(this.e, v0Var.e) && Intrinsics.f(this.f, v0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f295043a.hashCode() * 31;
        String str = this.f295044b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        s0 s0Var = this.f295045c;
        int iD = p.a.d((iHashCode2 + (s0Var == null ? 0 : s0Var.f295004a.hashCode())) * 31, 31, this.d);
        ld7.f fVar = this.e;
        int iHashCode3 = (iD + (fVar == null ? 0 : fVar.f194043a.hashCode())) * 31;
        List list = this.f;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }
}
