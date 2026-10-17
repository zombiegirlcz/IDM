package mva;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.PaymentHistoryContract$InputData;
import java.util.Set;
import m2b.r;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentHistoryContract$InputData f209202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f209203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f209204c;

    public c(d dVar, PaymentHistoryContract$InputData paymentHistoryContract$InputData) {
        this.f209203b = dVar;
        this.f209202a = paymentHistoryContract$InputData;
        this.f209204c = e4m.b.b(new r(dVar, this, 22));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
