package rel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f253646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f253647b;

    public b(float f, BigDecimal volume) {
        Intrinsics.checkNotNullParameter(volume, "volume");
        this.f253646a = f;
        this.f253647b = volume;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Float.compare(this.f253646a, bVar.f253646a) == 0 && Intrinsics.f(this.f253647b, bVar.f253647b);
    }

    public final int hashCode() {
        return this.f253647b.hashCode() + (Float.hashCode(this.f253646a) * 31);
    }
}
