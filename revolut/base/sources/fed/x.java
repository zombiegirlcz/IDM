package fed;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f134577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f134578b;

    public /* synthetic */ x(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            j1.f(v.f134576a.getDescriptor(), i, 3);
            throw null;
        }
        this.f134577a = i2;
        this.f134578b = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f134577a == xVar.f134577a && this.f134578b == xVar.f134578b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f134578b) + (Integer.hashCode(this.f134577a) * 31);
    }
}
