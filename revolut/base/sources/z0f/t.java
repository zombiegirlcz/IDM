package z0f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f318282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f318283b;

    public t(List currencies, xi0.b selectedCurrency) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        this.f318282a = currencies;
        this.f318283b = selectedCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f318282a, tVar.f318282a) && Intrinsics.f(this.f318283b, tVar.f318283b);
    }

    public final int hashCode() {
        return this.f318283b.hashCode() + (this.f318282a.hashCode() * 31);
    }
}
