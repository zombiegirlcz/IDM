package du8;

import com.google.firebase.messaging.t;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsContract$PetEditAction;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract$RenewalOptInUpdateSterilizedAction;
import cu8.c1;
import cu8.g1;
import fx7.l;
import java.util.Stack;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117934a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f117935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f117936c;
    public final Object d;

    public b(mt8.d kycInteractor, g1 presentationModel, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f117935b = kycInteractor;
        this.f117936c = presentationModel;
        this.d = actionDelegateFactory.f(new a(this, 2));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        switch (this.f117934a) {
            case 0:
                c1 action = (c1) aVar;
                Intrinsics.checkNotNullParameter(action, "action");
                return ((tm.g) this.d).a(action);
            case 1:
                RenewalDetailsContract$RenewalOptInUpdateSterilizedAction action2 = (RenewalDetailsContract$RenewalOptInUpdateSterilizedAction) aVar;
                Intrinsics.checkNotNullParameter(action2, "action");
                return ((tm.g) ((Lazy) this.d).getValue()).a(action2);
            case 2:
                PetEditDetailsContract$PetEditAction action3 = (PetEditDetailsContract$PetEditAction) aVar;
                Intrinsics.checkNotNullParameter(action3, "action");
                return ((tm.g) ((Lazy) this.d).getValue()).a(action3);
            default:
                qc0.c action4 = (qc0.c) aVar;
                Intrinsics.checkNotNullParameter(action4, "action");
                jt0.b bVar = (jt0.b) this.f117935b;
                qc0.k kVar = (qc0.k) bVar.f178265b;
                Stack stack = (Stack) w.O(kVar.r0());
                od0.i iVar = (od0.i) w.O(kVar.k());
                if (bVar.v0(stack, iVar != null ? (BackendFlow) iVar.g() : null)) {
                    return ((mm.d) this.f117936c).c0(qc0.d.f244408a);
                }
                vc0.a aVar2 = (vc0.a) this.d;
                Intrinsics.checkNotNullParameter(action4, "action");
                return aVar2.f.a(action4);
        }
    }

    public b(jt0.b creditBackendFlowCancellationChecker, mm.d actionsDispatcher, vc0.a backendFlowActionBackHandler) {
        Intrinsics.checkNotNullParameter(creditBackendFlowCancellationChecker, "creditBackendFlowCancellationChecker");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(backendFlowActionBackHandler, "backendFlowActionBackHandler");
        this.f117935b = creditBackendFlowCancellationChecker;
        this.f117936c = actionsDispatcher;
        this.d = backendFlowActionBackHandler;
    }

    public b(fx7.g petIssueInteractor, l petQuoteInteractor, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(petIssueInteractor, "petIssueInteractor");
        Intrinsics.checkNotNullParameter(petQuoteInteractor, "petQuoteInteractor");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f117935b = petIssueInteractor;
        this.f117936c = petQuoteInteractor;
        this.d = yhm.j.b(new hl6.b(actionDelegateFactory, this, 25));
    }

    public b(fx7.f petInteractor, ly7.b router, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f117935b = petInteractor;
        this.f117936c = router;
        this.d = yhm.j.b(new mhd.b(actionDelegateFactory, this, 28));
    }
}
