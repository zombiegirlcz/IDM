package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a6 {

    @NotNull
    public static final z5 Companion = new z5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n7 f117601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n7 f117602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7 f117603c;
    public final n7 d;
    public final n7 e;
    public final n7 f;

    public /* synthetic */ a6(int i, n7 n7Var, n7 n7Var2, n7 n7Var3, n7 n7Var4, n7 n7Var5, n7 n7Var6) {
        if (63 != (i & 63)) {
            qlm.j1.f(y5.f117913a.getDescriptor(), i, 63);
            throw null;
        }
        this.f117601a = n7Var;
        this.f117602b = n7Var2;
        this.f117603c = n7Var3;
        this.d = n7Var4;
        this.e = n7Var5;
        this.f = n7Var6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj2;
        return Intrinsics.f(this.f117601a, a6Var.f117601a) && Intrinsics.f(this.f117602b, a6Var.f117602b) && Intrinsics.f(this.f117603c, a6Var.f117603c) && Intrinsics.f(this.d, a6Var.d) && Intrinsics.f(this.e, a6Var.e) && Intrinsics.f(this.f, a6Var.f);
    }

    public final int hashCode() {
        n7 n7Var = this.f117601a;
        int iHashCode = (n7Var == null ? 0 : n7Var.hashCode()) * 31;
        n7 n7Var2 = this.f117602b;
        int iHashCode2 = (iHashCode + (n7Var2 == null ? 0 : n7Var2.hashCode())) * 31;
        n7 n7Var3 = this.f117603c;
        int iHashCode3 = (iHashCode2 + (n7Var3 == null ? 0 : n7Var3.hashCode())) * 31;
        n7 n7Var4 = this.d;
        int iHashCode4 = (iHashCode3 + (n7Var4 == null ? 0 : n7Var4.hashCode())) * 31;
        n7 n7Var5 = this.e;
        int iHashCode5 = (iHashCode4 + (n7Var5 == null ? 0 : n7Var5.hashCode())) * 31;
        n7 n7Var6 = this.f;
        return iHashCode5 + (n7Var6 != null ? n7Var6.hashCode() : 0);
    }
}
