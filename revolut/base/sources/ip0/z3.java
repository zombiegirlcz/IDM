package ip0;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class z3 {

    @NotNull
    public static final x3 Companion = new x3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f167391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w3 f167392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y3 f167393c;

    public z3(float f, w3 w3Var, y3 y3Var) {
        this.f167391a = f;
        this.f167392b = w3Var;
        this.f167393c = y3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj2;
        return Float.compare(this.f167391a, z3Var.f167391a) == 0 && this.f167392b == z3Var.f167392b && this.f167393c == z3Var.f167393c;
    }

    public final int hashCode() {
        return (this.f167393c.hashCode() + ((this.f167392b.hashCode() + (Float.hashCode(this.f167391a) * 31)) * 31)) * 31;
    }
}
