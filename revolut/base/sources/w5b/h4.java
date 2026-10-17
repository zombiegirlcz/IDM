package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class h4 {

    @NotNull
    public static final g4 Companion = new g4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294866c;
    public final boolean d;
    public final z1 e;
    public final f2 f;

    public /* synthetic */ h4(int i, String str, String str2, String str3, boolean z, z1 z1Var, f2 f2Var) {
        if (63 != (i & 63)) {
            qlm.j1.f(f4.f294835a.getDescriptor(), i, 63);
            throw null;
        }
        this.f294864a = str;
        this.f294865b = str2;
        this.f294866c = str3;
        this.d = z;
        this.e = z1Var;
        this.f = f2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj2;
        return Intrinsics.f(this.f294864a, h4Var.f294864a) && Intrinsics.f(this.f294865b, h4Var.f294865b) && Intrinsics.f(this.f294866c, h4Var.f294866c) && this.d == h4Var.d && Intrinsics.f(this.e, h4Var.e) && Intrinsics.f(this.f, h4Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f294864a.hashCode() * 31;
        String str = this.f294865b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f294866c;
        int iC = j6.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        z1 z1Var = this.e;
        int iHashCode3 = (iC + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        f2 f2Var = this.f;
        return iHashCode3 + (f2Var != null ? f2Var.hashCode() : 0);
    }

    public h4(String title, String str, String str2, boolean z, z1 z1Var, f2 f2Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f294864a = title;
        this.f294865b = str;
        this.f294866c = str2;
        this.d = z;
        this.e = z1Var;
        this.f = f2Var;
    }
}
