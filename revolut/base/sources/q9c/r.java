package q9c;

import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.EarningRepresentation;
import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q97.p1;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6c.o f243874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6c.f f243875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaymentScheduleSelection f243876c;
    public final EarningRepresentation d;
    public final Lazy e;

    public r(t6c.o wrappedPaymentOptions, t6c.f fVar, PaymentScheduleSelection paymentScheduleSelection, EarningRepresentation earningRepresentation) {
        Intrinsics.checkNotNullParameter(wrappedPaymentOptions, "wrappedPaymentOptions");
        Intrinsics.checkNotNullParameter(earningRepresentation, "earningRepresentation");
        this.f243874a = wrappedPaymentOptions;
        this.f243875b = fVar;
        this.f243876c = paymentScheduleSelection;
        this.d = earningRepresentation;
        this.e = yhm.j.b(new p1(this, 2));
    }

    public final s6c.p a() {
        return (s6c.p) this.e.getValue();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f243874a, rVar.f243874a) && Intrinsics.f(this.f243875b, rVar.f243875b) && Intrinsics.f(this.f243876c, rVar.f243876c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f243874a.hashCode() * 31;
        t6c.f fVar = this.f243875b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        PaymentScheduleSelection paymentScheduleSelection = this.f243876c;
        return this.d.hashCode() + ((iHashCode2 + (paymentScheduleSelection != null ? paymentScheduleSelection.hashCode() : 0)) * 31);
    }
}
