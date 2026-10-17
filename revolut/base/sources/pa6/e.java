package pa6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.donations.impl.ui.kompot.flow.recurring.CharityRecurringDonationFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharityRecurringDonationFlowContract$InputData f234361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f234362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f234363c = this;
    public final e4m.e d;
    public final e4m.e e;

    public e(m mVar, CharityRecurringDonationFlowContract$InputData charityRecurringDonationFlowContract$InputData) {
        this.f234362b = mVar;
        this.f234361a = charityRecurringDonationFlowContract$InputData;
        this.d = e4m.b.b(new p8a.m(mVar, this, 0, 29));
        this.e = e4m.b.b(new p8a.m(mVar, this, 1, 29));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
