package com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen;

import android.os.Parcelable;
import avc.o;
import cli.n;
import cli.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.card_management.api.cardagreements.CardIssuanceAgreementControllerContract$InputData;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreenContract$ModalStep;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.revolut.feature_fourthline_impl.R;
import d73.u;
import efm.d0;
import g48.r0;
import h93.c0;
import ha3.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jx2.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import od0.i;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import qij.s;
import rp0.k1;
import rp0.t;
import t73.d3;
import t73.e1;
import t73.g1;
import t73.j1;
import t73.m1;
import t73.n1;
import t73.o1;
import t73.p0;
import t73.p1;
import t73.q0;
import t73.r1;
import t73.r2;
import t73.s1;
import t73.u2;
import t73.y1;
import te0.w;
import v73.r;
import vi9.e0;
import vkm.j2;
import vkm.q;
import wli.x;
import yji.l;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends h implements dli.b, g1 {

    @NotNull
    public static final n1 Companion = new n1();
    public final x63.a A;
    public final l93.f B;
    public final k C;
    public final hy2.f D;
    public final com.revolut.domain.interactors.transactions.a E;
    public final r0 F;
    public final k63.a G;
    public final v73.a H;
    public final v73.k I;
    public final r J;
    public final sh3.a K;
    public final az2.b L;
    public final t73.c M;
    public final u03.c N;
    public final gte.a O;
    public final zf8.k P;
    public final kd8.e Q;
    public final te8.e R;
    public final hj8.a S;
    public final x T;
    public final hvh.a U;
    public final jx2.a V;
    public final m W;
    public final u X;
    public final t73.b Y;
    public final zt2.c Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final sf0.h f65430a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final i4b.f f65431b0;
    public final b80.c c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ang.f f65432d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final al4.b f65433e0;
    public final wtc.h f0;
    public final j63.a g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final y f65434h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f65435k0;
    public final CardsCarouselScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xh9.a f65436p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d3 f65437q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final di9.d f65438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e0 f65439s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f65440t;
    public final w73.b u;
    public final y63.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u2 f65441w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c70.a f65442x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r70.c f65443y;
    public final rp0.g1 z;

    public g(n stateMapper, CardsCarouselScreenContract$InputData inputData, xh9.a payLaterInteractor, d3 cardsScreenStateSnapshotInteractor, di9.d payLaterToggleActionExtension, e0 payLaterStateDialogMapper, c90.c uiResources, j60.a bottomExpandableDialogControllerExtension, w73.b cardsTypeInfoMapper, y63.h expandableDialogMapper, u2 statusDialogProvider, c70.a clipboard, r70.c hapticEngine, rp0.g1 shotDialogDisplayer, x63.a cardUnfreezeDialogProvider, l93.f revolutCardsInteractor, k cardsTypeInfoInteractor, hy2.f cardDesignInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, r0 jointAccountsInteractor, k63.a configurationProvider, v73.a addToTapAndPayExtension, v73.k juniorCardsCarouselControllerExtension, r revolutPayCardsCarouselExtension, sh3.a checkoutInteractor, az2.b terminateCardDialogProvider, t73.c enableTransactionsBottomDialogMapper, u03.c juniorCardUnsupportedSettingsProvider, gte.a featureToggleInteractor, zf8.k juniorAccountInfoProvider, kd8.e juniorConsentInteractor, te8.e juniorAccountInteractor, hj8.a juniorProfileInteractor, x deeplinkHandler, hvh.a workflowEventBus, jx2.a brazilLocalGlobalCardInfoBottomDialogProvider, m indiaLocalGlobalCardInfoBottomDialogProvider, u cardsScreenInteractor, t73.b cardDetailsCallShareBottomDialogMapper, zt2.c callSecurityInfoInteractor, sf0.h serverErrorParser, i4b.f legalEntityContextProvider, b80.c networkStateRepository, ang.f userInteractor, al4.b comboCardInteractor, wtc.h linkedWalletsInteractor, j63.a selectedCardUiConfigProvider) {
        o5l.g gVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(cardsScreenStateSnapshotInteractor, "cardsScreenStateSnapshotInteractor");
        Intrinsics.checkNotNullParameter(payLaterToggleActionExtension, "payLaterToggleActionExtension");
        Intrinsics.checkNotNullParameter(payLaterStateDialogMapper, "payLaterStateDialogMapper");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(cardsTypeInfoMapper, "cardsTypeInfoMapper");
        Intrinsics.checkNotNullParameter(expandableDialogMapper, "expandableDialogMapper");
        Intrinsics.checkNotNullParameter(statusDialogProvider, "statusDialogProvider");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(cardUnfreezeDialogProvider, "cardUnfreezeDialogProvider");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cardsTypeInfoInteractor, "cardsTypeInfoInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(addToTapAndPayExtension, "addToTapAndPayExtension");
        Intrinsics.checkNotNullParameter(juniorCardsCarouselControllerExtension, "juniorCardsCarouselControllerExtension");
        Intrinsics.checkNotNullParameter(revolutPayCardsCarouselExtension, "revolutPayCardsCarouselExtension");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(terminateCardDialogProvider, "terminateCardDialogProvider");
        Intrinsics.checkNotNullParameter(enableTransactionsBottomDialogMapper, "enableTransactionsBottomDialogMapper");
        Intrinsics.checkNotNullParameter(juniorCardUnsupportedSettingsProvider, "juniorCardUnsupportedSettingsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(juniorConsentInteractor, "juniorConsentInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(workflowEventBus, "workflowEventBus");
        Intrinsics.checkNotNullParameter(brazilLocalGlobalCardInfoBottomDialogProvider, "brazilLocalGlobalCardInfoBottomDialogProvider");
        Intrinsics.checkNotNullParameter(indiaLocalGlobalCardInfoBottomDialogProvider, "indiaLocalGlobalCardInfoBottomDialogProvider");
        Intrinsics.checkNotNullParameter(cardsScreenInteractor, "cardsScreenInteractor");
        Intrinsics.checkNotNullParameter(cardDetailsCallShareBottomDialogMapper, "cardDetailsCallShareBottomDialogMapper");
        Intrinsics.checkNotNullParameter(callSecurityInfoInteractor, "callSecurityInfoInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        Intrinsics.checkNotNullParameter(linkedWalletsInteractor, "linkedWalletsInteractor");
        Intrinsics.checkNotNullParameter(selectedCardUiConfigProvider, "selectedCardUiConfigProvider");
        this.o = inputData;
        this.f65436p = payLaterInteractor;
        this.f65437q = cardsScreenStateSnapshotInteractor;
        this.f65438r = payLaterToggleActionExtension;
        this.f65439s = payLaterStateDialogMapper;
        this.f65440t = bottomExpandableDialogControllerExtension;
        this.u = cardsTypeInfoMapper;
        this.v = expandableDialogMapper;
        this.f65441w = statusDialogProvider;
        this.f65442x = clipboard;
        this.f65443y = hapticEngine;
        this.z = shotDialogDisplayer;
        this.A = cardUnfreezeDialogProvider;
        this.B = revolutCardsInteractor;
        this.C = cardsTypeInfoInteractor;
        this.D = cardDesignInteractor;
        this.E = transactionsInteractor;
        this.F = jointAccountsInteractor;
        this.G = configurationProvider;
        this.H = addToTapAndPayExtension;
        this.I = juniorCardsCarouselControllerExtension;
        this.J = revolutPayCardsCarouselExtension;
        this.K = checkoutInteractor;
        this.L = terminateCardDialogProvider;
        this.M = enableTransactionsBottomDialogMapper;
        this.N = juniorCardUnsupportedSettingsProvider;
        this.O = featureToggleInteractor;
        this.P = juniorAccountInfoProvider;
        this.Q = juniorConsentInteractor;
        this.R = juniorAccountInteractor;
        this.S = juniorProfileInteractor;
        this.T = deeplinkHandler;
        this.U = workflowEventBus;
        this.V = brazilLocalGlobalCardInfoBottomDialogProvider;
        this.W = indiaLocalGlobalCardInfoBottomDialogProvider;
        this.X = cardsScreenInteractor;
        this.Y = cardDetailsCallShareBottomDialogMapper;
        this.Z = callSecurityInfoInteractor;
        this.f65430a0 = serverErrorParser;
        this.f65431b0 = legalEntityContextProvider;
        this.c0 = networkStateRepository;
        this.f65432d0 = userInteractor;
        this.f65433e0 = comboCardInteractor;
        this.f0 = linkedWalletsInteractor;
        this.g0 = selectedCardUiConfigProvider;
        Data data = new Data(null, null, true, 3, null);
        od0.h hVar = i.Companion;
        String str = inputData.f65406a;
        hVar.getClass();
        i iVarA = od0.h.a(str);
        CardScreenAction cardScreenAction = inputData.d;
        b93.d dVar = inputData.f65407b;
        int i = p1.f268504c[uiResources.a().ordinal()];
        if (i == 1) {
            gVar = o5l.g.MDPI;
        } else if (i == 2) {
            gVar = o5l.g.HDPI;
        } else if (i == 3) {
            gVar = o5l.g.XHDPI;
        } else if (i == 4) {
            gVar = o5l.g.XXHDPI;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = o5l.g.XXXHDPI;
        }
        AccountId accountId = inputData.f65408c;
        Data data2 = new Data(null, null, true, 3, null);
        f0 f0Var = f0.f322471a;
        Data data3 = new Data(new p0(f0Var, f0Var, zhm.r0.g()), null, false, 6, null);
        boolean z = configurationProvider.b() && inputData.f65406a != null;
        Boolean bool = (Boolean) cardsScreenInteractor.f111804b.a(new tk0.b("HIDE_GLOBAL_DEBIT_CARDS_INFO"));
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        boolean z3 = inputData.f;
        Data data4 = new Data(null, null, true, 3, null);
        i iVar = i.f224256b;
        this.f65434h0 = mra.d.b(this, new q0(data, iVarA, cardScreenAction, iVar, iVar, null, dVar, gVar, accountId, data2, data3, z, zBooleanValue, null, null, null, null, null, null, null, null, data4, null, false, z3), stateMapper, null, false, 12);
        this.i0 = w.y0(new j1(this, 0));
        this.j0 = w.y0(new j1(this, 1));
        this.f65435k0 = hx7.e.a(this, new m1(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g r8, h93.f0 r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.I2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g, h93.f0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum J2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g r4, java.lang.String r5, gim.c r6) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.J2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g, java.lang.String, gim.c):java.lang.Enum");
    }

    public static final d0 K2(g gVar, h93.f0 f0Var) {
        if (!f0Var.b0()) {
            return d0.m(Boolean.TRUE);
        }
        d0 d0VarFirstOrError = gVar.N.a(f0Var).firstOrError();
        t45.a aVar = new t45.a(new t73.d(5), 15);
        d0VarFirstOrError.getClass();
        return new z(new ufm.i(d0VarFirstOrError, aVar, 1), 1, new s1c.d(9), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g r4, h93.f0 r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof t73.e2
            if (r0 == 0) goto L16
            r0 = r6
            t73.e2 r0 = (t73.e2) r0
            int r1 = r0.f268459w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f268459w = r1
            goto L1b
        L16:
            t73.e2 r0 = new t73.e2
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f268459w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L55
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            boolean r6 = r5.W
            if (r6 == 0) goto L5e
            l93.f r4 = r4.B
            java.lang.String r5 = r5.f150110a
            efm.r r4 = l93.f.f(r4, r5)
            t5e.j r5 = new t5e.j
            r6 = 1
            r5.<init>(r6)
            r6 = 0
            efm.r r4 = m70.a.g(r4, r6, r5, r3)
            r0.f268459w = r3
            java.lang.Object r6 = nim.a.c(r4, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            kotlin.jvm.internal.Intrinsics.h(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r3 = r6.booleanValue()
        L5e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.L2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g, h93.f0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof t73.f2
            if (r0 == 0) goto L13
            r0 = r5
            t73.f2 r0 = (t73.f2) r0
            int r1 = r0.f268466w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268466w = r1
            goto L18
        L13:
            t73.f2 r0 = new t73.f2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f268466w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            l93.f r4 = r4.B
            h93.l0 r5 = h93.l0.INDIA_GLOBAL
            ha3.x r4 = (ha3.x) r4
            ufm.b r4 = r4.q(r5)
            r0.f268466w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.M2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0279  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void N2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g r27, h93.f0 r28, com.revolut.feature.card_screen.api.models.CardScreenAction r29) {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.N2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g, h93.f0, com.revolut.feature.card_screen.api.models.CardScreenAction):void");
    }

    public static final void O2(g gVar) {
        gVar.getClass();
        gVar.X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.card_terminate_global_card_error_dialog_title, null, null, 14), new TextLocalisedClause(R$string.card_terminate_global_card_error_dialog_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5));
    }

    public static final void P2(g gVar, String str, boolean z, o1 o1Var) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        TextLocalisedClause textLocalisedClause4;
        int[] iArr = p1.f268503b;
        int i = iArr[o1Var.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.card_activate_card_success_dialog_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.card_unblock_pin_success_dialog_title, null, null, 14);
        }
        int i2 = iArr[o1Var.ordinal()];
        if (i2 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.card_activate_card_success_dialog_description, null, null, 14);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.card_unblock_pin_success_dialog_description, null, null, 14);
        }
        int i3 = iArr[o1Var.ordinal()];
        if (i3 == 1) {
            textLocalisedClause3 = new TextLocalisedClause(R$string.card_activate_card_success_dialog_primary_button, null, null, 14);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause3 = new TextLocalisedClause(R$string.card_unblock_pin_success_dialog_primary_button, null, null, 14);
        }
        int i5 = iArr[o1Var.ordinal()];
        if (i5 == 1) {
            textLocalisedClause4 = new TextLocalisedClause(R$string.card_activate_card_success_dialog_secondary_button, null, null, 14);
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause4 = new TextLocalisedClause(R$string.card_unblock_pin_success_dialog_secondary_button, null, null, 14);
        }
        l.a1(gVar, gVar.X1(new y0(null, new j0((Clause) textLocalisedClause, (Clause) textLocalisedClause2, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(2, textLocalisedClause3, textLocalisedClause4), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 5)), null, null, new r2(gVar, str, z, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    @Override // yji.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1() {
        /*
            Method dump skipped, instruction units count: 1588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g.I1():void");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f65435k0;
    }

    public final AccountId Q2(h93.f0 f0Var) {
        y yVar = this.f65434h0;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        AccountId.Joint joint = (AccountId.Joint) ((q0) j2Var.getValue()).f268511j.getContent();
        return (joint != null && Intrinsics.f(f0Var.u, joint.f51413b)) ? joint : ((q0) j2Var2.getValue()).i;
    }

    public final void R2(int i, String str, boolean z, String str2) {
        c70.a.b(this.f65442x, null, str2, z, 1);
        r70.c.b(this.f65443y, 3);
        ((k1) this.z).d(ShotDialogDisplayer$Configuration.Companion.e(ShotDialogDisplayer$Configuration.INSTANCE, str, new TextLocalisedClause(i, null, null, 14), null, null, null, 60));
    }

    public final void S2(h93.f0 f0Var) {
        Continuation continuation = null;
        if (ifk.b.m(f0Var)) {
            do3.n nVar = ((q0) ((j2) this.f65434h0.f22677a).getValue()).f268520w;
            if (nVar != null) {
                wi0.b.Companion.getClass();
                wi0.b bVar = wi0.b.M0;
                if (w.S(nVar, bVar)) {
                    f2(e1(new xy2.b(new CardIssuanceAgreementControllerContract$InputData(bVar, c93.e.DISPOSABLE))), ModalDestination.Style.FULLSCREEN_FADE.f98307a, new t73.k1(this, 0));
                    return;
                }
            }
            l2(new y1(this, continuation, 0), new yi5.b(26));
            return;
        }
        i93.c cVar = f0Var.f150113g;
        if (cVar == null || !cVar.f159550b || f0Var.k.f150132a == h93.g.DELIVERED || h93.h0.e(f0Var) || !this.c0.b()) {
            int i = 8;
            l2(new sma.f(i, this, new t73.h(7), f0Var.f150110a, continuation), new yi5.b(26));
            return;
        }
        String cardId = f0Var.f150110a;
        this.M.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        t tVar = new t(new TextLocalisedClause(R$string.card_online_transaction_prompt_title, null, null, 14), new TextLocalisedClause(R$string.card_online_transaction_prompt_description, null, null, 14), null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_ENABLE_TRANSACTIONS", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.card_online_transaction_prompt_enable_action, null, null, 14), false, null, null, cardId, null, 744);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_CANCEL", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
        this.f65440t.x(new rp0.y(v.k(model, model2), tVar, null, null, null, null, 1020));
    }

    @Override // yji.l
    public final void T1(long j2) {
        this.G.getClass();
        l.b1(this, q.P(new s(this.f65434h0.B(new t73.d(1)), 22), 1), null, new e(this, null), 3);
    }

    public final void T2(h93.f0 f0Var) {
        if (f0Var.e) {
            return;
        }
        n2(new r1(this, f0Var, null, 3), new whi.b(6));
    }

    public final void U2() {
        H2(this.f65434h0, new t73.d(6));
    }

    public final void V2(h93.f0 f0Var) {
        String str;
        AccountId accountIdQ2 = Q2(f0Var);
        AccountId.Joint joint = accountIdQ2 instanceof AccountId.Joint ? (AccountId.Joint) accountIdQ2 : null;
        if (joint == null || (str = joint.f51413b) == null) {
            str = (String) ((q0) ((j2) this.f65434h0.f22677a).getValue()).f268507b.f224257a;
        }
        C2(new e1(f0Var, str, Q2(f0Var)));
    }

    public final void W2(h93.f0 f0Var) {
        y yVar = this.f65434h0;
        s63.g gVar = (s63.g) ((q0) ((j2) yVar.f22677a).getValue()).f268506a.getContent();
        Object obj2 = null;
        List list = gVar != null ? gVar.f260121b : null;
        if (list == null) {
            list = f0.f322471a;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((h93.f0) next).o, f0Var.f150110a)) {
                obj2 = next;
                break;
            }
        }
        h93.f0 f0Var2 = (h93.f0) obj2;
        if (f0Var2 == null) {
            return;
        }
        H2(yVar, new o(f0Var2, 19));
    }

    public final void X2(h93.f0 card, String str) {
        rp0.y yVar;
        this.v.getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        if (card.b0()) {
            String str2 = card.f150110a;
            t tVar = new t(new TextLocalisedClause(com.revolut.feature.card_screen.common.R$string.card_screen_youth_click_activation_confirm_title, v.l(str), null, 12), new TextLocalisedClause(com.revolut.feature.card_screen.common.R$string.card_screen_youth_click_activation_confirm_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, 28);
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ACTIVATE_CARD_BY_CLICK_CONFIRM_RECEIVED_ACTION_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.card_screen.common.R$string.card_screen_youth_click_activation_confirm_have_card, null, null, 14), false, null, null, card, null, 744);
            yp0.b.r(model, 0, 0, 0, 0, 15);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ACTIVATE_CARD_BY_CLICK_CANCEL_ACTION_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.feature.card_screen.common.R$string.card_screen_click_activation_confirm_cancel, null, null, 14), false, null, null, str2, null, 744);
            yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
            yVar = new rp0.y(v.k(model, model2), tVar, null, null, null, null, 1020);
        } else {
            String str3 = card.f150110a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.card_screen.common.R$string.card_screen_one_click_activation_confirmation_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.card_screen.common.R$string.card_screen_one_click_activation_confirmation_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
            List listC = zhm.u.c(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_card_check, (Integer) null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 126));
            Float fValueOf = Float.valueOf(48.0f);
            rp0.s sVar = new rp0.s(new com.revolut.core.ui_kit.views.f(new LayeredImage(listC, fValueOf, fValueOf, 8)), textLocalisedClause, textLocalisedClause2, 24);
            LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("ACTIVATE_CARD_BY_CLICK_CONFIRM_RECEIVED_ACTION_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.card_screen.common.R$string.card_screen_one_click_activation_confirmation_activate, null, null, 14), false, null, null, card, null, 744);
            yp0.b.r(model3, 0, 0, 0, 0, 15);
            LargeActionButtonDelegate.Model model4 = new LargeActionButtonDelegate.Model("ACTIVATE_CARD_BY_CLICK_CANCEL_ACTION_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.feature.card_screen.common.R$string.card_screen_click_activation_confirm_cancel, null, null, 14), false, null, null, str3, null, 744);
            yp0.b.r(model4, 0, R$attr.uikit_dp24, 0, 0, 13);
            yVar = new rp0.y(v.k(model3, model4), sVar, null, null, null, null, 1020);
        }
        this.f65440t.x(yVar);
    }

    public final void Y2(boolean z) {
        y yVar = this.f65434h0;
        h93.f0 f0Var = (h93.f0) ((q0) ((j2) yVar.f22677a).getValue()).d.f224257a;
        if (f0Var == null || f0Var.e) {
            return;
        }
        if (Intrinsics.f(f0Var.Q, Boolean.TRUE)) {
            h.v2(this.f65435k0, CardsCarouselScreenContract$ModalStep.NamelessCardDialog.f65409a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        boolean z3 = f0Var.f150112c;
        n93.f fVar = (z3 && f0Var.d) ? n93.f.DISPOSABLE : z3 ? n93.f.VIRTUAL : n93.f.PHYSICAL;
        s63.g gVar = (s63.g) ((q0) ((j2) yVar.f22677a).getValue()).f268506a.getContent();
        List list = gVar != null ? gVar.f260121b : null;
        if (list == null) {
            list = f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((h93.f0) obj2).P()) {
                arrayList.add(obj2);
            }
        }
        l2(new hve.i(this, f0Var, fVar, z, arrayList, (Continuation) null), new yi5.b(26));
    }

    public final void Z2(h93.f0 f0Var, String str) {
        l2(new s1(this, f0Var, str, null, 1), new su0.c(1, this, g.class, "handleTerminationError", "handleTerminationError(Ljava/lang/Throwable;)Z", 0, 12));
    }

    public final void a3(h93.f0 card) {
        List list = h93.h0.f150146a;
        Intrinsics.checkNotNullParameter(card, "<this>");
        boolean zX = card.x();
        c0 c0Var = card.f150123t;
        Continuation continuation = null;
        if (!zX || c0Var != c0.FOUND_ON_DARKNET) {
            int i = 26;
            if (card.x() && c0Var == c0.DECLINED_BY_FRAUD_DETECTOR_TRANSACTION) {
                l2(new r1(this, card, continuation, 13), new yi5.b(i));
                return;
            } else {
                l2(new r1(this, card, continuation, 16), new yi5.b(i));
                return;
            }
        }
        this.A.getClass();
        Intrinsics.checkNotNullParameter(card, "card");
        t tVar = new t(new TextLocalisedClause(com.revolut.feature.card_screen.common.R$string.card_screen_compromised_card_unfreeze_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.card_screen.common.R$string.card_screen_compromised_card_unfreeze_subtitle, null, null, 14), null, 28);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.card_suspicious_dialog_confirm, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        int i2 = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CONFIRM_UNFREEZE_BUTTON_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, card, R$attr.uikit_dp24, R$attr.uikit_dp8, i2, i2, 368);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        int i3 = R$attr.uikit_dp16;
        this.f65440t.x(new rp0.y(v.k(model, new LargeActionButtonDelegate.Model("CANCEL_UNFREEZE_BUTTON_LIST_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, null, R$attr.uikit_dp8, R$attr.uikit_dp24, i3, i3, 496)), tVar, null, null, null, null, null, null, null, null, 3836));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f65434h0;
    }
}
