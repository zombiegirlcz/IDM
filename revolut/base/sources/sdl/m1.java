package sdl;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class m1 {

    @NotNull
    public static final l1 Companion = new l1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f261983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f261984b;

    public /* synthetic */ m1(int i, BigDecimal bigDecimal, dj0.d dVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(k1.f261978a.getDescriptor(), i, 3);
            throw null;
        }
        this.f261983a = bigDecimal;
        this.f261984b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.f261983a, m1Var.f261983a) && Intrinsics.f(this.f261984b, m1Var.f261984b);
    }

    public final int hashCode() {
        int iHashCode = this.f261983a.hashCode() * 31;
        dj0.d dVar = this.f261984b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public m1(dj0.d dVar, BigDecimal yearlyRate) {
        Intrinsics.checkNotNullParameter(yearlyRate, "yearlyRate");
        this.f261983a = yearlyRate;
        this.f261984b = dVar;
    }
}
