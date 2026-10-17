package pa6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.schedule.RecurringDonationScheduleScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringDonationScheduleScreenContract$InputData f234417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f234418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234419c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f234421h;
    public final e4m.e i;

    public q(m mVar, e eVar, BaseScreen baseScreen, RecurringDonationScheduleScreenContract$InputData recurringDonationScheduleScreenContract$InputData) {
        this.f234417a = recurringDonationScheduleScreenContract$InputData;
        this.f234418b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 6;
        this.f234419c = e4m.b.b(new f(mVar, this, 2, i));
        this.d = e4m.b.b(new f(mVar, this, 1, i));
        this.e = e4m.b.b(new f(mVar, this, 0, i));
        this.f = e4m.b.b(new f(mVar, this, 4, i));
        this.f234420g = e4m.b.b(new f(mVar, this, 5, i));
        this.f234421h = e4m.b.b(new f(mVar, this, 6, i));
        this.i = e4m.b.b(new f(mVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
