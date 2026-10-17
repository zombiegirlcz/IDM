package pne;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f237715c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f237716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f237717b;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f237715c = new Lazy[]{yhm.j.c(kVar, new pka.c(22)), yhm.j.c(kVar, new pka.c(23))};
    }

    public f(ArrayList limitOrders, ArrayList fullOrders) {
        Intrinsics.checkNotNullParameter(limitOrders, "limitOrders");
        Intrinsics.checkNotNullParameter(fullOrders, "fullOrders");
        this.f237716a = limitOrders;
        this.f237717b = fullOrders;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f237716a, fVar.f237716a) && Intrinsics.f(this.f237717b, fVar.f237717b);
    }

    public final int hashCode() {
        return this.f237717b.hashCode() + (this.f237716a.hashCode() * 31);
    }

    public f(List list, int i, List list2) {
        if (1 != (i & 1)) {
            j1.f(d.f237708a.getDescriptor(), i, 1);
            throw null;
        }
        this.f237716a = list;
        if ((i & 2) == 0) {
            this.f237717b = zhm.f0.f322471a;
        } else {
            this.f237717b = list2;
        }
    }
}
