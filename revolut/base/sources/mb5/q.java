package mb5;

import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f204152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f204153c;
    public final int d;
    public final t e;
    public final CreditScheduledAmountType f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f204154g;

    public q(String id10, u paymentType, v state, int i, t source, CreditScheduledAmountType paymentAmount, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
        this.f204151a = id10;
        this.f204152b = paymentType;
        this.f204153c = state;
        this.d = i;
        this.e = source;
        this.f = paymentAmount;
        this.f204154g = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f204151a, qVar.f204151a) && this.f204152b == qVar.f204152b && this.f204153c == qVar.f204153c && this.d == qVar.d && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && this.f204154g == qVar.f204154g;
    }

    public final int hashCode() {
        return Long.hashCode(this.f204154g) + ((this.f.hashCode() + ((this.e.hashCode() + j6.a.b(this.d, (this.f204153c.hashCode() + ((this.f204152b.hashCode() + (this.f204151a.hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31);
    }
}
