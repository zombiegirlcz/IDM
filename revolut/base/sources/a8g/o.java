package a8g;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2235b;

    public /* synthetic */ o(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            j1.f(m.f2233a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2234a = i2;
        this.f2235b = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f2234a == oVar.f2234a && this.f2235b == oVar.f2235b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2235b) + (Integer.hashCode(this.f2234a) * 31);
    }
}
