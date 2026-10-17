package com.revolut.shared.feature.suspicious_transaction.impl.flow;

import abl.d;
import aw0.o9;
import com.google.android.material.internal.ViewUtils;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.suspicious_transaction.api.models.Action;
import com.revolut.shared.feature.suspicious_transaction.api.models.ActionButton;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialogAnswer;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$Step;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.actions.ActionsScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.actions.ActionsScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.agreement.RiskAgreementScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.agreement.RiskAgreementScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.cancel.CancelScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.cancel.CancelScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.confirmation.SimpleConfirmationScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.confirmation.SimpleConfirmationScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.error.ErrorScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.loading.LoadingScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.loading.LoadingScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.question.QuestionScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.question.QuestionScreenContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.warning.WarningScreen;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.warning.WarningScreenContract$InputData;
import com.revolut.tracking.v3.IdContext;
import dki.g;
import ife.c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.v9;
import nal.d;
import nal.f;
import nal.i;
import nal.n;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import yji.l;
import zhm.d0;
import zhm.h0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends g implements d {

    @NotNull
    public static final i Companion = new i();
    public final SuspiciousTransactionFlowContract$Step A;
    public final SuspiciousTransactionFlowContract$SuspiciousTransactionFlowState B;
    public final List C;
    public final ArrayList D;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SuspiciousTransactionFlowContract$InputData f105001t;
    public final f u;
    public final cal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f105002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f80.a f105003x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fal.b f105004y;
    public final bbl.a z;

    public a(SuspiciousTransactionFlowContract$InputData inputData, f stateMapper, cal.a navigationDestinationProvider, c transactionDetailsProvider, f80.a uriHelper, fal.b suspiciousTransactionInteractor, bbl.a suspiciousTransactionPromptControllerProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(navigationDestinationProvider, "navigationDestinationProvider");
        Intrinsics.checkNotNullParameter(transactionDetailsProvider, "transactionDetailsProvider");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(suspiciousTransactionInteractor, "suspiciousTransactionInteractor");
        Intrinsics.checkNotNullParameter(suspiciousTransactionPromptControllerProvider, "suspiciousTransactionPromptControllerProvider");
        this.f105001t = inputData;
        this.u = stateMapper;
        this.v = navigationDestinationProvider;
        this.f105002w = transactionDetailsProvider;
        this.f105003x = uriHelper;
        this.f105004y = suspiciousTransactionInteractor;
        this.z = suspiciousTransactionPromptControllerProvider;
        this.A = inputData.f104986c;
        this.B = new SuspiciousTransactionFlowContract$SuspiciousTransactionFlowState(inputData.f104984a, inputData.f104985b);
        this.C = v.k(SuspiciousTransactionFlowContract$Step.Loading.class, SuspiciousTransactionFlowContract$Step.Error.class);
        this.D = new ArrayList();
    }

    public static final void O2(a aVar, Throwable th10) {
        aVar.getClass();
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        aVar.U2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P2(com.revolut.shared.feature.suspicious_transaction.impl.flow.a r5, java.lang.String r6, kotlin.jvm.functions.Function2 r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof nal.o
            if (r0 == 0) goto L13
            r0 = r8
            nal.o r0 = (nal.o) r0
            int r1 = r0.f213939x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213939x = r1
            goto L18
        L13:
            nal.o r0 = new nal.o
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f213939x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.jvm.internal.q r5 = r0.u
            r7 = r5
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            yhm.o.b(r8)
            goto L63
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r8)
            ife.c r5 = r5.f105002w
            r5.getClass()
            java.lang.String r8 = "groupId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)
            com.revolut.domain.interactors.transactions.a r5 = r5.f161007a
            r8 = 0
            r2 = 6
            r4 = 0
            efm.r r5 = com.revolut.domain.interactors.transactions.a.c(r5, r6, r4, r8, r2)
            id8.a r6 = new id8.a
            r8 = 25
            r6.<init>(r8)
            efm.r r5 = nim.a.w(r5, r6)
            r6 = r7
            kotlin.jvm.internal.q r6 = (kotlin.jvm.internal.q) r6
            r0.u = r6
            r0.f213939x = r3
            java.lang.Object r8 = nim.a.c(r5, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r5 = r8.getContent()
            gal.b r5 = (gal.b) r5
            if (r5 == 0) goto L74
            java.lang.String r6 = r5.f142193a
            dj0.d r5 = r5.f142194b
            r7.invoke(r6, r5)
        L74:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.shared.feature.suspicious_transaction.impl.flow.a.P2(com.revolut.shared.feature.suspicious_transaction.impl.flow.a, java.lang.String, kotlin.jvm.functions.Function2, gim.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    public final SuspiciousTransactionFlowContract$Step Q2() {
        SuspiciousTransactionFlowContract$Step suspiciousTransactionFlowContract$Step = (SuspiciousTransactionFlowContract$Step) A2().f98430b;
        if (suspiciousTransactionFlowContract$Step instanceof SuspiciousTransactionFlowContract$Step.Question) {
            SuspiciousTransactionFlowContract$Step.Question question = (SuspiciousTransactionFlowContract$Step.Question) suspiciousTransactionFlowContract$Step;
            SuspiciousTransactionDialog.Question question2 = question.f104990a;
            SuspiciousTransactionDialogAnswer suspiciousTransactionDialogAnswer = question.f104991b;
            ?? r110 = question2.f104944g;
            if (suspiciousTransactionDialogAnswer != null) {
                return V2((SuspiciousTransactionDialog) r0.h(suspiciousTransactionDialogAnswer.f104973a, r110));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (suspiciousTransactionFlowContract$Step instanceof SuspiciousTransactionFlowContract$Step.Warning) {
            return V2(((SuspiciousTransactionFlowContract$Step.Warning) suspiciousTransactionFlowContract$Step).f104998a.f104972j);
        }
        if ((suspiciousTransactionFlowContract$Step instanceof SuspiciousTransactionFlowContract$Step.Action) || (suspiciousTransactionFlowContract$Step instanceof SuspiciousTransactionFlowContract$Step.Screen) || Intrinsics.f(suspiciousTransactionFlowContract$Step, SuspiciousTransactionFlowContract$Step.Error.f104988a) || Intrinsics.f(suspiciousTransactionFlowContract$Step, SuspiciousTransactionFlowContract$Step.Loading.f104989a) || (suspiciousTransactionFlowContract$Step instanceof SuspiciousTransactionFlowContract$Step.Redirect)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void R2(SuspiciousTransactionFlowContract$Step suspiciousTransactionFlowContract$Step) {
        TextClause textClause;
        PromptMarketingContentDelegate.Model.Content mediaContent;
        PromptMarketingContentDelegate.Model.Button button;
        PromptMarketingContentDelegate.Model.Button button2;
        String str;
        String str2;
        if (suspiciousTransactionFlowContract$Step instanceof SuspiciousTransactionFlowContract$Step.Redirect) {
            String str3 = ((SuspiciousTransactionFlowContract$Step.Redirect) suspiciousTransactionFlowContract$Step).f104992a;
            if (str3 == null) {
                return;
            }
            S2(str3);
            return;
        }
        if (!(suspiciousTransactionFlowContract$Step instanceof SuspiciousTransactionFlowContract$Step.Screen.SimpleWarning) && !(suspiciousTransactionFlowContract$Step instanceof SuspiciousTransactionFlowContract$Step.Screen.CircleWarning)) {
            if (!(suspiciousTransactionFlowContract$Step instanceof SuspiciousTransactionFlowContract$Step.Loading) && !(suspiciousTransactionFlowContract$Step instanceof SuspiciousTransactionFlowContract$Step.Error)) {
                E2(suspiciousTransactionFlowContract$Step, !this.C.contains(A2().f98430b.getClass()), TransitionAnimation.NONE.f98393a, false);
                return;
            } else {
                r2();
                E2(suspiciousTransactionFlowContract$Step, false, TransitionAnimation.NONE.f98393a, false);
                return;
            }
        }
        SuspiciousTransactionDialog.Screen screen = ((SuspiciousTransactionFlowContract$Step.Screen) suspiciousTransactionFlowContract$Step).a();
        this.z.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        TextClause textClause2 = new TextClause(screen.getF104964a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        boolean z = screen instanceof SuspiciousTransactionDialog.Screen.SimpleWarning;
        if (z) {
            textClause = new TextClause(((SuspiciousTransactionDialog.Screen.SimpleWarning) screen).e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            if (!(screen instanceof SuspiciousTransactionDialog.Screen.CircleWarning)) {
                if (!(screen instanceof SuspiciousTransactionDialog.Screen.RiskAgreement) && !(screen instanceof SuspiciousTransactionDialog.Screen.SimpleConfirmation) && !(screen instanceof SuspiciousTransactionDialog.Screen.Cancel)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new UnsupportedOperationException("Prompt is not supported for ".concat(screen.getClass().getSimpleName()));
            }
            textClause = new TextClause(((SuspiciousTransactionDialog.Screen.CircleWarning) screen).e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (screen instanceof SuspiciousTransactionDialog.Screen.CircleWarning) {
            SuspiciousTransactionDialog.Screen.CircleWarning circleWarning = (SuspiciousTransactionDialog.Screen.CircleWarning) screen;
            BigDecimal bigDecimal = circleWarning.f104956g;
            int iMax = Integer.max(3, Integer.min(bigDecimal.intValue(), 97));
            int i = R$attr.uikit_colorRed;
            mediaContent = new PromptMarketingContentDelegate.Model.Content.ProgressContent(new ProgressStyle(iMax, 100, i, i, R$attr.uikit_colorTransparent, 12.0f, 12.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS), new PercentageClause(bigDecimal, (PercentageClause.Format) null, (Style) null, 6), new TextClause(circleWarning.f104957h, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124));
        } else {
            if (!z) {
                if (!(screen instanceof SuspiciousTransactionDialog.Screen.Cancel) && !(screen instanceof SuspiciousTransactionDialog.Screen.RiskAgreement) && !(screen instanceof SuspiciousTransactionDialog.Screen.SimpleConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new UnsupportedOperationException("Prompt is not supported for ".concat(screen.getClass().getSimpleName()));
            }
            String str4 = ((SuspiciousTransactionDialog.Screen.SimpleWarning) screen).f;
            mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(str4 != null ? new UrlImage(str4, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : new ResourceImage(R$drawable.uikit_icn_104_warning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null);
        }
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        ActionButton actionButton = (ActionButton) d0.e0(0, screen.b());
        if (actionButton == null || (str2 = actionButton.f104901b) == null) {
            button = null;
        } else {
            TextClause textClause3 = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            ActionButton actionButton2 = (ActionButton) d0.e0(0, screen.b());
            button = new PromptMarketingContentDelegate.Model.Button((Clause) textClause3, (ResourceImage) null, (LargeActionButton.ButtonStyle) bbl.a.a(actionButton2 != null ? actionButton2.f104900a : null), false, (String) null, 54);
        }
        ActionButton actionButton3 = (ActionButton) d0.e0(1, screen.b());
        if (actionButton3 == null || (str = actionButton3.f104901b) == null) {
            button2 = null;
        } else {
            TextClause textClause4 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            ActionButton actionButton4 = (ActionButton) d0.e0(1, screen.b());
            button2 = new PromptMarketingContentDelegate.Model.Button((Clause) textClause4, (ResourceImage) null, (LargeActionButton.ButtonStyle) bbl.a.a(actionButton4 != null ? actionButton4.f104900a : null), false, (String) null, 54);
        }
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        IdContext.a aVarNewBuilder = IdContext.newBuilder();
        aVarNewBuilder.h(screen.getD());
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        f2(new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("PROMPT_LIST_ID", textClause2, textClause, mediaContent, PromptMarketingContentDelegate.Model.BackgroundType.Dialog.f53101a, null, resourceImage, null, null, button, button2, null, null, null, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), null, null, null, null, null, null, 2079136), null, false, false, null, 30)), ModalDestination.Style.POPUP.f98311a, new nal.g(suspiciousTransactionFlowContract$Step, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S2(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.shared.feature.suspicious_transaction.impl.flow.a.S2(java.lang.String):void");
    }

    public final void T2(Action action) {
        if (action instanceof Action.Deeplink) {
            S2(((Action.Deeplink) action).f104895a);
            return;
        }
        if (action instanceof Action.Screen) {
            R2(V2(((Action.Screen) action).f104899a));
            return;
        }
        if (!(action instanceof Action.Request)) {
            throw new NoWhenBranchMatchedException();
        }
        l2(new n(this, (Action.Request) action, null), new v9(1, this, a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 28));
    }

    public final void U2() {
        l.a1(this, X1(new y0("ID_STATUS_DIALOG_ERROR", new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.general_error_common, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, null, null, 7);
    }

    public final SuspiciousTransactionFlowContract$Step V2(SuspiciousTransactionDialog dialog) {
        ((b) this.u).getClass();
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (dialog instanceof SuspiciousTransactionDialog.Action) {
            return new SuspiciousTransactionFlowContract$Step.Action((SuspiciousTransactionDialog.Action) dialog);
        }
        if (dialog instanceof SuspiciousTransactionDialog.Question) {
            return new SuspiciousTransactionFlowContract$Step.Question((SuspiciousTransactionDialog.Question) dialog, null);
        }
        if (dialog instanceof SuspiciousTransactionDialog.Warning) {
            return new SuspiciousTransactionFlowContract$Step.Warning((SuspiciousTransactionDialog.Warning) dialog);
        }
        if (dialog instanceof SuspiciousTransactionDialog.Redirection) {
            return new SuspiciousTransactionFlowContract$Step.Redirect(((SuspiciousTransactionDialog.Redirection) dialog).f104946b);
        }
        if (dialog instanceof SuspiciousTransactionDialog.Screen.Cancel) {
            return new SuspiciousTransactionFlowContract$Step.Screen.Cancel((SuspiciousTransactionDialog.Screen.Cancel) dialog);
        }
        if (dialog instanceof SuspiciousTransactionDialog.Screen.CircleWarning) {
            return new SuspiciousTransactionFlowContract$Step.Screen.CircleWarning((SuspiciousTransactionDialog.Screen.CircleWarning) dialog);
        }
        if (dialog instanceof SuspiciousTransactionDialog.Screen.RiskAgreement) {
            return new SuspiciousTransactionFlowContract$Step.Screen.RiskAgreement((SuspiciousTransactionDialog.Screen.RiskAgreement) dialog);
        }
        if (dialog instanceof SuspiciousTransactionDialog.Screen.SimpleConfirmation) {
            return new SuspiciousTransactionFlowContract$Step.Screen.SimpleConfirmation((SuspiciousTransactionDialog.Screen.SimpleConfirmation) dialog);
        }
        if (dialog instanceof SuspiciousTransactionDialog.Screen.SimpleWarning) {
            return new SuspiciousTransactionFlowContract$Step.Screen.SimpleWarning((SuspiciousTransactionDialog.Screen.SimpleWarning) dialog);
        }
        if (dialog instanceof SuspiciousTransactionDialog.DeeplinkRedirection) {
            return new SuspiciousTransactionFlowContract$Step.Redirect(((SuspiciousTransactionDialog.DeeplinkRedirection) dialog).f104940a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        SuspiciousTransactionFlowContract$Step step = (SuspiciousTransactionFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean zF = Intrinsics.f(step, SuspiciousTransactionFlowContract$Step.Loading.f104989a);
        SuspiciousTransactionFlowContract$SuspiciousTransactionFlowState suspiciousTransactionFlowContract$SuspiciousTransactionFlowState = this.B;
        if (zF) {
            LoadingScreen loadingScreen = new LoadingScreen(new LoadingScreenContract$InputData(suspiciousTransactionFlowContract$SuspiciousTransactionFlowState.f104999a, suspiciousTransactionFlowContract$SuspiciousTransactionFlowState.f105000b));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: nal.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.shared.feature.suspicious_transaction.impl.flow.a f213931b;

                {
                    this.f213931b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            abl.d outputData = (abl.d) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z = outputData instanceof abl.c;
                            com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar = this.f213931b;
                            if (z) {
                                aVar.R2(aVar.V2(((abl.c) outputData).f2981a));
                            } else if (Intrinsics.f(outputData, d.a.f2982a)) {
                                aVar.R2(SuspiciousTransactionFlowContract$Step.Error.f104988a);
                            } else if (!Intrinsics.f(outputData, d.b.f2983a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        default:
                            zal.d it8 = (zal.d) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar2 = this.f213931b;
                            aVar2.r2();
                            aVar2.R2(SuspiciousTransactionFlowContract$Step.Loading.f104989a);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            loadingScreen.H = function1;
            return loadingScreen;
        }
        if (Intrinsics.f(step, SuspiciousTransactionFlowContract$Step.Error.f104988a)) {
            ErrorScreen errorScreen = new ErrorScreen();
            final int i2 = 1;
            Function1 function12 = new Function1(this) { // from class: nal.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.shared.feature.suspicious_transaction.impl.flow.a f213931b;

                {
                    this.f213931b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            abl.d outputData = (abl.d) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z = outputData instanceof abl.c;
                            com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar = this.f213931b;
                            if (z) {
                                aVar.R2(aVar.V2(((abl.c) outputData).f2981a));
                            } else if (Intrinsics.f(outputData, d.a.f2982a)) {
                                aVar.R2(SuspiciousTransactionFlowContract$Step.Error.f104988a);
                            } else if (!Intrinsics.f(outputData, d.b.f2983a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        default:
                            zal.d it8 = (zal.d) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar2 = this.f213931b;
                            aVar2.r2();
                            aVar2.R2(SuspiciousTransactionFlowContract$Step.Loading.f104989a);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            errorScreen.H = function12;
            return errorScreen;
        }
        if (step instanceof SuspiciousTransactionFlowContract$Step.Question) {
            QuestionScreen questionScreen = new QuestionScreen(new QuestionScreenContract$InputData(((SuspiciousTransactionFlowContract$Step.Question) step).f104990a));
            nal.g gVar = new nal.g(this, step);
            Intrinsics.checkNotNullParameter(gVar, "<set-?>");
            questionScreen.H = gVar;
            return questionScreen;
        }
        if (step instanceof SuspiciousTransactionFlowContract$Step.Warning) {
            return new WarningScreen(new WarningScreenContract$InputData(((SuspiciousTransactionFlowContract$Step.Warning) step).f104998a));
        }
        if (step instanceof SuspiciousTransactionFlowContract$Step.Action) {
            return new ActionsScreen(new ActionsScreenContract$InputData(((SuspiciousTransactionFlowContract$Step.Action) step).f104987a));
        }
        if (step instanceof SuspiciousTransactionFlowContract$Step.Screen.Cancel) {
            return new CancelScreen(new CancelScreenContract$InputData(((SuspiciousTransactionFlowContract$Step.Screen.Cancel) step).f104993a, suspiciousTransactionFlowContract$SuspiciousTransactionFlowState.f104999a));
        }
        if (step instanceof SuspiciousTransactionFlowContract$Step.Screen.SimpleConfirmation) {
            return new SimpleConfirmationScreen(new SimpleConfirmationScreenContract$InputData(((SuspiciousTransactionFlowContract$Step.Screen.SimpleConfirmation) step).f104996a));
        }
        if (step instanceof SuspiciousTransactionFlowContract$Step.Screen.RiskAgreement) {
            return new RiskAgreementScreen(new RiskAgreementScreenContract$InputData(((SuspiciousTransactionFlowContract$Step.Screen.RiskAgreement) step).f104995a));
        }
        if ((step instanceof SuspiciousTransactionFlowContract$Step.Screen.SimpleWarning) || (step instanceof SuspiciousTransactionFlowContract$Step.Screen.CircleWarning) || (step instanceof SuspiciousTransactionFlowContract$Step.Redirect)) {
            throw new IllegalStateException(a.class.getSimpleName().concat(" step should never be passed into next() method"));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.B;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.A;
    }
}
