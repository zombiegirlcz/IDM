package bjk;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c3 {

    @NotNull
    public static final b3 Companion = new b3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f15707c = {yhm.j.c(yhm.k.PUBLICATION, new bi2.g(17)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i3 f15709b;

    public /* synthetic */ c3(int i, List list, i3 i3Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(a3.f15699a.getDescriptor(), i, 3);
            throw null;
        }
        this.f15708a = list;
        this.f15709b = i3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj2;
        return Intrinsics.f(this.f15708a, c3Var.f15708a) && Intrinsics.f(this.f15709b, c3Var.f15709b);
    }

    public final int hashCode() {
        List list = this.f15708a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        i3 i3Var = this.f15709b;
        return iHashCode + (i3Var != null ? i3Var.hashCode() : 0);
    }
}
