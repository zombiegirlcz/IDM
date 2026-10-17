package j19;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l1 {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k19.c f170227c;
    public final k1 d;
    public final String e;

    public /* synthetic */ l1(int i, String str, String str2, k19.c cVar, k1 k1Var, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(f1.f170201a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170225a = str;
        this.f170226b = str2;
        this.f170227c = cVar;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = k1Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.f170225a, l1Var.f170225a) && Intrinsics.f(this.f170226b, l1Var.f170226b) && Intrinsics.f(this.f170227c, l1Var.f170227c) && Intrinsics.f(this.d, l1Var.d) && Intrinsics.f(this.e, l1Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f170227c.hashCode() + p.a.c(this.f170225a.hashCode() * 31, 31, this.f170226b)) * 31;
        k1 k1Var = this.d;
        int iHashCode2 = (iHashCode + (k1Var == null ? 0 : k1Var.f170219a.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
