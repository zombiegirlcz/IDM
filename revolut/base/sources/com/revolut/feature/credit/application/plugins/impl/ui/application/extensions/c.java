package com.revolut.feature.credit.application.plugins.impl.ui.application.extensions;

import android.os.Parcelable;
import aw0.h;
import aw0.n6;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.CreditApplicationCancellationModelExtension$CancellationVariant;
import com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.a;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.kompot.navigable.vc.ViewController;
import ft3.d1;
import ft3.g1;
import ft3.j1;
import gim.i;
import grl.k9;
import it3.k;
import j4h.m;
import j54.f;
import j54.j;
import j54.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import nii.u1;
import ow3.e;
import ow3.g;
import wli.x;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends n implements f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f67105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f67106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final hw3.c f67107n;
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dq3.a f67108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f67109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aq3.a f67110r;

    public c(e creditApplicationCancellationInteractor, x deeplinkHandler, hw3.c actionPathInteractor, g creditApplicationCloseDescriptionProvider, dq3.a creditApplicationCancellationFacade, v lifecycleExtension, aq3.a checklistAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(creditApplicationCancellationInteractor, "creditApplicationCancellationInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(actionPathInteractor, "actionPathInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationCloseDescriptionProvider, "creditApplicationCloseDescriptionProvider");
        Intrinsics.checkNotNullParameter(creditApplicationCancellationFacade, "creditApplicationCancellationFacade");
        Intrinsics.checkNotNullParameter(lifecycleExtension, "lifecycleExtension");
        Intrinsics.checkNotNullParameter(checklistAvailabilityProvider, "checklistAvailabilityProvider");
        this.f67105l = creditApplicationCancellationInteractor;
        this.f67106m = deeplinkHandler;
        this.f67107n = actionPathInteractor;
        this.o = creditApplicationCloseDescriptionProvider;
        this.f67108p = creditApplicationCancellationFacade;
        this.f67109q = lifecycleExtension;
        this.f67110r = checklistAvailabilityProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (lg0.b.x1(r7.f67106m, r2, null, null, r5, 6) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r7.f67107n.c(r8, r5) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof j54.o
            if (r0 == 0) goto L14
            r0 = r9
            j54.o r0 = (j54.o) r0
            int r1 = r0.f171534x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f171534x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            j54.o r0 = new j54.o
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f171534x
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
            r5.f171534x = r4
            java.lang.Object r9 = r7.Z2(r9, r5)
            if (r9 != r0) goto L55
            goto L85
        L55:
            boolean r9 = r8 instanceof com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.Deeplink
            r1 = 0
            if (r9 == 0) goto L71
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action$Deeplink r8 = (com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.Deeplink) r8
            java.lang.String r2 = r8.f66307a
            r5.u = r1
            r5.f171534x = r3
            wli.x r1 = r7.f67106m
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
            r5.f171534x = r2
            hw3.c r9 = r7.f67107n
            java.lang.Object r8 = r9.c(r8, r5)
            if (r8 != r0) goto L86
        L85:
            return r0
        L86:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L89:
            boolean r8 = r8 instanceof com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig.Action.Close
            if (r8 == 0) goto L92
            int r8 = jli.h.f175850a
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L92:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c.Z2(com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$Action, gim.c):java.lang.Object");
    }

    public final Object b3(PluginPayload pluginPayload, boolean z, String str, i iVar) {
        it3.d dVar = pluginPayload.f66247a;
        if (((wr3.b) this.f67110r).a(dVar.f168328j) || dVar.f168333q || !dVar.f168327h) {
            Unit unitR = v.r(this.f67109q, dVar.f168323a, null, iVar, 2);
            return unitR == fim.a.COROUTINE_SUSPENDED ? unitR : Unit.f186387a;
        }
        Object objC3 = c3(pluginPayload, z, str, iVar);
        return objC3 == fim.a.COROUTINE_SUSPENDED ? objC3 : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (j54.v.r(r9.f67109q, r10, null, r0, 2) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(com.revolut.feature.credit.application.models.plugins.PluginPayload r10, boolean r11, java.lang.String r12, gim.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof j54.p
            if (r0 == 0) goto L13
            r0 = r13
            j54.p r0 = (j54.p) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            j54.p r0 = new j54.p
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f171539x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r13)
            goto L9b
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            boolean r11 = r0.f171538w
            com.google.protobuf.w0 r10 = r0.v
            com.revolut.feature.credit.application.models.plugins.PluginPayload r12 = r0.u
            yhm.o.b(r13)
            r8 = r13
            r13 = r10
            r10 = r12
            r12 = r8
            goto L72
        L41:
            yhm.o.b(r13)
            com.revolut.analytics.tracking.v3.AnalyticsContext$b r13 = com.revolut.analytics.tracking.v3.AnalyticsContext.INSTANCE
            it3.d r2 = r10.f66247a
            com.revolut.feature.credit.application.models.plugins.EntryPointParams r5 = r10.f66249c
            grl.r2 r6 = r5.f66246b
            wi0.b r7 = r10.f66248b
            java.lang.String r5 = r5.f66245a
            com.revolut.tracking.v3.CreditApplicationCommonContext r2 = zr3.b.b(r7, r6, r5, r2)
            r13.getClass()
            com.google.protobuf.w0 r13 = com.revolut.analytics.tracking.v3.AnalyticsContext.Companion.a(r2)
            if (r11 == 0) goto L9e
            it3.d r2 = r10.f66247a
            java.lang.String r2 = r2.f168323a
            r0.u = r10
            r0.v = r13
            r0.f171538w = r11
            r0.z = r4
            ow3.e r4 = r9.f67105l
            java.lang.Object r12 = r4.c(r2, r12, r0)
            if (r12 != r1) goto L72
            goto L9a
        L72:
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig r12 = (com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig) r12
            com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig$ConfirmationContent r2 = r12.f66304b
            if (r2 == 0) goto L7e
            com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.CreditApplicationCancellationModelExtension$CancellationVariant$BECancellation r11 = new com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.CreditApplicationCancellationModelExtension$CancellationVariant$BECancellation
            r11.<init>(r2)
            goto La0
        L7e:
            boolean r12 = r12.f66303a
            if (r12 == 0) goto L85
            com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.CreditApplicationCancellationModelExtension$CancellationVariant$LeaveNow r11 = com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.CreditApplicationCancellationModelExtension$CancellationVariant.LeaveNow.f67100a
            goto La0
        L85:
            it3.d r10 = r10.f66247a
            java.lang.String r10 = r10.f168323a
            r12 = 0
            r0.u = r12
            r0.v = r12
            r0.f171538w = r11
            r0.z = r3
            j54.v r11 = r9.f67109q
            kotlin.Unit r10 = j54.v.r(r11, r10, r12, r0, r3)
            if (r10 != r1) goto L9b
        L9a:
            return r1
        L9b:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L9e:
            com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.CreditApplicationCancellationModelExtension$CancellationVariant$ConfirmCancellation r11 = com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.CreditApplicationCancellationModelExtension$CancellationVariant.ConfirmCancellation.f67099a
        La0:
            aii.o r12 = r9.r2()
            j54.e r0 = new j54.e
            r0.<init>(r11, r10, r13)
            r12.M0(r0)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c.c3(com.revolut.feature.credit.application.models.plugins.PluginPayload, boolean, java.lang.String, gim.c):java.lang.Object");
    }

    public final ViewController d3(CreditApplicationCancellationModelExtension$CancellationVariant variant, final PluginPayload pluginPayload, w0 w0Var) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        int i = 6;
        if (variant instanceof CreditApplicationCancellationModelExtension$CancellationVariant.BECancellation) {
            DropOutConfig.ConfirmationContent confirmationContent = ((CreditApplicationCancellationModelExtension$CancellationVariant.BECancellation) variant).f67098a;
            Intrinsics.checkNotNullParameter(confirmationContent, "confirmationContent");
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.credit_application_cancellation_custom_content_template_title, u.c(confirmationContent.f66313a), null, 12), new TextLocalisedClause(R$string.credit_application_cancellation_custom_content_template_description, u.c(confirmationContent.f66314b), null, 12), null, null, false, 28);
            h hVar = new h(false, new n6(new TextLocalisedClause(R$string.credit_application_cancellation_custom_content_template_primaryButton, u.c(confirmationContent.f66315c.f66311a), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(R$string.credit_application_cancellation_custom_content_template_secondaryButton, u.c(confirmationContent.d.f66311a), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), null, null, null, 121);
            k9 value = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, hVar, new AnalyticsProduct.Retail(value), new AnalyticsContext(w0Var), null, 16));
            s.F(actionsBottomSheetController, new j(2, 0, c.class, this, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;"), null, new m(this, confirmationContent, i), 6);
            return actionsBottomSheetController;
        }
        if (!Intrinsics.f(variant, CreditApplicationCancellationModelExtension$CancellationVariant.LeaveNow.f67100a)) {
            if (!Intrinsics.f(variant, CreditApplicationCancellationModelExtension$CancellationVariant.ConfirmCancellation.f67099a)) {
                throw new NoWhenBranchMatchedException();
            }
            j1 productType = pluginPayload.f66247a.f168328j;
            Intrinsics.checkNotNullParameter(productType, "productType");
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(productType.b() ? R$string.credit_application_cancellation_cancel_request_dialog_confirm_cancellation_title : R$string.credit_application_cancellation_cancel_application_alert_title, null, null, 14), new TextLocalisedClause(productType.b() ? R$string.credit_application_cancellation_cancel_request_dialog_confirm_cancellation_subtitle : R$string.credit_application_cancellation_cancel_application_alert_subtitle, null, null, 14), null, null, false, 28);
            h hVar2 = new h(false, new n6(new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_alert_confirm_cancellation_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_alert_confirm_cancellation_secondary_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), null, null, null, 121);
            k9 value2 = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value2, "value");
            ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar2, hVar2, new AnalyticsProduct.Retail(value2), new AnalyticsContext(w0Var), null, 16));
            final int i2 = 0;
            s.F(actionsBottomSheetController2, new fi7.s(2, this, c.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 26), new b(this, null), new Function1(this) { // from class: j54.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c f171510b;

                {
                    this.f171510b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i3 = i2;
                    int i5 = 27;
                    Continuation continuation = null;
                    PluginPayload pluginPayload2 = pluginPayload;
                    com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c cVar = this.f171510b;
                    int i6 = 0;
                    switch (i3) {
                        case 0:
                            dii.g output = (dii.g) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof dii.e) {
                                cVar.T2(new i(cVar, pluginPayload2, continuation, i6), new yi5.b(i5));
                            } else {
                                cVar.r2().M0(a.C0470a.f67104b);
                            }
                            break;
                        default:
                            dii.g output2 = (dii.g) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            if (output2 instanceof dii.e) {
                                yji.n.j2(cVar, cVar.L2(new nii.y0(null, new nii.j0((Clause) new TextLocalisedClause(pluginPayload2.f66247a.f168328j.b() ? R$string.credit_application_cancellation_cancel_request_saved_alert_title : R$string.credit_application_cancellation_cancel_application_status_dialog_saved_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_status_dialog_saved_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 5)), new ie6.q(2, 4, continuation), new i(cVar, pluginPayload2, continuation, 1), 2);
                            } else if (output2 instanceof dii.f) {
                                cVar.T2(new i(cVar, pluginPayload2, continuation, i6), new yi5.b(i5));
                            } else {
                                int i21 = jli.h.f175850a;
                                Unit unit = Unit.f186387a;
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            }, 2);
            return actionsBottomSheetController2;
        }
        it3.d dVar = pluginPayload.f66247a;
        Object obj2 = g1.f137832a;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        j1 j1Var = dVar.f168328j;
        k kVar = dVar.f168334r;
        TextLocalisedClause description = this.o.a(g1.c(new d1(j1Var, dVar.k, null), dVar.f168332p, kVar), kVar, Integer.valueOf(dVar.f168329l));
        Intrinsics.checkNotNullParameter(description, "description");
        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_title, null, null, 14), description, null, null, false, 28);
        h hVar3 = new h(false, new n6(new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_button_primary_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_dialog_button_secondary_title, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), null, null, null, 121);
        k9 value3 = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value3, "value");
        ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar3, hVar3, new AnalyticsProduct.Retail(value3), new AnalyticsContext(w0Var), null, 16));
        final int i3 = 1;
        s.F(actionsBottomSheetController3, new fi7.s(2, this, c.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 27), null, new Function1(this) { // from class: j54.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c f171510b;

            {
                this.f171510b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj22) {
                int i32 = i3;
                int i5 = 27;
                Continuation continuation = null;
                PluginPayload pluginPayload2 = pluginPayload;
                com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c cVar = this.f171510b;
                int i6 = 0;
                switch (i32) {
                    case 0:
                        dii.g output = (dii.g) obj22;
                        Intrinsics.checkNotNullParameter(output, "output");
                        if (output instanceof dii.e) {
                            cVar.T2(new i(cVar, pluginPayload2, continuation, i6), new yi5.b(i5));
                        } else {
                            cVar.r2().M0(a.C0470a.f67104b);
                        }
                        break;
                    default:
                        dii.g output2 = (dii.g) obj22;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        if (output2 instanceof dii.e) {
                            yji.n.j2(cVar, cVar.L2(new nii.y0(null, new nii.j0((Clause) new TextLocalisedClause(pluginPayload2.f66247a.f168328j.b() ? R$string.credit_application_cancellation_cancel_request_saved_alert_title : R$string.credit_application_cancellation_cancel_application_status_dialog_saved_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_status_dialog_saved_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 5)), new ie6.q(2, 4, continuation), new i(cVar, pluginPayload2, continuation, 1), 2);
                        } else if (output2 instanceof dii.f) {
                            cVar.T2(new i(cVar, pluginPayload2, continuation, i6), new yi5.b(i5));
                        } else {
                            int i21 = jli.h.f175850a;
                            Unit unit = Unit.f186387a;
                        }
                        break;
                }
                return Unit.f186387a;
            }
        }, 6);
        return actionsBottomSheetController3;
    }
}
