package s64;

import com.revolut.retail.core.navigation.FinishCommand;
import dcl.q;
import efm.k;
import kotlin.jvm.internal.Intrinsics;
import mm.d;
import okl.m;
import p54.e;
import qc0.f1;
import qc0.h;
import rfm.u;
import wli.x;
import xl2.f;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends f1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ln.a f260132m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ln.a navigationCommandsDispatcher, e state, h presentationModel, q transitionsInteractor, am2.a backendFlowCountryInteractor, t70.b currencyLocalization, f backendFlowConfiguration, d actionsDispatcher, x deeplinkHandler, s70.a intentProvider, yc0.a addressFlowInputDataMapper) {
        super(presentationModel, transitionsInteractor, backendFlowCountryInteractor, state, currencyLocalization, "CREDIT_MANAGE_CO_BORROWER_DETAILS_FLOW", actionsDispatcher, deeplinkHandler, backendFlowConfiguration, intentProvider, addressFlowInputDataMapper);
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(transitionsInteractor, "transitionsInteractor");
        Intrinsics.checkNotNullParameter("CREDIT_MANAGE_CO_BORROWER_DETAILS_FLOW", "flowName");
        Intrinsics.checkNotNullParameter(backendFlowCountryInteractor, "backendFlowCountryInteractor");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(addressFlowInputDataMapper, "addressFlowInputDataMapper");
        this.f260132m = navigationCommandsDispatcher;
    }

    @Override // qc0.f1, qc0.j
    public final efm.b goBack() {
        return m.w(null, null, null, 7, this.f260132m);
    }

    @Override // qc0.f1
    public final k i() {
        u uVarG = k.g(new FinishCommand(-1, null, null, 6));
        Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
        return uVarG;
    }
}
