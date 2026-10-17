package qbd;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f244206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f244207b;

    public /* synthetic */ u(int i, boolean z, boolean z3) {
        if (3 != (i & 3)) {
            j1.f(s.f244205a.getDescriptor(), i, 3);
            throw null;
        }
        this.f244206a = z;
        this.f244207b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f244206a == uVar.f244206a && this.f244207b == uVar.f244207b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f244207b) + (Boolean.hashCode(this.f244206a) * 31);
    }

    public u(boolean z, boolean z3) {
        this.f244206a = z;
        this.f244207b = z3;
    }
}
