package erj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments.UpcomingPaymentsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpcomingPaymentsContract$InputData f128726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f128727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f128728c;
    public final e4m.e d;

    public n(h hVar, UpcomingPaymentsContract$InputData upcomingPaymentsContract$InputData) {
        this.f128727b = hVar;
        this.f128726a = upcomingPaymentsContract$InputData;
        int i = 9;
        this.f128728c = e4m.b.b(new ea2.p(hVar, this, 1, i));
        this.d = e4m.b.b(new ea2.p(hVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
