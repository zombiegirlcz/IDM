package v17;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f285242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f285243b;

    public j(List allPaymentMethods, Set allCurrencies) {
        Intrinsics.checkNotNullParameter(allCurrencies, "allCurrencies");
        Intrinsics.checkNotNullParameter(allPaymentMethods, "allPaymentMethods");
        this.f285242a = allCurrencies;
        this.f285243b = allPaymentMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f285242a, jVar.f285242a) && Intrinsics.f(this.f285243b, jVar.f285243b);
    }

    public final int hashCode() {
        return this.f285243b.hashCode() + (this.f285242a.hashCode() * 31);
    }
}
