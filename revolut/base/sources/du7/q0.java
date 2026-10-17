package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class q0 {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117817c;
    public final n0 d;

    public /* synthetic */ q0(int i, String str, String str2, String str3, n0 n0Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(m0.f117756a.getDescriptor(), i, 15);
            throw null;
        }
        this.f117815a = str;
        this.f117816b = str2;
        this.f117817c = str3;
        this.d = n0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f117815a, q0Var.f117815a) && Intrinsics.f(this.f117816b, q0Var.f117816b) && Intrinsics.f(this.f117817c, q0Var.f117817c) && Intrinsics.f(this.d, q0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f117815a.hashCode() * 31;
        String str = this.f117816b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f117817c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        n0 n0Var = this.d;
        return iHashCode3 + (n0Var != null ? n0Var.hashCode() : 0);
    }
}
