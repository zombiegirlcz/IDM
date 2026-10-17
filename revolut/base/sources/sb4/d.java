package sb4;

import c84.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rv3.b;
import yki.l;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261501a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f261502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e f261503c;

    public /* synthetic */ d(com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e eVar, l lVar) {
        this.f261503c = eVar;
        this.f261502b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f261501a) {
            case 0:
                qb4.f outputData = (qb4.f) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z = outputData instanceof qb4.d;
                com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e eVar = this.f261503c;
                if (z) {
                    t.J2(eVar, false, null, null, 7);
                } else {
                    if (!(outputData instanceof qb4.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar.n2(new rhl.b(eVar, outputData, this.f261502b, null, 23), new whi.b(6));
                }
                return Unit.f186387a;
            default:
                rv3.b outputData2 = (rv3.b) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof b.a) {
                    this.f261502b.e(false);
                } else if (outputData2 instanceof b.C1428b) {
                    int i = jli.h.f175850a;
                } else {
                    if (!(outputData2 instanceof rv3.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e eVar2 = this.f261503c;
                    eVar2.l2(new j(eVar2, null, 0), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ d(l lVar, com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e eVar) {
        this.f261502b = lVar;
        this.f261503c = eVar;
    }
}
