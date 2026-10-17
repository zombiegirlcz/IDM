package u91;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f278350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f278351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f278352c;

    public e(List directDebits, List scheduledPayments, List incomingPayments) {
        Intrinsics.checkNotNullParameter(directDebits, "directDebits");
        Intrinsics.checkNotNullParameter(scheduledPayments, "scheduledPayments");
        Intrinsics.checkNotNullParameter(incomingPayments, "incomingPayments");
        this.f278350a = directDebits;
        this.f278351b = scheduledPayments;
        this.f278352c = incomingPayments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f278350a, eVar.f278350a) && Intrinsics.f(this.f278351b, eVar.f278351b) && Intrinsics.f(this.f278352c, eVar.f278352c);
    }

    public final int hashCode() {
        return this.f278352c.hashCode() + p.a.d(this.f278350a.hashCode() * 31, 31, this.f278351b);
    }
}
