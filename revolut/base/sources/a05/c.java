package a05;

import com.revolut.retail.core.navigation.FinishCommand;
import dcl.q;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import qc0.f1;
import qc0.h;
import qc0.k;
import rfm.u;
import wli.x;
import xl2.f;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends f1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c05.c f130m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c05.c presentationModel, k state, q transitionsInteractor, am2.a backendFlowCountryInteractor, t70.b currencyLocalization, mm.d actionsDispatcher, f backendFlowConfiguration, x deeplinkHandler, s70.a intentProvider, yc0.a addressFlowInputDataMapper) {
        super(presentationModel, transitionsInteractor, backendFlowCountryInteractor, state, currencyLocalization, "FINANCIAL_DIFFICULTY_FLOW", actionsDispatcher, deeplinkHandler, backendFlowConfiguration, intentProvider, addressFlowInputDataMapper);
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transitionsInteractor, "transitionsInteractor");
        Intrinsics.checkNotNullParameter("FINANCIAL_DIFFICULTY_FLOW", "flowName");
        Intrinsics.checkNotNullParameter(backendFlowCountryInteractor, "backendFlowCountryInteractor");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(addressFlowInputDataMapper, "addressFlowInputDataMapper");
        this.f130m = presentationModel;
    }

    @Override // qc0.f1, ln.d
    public final r T() {
        return this.k;
    }

    @Override // qc0.f1
    public final h h() {
        return this.f130m;
    }

    @Override // qc0.f1, qc0.j
    public final efm.b h0() {
        pfm.a aVarE = this.f130m.h2().e(l());
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    @Override // qc0.f1
    public final efm.k i() {
        u uVarG = efm.k.g(new FinishCommand(null, null, null, 7));
        Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
        return uVarG;
    }
}
