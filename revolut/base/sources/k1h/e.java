package k1h;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f180263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f180264b;

    public e(j links, BigDecimal annualFee) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(annualFee, "annualFee");
        this.f180263a = links;
        this.f180264b = annualFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f180263a, eVar.f180263a) && Intrinsics.f(this.f180264b, eVar.f180264b);
    }

    public final int hashCode() {
        return this.f180264b.hashCode() + (this.f180263a.hashCode() * 31);
    }
}
