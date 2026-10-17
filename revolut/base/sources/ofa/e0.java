package ofa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class e0 implements g0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f224768a;

    public /* synthetic */ e0(int i, d0 d0Var) {
        if (1 == (i & 1)) {
            this.f224768a = d0Var;
        } else {
            j1.f(z.f224793a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f224768a, ((e0) obj2).f224768a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224768a.f224765a);
    }
}
