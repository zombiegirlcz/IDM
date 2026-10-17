package h9h;

import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import vc.s;
import ybl.k;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f150298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f150299b;

    public e(a aVar, f fVar) {
        this.f150298a = aVar;
        this.f150299b = fVar;
    }

    @Override // phm.a
    public final Object get() {
        AddMoneyFeatureConfig.CompositeAddMoney.InputData inputData = this.f150299b.f150300a;
        a aVar = this.f150298a;
        wzg.a aVar2 = (wzg.a) aVar.Q.get();
        k kVarD = aVar.f150256a.d();
        s.j(kVarD);
        return new com.revolut.feature.wealth.impl.ui.flows.add_money.b(inputData, aVar2, kVarD);
    }
}
