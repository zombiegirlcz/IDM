package com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation;

import ang.f;
import ce9.m;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.views.CardPersonalisationView;
import com.revolut.data.model.Data;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationControllerContract$ModalStep;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.a;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mx0.u2;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import x23.i;
import x23.j;
import x23.p;
import x23.r;
import x23.t;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends h implements i {

    @NotNull
    public static final r Companion = new r();
    public final CardPersonalisationControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n60.b f65172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n60.a f65173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r70.c f65174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f65175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z43.a f65176t;
    public final f u;
    public final hy2.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a53.a f65177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f65178x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f65179y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public c(n stateMapper, CardPersonalisationControllerContract$InputData inputData, n60.b keyboardViewControllerExtension, n60.a keyboardControllerExtension, r70.c hapticEngine, p cardPersonalisationControllerExtension, z43.a cardPersonalisationInteractor, f userInteractor, hy2.f cardDesignInteractor, a53.a customisationImageGenerationInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(keyboardViewControllerExtension, "keyboardViewControllerExtension");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(cardPersonalisationControllerExtension, "cardPersonalisationControllerExtension");
        Intrinsics.checkNotNullParameter(cardPersonalisationInteractor, "cardPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(customisationImageGenerationInteractor, "customisationImageGenerationInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f65172p = keyboardViewControllerExtension;
        this.f65173q = keyboardControllerExtension;
        this.f65174r = hapticEngine;
        this.f65175s = cardPersonalisationControllerExtension;
        this.f65176t = cardPersonalisationInteractor;
        this.u = userInteractor;
        this.v = cardDesignInteractor;
        this.f65177w = customisationImageGenerationInteractor;
        this.f65178x = featureToggleInteractor;
        this.f65179y = d.b(this, new j(new Data(null, null, true, 3, null), inputData.f65159a, inputData.f65161c, (inputData.e == null || m.w(inputData.d.f22270b)) ? new Data(inputData.f65159a.d, null, false, 6, null) : new Data(null, null, true, 3, null), true, inputData.f65160b, false, false, false, ((CardPersonalisationController) cardPersonalisationControllerExtension.f302493a).d3().f211227c.getSupportedFonts(), null, null), stateMapper, null, false, 12);
        this.z = e.a(this, new wtj.c(this, 28));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (nim.a.a(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof x23.u
            if (r0 == 0) goto L13
            r0 = r7
            x23.u r0 = (x23.u) r0
            int r1 = r0.f302497w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302497w = r1
            goto L18
        L13:
            x23.u r0 = new x23.u
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302497w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L89
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L48
        L36:
            yhm.o.b(r7)
            x23.p r7 = r6.f65175s
            r0.f302497w = r4
            x23.o r7 = r7.f302493a
            com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController r7 = (com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController) r7
            java.lang.Object r7 = r7.f3(r0)
            if (r7 != r1) goto L48
            goto L88
        L48:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            z43.a r2 = r6.f65176t
            n53.b r2 = (n53.b) r2
            r2.getClass()
            java.lang.String r4 = "bitmap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            o53.b r2 = r2.f212540a
            r2.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            ne0.o r4 = new ne0.o
            r5 = 12
            r4.<init>(r2, r7, r5)
            pfm.h r7 = new pfm.h
            r2 = 2
            r7.<init>(r4, r2)
            java.lang.String r2 = "fromAction(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            efm.c0 r2 = hhm.f.f152430b
            pfm.r r7 = r7.y(r2)
            java.lang.String r2 = "subscribeOn(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.f302497w = r3
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L89
        L88:
            return r1
        L89:
            a53.a r7 = r6.f65177w
            f53.b r7 = (f53.b) r7
            h53.a r7 = r7.f132263a
            h53.c r7 = (h53.c) r7
            ue0.c r7 = r7.e
            r7.clear()
            x23.k r7 = new x23.k
            cli.y r0 = r6.f65179y
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            x23.j r0 = (x23.j) r0
            com.revolut.data.model.Data r0 = r0.d
            java.lang.Object r0 = r0.getContent()
            c93.j r0 = (c93.j) r0
            r7.<init>(r0)
            r6.C2(r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c.I2(com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof x23.v
            if (r0 == 0) goto L14
            r0 = r9
            x23.v r0 = (x23.v) r0
            int r1 = r0.f302498w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f302498w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            x23.v r0 = new x23.v
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f302498w
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            yhm.o.b(r9)
            r1 = r8
            goto L68
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            yhm.o.b(r9)
            goto L4b
        L39:
            yhm.o.b(r9)
            x23.p r9 = r8.f65175s
            r6.f302498w = r3
            x23.o r9 = r9.f302493a
            com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController r9 = (com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController) r9
            java.lang.Object r9 = r9.f3(r6)
            if (r9 != r0) goto L4b
            goto L67
        L4b:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            up4.h r4 = new up4.h
            r1 = 11
            r4.<init>(r1)
            w64.d r5 = new w64.d
            r1 = 21
            r3 = 0
            r5.<init>(r8, r9, r3, r1)
            r6.f302498w = r2
            r2 = 0
            r7 = 3
            r1 = r8
            java.lang.Object r9 = n14.k.V(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L68
        L67:
            return r0
        L68:
            nii.h r9 = (nii.h) r9
            boolean r8 = r9 instanceof nii.g
            if (r8 == 0) goto L8a
            x23.k r8 = new x23.k
            cli.y r9 = r1.f65179y
            java.lang.Object r9 = r9.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            x23.j r9 = (x23.j) r9
            com.revolut.data.model.Data r9 = r9.d
            java.lang.Object r9 = r9.getContent()
            c93.j r9 = (c93.j) r9
            r8.<init>(r9)
            r1.C2(r8)
        L8a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c.J2(com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        c cVar;
        pi3.h hVar;
        String str;
        CardPersonalisationControllerContract$InputData cardPersonalisationControllerContract$InputData = this.o;
        Continuation continuation = null;
        if (m.w(cardPersonalisationControllerContract$InputData.d.f22270b) || (hVar = cardPersonalisationControllerContract$InputData.e) == null) {
            cVar = this;
        } else {
            b93.b bVarC = cardPersonalisationControllerContract$InputData.d.f22270b.c();
            String str2 = hVar.f236404a.f152287a;
            AccountId accountId = cardPersonalisationControllerContract$InputData.f;
            if (!(accountId instanceof AccountId.Joint)) {
                accountId = null;
            }
            AccountId.Joint joint = (AccountId.Joint) accountId;
            if (joint == null || (str = joint.f51413b) == null) {
                str = cardPersonalisationControllerContract$InputData.f65162g;
            }
            cVar = this;
            l.a1(cVar, rd0.e.b(this.v.h(bVarC, str2, str)), null, null, new t(this, continuation, 0), 3);
        }
        l.a1(cVar, cVar.u.j(w4l.h.f294642c), null, null, new t(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    public final void K2() {
        H2(this.f65179y, new x1.n(23));
        CardPersonalisationView cardPersonalisationView = ((CardPersonalisationController) this.f65175s.f302493a).d3().f211227c;
        cardPersonalisationView.post(new u2(cardPersonalisationView, 0));
    }

    public final void L2() {
        y yVar = this.f65179y;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        if (((j) j2Var.getValue()).f302479h) {
            this.f65173q.R();
            return;
        }
        if (((j) j2Var2.getValue()).e && ((j) j2Var2.getValue()).f302478g) {
            h.v2(this.z, CardPersonalisationControllerContract$ModalStep.ConfirmExit.f65164a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (((j) j2Var2.getValue()).e) {
            C2(a.C0463a.f65170a);
        } else {
            K2();
        }
    }

    public final void M2() {
        if (((j) ((j2) this.f65179y.f22677a).getValue()).f302478g) {
            if (((jte.d) this.f65178x).c(CardsCoreApi$Toggles.SkippableCardCustomisation.f65572c)) {
                h.v2(this.z, CardPersonalisationControllerContract$ModalStep.ConfirmSkip.f65165a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return;
            }
        }
        l2(new b(this, null), new yi5.b(26));
    }

    public final void N2(ty0.a click) {
        Intrinsics.checkNotNullParameter(click, "click");
        String str = click.f275445a;
        boolean zF = Intrinsics.f(str, "START_OVER_LIST_ID");
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.z;
        if (zF) {
            h.v2(aVar, CardPersonalisationControllerContract$ModalStep.StartOver.f65169a, bottom_dialog);
        } else if (Intrinsics.f(str, "TEXT_GUIDELINES_LIST_ID")) {
            h.v2(aVar, new CardPersonalisationControllerContract$ModalStep.Guidelines(false), bottom_dialog);
        }
    }

    public final void O2(String fontId) {
        Intrinsics.checkNotNullParameter(fontId, "fontId");
        p pVar = this.f65175s;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(fontId, "fontId");
        CardPersonalisationController cardPersonalisationController = (CardPersonalisationController) pVar.f302493a;
        Intrinsics.checkNotNullParameter(fontId, "fontId");
        cardPersonalisationController.d3().f211227c.I0(fontId);
        H2(this.f65179y, new wsg.j(fontId, 11));
    }

    @Override // yji.l
    public final void T1(long j2) {
        efm.r rVarSkip = this.f65172p.d.skip(1000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarSkip, "skip(...)");
        l.b1(this, rd0.e.b(rVarSkip), null, new t(this, null, 2), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f65179y;
    }
}
