package snd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f264546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f264547c;

    public m(String accountId, xi0.b currency, List recurringPayments) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        this.f264545a = accountId;
        this.f264546b = currency;
        this.f264547c = recurringPayments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f264545a, mVar.f264545a) && Intrinsics.f(this.f264546b, mVar.f264546b) && Intrinsics.f(this.f264547c, mVar.f264547c);
    }

    public final int hashCode() {
        return this.f264547c.hashCode() + h30.l.j(this.f264546b, this.f264545a.hashCode() * 31, 31);
    }
}
