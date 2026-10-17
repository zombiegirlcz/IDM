package com.revolut.feature.freelancer.impl.ui.extension;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.freelancer.impl.R$string;
import ct6.t;
import dug.d;
import gim.c;
import gim.i;
import gr6.m;
import ip0.tm0;
import ip0.um0;
import jr6.o;
import kda.b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import rp0.y;
import vkm.q;
import w4l.h;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends n implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f73810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gr6.a f73811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f73812n;
    public final jr6.m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f73813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cne.a f73814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ppg.b f73815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wsg.n f73816s;

    public a(j60.a bottomDialog, gr6.a freelancerAccountDetailsInteractor, m freelancerPocketsInteractor, jr6.m freelancerDialogFactory, o freelancerNaviCommandPermissionWrapper, cne.a stampDutyInteractor, ppg.b vaultsInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(freelancerDialogFactory, "freelancerDialogFactory");
        Intrinsics.checkNotNullParameter(freelancerNaviCommandPermissionWrapper, "freelancerNaviCommandPermissionWrapper");
        Intrinsics.checkNotNullParameter(stampDutyInteractor, "stampDutyInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f73810l = bottomDialog;
        this.f73811m = freelancerAccountDetailsInteractor;
        this.f73812n = freelancerPocketsInteractor;
        this.o = freelancerDialogFactory;
        this.f73813p = freelancerNaviCommandPermissionWrapper;
        this.f73814q = stampDutyInteractor;
        this.f73815r = vaultsInteractor;
        this.f73816s = walletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(com.revolut.feature.freelancer.impl.ui.extension.a r6, gim.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof dx6.f
            if (r0 == 0) goto L13
            r0 = r7
            dx6.f r0 = (dx6.f) r0
            int r1 = r0.f120897x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120897x = r1
            goto L18
        L13:
            dx6.f r0 = new dx6.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f120897x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            mr6.b r6 = r0.u
            yhm.o.b(r7)
            goto L67
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            gr6.a r7 = r6.f73811m
            r0.f120897x = r4
            et6.g r7 = (et6.g) r7
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L48
            goto L63
        L48:
            mr6.j r7 = (mr6.j) r7
            boolean r2 = r7 instanceof mr6.h
            if (r2 == 0) goto L7e
            mr6.h r7 = (mr6.h) r7
            mr6.g r7 = r7.f208066a
            boolean r2 = r7 instanceof mr6.b
            if (r2 == 0) goto L78
            r2 = r7
            mr6.b r2 = (mr6.b) r2
            r0.u = r2
            r0.f120897x = r3
            java.lang.Object r6 = r6.e3(r2, r0)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            r5 = r7
            r7 = r6
            r6 = r5
        L67:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L71
            com.revolut.feature.freelancer.impl.ui.extension.FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException$NegativeBalance r6 = new com.revolut.feature.freelancer.impl.ui.extension.FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException$NegativeBalance
            r6.<init>(r7)
            goto L7d
        L71:
            com.revolut.feature.freelancer.impl.ui.extension.FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException$Failure r7 = new com.revolut.feature.freelancer.impl.ui.extension.FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException$Failure
            r7.<init>(r6)
            r6 = r7
            goto L7d
        L78:
            com.revolut.feature.freelancer.impl.ui.extension.FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException$Failure r6 = new com.revolut.feature.freelancer.impl.ui.extension.FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException$Failure
            r6.<init>(r7)
        L7d:
            throw r6
        L7e:
            ppg.b r6 = r6.f73815r
            pcd.b r7 = pcd.b.PERSONAL
            ypg.p r6 = (ypg.p) r6
            r6.o(r7, r4)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.extension.a.Z2(com.revolut.feature.freelancer.impl.ui.extension.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(com.revolut.feature.freelancer.impl.ui.extension.a r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof dx6.j
            if (r0 == 0) goto L13
            r0 = r7
            dx6.j r0 = (dx6.j) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            dx6.j r0 = new dx6.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f120902x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.revolut.feature.tab.accounts.models.ProductId r6 = r0.f120901w
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = r0.v
            com.revolut.feature.freelancer.impl.ui.extension.a r0 = r0.u
            yhm.o.b(r7)
            r2 = r6
            r6 = r0
            goto L57
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            yhm.o.b(r7)
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r7 = ibb.c.f160140a
            com.revolut.feature.tab.accounts.models.ProductId r2 = com.revolut.feature.tab.accounts.models.ProductId.SUBACCOUNT
            wsg.n r4 = r6.f73816s
            com.revolut.core.model.account.AccountId$Personal r5 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r4 = r4.y(r5)
            r0.u = r6
            r0.v = r7
            r0.f120901w = r2
            r0.z = r3
            java.lang.Object r0 = nim.a.b(r4, r0)
            if (r0 != r1) goto L55
            return r1
        L55:
            r1 = r7
            r7 = r0
        L57:
            io3.d r7 = (io3.d) r7
            java.lang.String r7 = r7.f163145a
            com.revolut.feature.tab.accounts.models.ProductAccountId r0 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            r3 = 0
            r0.<init>(r7, r3)
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r7 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            r7.<init>(r0, r2)
            com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig r0 = new com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig
            r0.<init>(r7, r3)
            r7 = 12
            com.revolut.retail.core.navigation.FeatureCommand r7 = jbb.a.a(r1, r0, r3, r3, r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = zh9.u0.b(r7)
            r6.A2(r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.extension.a.b3(com.revolut.feature.freelancer.impl.ui.extension.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c3(com.revolut.feature.freelancer.impl.ui.extension.a r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof dx6.k
            if (r0 == 0) goto L13
            r0 = r9
            dx6.k r0 = (dx6.k) r0
            int r1 = r0.f120905x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120905x = r1
            goto L18
        L13:
            dx6.k r0 = new dx6.k
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f120905x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.freelancer.impl.ui.extension.a r8 = r0.u
            yhm.o.b(r9)
            goto L56
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r9)
            jr6.o r9 = r8.f73813p
            com.revolut.feature_move_money.api.navigation.MoveMoneyDestination r2 = new com.revolut.feature_move_money.api.navigation.MoveMoneyDestination
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r4 = new com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData
            com.revolut.shared.feature.move_money.api.navigation.Action$Add r5 = new com.revolut.shared.feature.move_money.api.navigation.Action$Add
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$ProAll r6 = com.revolut.shared.feature.move_money.api.navigation.StartUpPocket.ProAll.f104860a
            r7 = 0
            r5.<init>(r6, r7)
            r6 = 6
            r4.<init>(r5, r7, r6)
            r2.<init>(r4, r7)
            r0.u = r8
            r0.f120905x = r3
            s17.d r9 = (s17.d) r9
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            aii.u r9 = (aii.u) r9
            r8.A2(r9)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.extension.a.c3(com.revolut.feature.freelancer.impl.ui.extension.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r10 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d3(com.revolut.feature.freelancer.impl.ui.extension.a r8, mr6.b r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof dx6.l
            if (r0 == 0) goto L13
            r0 = r10
            dx6.l r0 = (dx6.l) r0
            int r1 = r0.f120907x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120907x = r1
            goto L18
        L13:
            dx6.l r0 = new dx6.l
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f120907x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            com.revolut.feature.freelancer.impl.ui.extension.a r8 = r0.u
            yhm.o.b(r10)
            goto L89
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r10)
            goto L52
        L38:
            yhm.o.b(r10)
            mr6.a r9 = r9.f208060a
            int[] r10 = dx6.b.f120893a
            int r9 = r9.ordinal()
            r9 = r10[r9]
            if (r9 == r3) goto L64
            if (r9 != r4) goto L5e
            r0.f120907x = r3
            java.lang.Object r10 = r8.g3(r0)
            if (r10 != r1) goto L52
            goto L88
        L52:
            pcd.s r10 = (pcd.s) r10
            java.lang.String r9 = r10.f()
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$ProVaultAccount r10 = new com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$ProVaultAccount
            r10.<init>(r9)
            goto L66
        L5e:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L64:
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$ProAll r10 = com.revolut.shared.feature.move_money.api.navigation.StartUpPocket.ProAll.f104860a
        L66:
            jr6.o r9 = r8.f73813p
            com.revolut.feature_move_money.api.navigation.MoveMoneyDestination r2 = new com.revolut.feature_move_money.api.navigation.MoveMoneyDestination
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r3 = new com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData
            com.revolut.shared.feature.move_money.api.navigation.Action$MoveMoney r5 = new com.revolut.shared.feature.move_money.api.navigation.Action$MoveMoney
            com.revolut.shared.feature.move_money.api.navigation.a r6 = com.revolut.shared.feature.move_money.api.navigation.a.SOURCE
            r7 = 4
            r5.<init>(r10, r6, r7)
            r10 = 6
            r6 = 0
            r3.<init>(r5, r6, r10)
            r2.<init>(r3, r6)
            r0.u = r8
            r0.f120907x = r4
            s17.d r9 = (s17.d) r9
            java.lang.Object r10 = r9.a(r2, r0)
            if (r10 != r1) goto L89
        L88:
            return r1
        L89:
            aii.u r10 = (aii.u) r10
            r8.A2(r10)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.extension.a.d3(com.revolut.feature.freelancer.impl.ui.extension.a, mr6.b, gim.c):java.lang.Object");
    }

    @Override // kda.b
    public final Object C0(String dialogButtonId, i iVar) {
        ((t) this.o).getClass();
        Intrinsics.checkNotNullParameter(dialogButtonId, "dialogButtonId");
        String str = null;
        int i = 56;
        boolean z = false;
        String str2 = null;
        Object objA = nim.a.a(this.f73810l.G(new y(u.c(new um0(dialogButtonId, new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.freelancer_account_closure_account_actions_confirmation_dialog_action_cancel, null, null, 14), z, str2, str, i), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.freelancer_account_closure_account_actions_confirmation_dialog_action_confirm, null, null, 14), z, str2, str, i), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new rp0.t(new TextLocalisedClause(R$string.freelancer_account_closure_account_actions_confirmation_dialog_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_account_closure_account_actions_confirmation_dialog_description, null, null, 14), null, 28), null, null, null, null, 1020)), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (pu7.a.B(r7.e, "freelancer_account_closure", new dx6.n(r7, null), r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kda.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object closeAccount(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof dx6.d
            if (r0 == 0) goto L13
            r0 = r8
            dx6.d r0 = (dx6.d) r0
            int r1 = r0.f120895w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120895w = r1
            goto L1a
        L13:
            dx6.d r0 = new dx6.d
            gim.c r8 = (gim.c) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f120895w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L8e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            yhm.o.b(r8)
            goto L51
        L39:
            yhm.o.b(r8)
            r8 = 0
            r2 = 3
            j60.a r6 = r7.f73810l
            j60.a.v(r6, r8, r5, r2)
            dx6.e r8 = new dx6.e
            r8.<init>(r7, r5)
            r0.f120895w = r4
            java.lang.Object r8 = r7.Y2(r0, r8)
            if (r8 != r1) goto L51
            goto L8d
        L51:
            dne.c r8 = (dne.c) r8
            boolean r2 = r8 instanceof dne.a
            if (r2 == 0) goto L74
            dne.a r8 = (dne.a) r8
            ane.a r0 = new ane.a
            dj0.d r1 = r8.f116289b
            com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount r8 = r8.f116288a
            r0.<init>(r8, r1)
            com.revolut.kompot.navigable.vc.ViewController r8 = r7.o2(r0)
            dx6.a r0 = new dx6.a
            r1 = 0
            r0.<init>(r7, r1)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r1 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r7.N2(r8, r1, r0)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L74:
            dne.b r2 = dne.b.f116290a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r8 == 0) goto L91
            r0.f120895w = r3
            dx6.n r8 = new dx6.n
            r8.<init>(r7, r5)
            nki.a r2 = r7.e
            java.lang.String r3 = "freelancer_account_closure"
            java.lang.Object r8 = pu7.a.B(r2, r3, r8, r0)
            if (r8 != r1) goto L8e
        L8d:
            return r1
        L8e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L91:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.extension.a.closeAccount(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(mr6.b r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dx6.c
            if (r0 == 0) goto L13
            r0 = r8
            dx6.c r0 = (dx6.c) r0
            int r1 = r0.f120894w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120894w = r1
            goto L18
        L13:
            dx6.c r0 = new dx6.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f120894w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto L51
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            goto L7e
        L37:
            yhm.o.b(r8)
            mr6.a r7 = r7.f208060a
            int[] r8 = dx6.b.f120893a
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L60
            if (r7 != r3) goto L5a
            r0.f120894w = r3
            java.io.Serializable r8 = r6.h3(r0)
            if (r8 != r1) goto L51
            goto L7d
        L51:
            pcd.s r8 = (pcd.s) r8
            if (r8 == 0) goto L8b
            java.lang.String r7 = r8.getCurrency()
            return r7
        L5a:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L60:
            w4l.h r7 = w4l.h.f294642c
            gr6.m r8 = r6.f73812n
            et6.i2 r8 = (et6.i2) r8
            akg.n r7 = r8.b(r7)
            dug.d r8 = new dug.d
            r2 = 10
            r8.<init>(r2)
            jhi.b r7 = mo3.a.g(r7, r5, r8, r4)
            r0.f120894w = r4
            java.lang.Object r8 = vkm.q.x(r7, r0)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            io3.d r8 = (io3.d) r8
            java.lang.String r7 = r8.f163147c
            long r0 = r8.i
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto L8b
            return r7
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.extension.a.e3(mr6.b, gim.c):java.lang.Object");
    }

    public final Object f3(c cVar) {
        return q.x(mo3.a.g(e.b(pd.b.r(this.f73816s.J(AccountId.Personal.f51414a, h.f294642c), new dx6.a(this, 1))), null, new d(9), 1), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof dx6.g
            if (r0 == 0) goto L13
            r0 = r5
            dx6.g r0 = (dx6.g) r0
            int r1 = r0.f120898w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120898w = r1
            goto L18
        L13:
            dx6.g r0 = new dx6.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f120898w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f120898w = r3
            java.lang.Object r5 = r4.f3(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L41:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r5.next()
            npg.a r0 = (npg.a) r0
            pcd.k0 r1 = pcd.l0.Companion
            r1.getClass()
            java.util.Set r1 = pcd.l0.a()
            java.lang.Object r2 = r0.f218206b
            pcd.s r2 = (pcd.s) r2
            pcd.l0 r2 = r2.e
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L41
            java.lang.Object r5 = r0.f218206b
            return r5
        L65:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.extension.a.g3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h3(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof dx6.h
            if (r0 == 0) goto L13
            r0 = r7
            dx6.h r0 = (dx6.h) r0
            int r1 = r0.f120899w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120899w = r1
            goto L18
        L13:
            dx6.h r0 = new dx6.h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f120899w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            r0.f120899w = r3
            java.lang.Object r7 = r6.f3(r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L41:
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 == 0) goto L73
            java.lang.Object r0 = r7.next()
            r2 = r0
            npg.a r2 = (npg.a) r2
            pcd.k0 r3 = pcd.l0.Companion
            r3.getClass()
            java.util.Set r3 = pcd.l0.a()
            java.lang.Object r4 = r2.f218206b
            pcd.s r4 = (pcd.s) r4
            pcd.l0 r4 = r4.e
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L41
            java.lang.Object r2 = r2.f218206b
            pcd.s r2 = (pcd.s) r2
            pcd.g0 r2 = r2.f234885h
            long r2 = r2.f234861c
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L41
            goto L74
        L73:
            r0 = r1
        L74:
            npg.a r0 = (npg.a) r0
            if (r0 == 0) goto L7d
            java.lang.Object r7 = r0.f218206b
            pcd.s r7 = (pcd.s) r7
            return r7
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.extension.a.h3(gim.c):java.io.Serializable");
    }
}
