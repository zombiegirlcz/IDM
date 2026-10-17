package p54;

import dcl.q;
import kotlin.jvm.internal.Intrinsics;
import qc0.f1;
import te0.s;
import te0.w;
import wli.x;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends f1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xq3.j f233013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final rz3.c f233014n;
    public final ii4.o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f233015p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(xq3.j creditApplicationLifecycleInteractor, rz3.c creditApplicationRouter, ii4.o spinnerInteractor, qc0.h presentationModel, q transitionsInteractor, e state, am2.a backendFlowCountryInteractor, t70.b currencyLocalization, xl2.f backendFlowConfiguration, mm.d actionsDispatcher, x deeplinkHandler, s70.a intentProvider, yc0.a addressFlowInputDataMapper) {
        super(presentationModel, transitionsInteractor, backendFlowCountryInteractor, state, currencyLocalization, "CREDIT_QUESTIONNAIRE_FLOW", actionsDispatcher, deeplinkHandler, backendFlowConfiguration, intentProvider, addressFlowInputDataMapper);
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationRouter, "creditApplicationRouter");
        Intrinsics.checkNotNullParameter(spinnerInteractor, "spinnerInteractor");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(transitionsInteractor, "transitionsInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter("CREDIT_QUESTIONNAIRE_FLOW", "flowName");
        Intrinsics.checkNotNullParameter(backendFlowCountryInteractor, "backendFlowCountryInteractor");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(addressFlowInputDataMapper, "addressFlowInputDataMapper");
        this.f233013m = creditApplicationLifecycleInteractor;
        this.f233014n = creditApplicationRouter;
        this.o = spinnerInteractor;
        this.f233015p = state;
    }

    @Override // qc0.f1, qc0.j
    public final efm.b h0() {
        pfm.a aVarE = this.f244416a.h2().e(l());
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    @Override // qc0.f1
    public final efm.k i() {
        e eVar = this.f233015p;
        te0.e eVarJ = eVar.J();
        s sVar = s.f270018a;
        efm.k kVarFirstElement = w.F0(eVarJ.c(sVar), eVar.n0().c(sVar)).flatMapSingle(new p30.b(21, new oxd.m(this, 20))).firstElement();
        Intrinsics.checkNotNullExpressionValue(kVarFirstElement, "firstElement(...)");
        return kVarFirstElement;
    }

    @Override // qc0.f1
    public final qc0.k j() {
        return this.f233015p;
    }
}
