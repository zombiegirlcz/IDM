package xyk;

import dcl.q;
import efm.k;
import kotlin.jvm.internal.Intrinsics;
import qc0.f1;
import qc0.h;
import rfm.o;
import s2i.i;
import wli.x;
import xl2.f;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends f1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f309748m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h presentationModel, b state, q transitionsInteractor, am2.a backendFlowCountryInteractor, t70.b currencyLocalization, mm.d actionsDispatcher, x deeplinkHandler, f backendFlowConfiguration, s70.a intentProvider, yc0.a addressFlowInputDataMapper) {
        super(presentationModel, transitionsInteractor, backendFlowCountryInteractor, state, currencyLocalization, "TRADING_ONBOARDING_EXTENDED_HOURS_FLOW", actionsDispatcher, deeplinkHandler, backendFlowConfiguration, intentProvider, addressFlowInputDataMapper);
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter("TRADING_ONBOARDING_EXTENDED_HOURS_FLOW", "flowName");
        Intrinsics.checkNotNullParameter(transitionsInteractor, "transitionsInteractor");
        Intrinsics.checkNotNullParameter(backendFlowCountryInteractor, "backendFlowCountryInteractor");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(addressFlowInputDataMapper, "addressFlowInputDataMapper");
        this.f309748m = state;
    }

    @Override // qc0.f1
    public final k i() {
        o oVar = new o(new i(this, 18));
        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
        return oVar;
    }

    @Override // qc0.f1
    public final qc0.k j() {
        return this.f309748m;
    }
}
