package iyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f169669b;

    public /* synthetic */ i(int i, String str, d0 d0Var) {
        if (3 != (i & 3)) {
            j1.f(g.f169663a.getDescriptor(), i, 3);
            throw null;
        }
        this.f169668a = str;
        this.f169669b = d0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f169668a, iVar.f169668a) && Intrinsics.f(this.f169669b, iVar.f169669b);
    }

    public final int hashCode() {
        return this.f169669b.hashCode() + (this.f169668a.hashCode() * 31);
    }

    public i(String endDateConfig, d0 taxPeriod) {
        Intrinsics.checkNotNullParameter(endDateConfig, "endDateConfig");
        Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
        this.f169668a = endDateConfig;
        this.f169669b = taxPeriod;
    }
}
