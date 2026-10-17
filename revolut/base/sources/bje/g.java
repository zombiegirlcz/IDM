package bje;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class g implements n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f15602c = {null, yhm.j.c(yhm.k.PUBLICATION, new bi2.g(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f15603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vtd.a f15604b;

    public g(double d, vtd.a stakingInterestType) {
        Intrinsics.checkNotNullParameter(stakingInterestType, "stakingInterestType");
        this.f15603a = d;
        this.f15604b = stakingInterestType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Double.compare(this.f15603a, gVar.f15603a) == 0 && this.f15604b == gVar.f15604b;
    }

    public final int hashCode() {
        return this.f15604b.hashCode() + (Double.hashCode(this.f15603a) * 31);
    }

    public /* synthetic */ g(int i, double d, vtd.a aVar) {
        if (3 != (i & 3)) {
            j1.f(e.f15601a.getDescriptor(), i, 3);
            throw null;
        }
        this.f15603a = d;
        this.f15604b = aVar;
    }
}
