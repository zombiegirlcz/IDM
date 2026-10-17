package g1e;

import dcl.q;
import kotlin.jvm.internal.Intrinsics;
import qc0.f1;
import qc0.k;
import wli.x;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends f1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qc0.h f139579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f139580n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qc0.h presentationModel, k state, q transitionsInteractor, am2.a backendFlowCountryInteractor, t70.b currencyLocalization, mm.d actionsDispatcher, x deeplinkHandler, xl2.f backendFlowConfiguration, s70.a intentProvider, yc0.a addressFlowInputDataMapper) {
        super(presentationModel, transitionsInteractor, backendFlowCountryInteractor, state, currencyLocalization, "STOCK_LENDING_ONBOARDING", actionsDispatcher, deeplinkHandler, backendFlowConfiguration, intentProvider, addressFlowInputDataMapper);
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transitionsInteractor, "transitionsInteractor");
        Intrinsics.checkNotNullParameter(backendFlowCountryInteractor, "backendFlowCountryInteractor");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter("STOCK_LENDING_ONBOARDING", "flowName");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(addressFlowInputDataMapper, "addressFlowInputDataMapper");
        this.f139579m = presentationModel;
        this.f139580n = state;
    }

    @Override // qc0.f1
    public final qc0.h h() {
        return this.f139579m;
    }

    @Override // qc0.f1
    public final k j() {
        return this.f139580n;
    }
}
