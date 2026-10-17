package s1l;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f259212c = {yhm.j.c(yhm.k.PUBLICATION, new s1g.a(7)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f259213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f259214b;

    public /* synthetic */ v0(int i, List list, k kVar) {
        if (1 != (i & 1)) {
            j1.f(t0.f259210a.getDescriptor(), i, 1);
            throw null;
        }
        this.f259213a = list;
        if ((i & 2) == 0) {
            this.f259214b = null;
        } else {
            this.f259214b = kVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f259213a, v0Var.f259213a) && Intrinsics.f(this.f259214b, v0Var.f259214b);
    }

    public final int hashCode() {
        int iHashCode = this.f259213a.hashCode() * 31;
        k kVar = this.f259214b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public v0(ArrayList items, k kVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f259213a = items;
        this.f259214b = kVar;
    }
}
