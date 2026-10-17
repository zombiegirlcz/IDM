package urj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzi.b f282323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f282324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f282325c;

    public c(uzi.b budgetingCycle, long j2, xi0.b currency) {
        Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f282323a = budgetingCycle;
        this.f282324b = j2;
        this.f282325c = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f282323a, cVar.f282323a) && this.f282324b == cVar.f282324b && Intrinsics.f(this.f282325c, cVar.f282325c);
    }

    public final int hashCode() {
        return this.f282325c.hashCode() + a0.d.c(this.f282323a.hashCode() * 31, 31, this.f282324b);
    }
}
