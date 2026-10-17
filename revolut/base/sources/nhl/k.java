package nhl;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f215530c = {null, yhm.j.c(yhm.k.PUBLICATION, new n85.b(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zel.i f215532b;

    public /* synthetic */ k(int i, String str, zel.i iVar) {
        if (3 != (i & 3)) {
            j1.f(i.f215528a.getDescriptor(), i, 3);
            throw null;
        }
        this.f215531a = str;
        this.f215532b = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f215531a, kVar.f215531a) && this.f215532b == kVar.f215532b;
    }

    public final int hashCode() {
        return this.f215532b.hashCode() + (this.f215531a.hashCode() * 31);
    }

    public k(String sortingMetric, zel.i sortOrder) {
        Intrinsics.checkNotNullParameter(sortingMetric, "sortingMetric");
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        this.f215531a = sortingMetric;
        this.f215532b = sortOrder;
    }
}
