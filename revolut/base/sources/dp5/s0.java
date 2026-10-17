package dp5;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f116809c = {null, yhm.j.c(yhm.k.PUBLICATION, new dmj.b(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f116810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f116811b;

    public /* synthetic */ s0(int i, List list, jo3.a aVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(q0.f116794a.getDescriptor(), i, 3);
            throw null;
        }
        this.f116810a = aVar;
        this.f116811b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f116810a, s0Var.f116810a) && Intrinsics.f(this.f116811b, s0Var.f116811b);
    }

    public final int hashCode() {
        int iHashCode = this.f116810a.hashCode() * 31;
        List list = this.f116811b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
