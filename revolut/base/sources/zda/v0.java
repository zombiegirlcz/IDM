package zda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f321421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321422c;

    public /* synthetic */ v0(int i, String str, y0 y0Var, String str2) {
        if (1 != (i & 1)) {
            j1.f(t0.f321416a.getDescriptor(), i, 1);
            throw null;
        }
        this.f321420a = str;
        if ((i & 2) == 0) {
            this.f321421b = null;
        } else {
            this.f321421b = y0Var;
        }
        if ((i & 4) == 0) {
            this.f321422c = null;
        } else {
            this.f321422c = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f321420a, v0Var.f321420a) && Intrinsics.f(this.f321421b, v0Var.f321421b) && Intrinsics.f(this.f321422c, v0Var.f321422c);
    }

    public final int hashCode() {
        int iHashCode = this.f321420a.hashCode() * 31;
        y0 y0Var = this.f321421b;
        int iHashCode2 = (iHashCode + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        String str = this.f321422c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public v0(String value, y0 y0Var, String str) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f321420a = value;
        this.f321421b = y0Var;
        this.f321422c = str;
    }
}
