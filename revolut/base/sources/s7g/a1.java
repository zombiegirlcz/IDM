package s7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class a1 {

    @NotNull
    public static final z0 Companion = new z0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f260683c = {null, yhm.j.c(yhm.k.PUBLICATION, new s77.x(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f260685b;

    public a1(int i, String str, List list) {
        if (1 != (i & 1)) {
            qlm.j1.f(y0.f260816a.getDescriptor(), i, 1);
            throw null;
        }
        this.f260684a = str;
        if ((i & 2) == 0) {
            this.f260685b = zhm.f0.f322471a;
        } else {
            this.f260685b = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.f260684a, a1Var.f260684a) && Intrinsics.f(this.f260685b, a1Var.f260685b);
    }

    public final int hashCode() {
        return this.f260685b.hashCode() + (this.f260684a.hashCode() * 31);
    }
}
