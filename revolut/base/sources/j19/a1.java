package j19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a1 implements c {

    @NotNull
    public static final y0 Companion = new y0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f170166g = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(13)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170169c;
    public final z0 d;
    public final k19.c e;
    public final String f;

    public /* synthetic */ a1(int i, String str, String str2, String str3, z0 z0Var, k19.c cVar, String str4) {
        if (63 != (i & 63)) {
            qlm.j1.f(x0.f170277a.getDescriptor(), i, 63);
            throw null;
        }
        this.f170167a = str;
        this.f170168b = str2;
        this.f170169c = str3;
        this.d = z0Var;
        this.e = cVar;
        this.f = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.f170167a, a1Var.f170167a) && Intrinsics.f(this.f170168b, a1Var.f170168b) && Intrinsics.f(this.f170169c, a1Var.f170169c) && this.d == a1Var.d && Intrinsics.f(this.e, a1Var.e) && Intrinsics.f(this.f, a1Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f170167a.hashCode() * 31, 31, this.f170168b), 31, this.f170169c)) * 31)) * 31;
        String str = this.f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
