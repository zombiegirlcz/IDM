package bjk;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class i3 {

    @NotNull
    public static final e3 Companion = new e3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f15986c = {null, yhm.j.c(yhm.k.PUBLICATION, new bi2.g(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15988b;

    public /* synthetic */ i3(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(d3.f15837a.getDescriptor(), i, 3);
            throw null;
        }
        this.f15987a = str;
        this.f15988b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj2;
        return Intrinsics.f(this.f15987a, i3Var.f15987a) && Intrinsics.f(this.f15988b, i3Var.f15988b);
    }

    public final int hashCode() {
        int iHashCode = this.f15987a.hashCode() * 31;
        List list = this.f15988b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
