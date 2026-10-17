package ll6;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fi6.d f196583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f196584b;

    public e(fi6.d dVar, Map toBaseCurrencyRatesMap) {
        Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap, "toBaseCurrencyRatesMap");
        this.f196583a = dVar;
        this.f196584b = toBaseCurrencyRatesMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f196583a, eVar.f196583a) && Intrinsics.f(this.f196584b, eVar.f196584b);
    }

    public final int hashCode() {
        fi6.d dVar = this.f196583a;
        return this.f196584b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }

    public e() {
        this(null, r0.g());
    }
}
