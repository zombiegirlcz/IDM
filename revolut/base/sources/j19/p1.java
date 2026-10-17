package j19;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p1 {

    @NotNull
    public static final o1 Companion = new o1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k19.c f170233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f170234b;

    public /* synthetic */ p1(int i, k19.c cVar, int i2) {
        if (3 != (i & 3)) {
            qlm.j1.f(n1.f170230a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170233a = cVar;
        this.f170234b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f170233a, p1Var.f170233a) && this.f170234b == p1Var.f170234b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f170234b) + (this.f170233a.hashCode() * 31);
    }
}
