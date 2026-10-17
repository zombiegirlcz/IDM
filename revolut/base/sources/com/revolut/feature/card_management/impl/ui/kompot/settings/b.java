package com.revolut.feature.card_management.impl.ui.kompot.settings;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.card_contactless_limit.api.CardContactlessLimitFeatureConfig;
import com.revolut.feature.card_contactless_limit.api.Mode;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.FeatureCommand;
import e7l.g;
import f73.c;
import ha3.x;
import hx7.e;
import i4b.f;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.j0;
import nii.u1;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pqc.k;
import pyc.p;
import q03.h0;
import q03.i;
import q03.i0;
import q03.n0;
import q03.o0;
import rp0.g1;
import te0.w;
import u03.d;
import u03.j;
import vkm.q;
import vkm.v1;
import wtc.a1;
import wtc.y0;
import yji.l;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements o0 {

    @NotNull
    public static final i Companion = new i();
    public final gte.a A;
    public final g1 B;
    public final f C;
    public final Object D;
    public final y E;
    public final com.revolut.kompot.navigable.vc.modal.a F;
    public final RevolutCardSettingsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f64909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final az2.b f64910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f64911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n0 f64912s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s70.a f64913t;
    public final y43.a u;
    public final f03.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f64914w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l93.f f64915x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f64916y;
    public final sf0.h z;

    public b(n stateMapper, RevolutCardSettingsScreenContract$InputData inputData, j60.a bottomDialogView, az2.b terminateCardDialogProvider, j itemProvider, n0 presentationModel, s70.a intentProvider, y43.a cardPaymentMethodWidget, f03.a cardSettingsExtension, d replaceRevolutCardDialogProvider, l93.f revolutCardsInteractor, c navigationFactory, sf0.h serverErrorParser, gte.a featureToggleInteractor, g1 shotDialogDisplayer, f legalEntityContextProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialogView, "bottomDialogView");
        Intrinsics.checkNotNullParameter(terminateCardDialogProvider, "terminateCardDialogProvider");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(cardPaymentMethodWidget, "cardPaymentMethodWidget");
        Intrinsics.checkNotNullParameter(cardSettingsExtension, "cardSettingsExtension");
        Intrinsics.checkNotNullParameter(replaceRevolutCardDialogProvider, "replaceRevolutCardDialogProvider");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(navigationFactory, "navigationFactory");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        this.o = inputData;
        this.f64909p = bottomDialogView;
        this.f64910q = terminateCardDialogProvider;
        this.f64911r = itemProvider;
        this.f64912s = presentationModel;
        this.f64913t = intentProvider;
        this.u = cardPaymentMethodWidget;
        this.v = cardSettingsExtension;
        this.f64914w = replaceRevolutCardDialogProvider;
        this.f64915x = revolutCardsInteractor;
        this.f64916y = navigationFactory;
        this.z = serverErrorParser;
        this.A = featureToggleInteractor;
        this.B = shotDialogDisplayer;
        this.C = legalEntityContextProvider;
        this.D = w.y0(new pyc.a(this, 4));
        this.E = mra.d.b(this, new i0(inputData.f64900a, inputData.f64901b, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.d), stateMapper, null, false, 12);
        this.F = e.a(this, new pu4.d(this, 17));
    }

    @Override // yji.l
    public final void I1() {
        h0 h0Var = (h0) this.f64912s;
        l93.f fVar = h0Var.f241073b;
        RevolutCardSettingsScreenContract$InputData revolutCardSettingsScreenContract$InputData = h0Var.f241072a;
        vkm.d dVarB = rd0.e.b(((x) fVar).v(revolutCardSettingsScreenContract$InputData.f64900a));
        vkm.d dVarB2 = rd0.e.b(nim.a.w(h0Var.f241074c.a(false), new p(28)));
        vkm.d dVarB3 = rd0.e.b(((ik3.c) h0Var.d).k(g.b.f123407a));
        Flow flowI = c6d.b.i(rd0.e.b(((x) h0Var.f241073b).v(revolutCardSettingsScreenContract$InputData.f64900a)), new q03.h(h0Var, 1));
        w4l.f fVar2 = h0Var.e.f150398a.d;
        Unit unit = Unit.f186387a;
        vkm.d dVarB4 = rd0.e.b(ue0.e.E(fVar2.f(unit, true), new Data(f0.f322471a, null, false, 6, null)));
        vkm.d dVarB5 = rd0.e.b(ue0.e.E(nim.a.w(h0Var.i.j0(false, true), new p(25)), new Data(Integer.MAX_VALUE, null, false, 6, null)));
        olf.e eVar = new olf.e(h0Var.f241077j.b3(), 21);
        a1 a1Var = (a1) ((ptc.a) h0Var.f241079m.f257630b);
        a1Var.getClass();
        Continuation continuation = null;
        l.a1(this, new t38.e(new olf.e(c6d.b.i(nim.a.u(new k(null, h0Var), u0.i(u0.i(dVarB, dVarB2, dVarB3), u0.i(flowI, dVarB4, dVarB5), u0.m(eVar, q.Q(new wtc.w(new v1(new y0(a1Var, null)), 0), new pkf.x(continuation, h0Var, 17))))), new q03.h(this, 0)), 20), 24, this.C.j(new md6.i(md6.h.DEBIT_CARD)), q03.q.f241098a), null, null, new k(this, continuation, 26), 3);
        l.b1(this, mo3.a.g(h0Var.k.f299872a.e.b(unit, w4l.i.f294643c), null, new pyb.g(16), 1), null, null, 7);
    }

    public final void I2(h93.f0 f0Var) {
        C1(u0.b(new FeatureCommand(new CardContactlessLimitFeatureConfig((Mode) new Mode.SingleCard(f0Var.f150110a, R$string.card_sca_limit_reset_tutorial_text_from_settings), R$string.card_sca_limit_reset_tutorial_title_from_settings, false, Integer.valueOf(R$string.card_sca_limit_reset_tutorial_reset_limit), false, false, 64))));
    }

    public final Unit J2(String str) {
        if (str == null) {
            return Unit.f186387a;
        }
        l.a1(this, X1(new nii.y0(null, new j0((Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 5)), null, null, null, 7);
        return Unit.f186387a;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (J2(r11) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(nii.b r10, java.lang.String r11, gim.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof q03.a0
            if (r0 == 0) goto L13
            r0 = r12
            q03.a0 r0 = (q03.a0) r0
            int r1 = r0.f241060x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241060x = r1
            goto L18
        L13:
            q03.a0 r0 = new q03.a0
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241060x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r12)
            goto L83
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            java.lang.String r11 = r0.u
            yhm.o.b(r12)
            goto L4e
        L39:
            yhm.o.b(r12)
            pmk.t r12 = new pmk.t
            r2 = 10
            r12.<init>(r9, r10, r5, r2)
            r0.u = r11
            r0.f241060x = r4
            java.lang.Object r12 = r9.p2(r0, r12)
            if (r12 != r1) goto L4e
            goto L65
        L4e:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
            if (r10 != 0) goto L59
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L59:
            if (r11 == 0) goto L66
            r0.u = r5
            r0.f241060x = r3
            kotlin.Unit r10 = r9.J2(r11)
            if (r10 != r1) goto L83
        L65:
            return r1
        L66:
            com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration$a r2 = com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration.INSTANCE
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r10 = com.revolut.feature.cards_core.R$string.card_terminate_confirm_terminate_success_toast
            r11 = 14
            r4.<init>(r10, r5, r5, r11)
            r7 = 0
            r8 = 60
            java.lang.String r3 = "TERMINATED_SHOT_ID"
            r5 = 0
            r6 = 0
            com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration r10 = com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration.Companion.f(r2, r3, r4, r5, r6, r7, r8)
            rp0.g1 r11 = r9.B
            rp0.k1 r11 = (rp0.k1) r11
            r11.d(r10)
        L83:
            q03.k0 r10 = q03.k0.f241086a
            r9.C2(r10)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_management.impl.ui.kompot.settings.b.K2(nii.b, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.E;
    }
}
