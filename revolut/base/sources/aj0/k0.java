package aj0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class k0 implements l0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f5360c = {yhm.j.c(yhm.k.PUBLICATION, new o(2)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f5362b;

    public /* synthetic */ k0(int i, List list, g gVar) {
        if (3 != (i & 3)) {
            j1.f(f0.f5350a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5361a = list;
        this.f5362b = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f5361a, k0Var.f5361a) && Intrinsics.f(this.f5362b, k0Var.f5362b);
    }

    public final int hashCode() {
        int iHashCode = this.f5361a.hashCode() * 31;
        g gVar = this.f5362b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public k0(ArrayList blocks, g gVar) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f5361a = blocks;
        this.f5362b = gVar;
    }
}
