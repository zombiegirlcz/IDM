package pne;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f237723b;

    public /* synthetic */ i(int i, String str, h0 h0Var) {
        if (1 != (i & 1)) {
            j1.f(g.f237719a.getDescriptor(), i, 1);
            throw null;
        }
        this.f237722a = str;
        if ((i & 2) == 0) {
            this.f237723b = null;
        } else {
            this.f237723b = h0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f237722a, iVar.f237722a) && Intrinsics.f(this.f237723b, iVar.f237723b);
    }

    public final int hashCode() {
        int iHashCode = this.f237722a.hashCode() * 31;
        h0 h0Var = this.f237723b;
        return iHashCode + (h0Var == null ? 0 : h0Var.hashCode());
    }

    public i(String code, h0 h0Var) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f237722a = code;
        this.f237723b = h0Var;
    }
}
