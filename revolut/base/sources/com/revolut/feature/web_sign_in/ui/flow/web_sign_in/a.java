package com.revolut.feature.web_sign_in.ui.flow.web_sign_in;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.barcode.kompot.ui.BarcodeScreen;
import com.revolut.feature.barcode.kompot.ui.BarcodeScreenContract$ActionButtonConfig;
import com.revolut.feature.barcode.kompot.ui.BarcodeScreenContract$InputData;
import com.revolut.feature.barcode.kompot.ui.BarcodeScreenContract$NavBarConfig;
import com.revolut.feature.web_sign_in.R$layout;
import com.revolut.feature.web_sign_in.navigation.WebSignInDestinationInput;
import com.revolut.feature.web_sign_in.ui.flow.web_sign_in.WebSignInFlowContract$Step;
import com.revolut.feature.web_sign_in.ui.screen.confirmation.WebSignInConfirmationScreen;
import com.revolut.feature.web_sign_in.ui.screen.confirmation.WebSignInConfirmationScreenContract$InputData;
import com.revolut.feature.web_sign_in.ui.screen.promo.WebSignInPromoScreen;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.api.R$string;
import efm.c0;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import pfm.t;
import prh.h;
import prh.i;
import rd0.d;
import rfm.l;
import skm.p0;
import te0.w;
import ufm.n;
import vkm.j2;
import vkm.q;
import vrh.b;
import vrh.e;
import vrh.f;
import xjl.p;
import xjl.r;
import xjl.s;
import xq2.c;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends aji.a implements b {

    @NotNull
    public static final f Companion = new f();
    public final WebSignInFlowContract$Step A;
    public final WebSignInFlowContract$State B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r f96339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f96340y;
    public final j2 z;

    public a(WebSignInDestinationInput input, r webSignInInteractor, s webSignInUiFactory) {
        WebSignInFlowContract$Step loading;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(webSignInInteractor, "webSignInInteractor");
        Intrinsics.checkNotNullParameter(webSignInUiFactory, "webSignInUiFactory");
        this.f96339x = webSignInInteractor;
        this.f96340y = new i(new h(6, new TextLocalisedClause(R$string.revolut_sso_login_confirmation_success, null, null, 14), null), new h(2, new TextLocalisedClause(R$string.revolut_sso_login_confirmation_timeout_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_confirmation_timeout_button, null, null, 14)), new h(2, new TextLocalisedClause(R$string.revolut_sso_login_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_confirmation_timeout_button, null, null, 14)), new h(2, new TextLocalisedClause(R$string.revolut_sso_login_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_confirmation_timeout_button, null, null, 14)));
        this.z = q.c(c.a.f308054a);
        WebSignInDestinationInput.LaunchMode launchMode = input.f96326a;
        if (launchMode instanceof WebSignInDestinationInput.LaunchMode.Confirm) {
            loading = new WebSignInFlowContract$Step.Loading(((WebSignInDestinationInput.LaunchMode.Confirm) launchMode).f96327a, true);
        } else {
            if (!(launchMode instanceof WebSignInDestinationInput.LaunchMode.ScanAndConfirm)) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalStateException illegalStateException = new IllegalStateException("Promo is not supported here");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            rd0.c cVar = rd0.c.ERROR;
            d.a(cVar, null, null, illegalStateException, h0Var);
            d.a(cVar, null, null, new IllegalStateException("Promo is not supported here"), h0Var);
            loading = WebSignInFlowContract$Step.Promo.f96337a;
        }
        this.A = loading;
        this.B = new WebSignInFlowContract$State(null);
    }

    public static boolean U2(Throwable th10) {
        boolean z = th10 instanceof ServerErrorException;
        if (z) {
            ServerErrorException serverErrorException = (ServerErrorException) th10;
            if (serverErrorException.e == 422 || serverErrorException.f.f51362a == 1003) {
                return true;
            }
        }
        if (!z) {
            return false;
        }
        ServerErrorException serverErrorException2 = (ServerErrorException) th10;
        return serverErrorException2.e == 401 && serverErrorException2.f.f51362a == 9001;
    }

    public final void P2(String token) {
        r rVar = this.f96339x;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(token, "token");
        pfm.h hVarN = pd.b.n(p0.f264003c, new p(rVar, token, null, 0));
        vpg.b bVar = new vpg.b(24, new vrh.c(this, 1));
        dfm.c cVar = mfm.f.d;
        en.a aVar = mfm.f.f205043c;
        t tVar = new t(hVarN, bVar, cVar, aVar, aVar, aVar, aVar);
        Intrinsics.checkNotNullExpressionValue(tVar, "doOnSubscribe(...)");
        y0(tVar, false, new vrh.d(this, 2), new vrh.c(this, 2));
    }

    public final pfm.a Q2(String token) {
        r rVar = this.f96339x;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(token, "token");
        l lVar = new l(new ufm.f(w.o0(p0.f264003c, new xjl.q(rVar, token, null)), new vpg.b(28, new vrh.c(this, 11)), 2), new e(this, 3), 5);
        c0 c0Var = hfm.c.f152030a;
        m70.a.p(c0Var);
        n nVarN = lVar.n(c0Var);
        int i = 29;
        pfm.a aVar = new pfm.a(nVarN, new vpg.b(i, new vgk.f(this, token, i)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return ue0.e.w(aVar, new vrh.c(this, 12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
    
        if (nim.a.a(r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R2(xq2.a r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vrh.g
            if (r0 == 0) goto L13
            r0 = r8
            vrh.g r0 = (vrh.g) r0
            int r1 = r0.f291606x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291606x = r1
            goto L18
        L13:
            vrh.g r0 = new vrh.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291606x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r8)
            goto Lb3
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            xq2.a r7 = r0.u
            yhm.o.b(r8)
            goto L50
        L3a:
            yhm.o.b(r8)
            r0.u = r7
            r0.f291606x = r5
            vkm.j2 r8 = r6.z
            r8.getClass()
            xq2.c$d r2 = xq2.c.d.f308056a
            r8.g(r3, r2)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            if (r8 != r1) goto L50
            goto Lb2
        L50:
            r8 = 0
            r6.d0(r5, r8)
            java.lang.String r7 = r7.f308049a
            xjl.r r7 = r6.f96339x
            r7.getClass()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r2 = "Handling QR code is not supported here"
            r7.<init>(r2)
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r5 = rd0.d.f253311a
            rd0.c r5 = rd0.c.ERROR
            rd0.d.a(r5, r3, r3, r7, r2)
            od0.h r7 = od0.i.Companion
            r7.getClass()
            od0.i r7 = od0.i.f224256b
            ufm.b r7 = efm.d0.m(r7)
            java.lang.String r2 = "just(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            vrh.e r2 = new vrh.e
            r2.<init>(r6, r8)
            rfm.l r8 = new rfm.l
            r5 = 5
            r8.<init>(r7, r2, r5)
            efm.c0 r7 = hfm.c.f152030a
            m70.a.p(r7)
            ufm.n r7 = r8.n(r7)
            vrh.c r8 = new vrh.c
            r2 = 8
            r8.<init>(r6, r2)
            vpg.b r2 = new vpg.b
            r5 = 26
            r2.<init>(r5, r8)
            pfm.a r8 = new pfm.a
            r5 = 4
            r8.<init>(r7, r2, r5)
            java.lang.String r7 = "flatMapCompletable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            r0.u = r3
            r0.f291606x = r4
            java.lang.Object r7 = nim.a.a(r8, r0)
            if (r7 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.web_sign_in.ui.flow.web_sign_in.a.R2(xq2.a, gim.c):java.lang.Object");
    }

    public final t S2() {
        t tVarL = new pfm.h(new e(this, 1), 2).k(5000L, TimeUnit.MILLISECONDS, hhm.f.f152430b).l(new e(this, 2));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return tVarL;
    }

    public final void T2(Throwable th10) {
        if (th10 instanceof ServerErrorException) {
            ServerErrorException serverErrorException = (ServerErrorException) th10;
            if (serverErrorException.e == 401 && serverErrorException.f.f51362a == 1003) {
                vrh.d dVar = new vrh.d(this, 0);
                this.f96340y.getClass();
                V2(dVar);
                return;
            }
        }
        if (U2(th10)) {
            V2(new vrh.d(this, 1));
        } else {
            W2();
        }
    }

    public final void V2(Function0 function0) {
        h hVar = this.f96340y.f239028b;
        zii.i.t(this, O2(new y0(null, new z(hVar.f239025a, null, hVar.f239026b, null, null, null, true, null, null, null, null, null, null, 32502), false, 5)), new ac1.b(21, function0), null, 14);
    }

    public final void W2() {
        h hVar = this.f96340y.d;
        zii.i.t(this, O2(new y0(null, new z(hVar.f239025a, null, hVar.f239026b, null, null, null, true, null, null, null, null, null, null, 32500), false, 5)), new vrh.c(this, 7), null, 14);
    }

    public final void X2() {
        zii.i.t(this, O2(new y0(null, new nii.c0(null, null, null, true, null, false, false, null, 1903), false, 5)), null, null, 15);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        WebSignInFlowContract$Step step = (WebSignInFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof WebSignInFlowContract$Step.Promo) {
            WebSignInPromoScreen webSignInPromoScreen = new WebSignInPromoScreen();
            vrh.c cVar = new vrh.c(this, 10);
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            webSignInPromoScreen.H = cVar;
            return webSignInPromoScreen;
        }
        if (step instanceof WebSignInFlowContract$Step.Permissions) {
            throw new IllegalArgumentException("Permissions promo screen shouldn't be launched at this point. Please, fix your flow setup");
        }
        if (step instanceof WebSignInFlowContract$Step.Scanner) {
            dr2.e eVar = dr2.e.TillFinish;
            AnalyticsProduct.Shared.Onboarding onboarding = AnalyticsProduct.Shared.Onboarding.f;
            return new BarcodeScreen(new BarcodeScreenContract$InputData(BarcodeScreenContract$NavBarConfig.Hidden.f64124a, BarcodeScreenContract$ActionButtonConfig.Hidden.f64117a, eVar, onboarding));
        }
        if (step instanceof WebSignInFlowContract$Step.Loading) {
            WebSignInFlowContract$Step.Loading loading = (WebSignInFlowContract$Step.Loading) step;
            boolean z = loading.f96335b;
            String str = loading.f96334a;
            if (z) {
                zii.i.G(this, Q2(str), null, new vrh.c(this, 4), 2);
            } else {
                P2(str);
            }
            return new LayoutViewerScreen(R$layout.screen_web_sign_in_empty);
        }
        if (!(step instanceof WebSignInFlowContract$Step.Confirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        WebSignInFlowContract$Step.Confirmation confirmation = (WebSignInFlowContract$Step.Confirmation) step;
        String str2 = confirmation.f96331a;
        Long l2 = confirmation.f96333c;
        String str3 = confirmation.d;
        WebSignInConfirmationScreen webSignInConfirmationScreen = new WebSignInConfirmationScreen(new WebSignInConfirmationScreenContract$InputData(confirmation.e, l2, str2, confirmation.f96332b, str3));
        vrh.c cVar2 = new vrh.c(this, 0);
        Intrinsics.checkNotNullParameter(cVar2, "<set-?>");
        webSignInConfirmationScreen.H = cVar2;
        return webSignInConfirmationScreen;
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
