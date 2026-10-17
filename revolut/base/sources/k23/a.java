package k23;

import h93.j0;
import h93.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f180308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f180309c;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f180307a, aVar.f180307a) && this.f180308b == aVar.f180308b && this.f180309c == aVar.f180309c;
    }

    public final int hashCode() {
        String str = this.f180307a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        j0 j0Var = this.f180308b;
        int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        l0 l0Var = this.f180309c;
        return iHashCode2 + (l0Var != null ? l0Var.hashCode() : 0);
    }

    public a(String str, j0 j0Var, l0 l0Var) {
        this.f180307a = str;
        this.f180308b = j0Var;
        this.f180309c = l0Var;
    }

    public /* synthetic */ a(String str, j0 j0Var, l0 l0Var, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : j0Var, (i & 4) != 0 ? null : l0Var);
    }
}
