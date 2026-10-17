package nhl;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new s(9)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f215566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f215567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f215568c;

    public /* synthetic */ t0(int i, int i2, List list, w0 w0Var) {
        if (7 != (i & 7)) {
            j1.f(r0.f215563a.getDescriptor(), i, 7);
            throw null;
        }
        this.f215566a = i2;
        this.f215567b = list;
        this.f215568c = w0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return this.f215566a == t0Var.f215566a && Intrinsics.f(this.f215567b, t0Var.f215567b) && Intrinsics.f(this.f215568c, t0Var.f215568c);
    }

    public final int hashCode() {
        return this.f215568c.hashCode() + p.a.d(Integer.hashCode(this.f215566a) * 31, 31, this.f215567b);
    }
}
