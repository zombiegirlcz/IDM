package com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.cards.models.exceptions.CardLimitReachedException;
import com.revolut.feature.cards_core.R$string;
import efm.r;
import g03.e;
import g03.m;
import g03.q;
import h93.f0;
import ha3.x;
import i03.c;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import md6.i;
import mra.d;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import skm.a2;
import vkm.j2;
import w4l.j;
import yji.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements e {

    @NotNull
    public static final m Companion = new m();
    public a2 A;
    public final y B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final DisposableCardSettingsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f64870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f64871q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i03.a f64872r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f64873s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y43.a f64874t;
    public final f03.a u;
    public final hy2.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wz2.b f64875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g1 f64876x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i4b.f f64877y;
    public final ang.f z;

    public b(n stateMapper, DisposableCardSettingsContract$InputData inputData, f cardsInteractor, c settingsItemsProvider, i03.a cardSettingsDialogProvider, j60.a bottomExpandableDialogExtension, y43.a cardPaymentMethodWidget, f03.a cardSettingsExtension, hy2.f cardDesignInteractor, wz2.b updateSecuritySettingControllerModelExtension, g1 shotDialogDisplayer, i4b.f legalEntityContextProvider, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(settingsItemsProvider, "settingsItemsProvider");
        Intrinsics.checkNotNullParameter(cardSettingsDialogProvider, "cardSettingsDialogProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        Intrinsics.checkNotNullParameter(cardPaymentMethodWidget, "cardPaymentMethodWidget");
        Intrinsics.checkNotNullParameter(cardSettingsExtension, "cardSettingsExtension");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(updateSecuritySettingControllerModelExtension, "updateSecuritySettingControllerModelExtension");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f64870p = cardsInteractor;
        this.f64871q = settingsItemsProvider;
        this.f64872r = cardSettingsDialogProvider;
        this.f64873s = bottomExpandableDialogExtension;
        this.f64874t = cardPaymentMethodWidget;
        this.u = cardSettingsExtension;
        this.v = cardDesignInteractor;
        this.f64875w = updateSecuritySettingControllerModelExtension;
        this.f64876x = shotDialogDisplayer;
        this.f64877y = legalEntityContextProvider;
        this.z = userInteractor;
        this.B = d.b(this, new g03.a(new Data(null, null, true, 3, null), inputData.f64867a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.C = hx7.e.a(this, new fv1.a(this, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b r6, gim.c r7) {
        /*
            cli.y r0 = r6.B
            boolean r1 = r7 instanceof g03.z
            if (r1 == 0) goto L15
            r1 = r7
            g03.z r1 = (g03.z) r1
            int r2 = r1.f139282w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f139282w = r2
            goto L1a
        L15:
            g03.z r1 = new g03.z
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r6 = r1.u
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f139282w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L65
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r0.f22677a
            vkm.j2 r6 = (vkm.j2) r6
            java.lang.Object r6 = r6.getValue()
            g03.a r6 = (g03.a) r6
            com.revolut.data.model.Data r6 = r6.e
            java.lang.Object r6 = r6.getContent()
            do3.n r6 = (do3.n) r6
            if (r6 != 0) goto L72
            fwf.n r6 = new fwf.n
            r2 = 24
            r6.<init>(r2)
            kotlinx.coroutines.flow.Flow r6 = r0.B(r6)
            d4f.m r0 = new d4f.m
            r2 = 2
            r4 = 17
            r5 = 0
            r0.<init>(r2, r4, r5)
            r1.f139282w = r3
            java.lang.Object r6 = vkm.q.y(r6, r0, r1)
            if (r6 != r7) goto L65
            return r7
        L65:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r6 = r6.getContent()
            do3.n r6 = (do3.n) r6
            if (r6 != 0) goto L72
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L72:
            wi0.a r7 = wi0.b.Companion
            r7.getClass()
            wi0.b r7 = wi0.b.M0
            boolean r6 = te0.w.S(r6, r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b.I2(com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.z.j(j.f294644c), null, null, new q(this, null, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r6) throws com.revolut.feature.cards.models.exceptions.CardLimitReachedException.DailyLimitReached {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g03.n
            if (r0 == 0) goto L13
            r0 = r6
            g03.n r0 = (g03.n) r0
            int r1 = r0.f139270w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f139270w = r1
            goto L18
        L13:
            g03.n r0 = new g03.n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f139270w
            cli.y r3 = r5.B
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r3.f22677a
            vkm.j2 r6 = (vkm.j2) r6
            java.lang.Object r6 = r6.getValue()
            g03.a r6 = (g03.a) r6
            h93.f0 r6 = r6.f139254b
            boolean r2 = ifk.b.m(r6)
            if (r2 == 0) goto L5a
            r0.f139270w = r4
            java.lang.Object r6 = r5.K2(r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            h93.f0 r6 = (h93.f0) r6
            avc.o r0 = new avc.o
            r1 = 1
            r0.<init>(r6, r1)
            r5.H2(r3, r0)
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b.J2(gim.c):java.lang.Object");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(gim.c r7) throws com.revolut.feature.cards.models.exceptions.CardLimitReachedException.DailyLimitReached {
        /*
            r6 = this;
            boolean r0 = r7 instanceof g03.o
            if (r0 == 0) goto L13
            r0 = r7
            g03.o r0 = (g03.o) r0
            int r1 = r0.f139271w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f139271w = r1
            goto L18
        L13:
            g03.o r0 = new g03.o
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f139271w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L8a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.DisposableCardSettingsContract$InputData r7 = r6.o
            com.revolut.core.model.account.AccountId r7 = r7.f64868b
            boolean r2 = r7 instanceof com.revolut.core.model.account.AccountId.Joint
            r4 = 0
            if (r2 == 0) goto L3e
            com.revolut.core.model.account.AccountId$Joint r7 = (com.revolut.core.model.account.AccountId.Joint) r7
            goto L3f
        L3e:
            r7 = r4
        L3f:
            if (r7 == 0) goto L43
            java.lang.String r4 = r7.f51413b
        L43:
            cli.y r7 = r6.B
            java.lang.Object r7 = r7.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            g03.a r7 = (g03.a) r7
            com.revolut.data.model.Data r7 = r7.f139255c
            java.lang.Object r7 = r7.getContent()
            e93.e r7 = (e93.e) r7
            if (r7 == 0) goto L96
            java.util.List r2 = r7.f123845h
            boolean r2 = hx7.q.m(r2)
            if (r2 != 0) goto L90
            l93.f r2 = r6.f64870p
            r5 = 129(0x81, float:1.81E-43)
            ufm.b r7 = l93.f.g(r2, r7, r4, r5)
            g03.l r2 = new g03.l
            r4 = 4
            r2.<init>(r6, r4)
            fwj.h r4 = new fwj.h
            r5 = 13
            r4.<init>(r2, r5)
            ufm.i r2 = new ufm.i
            r5 = 0
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r0.f139271w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L8a
            return r1
        L8a:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        L90:
            com.revolut.feature.cards.models.exceptions.CardLimitReachedException$DailyLimitReached r7 = new com.revolut.feature.cards.models.exceptions.CardLimitReachedException$DailyLimitReached
            r7.<init>()
            throw r7
        L96:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Disposable card design should be present at this point"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b.K2(gim.c):java.lang.Object");
    }

    public final void L2() {
        r map;
        f0 f0Var = ((g03.a) ((j2) this.B.f22677a).getValue()).f139254b;
        if (ifk.b.m(f0Var)) {
            map = zi0.c.j(f0Var);
        } else {
            map = ((x) this.f64870p).v(f0Var.f150110a).map(new fwj.h(new g03.l(this, 1), 12));
        }
        Intrinsics.h(map);
        akg.n nVarI = u0.i(rd0.e.b(map), new dfj.f(this.f64875w.b3(), 28), this.f64877y.j(new i(md6.h.DEBIT_CARD)));
        a2 a2Var = this.A;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.A = l.b1(this, boh.f.e(nVarI, new g03.l(this, 2)), null, new q(this, continuation, 0), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r3.Z2(r5, r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(i93.e r9, boolean r10, gim.c r11) throws com.revolut.feature.cards.models.exceptions.CardLimitReachedException.DailyLimitReached {
        /*
            r8 = this;
            boolean r0 = r11 instanceof g03.a0
            if (r0 == 0) goto L13
            r0 = r11
            g03.a0 r0 = (g03.a0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            g03.a0 r0 = new g03.a0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f139257x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            wz2.b r3 = r8.f64875w
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L42
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            yhm.o.b(r11)
            goto L97
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            boolean r9 = r0.f139256w
            h93.f0 r10 = r0.v
            i93.e r2 = r0.u
            yhm.o.b(r11)
            goto L74
        L42:
            boolean r10 = r0.f139256w
            i93.e r9 = r0.u
            yhm.o.b(r11)
            goto L5a
        L4a:
            yhm.o.b(r11)
            r0.u = r9
            r0.f139256w = r10
            r0.z = r6
            java.lang.Object r11 = r8.J2(r0)
            if (r11 != r1) goto L5a
            goto L96
        L5a:
            h93.f0 r11 = (h93.f0) r11
            vkm.t1 r2 = r3.b3()
            r0.u = r9
            r0.v = r11
            r0.f139256w = r10
            r0.z = r5
            java.lang.Object r2 = vkm.q.x(r2, r0)
            if (r2 != r1) goto L6f
            goto L96
        L6f:
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r11
            r11 = r7
        L74:
            od0.i r11 = (od0.i) r11
            wz2.a r5 = new wz2.a
            java.lang.Object r11 = r11.f224257a
            i93.c r11 = (i93.c) r11
            if (r11 != 0) goto L80
            i93.c r11 = r10.f150113g
        L80:
            h93.f0 r10 = h93.f0.b(r10, r11)
            r5.<init>(r10, r2, r9)
            r10 = 0
            r0.u = r10
            r0.v = r10
            r0.f139256w = r9
            r0.z = r4
            java.lang.Object r9 = r3.Z2(r5, r0)
            if (r9 != r1) goto L97
        L96:
            return r1
        L97:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b.M2(i93.e, boolean, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        L2();
        DisposableCardSettingsContract$InputData disposableCardSettingsContract$InputData = this.o;
        AccountId accountId = disposableCardSettingsContract$InputData.f64868b;
        f0 f0Var = disposableCardSettingsContract$InputData.f64867a;
        Continuation continuation = null;
        AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
        l.b1(this, rd0.e.b(nim.a.w(hx2.c.b(this.v, joint != null ? joint.f51413b : null, f0Var.C(), f0Var.M(), false, false, false, false, null, null, ((g03.a) ((j2) this.B.f22677a).getValue()).f139254b.G, null, 3552), new g03.l(this, 3))), null, new q(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.B;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof CardLimitReachedException) {
            X1(new y0(null, new z(new TextLocalisedClause(R$string.card_disposable_info_limit_reached_title, null, null, 14), new TextLocalisedClause(R$string.card_disposable_info_limit_reached_subtitle, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
            return true;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
        super.o1(throwable);
        return false;
    }
}
