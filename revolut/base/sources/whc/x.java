package whc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.select_payment.RentAndBillsSelectPaymentScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RentAndBillsSelectPaymentScreenContract$InputData f297608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f297609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f297610c;

    public x(z zVar, RentAndBillsSelectPaymentScreenContract$InputData rentAndBillsSelectPaymentScreenContract$InputData) {
        this.f297609b = zVar;
        this.f297608a = rentAndBillsSelectPaymentScreenContract$InputData;
        this.f297610c = e4m.b.b(new d(zVar, this, 6));
    }

    public final ojc.d b() {
        c3j.c cVar = new c3j.c();
        m3j.j jVarD = b3j.p.d();
        thf.c cVarC = this.f297609b.k.c();
        vc.s.j(cVarC);
        return new ojc.d(cVar, jVarD, cVarC);
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
