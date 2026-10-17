package fd2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.services.ideal.impl.ui.confirmation.IDealPaymentConfirmedScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IDealPaymentConfirmedScreenContract$InputData f133880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f133881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f133882c;

    public k(g gVar, j jVar, IDealPaymentConfirmedScreenContract$InputData iDealPaymentConfirmedScreenContract$InputData) {
        this.f133880a = iDealPaymentConfirmedScreenContract$InputData;
        int i = 7;
        this.f133881b = e4m.b.b(new fa0.q(gVar, this, 1, i));
        this.f133882c = e4m.b.b(new fa0.q(gVar, this, 0, i));
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
