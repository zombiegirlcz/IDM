package s7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class m1 {

    @NotNull
    public static final l1 Companion = new l1();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new s77.x(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f260764c;
    public final List d;

    public /* synthetic */ m1(int i, Boolean bool, String str, String str2, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(k1.f260751a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260762a = str;
        this.f260763b = str2;
        if ((i & 4) == 0) {
            this.f260764c = null;
        } else {
            this.f260764c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.f260762a, m1Var.f260762a) && Intrinsics.f(this.f260763b, m1Var.f260763b) && Intrinsics.f(this.f260764c, m1Var.f260764c) && Intrinsics.f(this.d, m1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f260762a.hashCode() * 31, 31, this.f260763b);
        Boolean bool = this.f260764c;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
