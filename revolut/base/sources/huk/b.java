package huk;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f155705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f155706c;
    public final a d;

    public b(int i, Integer num, BigDecimal value, a type) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f155704a = i;
        this.f155705b = num;
        this.f155706c = value;
        this.d = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f155704a == bVar.f155704a && Intrinsics.f(this.f155705b, bVar.f155705b) && Intrinsics.f(this.f155706c, bVar.f155706c) && this.d == bVar.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f155704a) * 31;
        Integer num = this.f155705b;
        return this.d.hashCode() + t61.a.d(this.f155706c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
    }
}
