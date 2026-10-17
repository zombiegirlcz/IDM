package dc4;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.HomeInsuranceFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rv3.b;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yki.l f112789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e f112790c;
    public final /* synthetic */ HomeInsuranceFlowContract$Step d;

    public /* synthetic */ f(com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar, yki.l lVar, HomeInsuranceFlowContract$Step homeInsuranceFlowContract$Step) {
        this.f112788a = 0;
        this.f112790c = eVar;
        this.f112789b = lVar;
        this.d = homeInsuranceFlowContract$Step;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f112788a;
        yki.l lVar = this.f112789b;
        HomeInsuranceFlowContract$Step homeInsuranceFlowContract$Step = this.d;
        switch (i) {
            case 0:
                rv3.b outputData = (rv3.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z = outputData instanceof b.a;
                com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar = this.f112790c;
                if (z) {
                    t.J2(eVar, false, null, null, 7);
                } else if (outputData instanceof b.C1428b) {
                    oki.h.w2(lVar, new HomeInsuranceFlowContract$Step.Disclaimer(((HomeInsuranceFlowContract$Step.Intro) homeInsuranceFlowContract$Step).f67777a.f284057b), ModalDestination.Style.POPUP.f98311a);
                } else {
                    if (!(outputData instanceof rv3.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ht3.a aVar = ((rv3.c) outputData).f257693b;
                    if (aVar == uy3.a.PARTNER) {
                        eVar.n2(new j(eVar, null, 0), new whi.b(6));
                    } else if (aVar == uy3.a.DOCUMENTS_UPLOAD) {
                        eVar.n2(new j(eVar, null, 1), new whi.b(6));
                    }
                }
                return Unit.f186387a;
            case 1:
                rv3.b outputData2 = (rv3.b) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                boolean z3 = outputData2 instanceof b.a;
                yki.l lVar2 = this.f112789b;
                if (z3) {
                    lVar2.e(false);
                } else if (outputData2 instanceof rv3.c) {
                    int i2 = h.f112794a[((rv3.c) outputData2).f257692a.ordinal()];
                    com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar2 = this.f112790c;
                    if (i2 == 1) {
                        oki.h.t2(eVar2, lVar2, new HomeInsuranceFlowContract$Step.DocumentsUpload(((HomeInsuranceFlowContract$Step.Requirements) homeInsuranceFlowContract$Step).f67779b), true, null, false, 12);
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVar2.K2(null);
                    }
                } else {
                    if (!(outputData2 instanceof b.C1428b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "HomeInsuranceFlowControllerModel", "Unsupported requirements link output", null, h0Var);
                }
                return Unit.f186387a;
            default:
                da4.d outputData3 = (da4.d) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (outputData3 instanceof da4.b) {
                    lVar.e(false);
                } else {
                    if (!(outputData3 instanceof da4.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ny3.k kVarF3 = ((HomeInsuranceFlowContract$Step.DocumentsUpload) homeInsuranceFlowContract$Step).f67775a.F3();
                    Map map = ((da4.c) outputData3).f112469a;
                    com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar3 = this.f112790c;
                    eVar3.l2(new cuc.c(eVar3, kVarF3, map, (Continuation) null, 27), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ f(yki.l lVar, com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e eVar, HomeInsuranceFlowContract$Step homeInsuranceFlowContract$Step, int i) {
        this.f112788a = i;
        this.f112789b = lVar;
        this.f112790c = eVar;
        this.d = homeInsuranceFlowContract$Step;
    }
}
