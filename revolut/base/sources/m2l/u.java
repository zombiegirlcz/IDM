package m2l;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f202228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f202229b;

    public /* synthetic */ u(int i, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        if (1 != (i & 1)) {
            j1.f(s.f202227a.getDescriptor(), i, 1);
            throw null;
        }
        this.f202228a = bigDecimal;
        if ((i & 2) == 0) {
            this.f202229b = null;
        } else {
            this.f202229b = bigDecimal2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f202228a, uVar.f202228a) && Intrinsics.f(this.f202229b, uVar.f202229b);
    }

    public final int hashCode() {
        int iHashCode = this.f202228a.hashCode() * 31;
        BigDecimal bigDecimal = this.f202229b;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public u(BigDecimal value, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f202228a = value;
        this.f202229b = bigDecimal;
    }
}
