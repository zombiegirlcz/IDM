package r6e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subaccount.impl.ui.add_money.flow.SubaccountAddMoneyFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubaccountAddMoneyFlowContract$InputData f251768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f251769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f251770c;

    public n(o oVar, SubaccountAddMoneyFlowContract$InputData subaccountAddMoneyFlowContract$InputData) {
        this.f251769b = oVar;
        this.f251768a = subaccountAddMoneyFlowContract$InputData;
        this.f251770c = e4m.b.b(new m(oVar, this, 0));
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
