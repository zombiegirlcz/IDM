package fdl;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class n1 {

    @NotNull
    public static final m1 Companion = new m1();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f134225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f134226c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{null, yhm.j.c(kVar, new fce.b(4)), yhm.j.c(kVar, new fce.b(5))};
    }

    public /* synthetic */ n1(int i, String str, List list, List list2) {
        if (7 != (i & 7)) {
            qlm.j1.f(l1.f134183a.getDescriptor(), i, 7);
            throw null;
        }
        this.f134224a = str;
        this.f134225b = list;
        this.f134226c = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return Intrinsics.f(this.f134224a, n1Var.f134224a) && Intrinsics.f(this.f134225b, n1Var.f134225b) && Intrinsics.f(this.f134226c, n1Var.f134226c);
    }

    public final int hashCode() {
        return this.f134226c.hashCode() + p.a.d(this.f134224a.hashCode() * 31, 31, this.f134225b);
    }
}
