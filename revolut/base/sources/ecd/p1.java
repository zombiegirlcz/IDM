package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class p1 {

    @NotNull
    public static final o1 Companion = new o1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f124643b;

    public /* synthetic */ p1(int i, String str, m1 m1Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(n1.f124623a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124642a = str;
        this.f124643b = m1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f124642a, p1Var.f124642a) && Intrinsics.f(this.f124643b, p1Var.f124643b);
    }

    public final int hashCode() {
        int iHashCode = this.f124642a.hashCode() * 31;
        m1 m1Var = this.f124643b;
        return iHashCode + (m1Var == null ? 0 : m1Var.hashCode());
    }

    public p1(String description, m1 m1Var) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f124642a = description;
        this.f124643b = m1Var;
    }
}
