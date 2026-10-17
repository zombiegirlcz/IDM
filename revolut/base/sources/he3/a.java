package he3;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f151554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f151555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f151556c;

    public a(xi0.b currency, Map amountPerDay, Map amountPerDayCommitted) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amountPerDay, "amountPerDay");
        Intrinsics.checkNotNullParameter(amountPerDayCommitted, "amountPerDayCommitted");
        this.f151554a = currency;
        this.f151555b = amountPerDay;
        this.f151556c = amountPerDayCommitted;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f151554a, aVar.f151554a) && Intrinsics.f(this.f151555b, aVar.f151555b) && Intrinsics.f(this.f151556c, aVar.f151556c);
    }

    public final int hashCode() {
        return this.f151556c.hashCode() + p.a.e(this.f151554a.hashCode() * 31, 31, this.f151555b);
    }
}
