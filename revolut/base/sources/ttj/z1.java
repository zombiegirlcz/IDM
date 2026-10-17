package ttj;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class z1 {

    @NotNull
    public static final y1 Companion = new y1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f274433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f274434b;

    public /* synthetic */ z1(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            qlm.j1.f(x1.f274429a.getDescriptor(), i, 3);
            throw null;
        }
        this.f274433a = i2;
        this.f274434b = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return this.f274433a == z1Var.f274433a && this.f274434b == z1Var.f274434b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f274434b) + (Integer.hashCode(this.f274433a) * 31);
    }
}
