package re3;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f253511c = {null, j.c(k.PUBLICATION, new d(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f253512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f253513b;

    public /* synthetic */ g(int i, double d, List list) {
        if (3 != (i & 3)) {
            j1.f(e.f253510a.getDescriptor(), i, 3);
            throw null;
        }
        this.f253512a = d;
        this.f253513b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Double.compare(this.f253512a, gVar.f253512a) == 0 && Intrinsics.f(this.f253513b, gVar.f253513b);
    }

    public final int hashCode() {
        return this.f253513b.hashCode() + (Double.hashCode(this.f253512a) * 31);
    }
}
