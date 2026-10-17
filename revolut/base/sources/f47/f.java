package f47;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f132013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f132014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f132015c;

    public f(Set availableCurrencies, Set selectedCurrencies, Map balances) {
        Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        Intrinsics.checkNotNullParameter(balances, "balances");
        this.f132013a = availableCurrencies;
        this.f132014b = selectedCurrencies;
        this.f132015c = balances;
    }

    public static f a(f fVar, Set selectedCurrencies) {
        Set availableCurrencies = fVar.f132013a;
        Map balances = fVar.f132015c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        Intrinsics.checkNotNullParameter(balances, "balances");
        return new f(availableCurrencies, selectedCurrencies, balances);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f132013a, fVar.f132013a) && Intrinsics.f(this.f132014b, fVar.f132014b) && Intrinsics.f(this.f132015c, fVar.f132015c);
    }

    public final int hashCode() {
        return this.f132015c.hashCode() + p.a.f(this.f132013a.hashCode() * 31, 31, this.f132014b);
    }
}
