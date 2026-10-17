package r93;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends k93.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l93.f f252511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u89.a f252512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q89.e f252513n;
    public final li0.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final uq8.a f252514p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f252515q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hj8.a f252516r;

    public k(l93.f revolutCardsInteractor, u89.a promptsRouter, q89.e onboardingInteractor, li0.b tapAndPayClient, uq8.a juniorTransferCommandFactory, n walletInteractor, hj8.a juniorProfileInteractor) {
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(promptsRouter, "promptsRouter");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(tapAndPayClient, "tapAndPayClient");
        Intrinsics.checkNotNullParameter(juniorTransferCommandFactory, "juniorTransferCommandFactory");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f252511l = revolutCardsInteractor;
        this.f252512m = promptsRouter;
        this.f252513n = onboardingInteractor;
        this.o = tapAndPayClient;
        this.f252514p = juniorTransferCommandFactory;
        this.f252515q = walletInteractor;
        this.f252516r = juniorProfileInteractor;
    }

    public static CompositeCommand c3(AccountId accountId, String str) {
        FeatureCommand featureCommand = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277277c, null, null, 6)));
        CardScreenAction.Select select = new CardScreenAction.Select(str, 6, false, false);
        AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
        return com.revolut.retail.core.navigation.a.c(featureCommand, new FeatureCommand(new CardsScreenFeatureConfig(null, joint != null ? joint.f51413b : null, null, accountId, select, 5)));
    }

    public static FeatureCommand i3() {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // k93.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.String r11, e93.e r12, com.revolut.retail.core.navigation.NaviCommand r13, java.lang.String r14, com.revolut.core.model.account.AccountId r15, java.lang.String r16, gim.c r17) {
        /*
            r10 = this;
            r0 = r17
            boolean r1 = r0 instanceof r93.g
            if (r1 == 0) goto L16
            r1 = r0
            r93.g r1 = (r93.g) r1
            int r2 = r1.f252506y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f252506y = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            r93.g r1 = new r93.g
            r1.<init>(r10, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.f252504w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.f252506y
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 == r3) goto L36
            if (r2 != r9) goto L2e
            yhm.o.b(r0)
            return r0
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            com.revolut.core.model.account.AccountId r15 = r8.v
            com.revolut.retail.core.navigation.NaviCommand r13 = r8.u
            yhm.o.b(r0)
        L3d:
            r14 = r13
            r13 = r15
            goto L57
        L40:
            yhm.o.b(r0)
            r8.u = r13
            r8.v = r15
            r8.f252506y = r3
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            r6 = r15
            r7 = r16
            java.lang.Object r0 = r2.g3(r3, r4, r5, r6, r7, r8)
            if (r0 != r1) goto L3d
            goto L6b
        L57:
            r12 = r0
            h93.f0 r12 = (h93.f0) r12
            r11 = 0
            r8.u = r11
            r8.v = r11
            r8.f252506y = r9
            r15 = 0
            r11 = r10
            r16 = r8
            java.lang.Object r12 = r11.h3(r12, r13, r14, r15, r16)
            if (r12 != r1) goto L6c
        L6b:
            return r1
        L6c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r93.k.Z2(java.lang.String, e93.e, com.revolut.retail.core.navigation.NaviCommand, java.lang.String, com.revolut.core.model.account.AccountId, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(h93.f0 r14, com.revolut.retail.core.navigation.NaviCommand r15, n93.i r16, gim.c r17) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r93.k.d3(h93.f0, com.revolut.retail.core.navigation.NaviCommand, n93.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof r93.e
            if (r0 == 0) goto L13
            r0 = r7
            r93.e r0 = (r93.e) r0
            int r1 = r0.f252502w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f252502w = r1
            goto L18
        L13:
            r93.e r0 = new r93.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f252502w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L80
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            wsg.n r7 = r5.f252515q
            efm.r r6 = r7.b0(r6)
            r38.m r7 = new r38.m
            r2 = 24
            r7.<init>(r5, r2)
            efm.r r6 = pd.b.r(r6, r7)
            r6d.h r7 = new r6d.h
            r2 = 16
            r7.<init>(r2)
            r2 = 0
            efm.r r6 = m70.a.g(r6, r2, r7, r3)
            r7i.r r7 = new r7i.r
            r2 = 7
            r7.<init>(r2)
            r83.d r2 = new r83.d
            r4 = 11
            r2.<init>(r4, r7)
            efm.r r6 = r6.map(r2)
            java.lang.String r7 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            od0.h r7 = od0.i.Companion
            r7.getClass()
            od0.i r7 = od0.i.f224256b
            efm.r r6 = ue0.e.E(r6, r7)
            r4k.a r7 = new r4k.a
            r2 = 17
            r7.<init>(r2)
            r0.f252502w = r3
            java.lang.Object r7 = nim.a.d(r6, r7, r0)
            if (r7 != r1) goto L80
            return r1
        L80:
            od0.i r7 = (od0.i) r7
            java.lang.Object r6 = r7.f224257a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r93.k.e3(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(h93.f0 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof r93.f
            if (r0 == 0) goto L13
            r0 = r6
            r93.f r0 = (r93.f) r0
            int r1 = r0.f252503w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f252503w = r1
            goto L18
        L13:
            r93.f r0 = new r93.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f252503w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r5 = r5.u
            r0.f252503w = r3
            java.lang.Object r6 = r4.e3(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r6 = (com.revolut.feature.junior_profile.api.models.JuniorBankingProfile) r6
            r5 = 0
            if (r6 == 0) goto L52
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.cards_core.R$string.junior_virtual_card_order_success_title
            java.lang.String r6 = r6.f77099b
            java.util.List r6 = zhm.u.c(r6)
            r2 = 12
            r0.<init>(r1, r6, r5, r2)
            return r0
        L52:
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.cards_core.R$string.junior_card_order_virtual_dialog_success_title
            r1 = 14
            r6.<init>(r0, r5, r5, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r93.k.f3(h93.f0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(java.lang.String r17, e93.e r18, java.lang.String r19, com.revolut.core.model.account.AccountId r20, java.lang.String r21, gim.c r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            r2 = r22
            boolean r3 = r2 instanceof r93.h
            if (r3 == 0) goto L19
            r3 = r2
            r93.h r3 = (r93.h) r3
            int r4 = r3.f252507w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f252507w = r4
            goto L1e
        L19:
            r93.h r3 = new r93.h
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f252507w
            r6 = 1
            if (r5 == 0) goto L35
            if (r5 != r6) goto L2d
            yhm.o.b(r2)
            goto L67
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            yhm.o.b(r2)
            boolean r2 = r1 instanceof com.revolut.core.model.account.AccountId.Joint
            r5 = 0
            if (r2 == 0) goto L40
            com.revolut.core.model.account.AccountId$Joint r1 = (com.revolut.core.model.account.AccountId.Joint) r1
            goto L41
        L40:
            r1 = r5
        L41:
            if (r1 == 0) goto L45
            java.lang.String r5 = r1.f51413b
        L45:
            if (r5 != 0) goto L4a
            r12 = r21
            goto L4b
        L4a:
            r12 = r5
        L4b:
            l93.f r1 = r0.f252511l
            r7 = r1
            ha3.x r7 = (ha3.x) r7
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r8 = r17
            r9 = r18
            r10 = r19
            ufm.b r1 = r7.t(r8, r9, r10, r11, r12, r13, r14, r15)
            r3.f252507w = r6
            java.lang.Object r2 = nim.a.b(r1, r3)
            if (r2 != r4) goto L67
            return r4
        L67:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r93.k.g3(java.lang.String, e93.e, java.lang.String, com.revolut.core.model.account.AccountId, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        if (r13 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        if (r13 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00da, code lost:
    
        if (r13 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(h93.f0 r9, com.revolut.core.model.account.AccountId r10, com.revolut.retail.core.navigation.NaviCommand r11, n93.i r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r93.k.h3(h93.f0, com.revolut.core.model.account.AccountId, com.revolut.retail.core.navigation.NaviCommand, n93.i, gim.c):java.lang.Object");
    }
}
