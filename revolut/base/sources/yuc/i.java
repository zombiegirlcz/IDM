package yuc;

import com.revolut.data.model.Data;
import h93.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f316978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f316979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f316980c;
    public final boolean d;
    public final Boolean e;

    public i(f0 f0Var, Data connections, boolean z, boolean z3, Boolean bool) {
        Intrinsics.checkNotNullParameter(connections, "connections");
        this.f316978a = f0Var;
        this.f316979b = connections;
        this.f316980c = z;
        this.d = z3;
        this.e = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f316978a, iVar.f316978a) && Intrinsics.f(this.f316979b, iVar.f316979b) && this.f316980c == iVar.f316980c && this.d == iVar.d && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        f0 f0Var = this.f316978a;
        int iC = j6.a.c(j6.a.c(kii.e.c(this.f316979b, (f0Var == null ? 0 : f0Var.hashCode()) * 31, 31), 31, this.f316980c), 31, this.d);
        Boolean bool = this.e;
        return iC + (bool != null ? bool.hashCode() : 0);
    }
}
