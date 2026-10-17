package dod;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f116551c;
    public final List d;

    public j(String accountId, xi0.b currency, List recurringPayments) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        this.f116550b = accountId;
        this.f116551c = currency;
        this.d = recurringPayments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f116550b, jVar.f116550b) && Intrinsics.f(this.f116551c, jVar.f116551c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.j(this.f116551c, this.f116550b.hashCode() * 31, 31);
    }
}
