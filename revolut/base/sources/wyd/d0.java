package wyd;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements s7a.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f301248a;

    public d0(Set selectedCurrencies) {
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        this.f301248a = selectedCurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f301248a, ((d0) obj2).f301248a);
    }

    public final int hashCode() {
        return this.f301248a.hashCode();
    }
}
