package fdl;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class t1 {

    @NotNull
    public static final s1 Companion = new s1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f134345c = {null, yhm.j.c(yhm.k.PUBLICATION, new fce.b(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f134347b;

    public /* synthetic */ t1(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(r1.f134257a.getDescriptor(), i, 3);
            throw null;
        }
        this.f134346a = str;
        this.f134347b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(this.f134346a, t1Var.f134346a) && Intrinsics.f(this.f134347b, t1Var.f134347b);
    }

    public final int hashCode() {
        return this.f134347b.hashCode() + (this.f134346a.hashCode() * 31);
    }
}
