package k64;

import an.k;
import com.google.firebase.messaging.t;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.close.ui.legacy.CreditApplicationCloseLegacyContract$Configuration;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.api.ui.prompts.BEPromptApplicationCancellation;
import com.revolut.feature.credit.application.plugins.api.ui.prompts.PromptApplicationCancellation;
import com.revolut.feature.credit.application.plugins.impl.models.CreditOnboardingClosePayload;
import com.revolut.feature.credit.core.R$string;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import efm.d0;
import ft3.j1;
import k3l.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import skm.p0;
import wli.x;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements mm.b, k, g3l.d {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an.a f181629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f181630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3l.a f181631c;
    public final hz3.c d;
    public final ow3.e e;
    public final j64.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f181632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final eq3.b f181633h;
    public final x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final hw3.c f181634j;
    public final aq3.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tm.g f181635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tm.g f181636m;

    public h(an.a promptDialogDispatcher, ln.a navigationCommandsDispatcher, g3l.a statusDialogViewConfigurationDispatcher, hz3.c applicationCommandsFactory, ow3.e interactor, j64.b state, w revolutJobInteractor, eq3.b cancellationDialogProvider, x deeplinkHandler, hw3.c actionPathInteractor, aq3.a creditApplicationChecklistAvailabilityProvider, t delegateFactory) {
        Intrinsics.checkNotNullParameter(promptDialogDispatcher, "promptDialogDispatcher");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(applicationCommandsFactory, "applicationCommandsFactory");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(cancellationDialogProvider, "cancellationDialogProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(actionPathInteractor, "actionPathInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationChecklistAvailabilityProvider, "creditApplicationChecklistAvailabilityProvider");
        Intrinsics.checkNotNullParameter("CREDIT_QUESTIONNAIRE_FLOW", "flowName");
        Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
        this.f181629a = promptDialogDispatcher;
        this.f181630b = navigationCommandsDispatcher;
        this.f181631c = statusDialogViewConfigurationDispatcher;
        this.d = applicationCommandsFactory;
        this.e = interactor;
        this.f = state;
        this.f181632g = revolutJobInteractor;
        this.f181633h = cancellationDialogProvider;
        this.i = deeplinkHandler;
        this.f181634j = actionPathInteractor;
        this.k = creditApplicationChecklistAvailabilityProvider;
        this.f181635l = delegateFactory.f(new b(this, 1));
        this.f181636m = delegateFactory.f(new b(this, 2));
    }

    @Override // an.k
    public final d0 a(an.f callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean z = callback instanceof an.g;
        Continuation continuation = null;
        if (z && (((an.g) callback).f6505a.f256150a instanceof BEPromptApplicationCancellation)) {
            return te0.w.o0(p0.f264003c, new f(this, callback, null));
        }
        boolean z3 = callback instanceof an.h;
        if (z3 && (((an.h) callback).f6506a.f256150a instanceof BEPromptApplicationCancellation)) {
            return te0.w.o0(p0.f264003c, new g(this, callback, null));
        }
        if (z && (((an.g) callback).f6505a.f256150a instanceof PromptApplicationCancellation)) {
            pfm.a aVarE = this.f181629a.c0(new an.b()).e(ue0.e.v(pd.b.n(p0.f264003c, new k22.c(this, continuation, 6))));
            j1 j1Var = ((CreditApplicationPluginFlowContract$Configuration) this.f.n0().get()).d;
            j1Var.getClass();
            j1[] elements = {j1.FTC_FORBEARANCE, j1.CC_FORBEARANCE};
            Intrinsics.checkNotNullParameter(elements, "elements");
            z zVarD = aVarE.e(this.f181631c.c0(new StatusViewConfiguration.Success("SUCCESS_STATUS_DIALOG_ID", kotlin.collections.d.y0(elements).contains(j1Var) ? new TextLocalisedClause(R$string.credit_application_cancellation_cancel_request_saved_alert_title, null, null, 14) : new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_saved_alert_title, null, null, 14), null, null, null, 2044))).D(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
            return zVarD;
        }
        if (!z3 || !(((an.h) callback).f6506a.f256150a instanceof PromptApplicationCancellation)) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        CreditOnboardingClosePayload payload = new CreditOnboardingClosePayload((CreditApplicationPluginFlowContract$Configuration) this.f.n0().get(), 6);
        Intrinsics.checkNotNullParameter("CREDIT_QUESTIONNAIRE_FLOW", "flowName");
        Intrinsics.checkNotNullParameter(payload, "payload");
        fq3.d.Companion.getClass();
        z zVarD2 = this.f181630b.a(new ActivityNavigateCommand(fq3.a.f137173b, new CreditApplicationCloseLegacyContract$Configuration(payload, "CREDIT_QUESTIONNAIRE_FLOW"), null, 4213, 0, null, null, null, null, false, 1012)).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD2, "toSingleDefault(...)");
        return zVarD2;
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        j64.a action = (j64.a) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        pfm.h hVar = new pfm.h(new fag.g(this, action, 24), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "defer(...)");
        return hVar;
    }

    @Override // g3l.d
    public final d0 b(j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return ((result instanceof k3l.g) && Intrinsics.f(((k3l.g) result).f180817a.getF104385a(), "SUCCESS_STATUS_DIALOG_ID")) ? this.f181630b.a(FinishFlowCommand.f98647a).D(Boolean.TRUE) : d0.m(Boolean.FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (lg0.b.x1(r7.i, r2, null, null, r5, 6) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r7.f181634j.c(r8, r5) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof k64.e
            if (r0 == 0) goto L14
            r0 = r9
            k64.e r0 = (k64.e) r0
            int r1 = r0.f181626x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f181626x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            k64.e r0 = new k64.e
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f181626x
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L41
            if (r1 == r4) goto L3b
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            yhm.o.b(r9)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            goto L6e
        L3b:
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action r8 = r5.u
            yhm.o.b(r9)
            goto L55
        L41:
            yhm.o.b(r9)
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action r9 = r8.getF66310b()
            if (r9 == 0) goto L55
            r5.u = r8
            r5.f181626x = r4
            java.lang.Object r9 = r7.c(r9, r5)
            if (r9 != r0) goto L55
            goto L85
        L55:
            boolean r9 = r8 instanceof com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.Deeplink
            r1 = 0
            if (r9 == 0) goto L71
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action$Deeplink r8 = (com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.Deeplink) r8
            java.lang.String r2 = r8.f66307a
            r5.u = r1
            r5.f181626x = r3
            wli.x r1 = r7.i
            r3 = 0
            r4 = 0
            r6 = 6
            java.lang.Object r8 = lg0.b.x1(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L6e
            goto L85
        L6e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L71:
            boolean r9 = r8 instanceof com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.PostRequest
            if (r9 == 0) goto L89
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action$PostRequest r8 = (com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.PostRequest) r8
            java.lang.String r8 = r8.f66309a
            r5.u = r1
            r5.f181626x = r2
            hw3.c r9 = r7.f181634j
            java.lang.Object r8 = r9.c(r8, r5)
            if (r8 != r0) goto L86
        L85:
            return r0
        L86:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L89:
            boolean r8 = r8 instanceof com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.Close
            if (r8 == 0) goto L9a
            an.b r8 = new an.b
            r8.<init>()
            an.a r9 = r7.f181629a
            r9.D(r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L9a:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k64.h.c(com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action, gim.c):java.lang.Object");
    }
}
