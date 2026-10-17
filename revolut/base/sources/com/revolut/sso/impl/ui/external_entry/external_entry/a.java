package com.revolut.sso.impl.ui.external_entry.external_entry;

import android.content.Intent;
import android.os.Bundle;
import anl.e;
import bjl.r;
import bjl.s;
import bjl.t;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.accounts.RevolutAccount;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$ExternalClientAuthentication;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.domain.models.RevolutAccountImpl;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$InputData;
import com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$State;
import com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$Step;
import com.revolut.sso.impl.ui.external_entry.external_entry.choose_account.ChooseAccountScreen;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import nii.y0;
import nii.z;
import rd0.d;
import yhm.j;
import zml.g;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends iki.b implements zml.a {
    public final g A;
    public final b B;
    public final nkl.b C;
    public final uil.a D;
    public final gte.a E;
    public final Lazy F;
    public final ExternalEntryFlowContract$Step G;
    public final ExternalEntryFlowContract$State H;
    public final ExternalEntryFlowContract$InputData z;

    public a(ExternalEntryFlowContract$InputData inputData, g flowNavigator, b flowResultMapper, nkl.b revolutSsoFlowsFactory, uil.a revolutAccountsManager, gte.a featureToggleInteractor) {
        ExternalEntryFlowContract$Step externalEntryFlowContract$Step;
        ExternalEntryFlowContract$State getAuthCode;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(flowNavigator, "flowNavigator");
        Intrinsics.checkNotNullParameter(flowResultMapper, "flowResultMapper");
        Intrinsics.checkNotNullParameter(revolutSsoFlowsFactory, "revolutSsoFlowsFactory");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.z = inputData;
        this.A = flowNavigator;
        this.B = flowResultMapper;
        this.C = revolutSsoFlowsFactory;
        this.D = revolutAccountsManager;
        this.E = featureToggleInteractor;
        this.F = j.b(new zh0.b(this, 10));
        ExternalEntryFlowContract$InputData.FlowToLaunch flowToLaunch = inputData.f106540a;
        boolean z = flowToLaunch instanceof ExternalEntryFlowContract$InputData.FlowToLaunch.GetAuthCode;
        if (z) {
            externalEntryFlowContract$Step = ExternalEntryFlowContract$Step.Loading.f106551a;
        } else {
            if (!(flowToLaunch instanceof ExternalEntryFlowContract$InputData.FlowToLaunch.NotSupported)) {
                throw new NoWhenBranchMatchedException();
            }
            externalEntryFlowContract$Step = ExternalEntryFlowContract$Step.NotSupported.f106552a;
        }
        this.G = externalEntryFlowContract$Step;
        if (z) {
            getAuthCode = new ExternalEntryFlowContract$State.GetAuthCode(((ExternalEntryFlowContract$InputData.FlowToLaunch.GetAuthCode) flowToLaunch).e);
        } else {
            if (!(flowToLaunch instanceof ExternalEntryFlowContract$InputData.FlowToLaunch.NotSupported)) {
                throw new NoWhenBranchMatchedException();
            }
            getAuthCode = ExternalEntryFlowContract$State.NotSupported.f106546a;
        }
        this.H = getAuthCode;
    }

    public static String R2(RevolutAccount revolutAccount) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String str = ((RevolutAccountImpl) revolutAccount).f106157a;
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return new String(bArrDigest, charset);
    }

    @Override // iki.b, yji.l
    public final void I1() {
        super.I1();
        if (!((Boolean) this.F.getValue()).booleanValue() || (A2().f98430b instanceof ExternalEntryFlowContract$Step.NotSupported)) {
            String simpleName = a.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.b(rd0.c.WARNING, simpleName, "ExternalEntryFlow won't be launched!\nHave you enabled RevolutSsoSdkNativeFlowEnabled feature toggle?", null, null, 16);
            this.A.a(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S2(gim.c r5) throws java.security.NoSuchAlgorithmException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zml.e
            if (r0 == 0) goto L13
            r0 = r5
            zml.e r0 = (zml.e) r0
            int r1 = r0.f323621w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f323621w = r1
            goto L18
        L13:
            zml.e r0 = new zml.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f323621w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            cjl.b r5 = cjl.b.RETAIL
            r0.f323621w = r3
            uil.a r2 = r4.D
            pjl.z0 r2 = (pjl.z0) r2
            java.lang.Object r5 = r2.i(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            if (r0 == 0) goto L7b
            r1 = 0
            if (r0 == r3) goto L54
            com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$Step$ChooseAccount r5 = com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$Step.ChooseAccount.f106547a
            com.revolut.kompot.navigable.TransitionAnimation$FADE r0 = com.revolut.kompot.navigable.TransitionAnimation.FADE.f98392a
            r4.E2(r5, r1, r0, r1)
            goto L8f
        L54:
            java.lang.Object r5 = zhm.d0.b0(r5)
            com.revolut.sso.api.models.RevolutAccountSession r5 = (com.revolut.sso.api.models.RevolutAccountSession) r5
            com.revolut.sso.api.accounts.RevolutAccount r0 = r5.f105973a
            java.lang.String r0 = R2(r0)
            com.revolut.kompot.navigable.flow.FlowStateWrapper r2 = r4.A2()
            com.revolut.kompot.navigable.flow.FlowState r2 = r2.f98429a
            java.lang.String r3 = "null cannot be cast to non-null type com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract.State.GetAuthCode"
            kotlin.jvm.internal.Intrinsics.i(r2, r3)
            com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$State$GetAuthCode r2 = (com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$State.GetAuthCode) r2
            com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$State$GetAuthCode r2 = new com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$State$GetAuthCode
            r2.<init>(r0)
            r4.L2(r2)
            com.revolut.kompot.navigable.TransitionAnimation$FADE r0 = com.revolut.kompot.navigable.TransitionAnimation.FADE.f98392a
            r4.U2(r5, r1, r0)
            goto L8f
        L7b:
            com.revolut.sso.impl.ui.external_entry.external_entry.b r5 = r4.B
            com.revolut.sso.impl.ui.external_entry.external_entry.c r5 = (com.revolut.sso.impl.ui.external_entry.external_entry.c) r5
            r5.getClass()
            r5 = 5003(0x138b, float:7.01E-42)
            zml.h r5 = com.revolut.sso.impl.ui.external_entry.external_entry.c.a(r5)
            zml.g r0 = r4.A
            android.os.Bundle r5 = r5.f323625a
            r0.a(r5)
        L8f:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.external_entry.external_entry.a.S2(gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (A2().f98430b instanceof ExternalEntryFlowContract$Step.Loading) {
            n2(new yzb.c(this, null, 29), new whi.b(6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T2(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zml.f
            if (r0 == 0) goto L13
            r0 = r6
            zml.f r0 = (zml.f) r0
            int r1 = r0.f323623x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f323623x = r1
            goto L18
        L13:
            zml.f r0 = new zml.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f323623x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            cjl.b r6 = cjl.b.RETAIL
            r0.u = r5
            r0.f323623x = r3
            uil.a r2 = r4.D
            pjl.z0 r2 = (pjl.z0) r2
            java.lang.Object r6 = r2.i(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L4b:
            boolean r0 = r6.hasNext()
            r1 = 0
            if (r0 == 0) goto L66
            java.lang.Object r0 = r6.next()
            r2 = r0
            com.revolut.sso.api.models.RevolutAccountSession r2 = (com.revolut.sso.api.models.RevolutAccountSession) r2
            com.revolut.sso.api.accounts.RevolutAccount r2 = r2.f105973a
            java.lang.String r2 = R2(r2)
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L4b
            goto L67
        L66:
            r0 = r1
        L67:
            com.revolut.sso.api.models.RevolutAccountSession r0 = (com.revolut.sso.api.models.RevolutAccountSession) r0
            if (r0 != 0) goto L8f
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            java.lang.String r0 = "No account of the provided session"
            java.lang.String r2 = "Revolut SSO"
            rd0.d.a(r6, r2, r0, r1, r5)
            com.revolut.sso.impl.ui.external_entry.external_entry.b r5 = r4.B
            com.revolut.sso.impl.ui.external_entry.external_entry.c r5 = (com.revolut.sso.impl.ui.external_entry.external_entry.c) r5
            r5.getClass()
            r5 = 5001(0x1389, float:7.008E-42)
            zml.h r5 = com.revolut.sso.impl.ui.external_entry.external_entry.c.a(r5)
            zml.g r6 = r4.A
            android.os.Bundle r5 = r5.f323625a
            r6.a(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L8f:
            r5 = 0
            com.revolut.kompot.navigable.TransitionAnimation$FADE r6 = com.revolut.kompot.navigable.TransitionAnimation.FADE.f98392a
            r4.U2(r0, r5, r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.sso.impl.ui.external_entry.external_entry.a.T2(java.lang.String, gim.c):java.lang.Object");
    }

    public final void U2(RevolutAccountSession revolutAccountSession, boolean z, TransitionAnimation.FADE fade) {
        ExternalEntryFlowContract$InputData.FlowToLaunch flowToLaunch = this.z.f106540a;
        if (flowToLaunch instanceof ExternalEntryFlowContract$InputData.FlowToLaunch.GetAuthCode) {
            ExternalEntryFlowContract$InputData.FlowToLaunch.GetAuthCode getAuthCode = (ExternalEntryFlowContract$InputData.FlowToLaunch.GetAuthCode) flowToLaunch;
            E2(new ExternalEntryFlowContract$Step.GetAuthCode(getAuthCode.f106541a, getAuthCode.f106542b, getAuthCode.f106543c, revolutAccountSession, getAuthCode.d), z, fade, false);
        } else {
            if (!(flowToLaunch instanceof ExternalEntryFlowContract$InputData.FlowToLaunch.NotSupported)) {
                throw new NoWhenBranchMatchedException();
            }
            this.A.a(null);
        }
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        X1(new y0(null, new z(new TextLocalisedClause(R$string.revolut_sso_login_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_error_generic_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
        return true;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        ExternalEntryFlowContract$Step step = (ExternalEntryFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ExternalEntryFlowContract$Step.Loading) {
            return new LayoutViewerScreen(R$layout.screen_transparent);
        }
        if (step instanceof ExternalEntryFlowContract$Step.ChooseAccount) {
            ChooseAccountScreen chooseAccountScreen = new ChooseAccountScreen();
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: zml.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.sso.impl.ui.external_entry.external_entry.a f323620b;

                {
                    this.f323620b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) throws NoSuchAlgorithmException {
                    Object iVar;
                    switch (i) {
                        case 0:
                            com.revolut.sso.impl.ui.external_entry.external_entry.a aVar = this.f323620b;
                            g gVar = aVar.A;
                            anl.e result = (anl.e) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof anl.d) {
                                RevolutAccountSession revolutAccountSession = ((anl.d) result).f7809a;
                                String strR2 = com.revolut.sso.impl.ui.external_entry.external_entry.a.R2(revolutAccountSession.f105973a);
                                FlowState flowState = aVar.A2().f98429a;
                                Intrinsics.i(flowState, "null cannot be cast to non-null type com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract.State.GetAuthCode");
                                aVar.L2(new ExternalEntryFlowContract$State.GetAuthCode(strR2));
                                aVar.U2(revolutAccountSession, true, null);
                            } else if (result instanceof e.a) {
                                gVar.a(null);
                            } else {
                                if (!(result instanceof e.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ((com.revolut.sso.impl.ui.external_entry.external_entry.c) aVar.B).getClass();
                                gVar.a(com.revolut.sso.impl.ui.external_entry.external_entry.c.a(5003).f323625a);
                            }
                            return Unit.f186387a;
                        default:
                            t outputData = (t) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "result");
                            com.revolut.sso.impl.ui.external_entry.external_entry.a aVar2 = this.f323620b;
                            com.revolut.sso.impl.ui.external_entry.external_entry.b bVar = aVar2.B;
                            g gVar2 = aVar2.A;
                            FlowState flowState2 = aVar2.A2().f98429a;
                            Intrinsics.i(flowState2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract.State.GetAuthCode");
                            ExternalEntryFlowContract$State.GetAuthCode state = (ExternalEntryFlowContract$State.GetAuthCode) flowState2;
                            String str = state.f106545a;
                            ((com.revolut.sso.impl.ui.external_entry.external_entry.c) bVar).getClass();
                            Intrinsics.checkNotNullParameter(state, "state");
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof r) {
                                iVar = com.revolut.sso.impl.ui.external_entry.external_entry.c.a(5002);
                            } else {
                                if (!(outputData instanceof s)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (str == null) {
                                    iVar = com.revolut.sso.impl.ui.external_entry.external_entry.c.a(5001);
                                } else {
                                    Bundle bundle = new Bundle();
                                    s sVar = (s) outputData;
                                    bundle.putString("EXTRA_KEY_AUTH_CODE", sVar.f16186a);
                                    bundle.putString("EXTRA_KEY_AUTH_STATE", sVar.f16187b);
                                    bundle.putString("EXTRA_KEY_SESSION_ID", str);
                                    iVar = new i(bundle);
                                }
                            }
                            if (iVar instanceof h) {
                                gVar2.a(((h) iVar).f323625a);
                            } else {
                                if (!(iVar instanceof i)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Bundle result2 = ((i) iVar).f323626a;
                                gVar2.getClass();
                                Intrinsics.checkNotNullParameter(result2, "result");
                                Intent intent = new Intent();
                                intent.putExtras(result2);
                                BaseFlow baseFlow = gVar2.f323624a;
                                baseFlow.m2().setResult(-1, intent);
                                baseFlow.m2().finish();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            chooseAccountScreen.H = function1;
            return chooseAccountScreen;
        }
        if (!(step instanceof ExternalEntryFlowContract$Step.GetAuthCode)) {
            if (step instanceof ExternalEntryFlowContract$Step.NotSupported) {
                return new LayoutViewerScreen(R$layout.screen_transparent);
            }
            throw new NoWhenBranchMatchedException();
        }
        ExternalEntryFlowContract$Step.GetAuthCode getAuthCode = (ExternalEntryFlowContract$Step.GetAuthCode) step;
        String str = getAuthCode.f106548a;
        String str2 = getAuthCode.f106549b;
        List list = getAuthCode.f106550c;
        RevolutAccountSession revolutAccountSession = getAuthCode.d;
        String str3 = getAuthCode.e;
        RevolutSsoApi$InputData$ExternalClientAuthentication input = new RevolutSsoApi$InputData$ExternalClientAuthentication(revolutAccountSession, str2, list, str3);
        com.google.gson.internal.d codeChallengeGenerator = new com.google.gson.internal.d(str, 9);
        UICustomization uiCustomization = new UICustomization(null, null, 31);
        nkl.b bVar = this.C;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(codeChallengeGenerator, "codeChallengeGenerator");
        bVar.f216818a.c(new xil.e(0));
        Intrinsics.checkNotNullParameter(input, "<this>");
        AuthenticationFlow authenticationFlow = new AuthenticationFlow(new AuthenticationFlowContract$InputData.ExternalClientAuthentication(revolutAccountSession, str2, list, str3), codeChallengeGenerator, uiCustomization);
        final int i2 = 1;
        Function1 block = new Function1(this) { // from class: zml.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.sso.impl.ui.external_entry.external_entry.a f323620b;

            {
                this.f323620b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) throws NoSuchAlgorithmException {
                Object iVar;
                switch (i2) {
                    case 0:
                        com.revolut.sso.impl.ui.external_entry.external_entry.a aVar = this.f323620b;
                        g gVar = aVar.A;
                        anl.e result = (anl.e) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result instanceof anl.d) {
                            RevolutAccountSession revolutAccountSession2 = ((anl.d) result).f7809a;
                            String strR2 = com.revolut.sso.impl.ui.external_entry.external_entry.a.R2(revolutAccountSession2.f105973a);
                            FlowState flowState = aVar.A2().f98429a;
                            Intrinsics.i(flowState, "null cannot be cast to non-null type com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract.State.GetAuthCode");
                            aVar.L2(new ExternalEntryFlowContract$State.GetAuthCode(strR2));
                            aVar.U2(revolutAccountSession2, true, null);
                        } else if (result instanceof e.a) {
                            gVar.a(null);
                        } else {
                            if (!(result instanceof e.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ((com.revolut.sso.impl.ui.external_entry.external_entry.c) aVar.B).getClass();
                            gVar.a(com.revolut.sso.impl.ui.external_entry.external_entry.c.a(5003).f323625a);
                        }
                        return Unit.f186387a;
                    default:
                        t outputData = (t) obj2;
                        Intrinsics.checkNotNullParameter(outputData, "result");
                        com.revolut.sso.impl.ui.external_entry.external_entry.a aVar2 = this.f323620b;
                        com.revolut.sso.impl.ui.external_entry.external_entry.b bVar2 = aVar2.B;
                        g gVar2 = aVar2.A;
                        FlowState flowState2 = aVar2.A2().f98429a;
                        Intrinsics.i(flowState2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract.State.GetAuthCode");
                        ExternalEntryFlowContract$State.GetAuthCode state = (ExternalEntryFlowContract$State.GetAuthCode) flowState2;
                        String str4 = state.f106545a;
                        ((com.revolut.sso.impl.ui.external_entry.external_entry.c) bVar2).getClass();
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        if (outputData instanceof r) {
                            iVar = com.revolut.sso.impl.ui.external_entry.external_entry.c.a(5002);
                        } else {
                            if (!(outputData instanceof s)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (str4 == null) {
                                iVar = com.revolut.sso.impl.ui.external_entry.external_entry.c.a(5001);
                            } else {
                                Bundle bundle = new Bundle();
                                s sVar = (s) outputData;
                                bundle.putString("EXTRA_KEY_AUTH_CODE", sVar.f16186a);
                                bundle.putString("EXTRA_KEY_AUTH_STATE", sVar.f16187b);
                                bundle.putString("EXTRA_KEY_SESSION_ID", str4);
                                iVar = new i(bundle);
                            }
                        }
                        if (iVar instanceof h) {
                            gVar2.a(((h) iVar).f323625a);
                        } else {
                            if (!(iVar instanceof i)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Bundle result2 = ((i) iVar).f323626a;
                            gVar2.getClass();
                            Intrinsics.checkNotNullParameter(result2, "result");
                            Intent intent = new Intent();
                            intent.putExtras(result2);
                            BaseFlow baseFlow = gVar2.f323624a;
                            baseFlow.m2().setResult(-1, intent);
                            baseFlow.m2().finish();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block, "block");
        authenticationFlow.H = block;
        return authenticationFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.H;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.G;
    }
}
