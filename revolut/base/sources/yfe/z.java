package yfe;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class z extends w {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f313329b;

    public z(int i) {
        this.f313329b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && this.f313329b == ((z) obj2).f313329b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f313329b);
    }

    public /* synthetic */ z(int i, int i2) {
        if (1 == (i & 1)) {
            this.f313329b = i2;
        } else {
            qlm.j1.f(x.f313321a.getDescriptor(), i, 1);
            throw null;
        }
    }
}
