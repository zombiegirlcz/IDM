package sb4;

import nii.m0;
import nii.t1;
import xu3.a0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class g implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e f261507b;

    public /* synthetic */ g(com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e eVar, int i) {
        this.f261506a = i;
        this.f261507b = eVar;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f261506a) {
            case 0:
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e eVar = this.f261507b;
                return com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e.P2(eVar, eVar.Q2().f);
            default:
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e eVar2 = this.f261507b;
                a0 a0Var = eVar2.Q2().f308936g;
                if (a0Var != null) {
                    return com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e.P2(eVar2, a0Var);
                }
                throw new IllegalArgumentException("Required value was null.");
        }
    }
}
