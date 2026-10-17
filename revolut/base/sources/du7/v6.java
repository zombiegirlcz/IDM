package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class v6 {

    @NotNull
    public static final u6 Companion = new u6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u5 f117882c;

    public /* synthetic */ v6(int i, String str, String str2, u5 u5Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(t6.f117857a.getDescriptor(), i, 7);
            throw null;
        }
        this.f117880a = str;
        this.f117881b = str2;
        this.f117882c = u5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj2;
        return Intrinsics.f(this.f117880a, v6Var.f117880a) && Intrinsics.f(this.f117881b, v6Var.f117881b) && Intrinsics.f(this.f117882c, v6Var.f117882c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f117880a.hashCode() * 31, 31, this.f117881b);
        u5 u5Var = this.f117882c;
        return iC + (u5Var == null ? 0 : u5Var.hashCode());
    }
}
