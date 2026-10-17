package nyb;

import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 implements eub.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f220817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f220818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f220819c;

    public n0(m0 revPointsTransactionsInteractor, RevPointsTransactionPageParams pageParams, efm.c0 scheduler) {
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(pageParams, "pageParams");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.f220817a = revPointsTransactionsInteractor;
        this.f220818b = j6.a.h("create(...)");
        this.f220819c = te0.w.y0(new ky4.f(this, 17, pageParams, scheduler));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // eub.l
    public final efm.b a(ihm.f events) {
        Intrinsics.checkNotNullParameter(events, "events");
        return ((lk0.d) this.f220819c.getValue()).b(events);
    }

    @Override // eub.l
    public final ihm.b b() {
        return this.f220818b;
    }
}
