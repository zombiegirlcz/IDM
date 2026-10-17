package m2l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class i {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f202205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f202206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f202207c;

    public /* synthetic */ i(int i, h hVar, e eVar, o oVar) {
        if (7 != (i & 7)) {
            j1.f(a.f202187a.getDescriptor(), i, 7);
            throw null;
        }
        this.f202205a = hVar;
        this.f202206b = eVar;
        this.f202207c = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f202205a, iVar.f202205a) && Intrinsics.f(this.f202206b, iVar.f202206b) && Intrinsics.f(this.f202207c, iVar.f202207c);
    }

    public final int hashCode() {
        return this.f202207c.hashCode() + ((this.f202206b.hashCode() + (this.f202205a.hashCode() * 31)) * 31);
    }

    public i(h ratingsDistribution, e priceTarget, o description) {
        Intrinsics.checkNotNullParameter(ratingsDistribution, "ratingsDistribution");
        Intrinsics.checkNotNullParameter(priceTarget, "priceTarget");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f202205a = ratingsDistribution;
        this.f202206b = priceTarget;
        this.f202207c = description;
    }
}
