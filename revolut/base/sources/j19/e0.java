package j19;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e0 implements c {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f170191c = {null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f170192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f170193b;

    public /* synthetic */ e0(int i, a0 a0Var, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(w.f170270a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170192a = a0Var;
        this.f170193b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f170192a, e0Var.f170192a) && Intrinsics.f(this.f170193b, e0Var.f170193b);
    }

    public final int hashCode() {
        return this.f170193b.hashCode() + (this.f170192a.hashCode() * 31);
    }
}
