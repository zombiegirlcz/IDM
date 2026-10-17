package pa6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount.RecurringDonationAmountScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringDonationAmountScreenContract$InputData f234413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f234414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234415c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234416g;

    public p(m mVar, e eVar, RecurringDonationAmountScreenContract$InputData recurringDonationAmountScreenContract$InputData) {
        this.f234414b = mVar;
        this.f234413a = recurringDonationAmountScreenContract$InputData;
        int i = 5;
        this.f234415c = e4m.b.b(new f(mVar, this, 2, i));
        this.d = e4m.b.b(new f(mVar, this, 1, i));
        this.e = e4m.b.b(new f(mVar, this, 3, i));
        this.f = e4m.b.b(new f(mVar, this, 4, i));
        this.f234416g = e4m.b.b(new f(mVar, this, 0, i));
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
