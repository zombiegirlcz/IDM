package xf1;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import xda.z;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes20.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f304772c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f304773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f304774b;

    static {
        k kVar = k.PUBLICATION;
        f304772c = new Lazy[]{j.c(kVar, new z(10)), j.c(kVar, new z(11))};
    }

    public i(ArrayList precalculatedProductsToShow, ArrayList productsReceived) {
        Intrinsics.checkNotNullParameter(precalculatedProductsToShow, "precalculatedProductsToShow");
        Intrinsics.checkNotNullParameter(productsReceived, "productsReceived");
        this.f304773a = precalculatedProductsToShow;
        this.f304774b = productsReceived;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f304773a, iVar.f304773a) && Intrinsics.f(this.f304774b, iVar.f304774b);
    }

    public final int hashCode() {
        return this.f304774b.hashCode() + (this.f304773a.hashCode() * 31);
    }

    public /* synthetic */ i(List list, int i, List list2) {
        if (3 != (i & 3)) {
            j1.f(g.f304771a.getDescriptor(), i, 3);
            throw null;
        }
        this.f304773a = list;
        this.f304774b = list2;
    }
}
