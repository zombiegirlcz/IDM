package vz4;

import dcl.q;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import qc0.f1;
import vrl.n;
import wli.x;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends f1 implements e05.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f293395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mz4.b f293396n;
    public final b o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a presentationModel, mz4.b commandsFactory, b state, q transitionsInteractor, am2.a backendFlowCountryInteractor, t70.b currencyLocalization, mm.d actionsDispatcher, xl2.f backendFlowConfiguration, x deeplinkHandler, s70.a intentProvider, yc0.a addressFlowInputDataMapper) {
        super(presentationModel, transitionsInteractor, backendFlowCountryInteractor, state, currencyLocalization, "LOAN_FORBEARANCE_APPLICATION_FLOW", actionsDispatcher, deeplinkHandler, backendFlowConfiguration, intentProvider, addressFlowInputDataMapper);
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(commandsFactory, "commandsFactory");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transitionsInteractor, "transitionsInteractor");
        Intrinsics.checkNotNullParameter("LOAN_FORBEARANCE_APPLICATION_FLOW", "flowName");
        Intrinsics.checkNotNullParameter(backendFlowCountryInteractor, "backendFlowCountryInteractor");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(addressFlowInputDataMapper, "addressFlowInputDataMapper");
        this.f293395m = presentationModel;
        this.f293396n = commandsFactory;
        this.o = state;
    }

    @Override // qc0.f1, ln.d
    public final r T() {
        return this.k;
    }

    @Override // qc0.f1
    public final qc0.h h() {
        return this.f293395m;
    }

    @Override // qc0.f1, qc0.j
    public final efm.b h0() {
        pfm.a aVarE = ((j) this.f293395m).f293392b.h2().e(l());
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    @Override // qc0.f1
    public final efm.k i() {
        m mVar = (m) this.o;
        String str = (String) mVar.d.getValue(mVar, m.f[1]).get();
        efm.k kVarFirstElement = m70.a.g(((j) this.f293395m).j3(str), null, null, 3).firstElement();
        c cVar = new c(new n(this, str, 22), 3);
        kVarFirstElement.getClass();
        rfm.m mVar2 = new rfm.m(kVarFirstElement, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(mVar2, "map(...)");
        return mVar2;
    }

    @Override // qc0.f1
    public final qc0.k j() {
        return this.o;
    }
}
