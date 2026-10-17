package com.revolut.feature.card_add_to_googlepay.impl;

import a35.j;
import android.content.SharedPreferences;
import android.os.Parcelable;
import cli.g;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.card_add_to_googlepay.api.NavigationIconConfig;
import com.revolut.feature.card_add_to_googlepay.impl.AddToGooglePayViewControllerContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.NaviCommand;
import cyc.c;
import ecm.q;
import etj.l;
import ew2.b0;
import ew2.c0;
import ew2.f0;
import ew2.g0;
import ew2.h0;
import ew2.i0;
import ew2.k0;
import ew2.r0;
import ew2.s0;
import ew2.w;
import ja3.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l93.b;
import li0.d;
import nii.j0;
import nii.u1;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.r;
import vkm.v1;
import vkm.z1;
import z6l.s;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b0 {

    @NotNull
    public static final k0 Companion = new k0();
    public final f A;
    public final hw2.a B;
    public final e C;
    public final gte.a D;
    public final com.revolut.kompot.navigable.a E;
    public r F;
    public final z1 G;
    public final y H;
    public final com.revolut.kompot.navigable.vc.modal.a I;
    public final AddToGooglePayViewControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f64460p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f64461q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wg1.b f64462r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final li0.b f64463s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final li0.a f64464t;
    public final d u;
    public final ang.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wsg.b f64465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final al4.b f64466x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fk3.a f64467y;
    public final q z;

    public a(w stateMapper, AddToGooglePayViewControllerContract$InputData inputData, s revolutCardsInteractor, b cardsInteractor, wg1.b tapAndPayInteractor, li0.b tapAndPayClient, li0.a pushTokenizerRequestBuilderFactory, d userAddressBuilderFactory, ang.f userInteractor, wsg.b newWalletsInteractor, al4.b comboCardInteractor, fk3.a configurationInteractor, q retailPreferencesInteractor, f cardBitmapDisplayer, hw2.a creditActivationBottomSheetProvider, e dateProvider, gte.a featureToggleInteractor, com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(tapAndPayInteractor, "tapAndPayInteractor");
        Intrinsics.checkNotNullParameter(tapAndPayClient, "tapAndPayClient");
        Intrinsics.checkNotNullParameter(pushTokenizerRequestBuilderFactory, "pushTokenizerRequestBuilderFactory");
        Intrinsics.checkNotNullParameter(userAddressBuilderFactory, "userAddressBuilderFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(retailPreferencesInteractor, "retailPreferencesInteractor");
        Intrinsics.checkNotNullParameter(cardBitmapDisplayer, "cardBitmapDisplayer");
        Intrinsics.checkNotNullParameter(creditActivationBottomSheetProvider, "creditActivationBottomSheetProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.o = inputData;
        this.f64460p = revolutCardsInteractor;
        this.f64461q = cardsInteractor;
        this.f64462r = tapAndPayInteractor;
        this.f64463s = tapAndPayClient;
        this.f64464t = pushTokenizerRequestBuilderFactory;
        this.u = userAddressBuilderFactory;
        this.v = userInteractor;
        this.f64465w = newWalletsInteractor;
        this.f64466x = comboCardInteractor;
        this.f64467y = configurationInteractor;
        this.z = retailPreferencesInteractor;
        this.A = cardBitmapDisplayer;
        this.B = creditActivationBottomSheetProvider;
        this.C = dateProvider;
        this.D = featureToggleInteractor;
        this.E = controller;
        this.F = e0.b();
        this.G = vkm.q.b(1, 5, null);
        boolean z = inputData.f64455b;
        boolean z3 = inputData.f64457g;
        NavigationIconConfig navigationIconConfig = inputData.e;
        this.H = mra.d.b(this, new c0(null, z, false, z3, null, null, navigationIconConfig != null ? navigationIconConfig.f64436a : null, true), stateMapper, null, false, 12);
        this.I = hx7.e.a(this, new eul.f(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.card_add_to_googlepay.impl.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof ew2.o0
            if (r0 == 0) goto L13
            r0 = r6
            ew2.o0 r0 = (ew2.o0) r0
            int r1 = r0.f130035w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130035w = r1
            goto L18
        L13:
            ew2.o0 r0 = new ew2.o0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f130035w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            goto L48
        L36:
            yhm.o.b(r6)
            wg1.b r6 = r5.f64462r
            ufm.i r6 = r6.b()
            r0.f130035w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L48
            goto L71
        L48:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L73
            li0.b r6 = r5.f64463s
            com.revolut.kompot.navigable.a r2 = r5.E
            android.app.Activity r2 = r2.m2()
            r6.getClass()
            java.lang.String r4 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            com.google.android.gms.tapandpay.TapAndPayClient r6 = r6.f195399a
            r4 = 1001(0x3e9, float:1.403E-42)
            r6.createWallet(r2, r4)
            skm.r r5 = r5.F
            r0.f130035w = r3
            java.lang.Object r5 = r5.y(r0)
            if (r5 != r1) goto L72
        L71:
            return r1
        L72:
            return r5
        L73:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_add_to_googlepay.impl.a.I2(com.revolut.feature.card_add_to_googlepay.impl.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.card_add_to_googlepay.impl.a r17, h93.f0 r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_add_to_googlepay.impl.a.J2(com.revolut.feature.card_add_to_googlepay.impl.a, h93.f0, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        ((l80.f) this.C).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        q qVar = this.z;
        qVar.getClass();
        Intrinsics.checkNotNullParameter("operation_prompts_google_pay_last_time_shown", "key");
        ((SharedPreferences) qVar.f124861b).edit().putLong("operation_prompts_google_pay_last_time_shown", jCurrentTimeMillis).commit();
        Continuation continuation = null;
        int i = 3;
        vkm.y yVar = new vkm.y(new v1(new l(this, continuation, 4)), new eob.e(i, 8, continuation));
        AddToGooglePayViewControllerContract$InputData addToGooglePayViewControllerContract$InputData = this.o;
        yji.l.a1(this, new vkm.y(ta6.a.h(yVar, ((om4.f) this.f64466x).a(addToGooglePayViewControllerContract$InputData.f64454a), new vkm.y(new j(2, 19, null), rd0.e.b(this.A.c(addToGooglePayViewControllerContract$InputData.f64454a.f150110a))), new s0(4, null)), new a82.q(i, 19, continuation)), null, null, new ew1.d(this, continuation, 2), 3);
        yji.l.a1(this, this.G, new c(2, this, a.class, "handleRefreshError", "handleRefreshError(Ljava/lang/Throwable;)Z", 4, 29), null, new r0(this, continuation, 1), 2);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.I;
    }

    public final void K2(NaviCommand naviCommand) {
        C1(new BridgeDestination(naviCommand));
    }

    public final void L2(i0 event) {
        NaviCommand naviCommand;
        NaviCommand naviCommand2;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof g0;
        AddToGooglePayViewControllerContract$InputData addToGooglePayViewControllerContract$InputData = this.o;
        if (z) {
            if (Intrinsics.f(((g0) event).f130016a, "GOOGLE_PROMPT_ID")) {
                l2(new r0(this, null, 2), new yi5.b(26));
                return;
            } else {
                K2(addToGooglePayViewControllerContract$InputData.d);
                return;
            }
        }
        if (event instanceof h0) {
            if (addToGooglePayViewControllerContract$InputData.f64458h) {
                h.v2(this.I, AddToGooglePayViewControllerContract$ModalStep.ShowCreditActivation.f64459a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return;
            } else {
                K2(addToGooglePayViewControllerContract$InputData.d);
                return;
            }
        }
        if (event instanceof f0) {
            NavigationIconConfig navigationIconConfig = addToGooglePayViewControllerContract$InputData.e;
            if (navigationIconConfig == null || (naviCommand2 = navigationIconConfig.f64437b) == null) {
                K2(addToGooglePayViewControllerContract$InputData.d);
                return;
            } else {
                C1(new BridgeDestination(naviCommand2));
                return;
            }
        }
        if (!(event instanceof ew2.e0)) {
            throw new NoWhenBranchMatchedException();
        }
        NavigationIconConfig navigationIconConfig2 = addToGooglePayViewControllerContract$InputData.e;
        if (navigationIconConfig2 == null || (naviCommand = navigationIconConfig2.f64437b) == null) {
            K2(addToGooglePayViewControllerContract$InputData.d);
        } else {
            C1(new BridgeDestination(naviCommand));
        }
    }

    public final void M2() {
        yji.l.a1(this, X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.card_add_to_gpay_screen_success_virtual_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.card_add_to_gpay_screen_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 5)), null, null, new ev7.b(this, null, 4), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.H;
    }
}
