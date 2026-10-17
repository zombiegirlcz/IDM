package jrk;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f178067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f178068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f178069c;

    public /* synthetic */ o(int i, long j2, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (7 != (i & 7)) {
            j1.f(m.f178066a.getDescriptor(), i, 7);
            throw null;
        }
        this.f178067a = j2;
        this.f178068b = bigDecimal;
        this.f178069c = bigDecimal2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f178067a == oVar.f178067a && Intrinsics.f(this.f178068b, oVar.f178068b) && Intrinsics.f(this.f178069c, oVar.f178069c);
    }

    public final int hashCode() {
        return this.f178069c.hashCode() + t61.a.d(this.f178068b, Long.hashCode(this.f178067a) * 31, 31);
    }

    public o(long j2, BigDecimal original, BigDecimal movingAverage) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(movingAverage, "movingAverage");
        this.f178067a = j2;
        this.f178068b = original;
        this.f178069c = movingAverage;
    }
}
