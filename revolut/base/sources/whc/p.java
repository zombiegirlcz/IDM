package whc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RentAndBillsFlowContract$InputData f297559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f297560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f297561c;

    public p(s sVar, RentAndBillsFlowContract$InputData rentAndBillsFlowContract$InputData) {
        this.f297559a = rentAndBillsFlowContract$InputData;
        int i = 29;
        this.f297560b = e4m.b.b(new vzc.j(sVar, this, 1, i));
        this.f297561c = e4m.b.b(new vzc.j(sVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f297561c.get());
    }
}
