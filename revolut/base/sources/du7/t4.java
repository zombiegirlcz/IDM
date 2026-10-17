package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t4 {

    @NotNull
    public static final n4 Companion = new n4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117856c;
    public final o4 d;
    public final s4 e;
    public final s4 f;

    public /* synthetic */ t4(int i, String str, String str2, String str3, o4 o4Var, s4 s4Var, s4 s4Var2) {
        if (63 != (i & 63)) {
            qlm.j1.f(m4.f117773a.getDescriptor(), i, 63);
            throw null;
        }
        this.f117854a = str;
        this.f117855b = str2;
        this.f117856c = str3;
        this.d = o4Var;
        this.e = s4Var;
        this.f = s4Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj2;
        return Intrinsics.f(this.f117854a, t4Var.f117854a) && Intrinsics.f(this.f117855b, t4Var.f117855b) && Intrinsics.f(this.f117856c, t4Var.f117856c) && Intrinsics.f(this.d, t4Var.d) && Intrinsics.f(this.e, t4Var.e) && Intrinsics.f(this.f, t4Var.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f117854a.hashCode() * 31, 31, this.f117855b), 31, this.f117856c);
        o4 o4Var = this.d;
        int iHashCode = (iC + (o4Var == null ? 0 : o4Var.hashCode())) * 31;
        s4 s4Var = this.e;
        int iHashCode2 = (iHashCode + (s4Var == null ? 0 : s4Var.hashCode())) * 31;
        s4 s4Var2 = this.f;
        return iHashCode2 + (s4Var2 != null ? s4Var2.hashCode() : 0);
    }
}
