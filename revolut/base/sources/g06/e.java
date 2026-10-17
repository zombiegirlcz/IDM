package g06;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f139353b;

    public e(List rates, dj0.d cartAmount) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(cartAmount, "cartAmount");
        this.f139352a = rates;
        this.f139353b = cartAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f139352a, eVar.f139352a) && Intrinsics.f(this.f139353b, eVar.f139353b);
    }

    public final int hashCode() {
        return this.f139353b.hashCode() + (this.f139352a.hashCode() * 31);
    }
}
