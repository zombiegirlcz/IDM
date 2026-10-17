package j1f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class z0 {

    @NotNull
    public static final v0 Companion = new v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f170450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f170451c;
    public final String d;

    public /* synthetic */ z0(int i, String str, int i2, y0 y0Var, String str2) {
        if (7 != (i & 7)) {
            j1.f(u0.f170438a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170449a = str;
        this.f170450b = i2;
        this.f170451c = y0Var;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f170449a, z0Var.f170449a) && this.f170450b == z0Var.f170450b && Intrinsics.f(this.f170451c, z0Var.f170451c) && Intrinsics.f(this.d, z0Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.b(this.f170450b, this.f170449a.hashCode() * 31, 31), 31, this.f170451c.f170448a);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public z0(String accountId, int i, y0 rate, String str) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f170449a = accountId;
        this.f170450b = i;
        this.f170451c = rate;
        this.d = str;
    }
}
