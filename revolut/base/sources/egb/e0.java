package egb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class e0 implements g0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125588b;

    public /* synthetic */ e0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(c0.f125585a.getDescriptor(), i, 3);
            throw null;
        }
        this.f125587a = str;
        this.f125588b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f125587a, e0Var.f125587a) && Intrinsics.f(this.f125588b, e0Var.f125588b);
    }

    public final int hashCode() {
        return this.f125588b.hashCode() + (this.f125587a.hashCode() * 31);
    }
}
