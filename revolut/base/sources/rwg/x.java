package rwg;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new rr4.a(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f257946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f257947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f257948c;

    public /* synthetic */ x(int i, h0 h0Var, a0 a0Var, List list) {
        if (7 != (i & 7)) {
            j1.f(v.f257945a.getDescriptor(), i, 7);
            throw null;
        }
        this.f257946a = h0Var;
        this.f257947b = a0Var;
        this.f257948c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f257946a, xVar.f257946a) && Intrinsics.f(this.f257947b, xVar.f257947b) && Intrinsics.f(this.f257948c, xVar.f257948c);
    }

    public final int hashCode() {
        int iHashCode = this.f257946a.hashCode() * 31;
        a0 a0Var = this.f257947b;
        return this.f257948c.hashCode() + ((iHashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31);
    }
}
