package dil;

import java.time.LocalDate;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements ne0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f115076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sel.a f115077c;
    public final String d;
    public final String e;

    public a(String securityRef, LocalDate localDate, sel.a period) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f115075a = securityRef;
        this.f115076b = localDate;
        this.f115077c = period;
        this.d = "GIA_RECURRING_ORDER_PROJECTIONS";
        Object[] elements = {"GIA_RECURRING_ORDER_PROJECTIONS", securityRef, localDate, period.b()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.e = d0.k0(d.L(elements), "_", null, null, 0, null, 62);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f115075a, aVar.f115075a) && Intrinsics.f(this.f115076b, aVar.f115076b) && this.f115077c == aVar.f115077c;
    }

    @Override // ne0.a
    public final String getKey() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.f115075a.hashCode() * 31;
        LocalDate localDate = this.f115076b;
        return this.f115077c.hashCode() + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }
}
