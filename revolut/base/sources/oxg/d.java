package oxg;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f230820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f230821c;

    public d(String ref2, String str, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f230819a = ref2;
        this.f230820b = str;
        this.f230821c = quantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f230819a, dVar.f230819a) && Intrinsics.f(this.f230820b, dVar.f230820b) && Intrinsics.f(this.f230821c, dVar.f230821c);
    }

    public final int hashCode() {
        int iHashCode = this.f230819a.hashCode() * 31;
        String str = this.f230820b;
        return this.f230821c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
