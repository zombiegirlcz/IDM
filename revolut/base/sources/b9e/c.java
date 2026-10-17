package b9e;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f13734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f13735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13736c;
    public final List d;
    public final Map e;

    public c(xi0.b baseCurrency, e subscriptions, List rates, List vaults, Map contactsWithPaidPlan) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(contactsWithPaidPlan, "contactsWithPaidPlan");
        this.f13734a = baseCurrency;
        this.f13735b = subscriptions;
        this.f13736c = rates;
        this.d = vaults;
        this.e = contactsWithPaidPlan;
    }

    public static c a(c cVar, e subscriptions) {
        xi0.b baseCurrency = cVar.f13734a;
        List rates = cVar.f13736c;
        List vaults = cVar.d;
        Map contactsWithPaidPlan = cVar.e;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(contactsWithPaidPlan, "contactsWithPaidPlan");
        return new c(baseCurrency, subscriptions, rates, vaults, contactsWithPaidPlan);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f13734a, cVar.f13734a) && Intrinsics.f(this.f13735b, cVar.f13735b) && Intrinsics.f(this.f13736c, cVar.f13736c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(p.a.d((this.f13735b.hashCode() + (this.f13734a.hashCode() * 31)) * 31, 31, this.f13736c), 31, this.d);
    }
}
