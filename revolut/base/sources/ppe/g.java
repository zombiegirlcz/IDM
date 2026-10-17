package ppe;

import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a f238596b;

    public /* synthetic */ g(com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a aVar, int i) {
        this.f238595a = i;
        this.f238596b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f238595a) {
            case 0:
                this.f238596b.J2(rpe.f.MISSING_TIN, BackNavigationType.BACK);
                break;
            case 1:
                com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a aVar = this.f238596b;
                List list = aVar.u.f90188c;
                if (list == null || list.isEmpty()) {
                    com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a.L2(aVar, Boolean.FALSE, null, null, 6);
                } else {
                    aVar.J2(rpe.f.MISSING_RESIDENCY, aVar.o.f90220h);
                }
                break;
            case 2:
                com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a aVar2 = this.f238596b;
                if (aVar2.v.d() == null) {
                    aVar2.B2();
                }
                break;
            case 3:
                com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a aVar3 = this.f238596b;
                List list2 = aVar3.u.f90188c;
                if (list2 == null || list2.isEmpty()) {
                    com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a.L2(aVar3, Boolean.FALSE, null, null, 6);
                } else {
                    aVar3.J2(rpe.f.MISSING_RESIDENCY, BackNavigationType.BACK);
                }
                break;
            default:
                com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a.L2(this.f238596b, Boolean.TRUE, null, ExemptionReason.TIN_PENDING, 2);
                break;
        }
        return Unit.f186387a;
    }
}
