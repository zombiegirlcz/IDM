package plg;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f237382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f237383b;

    public /* synthetic */ g(int i, double d, double d5) {
        if (3 != (i & 3)) {
            j1.f(e.f237381a.getDescriptor(), i, 3);
            throw null;
        }
        this.f237382a = d;
        this.f237383b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Double.compare(this.f237382a, gVar.f237382a) == 0 && Double.compare(this.f237383b, gVar.f237383b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f237383b) + (Double.hashCode(this.f237382a) * 31);
    }
}
