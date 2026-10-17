package wtg;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f299966c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f299968b;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f299966c = new Lazy[]{yhm.j.c(kVar, new wq1.a(10)), yhm.j.c(kVar, new wq1.a(11))};
    }

    public /* synthetic */ o(List list, int i, List list2) {
        if (3 != (i & 3)) {
            j1.f(m.f299965a.getDescriptor(), i, 3);
            throw null;
        }
        this.f299967a = list;
        this.f299968b = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f299967a, oVar.f299967a) && Intrinsics.f(this.f299968b, oVar.f299968b);
    }

    public final int hashCode() {
        return this.f299968b.hashCode() + (this.f299967a.hashCode() * 31);
    }
}
