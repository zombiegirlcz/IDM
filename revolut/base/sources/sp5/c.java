package sp5;

import android.os.Parcelable;
import com.google.firebase.messaging.t;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.handlers.CheckWorkflowStatusDialogPayload;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import qp5.d0;
import up5.a0;
import up5.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements mm.b, g3l.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3l.a f264879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final agf.b f264880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ym.d f264881c;
    public final qp5.h d;
    public final up5.b e;
    public final ln.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xq5.b f264882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tm.g f264883h;

    public c(g3l.a statusConfigurationDispatcher, agf.b transactionWorkflowInteractor, d0 statusViewConfigurationFactory, ym.d loadingDispatcher, qp5.h router, up5.b presentationModel, ln.a navigationCommandsDispatcher, xq5.b cryptoSendConfirmationLoadingHandler, t actionFactory) {
        Intrinsics.checkNotNullParameter(statusConfigurationDispatcher, "statusConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(transactionWorkflowInteractor, "transactionWorkflowInteractor");
        Intrinsics.checkNotNullParameter(statusViewConfigurationFactory, "statusViewConfigurationFactory");
        Intrinsics.checkNotNullParameter(loadingDispatcher, "loadingDispatcher");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(cryptoSendConfirmationLoadingHandler, "cryptoSendConfirmationLoadingHandler");
        Intrinsics.checkNotNullParameter(actionFactory, "actionFactory");
        this.f264879a = statusConfigurationDispatcher;
        this.f264880b = transactionWorkflowInteractor;
        this.f264881c = loadingDispatcher;
        this.d = router;
        this.e = presentationModel;
        this.f = navigationCommandsDispatcher;
        this.f264882g = cryptoSendConfirmationLoadingHandler;
        this.f264883h = actionFactory.f(new sl5.a(this, 10));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        qp5.b action = (qp5.b) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f264883h.a(action);
    }

    @Override // g3l.d
    public final efm.d0 b(k3l.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Parcelable f = result.a().getF();
        CheckWorkflowStatusDialogPayload checkWorkflowStatusDialogPayload = f instanceof CheckWorkflowStatusDialogPayload ? (CheckWorkflowStatusDialogPayload) f : null;
        if (!Intrinsics.f(result.a().getF104385a(), "WITHDRAW_WORKFLOW_WARNING_STATUS_VIEW_ID") || checkWorkflowStatusDialogPayload == null) {
            return Intrinsics.f(result.a().getF104385a(), "WITHDRAW_WORKFLOW_WAITING_STATUS_VIEW_ID") ? ((g0) this.d).d(false).D(Boolean.TRUE) : efm.d0.m(Boolean.FALSE);
        }
        FeatureCommand featureCommandA = cgf.b.a(checkWorkflowStatusDialogPayload.f71170a, ((a0) this.e).q3(), checkWorkflowStatusDialogPayload.f71171b);
        if (featureCommandA != null) {
            return this.f.a(featureCommandA).D(Boolean.TRUE);
        }
        ufm.b bVarM = efm.d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
