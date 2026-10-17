package wbl;

import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f296261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f296262c;

    public f(String ref2, LocalDate payDate, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(payDate, "payDate");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f296260a = ref2;
        this.f296261b = payDate;
        this.f296262c = quantity;
    }

    @Override // wbl.b
    public final LocalDate a() {
        return this.f296261b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f296260a, fVar.f296260a) && Intrinsics.f(this.f296261b, fVar.f296261b) && Intrinsics.f(this.f296262c, fVar.f296262c);
    }

    public final int hashCode() {
        return this.f296262c.hashCode() + y.a(this.f296260a.hashCode() * 31, 31, this.f296261b);
    }

    @Override // wbl.b
    public final String i() {
        return this.f296260a;
    }
}
