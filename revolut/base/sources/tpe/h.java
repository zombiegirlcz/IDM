package tpe;

import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.FatcaFlowContract$Step;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.a f273363b;

    public /* synthetic */ h(com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.a aVar, int i) {
        this.f273362a = i;
        this.f273363b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f273362a) {
            case 0:
                com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.a aVar = this.f273363b;
                oki.h.t2(aVar, aVar.u, new FatcaFlowContract$Step.TinInput(BackNavigationType.BACK), false, null, false, 14);
                break;
            case 1:
                this.f273363b.C2(c.f273357a);
                break;
            default:
                this.f273363b.C2(e.f273359a);
                break;
        }
        return Unit.f186387a;
    }
}
