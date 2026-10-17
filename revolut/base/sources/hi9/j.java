package hi9;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class j extends c {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f152549c;

    public /* synthetic */ j(int i, long j2, BigDecimal bigDecimal) {
        if (3 != (i & 3)) {
            j1.f(h.f152547a.getDescriptor(), i, 3);
            throw null;
        }
        this.f152548b = j2;
        this.f152549c = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f152548b == jVar.f152548b && Intrinsics.f(this.f152549c, jVar.f152549c);
    }

    public final int hashCode() {
        return this.f152549c.hashCode() + (Long.hashCode(this.f152548b) * 31);
    }

    public j(long j2, BigDecimal interestRate) {
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        this.f152548b = j2;
        this.f152549c = interestRate;
    }
}
