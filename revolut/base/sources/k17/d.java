package k17;

import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import jr6.u;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import lr6.r;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f180132a;

    public d(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f180132a = dateProvider;
    }

    public final boolean a(FreelancerOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return order.f73290b == r.CANCELLED;
    }

    public final boolean b(FreelancerOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return v.k(r.AUTHORISED, r.COMPLETED).contains(order.f73290b);
    }

    public final boolean c(FreelancerOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return order.f73290b == r.FAILED && ((f) this.f180132a).g().isAfter(order.f73304x);
    }

    public final boolean d(FreelancerOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return v.k(r.PENDING, r.PROCESSING).contains(order.f73290b);
    }
}
