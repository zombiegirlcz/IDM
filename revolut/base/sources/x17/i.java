package x17;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import org.joda.time.DateTime;
import sr6.n;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f302324b;

    public /* synthetic */ i(k kVar, int i) {
        this.f302323a = i;
        this.f302324b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f302323a) {
            case 0:
                OrderInitiationPage it8 = (OrderInitiationPage) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f302324b.getClass();
                switch (j.f302325a[it8.f86429c.ordinal()]) {
                    case 1:
                        return cs6.f.ACTIVE;
                    case 2:
                        return cs6.f.SUSPENDED;
                    case 3:
                        return cs6.f.COMPLETED;
                    case 4:
                        return cs6.f.EXPIRED;
                    case 5:
                        return cs6.f.CANCELLED;
                    case 6:
                        throw new IllegalStateException(h30.l.r("Unsupported freelancer order initiation page state: ", it8.f86429c.name()));
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            default:
                FreelancerInvoice it9 = (FreelancerInvoice) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                this.f302324b.getClass();
                boolean zR = e0.r(it9);
                n nVar = it9.f73378h;
                if (zR) {
                    return cs6.f.DRAFT;
                }
                if (e0.u(it9)) {
                    return cs6.f.COMPLETED;
                }
                DateTime dateTimeNow = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(dateTimeNow, "now(...)");
                if (e0.t(it9, dateTimeNow)) {
                    return cs6.f.OVERDUE;
                }
                DateTime now = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(now, "now(...)");
                Intrinsics.checkNotNullParameter(it9, "<this>");
                Intrinsics.checkNotNullParameter(now, "now");
                if (!e0.t(it9, now) && (e0.x(it9) || nVar == n.PROCESSING || nVar == n.ACTIVE)) {
                    return cs6.f.PENDING;
                }
                Intrinsics.checkNotNullParameter(it9, "<this>");
                if (nVar == n.EXPIRED) {
                    return cs6.f.EXPIRED;
                }
                if (e0.q(it9)) {
                    return cs6.f.CANCELLED;
                }
                throw new IllegalStateException(h30.l.r("Unsupported freelancer invoice status: ", nVar.name()));
        }
    }
}
