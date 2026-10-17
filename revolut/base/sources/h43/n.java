package h43;

import com.revolut.data.model.Data;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f149294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f149295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f149296c;

    public n(Data state, f0 f0Var, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f149294a = state;
        this.f149295b = f0Var;
        this.f149296c = z;
    }

    public static n a(n nVar, Data state, f0 f0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            state = nVar.f149294a;
        }
        if ((i & 2) != 0) {
            f0Var = nVar.f149295b;
        }
        if ((i & 4) != 0) {
            z = nVar.f149296c;
        }
        nVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        return new n(state, f0Var, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f149294a, nVar.f149294a) && Intrinsics.f(this.f149295b, nVar.f149295b) && this.f149296c == nVar.f149296c;
    }

    public final int hashCode() {
        int iHashCode = this.f149294a.hashCode() * 31;
        f0 f0Var = this.f149295b;
        return Boolean.hashCode(this.f149296c) + ((iHashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31);
    }
}
