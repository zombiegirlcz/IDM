package hqg;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f154694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f154695b;

    public a(xi0.b currency, Map suggestion) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        this.f154694a = currency;
        this.f154695b = suggestion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f154694a, aVar.f154694a) && this.f154695b.equals(aVar.f154695b);
    }

    public final int hashCode() {
        return this.f154695b.hashCode() + (this.f154694a.hashCode() * 31);
    }
}
