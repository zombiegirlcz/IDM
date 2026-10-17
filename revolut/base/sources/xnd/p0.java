package xnd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f307434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f307435c;

    public p0(String accountId, xi0.b currency, List recurringPayments) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        this.f307433a = accountId;
        this.f307434b = currency;
        this.f307435c = recurringPayments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f307433a, p0Var.f307433a) && Intrinsics.f(this.f307434b, p0Var.f307434b) && Intrinsics.f(this.f307435c, p0Var.f307435c);
    }

    public final int hashCode() {
        return this.f307435c.hashCode() + h30.l.j(this.f307434b, this.f307433a.hashCode() * 31, 31);
    }
}
