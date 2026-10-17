package f2e;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class s2 {

    @NotNull
    public static final r2 Companion = new r2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f131711c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f131713b;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f131711c = new Lazy[]{yhm.j.c(kVar, new i(18)), yhm.j.c(kVar, new i(19))};
    }

    public s2(ArrayList filters, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f131712a = filters;
        this.f131713b = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj2;
        return Intrinsics.f(this.f131712a, s2Var.f131712a) && Intrinsics.f(this.f131713b, s2Var.f131713b);
    }

    public final int hashCode() {
        int iHashCode = this.f131712a.hashCode() * 31;
        List list = this.f131713b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public /* synthetic */ s2(List list, int i, List list2) {
        if (3 != (i & 3)) {
            qlm.j1.f(q2.f131694a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131712a = list;
        this.f131713b = list2;
    }
}
