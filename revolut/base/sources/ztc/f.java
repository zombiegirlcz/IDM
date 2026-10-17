package ztc;

import com.revolut.feature.payees.api.models.PayeesTargetUser;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import ha3.x;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import sri.m;
import te0.w;
import ufm.i;
import wp5.y;
import wtc.h;
import zr2.o;
import zr5.k;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements rtc.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f325095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f325096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f325097c;
    public final ptc.a d;

    public f(m navigator, l93.f revolutCardsInteractor, h linkedWalletsInteractor, ptc.a wealthProtectionInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(linkedWalletsInteractor, "linkedWalletsInteractor");
        Intrinsics.checkNotNullParameter(wealthProtectionInteractor, "wealthProtectionInteractor");
        this.f325095a = navigator;
        this.f325096b = revolutCardsInteractor;
        this.f325097c = linkedWalletsInteractor;
        this.d = wealthProtectionInteractor;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SecurityHubStartScreen c(jf0.c cVar) {
        if (d0.J(cVar.f173627a, "revolut://app/cards/security", false)) {
            return SecurityHubStartScreen.CardSecurity.f85373a;
        }
        String strE = cVar.e(2);
        HashMap map = cVar.d;
        switch (strE.hashCode()) {
            case -1562139355:
                if (strE.equals("gambling-block")) {
                    return SecurityHubStartScreen.GamblingBlock.f85374a;
                }
                break;
            case -995215829:
                if (strE.equals("payees")) {
                    return new SecurityHubStartScreen.Payees(PayeesTargetUser.All.f78988a);
                }
                break;
            case -829967111:
                if (strE.equals("wealth-protection")) {
                    return SecurityHubStartScreen.WealthProtection.f85392a;
                }
                break;
            case 358153541:
                if (strE.equals("merchants-and-payments")) {
                    return SecurityHubStartScreen.ManageMerchants.f85383a;
                }
                break;
            case 994645033:
                if (strE.equals("learn-about-security")) {
                    return SecurityHubStartScreen.LearnAboutSecurity.f85376a;
                }
                break;
            case 1456477196:
                if (strE.equals("transaction-limit")) {
                    String strE2 = cVar.e(3);
                    return strE2.length() > 0 ? new SecurityHubStartScreen.TransactionsLimitChange(strE2, Boolean.parseBoolean((String) map.get("joint"))) : SecurityHubStartScreen.TransactionsLimits.f85391a;
                }
                break;
            case 1711091999:
                if (strE.equals("lost-device")) {
                    return SecurityHubStartScreen.SecureAccount.f85385a;
                }
                break;
            case 2016709606:
                if (strE.equals("linked-wallets")) {
                    return Boolean.parseBoolean((String) map.get("dismiss")) ? SecurityHubStartScreen.LinkedWalletsAcknowledgeNew.f85380a : SecurityHubStartScreen.LinkedWallets.f85379a;
                }
                break;
        }
        return SecurityHubStartScreen.SecurityHub.f85386a;
    }

    public static SecurityHubDestination d(jf0.c cVar, SecurityHubStartScreen securityHubStartScreen) {
        boolean z = Boolean.parseBoolean((String) cVar.d.get("skipArticle"));
        HashMap map = cVar.d;
        return new SecurityHubDestination(securityHubStartScreen, z, (String) map.get("articleId"), Intrinsics.f(map.get("presentation_type"), "inline"), 16);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "security-hub") || d0.J(cVar.f173627a, "revolut://app/cards/security", false) || (Intrinsics.f(cVar.e(1), "cards") && Intrinsics.f(cVar.e(3), "linked-wallets"));
    }

    public final efm.d0 b(jf0.c cVar) {
        String strE = cVar.e(2);
        int i = 4;
        String strE2 = cVar.e(4);
        if (strE2.length() == 0) {
            ufm.b bVarM = efm.d0.m(new SecurityHubDestination((SecurityHubStartScreen) new SecurityHubStartScreen.LinkedWalletsFromCardSettings(strE), true, (String) null, true, 16));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        ufm.b bVarN = ((x) this.f325096b).n(strE);
        ufm.b bVarO0 = w.o0(kotlin.coroutines.g.f186406a, new k(this, strE2, null, i));
        c cVar2 = c.f;
        return new i(efm.d0.D(bVarN, bVarO0, new zii.f(3)), new zmg.c(new o(17), 26), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ztc.d
            if (r0 == 0) goto L13
            r0 = r8
            ztc.d r0 = (ztc.d) r0
            int r1 = r0.f325092w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f325092w = r1
            goto L1a
        L13:
            ztc.d r0 = new ztc.d
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f325092w
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r8)
            goto L8c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            goto L5c
        L39:
            yhm.o.b(r8)
            java.lang.String r8 = r7.e(r4)
            java.lang.String r2 = "wealth-protection"
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            r2 = 3
            if (r8 == 0) goto L67
            java.lang.String r8 = r7.e(r2)
            int r8 = r8.length()
            if (r8 <= 0) goto L67
            r0.f325092w = r3
            java.lang.Object r8 = r6.g(r7, r0)
            if (r8 != r1) goto L5c
            goto L8b
        L5c:
            com.revolut.feature.security_hub.api.navigation.SecurityHubDestination r8 = (com.revolut.feature.security_hub.api.navigation.SecurityHubDestination) r8
            if (r8 == 0) goto L66
            q06.h r7 = new q06.h
            r7.<init>(r8, r5)
            return r7
        L66:
            return r5
        L67:
            java.lang.String r8 = r7.e(r3)
            java.lang.String r3 = "cards"
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r3)
            if (r8 == 0) goto L99
            java.lang.String r8 = r7.e(r2)
            java.lang.String r2 = "linked-wallets"
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r8 == 0) goto L99
            efm.d0 r7 = r6.b(r7)
            r0.f325092w = r4
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            com.revolut.kompot.common.ParcelableDestination r8 = (com.revolut.kompot.common.ParcelableDestination) r8
            q06.h r7 = new q06.h
            r7.<init>(r8, r5)
            return r7
        L99:
            com.revolut.feature.security_hub.api.SecurityHubStartScreen r8 = c(r7)
            com.revolut.feature.security_hub.api.navigation.SecurityHubDestination r8 = d(r7, r8)
            q06.h r0 = new q06.h
            java.util.HashMap r7 = r7.d
            java.lang.String r1 = "presentation_type"
            java.lang.Object r7 = r7.get(r1)
            java.lang.String r1 = "inline"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r1)
            if (r7 == 0) goto Lb4
            goto Lbc
        Lb4:
            q06.b r7 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160140a
            r7.<init>(r1, r5)
            r5 = r7
        Lbc:
            r0.<init>(r8, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ztc.f.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c cVar, boolean z) {
        if (y.D(cVar, "deeplink", 2, "wealth-protection") && cVar.e(3).length() > 0) {
            i iVar = new i(w.o0(kotlin.coroutines.g.f186406a, new z9m.a(this, cVar, (Continuation) null, 10)), new zmg.c(new b(this, 0), 24), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            return iVar;
        }
        if (!Intrinsics.f(cVar.e(1), "cards") || !Intrinsics.f(cVar.e(3), "linked-wallets")) {
            ufm.c cVar2 = new ufm.c(new wf6.w(this, cVar, 11), 2);
            Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
            return cVar2;
        }
        if (cVar.e(2).length() == 0) {
            Intrinsics.checkNotNullExpressionValue(efm.d0.m(Boolean.FALSE), "just(...)");
        }
        i iVar2 = new i(b(cVar), new zmg.c(new b(this, 1), 25), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(jf0.c r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ztc.e
            if (r0 == 0) goto L13
            r0 = r13
            ztc.e r0 = (ztc.e) r0
            int r1 = r0.f325094x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f325094x = r1
            goto L18
        L13:
            ztc.e r0 = new ztc.e
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f325094x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            qtc.k r12 = r0.u
            yhm.o.b(r13)
            goto L83
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            yhm.o.b(r13)
            r13 = 3
            java.lang.String r12 = r12.e(r13)
            qtc.k[] r2 = qtc.k.values()
            int r5 = r2.length
            r6 = 0
        L40:
            if (r6 >= r5) goto L53
            r7 = r2[r6]
            java.lang.String r8 = r7.name()
            boolean r8 = kotlin.text.a0.z(r8, r12, r3)
            if (r8 == 0) goto L50
            r12 = r7
            goto L54
        L50:
            int r6 = r6 + 1
            goto L40
        L53:
            r12 = r4
        L54:
            if (r12 == 0) goto L9f
            ptc.a r2 = r11.d
            wtc.a1 r2 = (wtc.a1) r2
            r2.getClass()
            java.lang.String r5 = "feature"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r5)
            cuc.u r2 = r2.f299851a
            cuc.z r2 = (cuc.z) r2
            r2.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r5)
            x4l.c r2 = r2.d
            w4l.i r5 = w4l.i.f294643c
            vkm.d r2 = r2.b(r12, r5)
            jhi.b r13 = mo3.a.g(r2, r4, r4, r13)
            r0.u = r12
            r0.f325094x = r3
            java.lang.Object r13 = vkm.q.z(r13, r0)
            if (r13 != r1) goto L83
            return r1
        L83:
            com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails r13 = (com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails) r13
            if (r13 == 0) goto L8c
            com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState$Visible r13 = otc.c.a(r13)
            goto L8d
        L8c:
            r13 = r4
        L8d:
            if (r13 == 0) goto L9f
            com.revolut.feature.security_hub.api.navigation.SecurityHubDestination r5 = new com.revolut.feature.security_hub.api.navigation.SecurityHubDestination
            com.revolut.feature.security_hub.api.SecurityHubStartScreen$WealthProtectionChangeLimit r6 = new com.revolut.feature.security_hub.api.SecurityHubStartScreen$WealthProtectionChangeLimit
            r6.<init>(r12, r13)
            r9 = 1
            r10 = 16
            r7 = 1
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L9f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ztc.f.g(jf0.c, gim.c):java.lang.Object");
    }
}
