package mxa;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.referrals.api.ReferralsDeeplinkApi$Toggles;
import com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingControllerContract$InputData;
import com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingControllerContract$PersonalizedTrackingNavigationDestination;
import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import dy0.o;
import efm.d0;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.t;
import mx0.a7;
import mx0.bc;
import mx0.oc;
import org.jetbrains.annotations.NotNull;
import pwa.l;
import pwa.n;
import sri.m;
import ufm.i;
import wp5.y;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements vva.c {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f210243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f210244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f210245c;

    public g(m navigator, gte.a featureToggleInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f210243a = navigator;
        this.f210244b = featureToggleInteractor;
        this.f210245c = userInteractor;
    }

    public static FeatureCommand b(o oVar) {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, oVar), null, null, 6)));
    }

    public static ufm.b c(String str, n nVar) {
        ufm.b bVarM = d0.m(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new PersonalizedTrackingControllerContract$PersonalizedTrackingNavigationDestination(new PersonalizedTrackingControllerContract$InputData.Code(str, nVar)), false, (Integer) null, 0, 61)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ufm.b d(jf0.c r9, boolean r10) {
        /*
            java.util.HashMap r0 = r9.d
            java.lang.String r1 = "inviteId"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            if (r1 == 0) goto L77
            java.lang.String r9 = "campaignType"
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L36
            pwa.n[] r10 = pwa.n.values()
            int r3 = r10.length
            r4 = 0
        L1d:
            if (r4 >= r3) goto L31
            r5 = r10[r4]
            java.lang.String r6 = r5.name()
            r7 = 1
            boolean r6 = kotlin.text.a0.z(r6, r9, r7)
            if (r6 == 0) goto L2e
            r2 = r5
            goto L31
        L2e:
            int r4 = r4 + 1
            goto L1d
        L31:
            if (r2 != 0) goto L34
            goto L36
        L34:
            r7 = r2
            goto L39
        L36:
            pwa.n r2 = pwa.n.STANDARD
            goto L34
        L39:
            com.revolut.feature.referrals.shared.ui.api.navigation.InvitesDetailsDestination$ByInviteeId r9 = new com.revolut.feature.referrals.shared.ui.api.navigation.InvitesDetailsDestination$ByInviteeId
            boolean r10 = pwa.l.c(r7)
            r9.<init>(r1, r7, r10)
            com.revolut.retail.core.navigation.FeatureCommand r9 = zh9.u0.f(r9)
            boolean r10 = pwa.l.c(r7)
            java.lang.String r1 = "just(...)"
            if (r10 != 0) goto L6f
            com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig$InviteCampaignHomeNavigationDestination r3 = new com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig$InviteCampaignHomeNavigationDestination
            java.lang.String r10 = "source"
            java.lang.Object r10 = r0.get(r10)
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
            r8 = 3
            r4 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            com.revolut.retail.core.navigation.FeatureCommand r10 = zh9.u0.f(r3)
            com.revolut.retail.core.navigation.CompositeCommand r9 = com.revolut.retail.core.navigation.a.c(r10, r9)
            ufm.b r9 = efm.d0.m(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            return r9
        L6f:
            ufm.b r9 = efm.d0.m(r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            return r9
        L77:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r3 = "inviteId is null"
            java.lang.String r4 = "ReferralsActionPerformerImpl"
            rd0.d.a(r1, r4, r3, r2, r0)
            ufm.b r9 = j(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mxa.g.d(jf0.c, boolean):ufm.b");
    }

    public static ufm.b h(jf0.c cVar, boolean z) {
        if (!Intrinsics.f(cVar.e(3), "all-invites")) {
            return j(cVar, z && cVar.l());
        }
        ufm.b bVarM = d0.m(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) ReferralsBizFeatureConfig.AllReferralsTroubleshooterNavigationDestination.f81830a, false, (Integer) null, 0, 61)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public static ufm.b i() {
        ufm.b bVarM = d0.m(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) ReferralsBizFeatureConfig.ReferralsTroubleshooterNavigationDestination.f81838a, false, (Integer) null, 0, 61)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ufm.b j(jf0.c r12, boolean r13) {
        /*
            java.util.HashMap r12 = r12.d
            java.lang.String r0 = "campaignType"
            java.lang.Object r0 = r12.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            if (r0 == 0) goto L2c
            pwa.n[] r2 = pwa.n.values()
            int r3 = r2.length
            r4 = r1
        L13:
            if (r4 >= r3) goto L26
            r5 = r2[r4]
            java.lang.String r6 = r5.name()
            r7 = 1
            boolean r6 = kotlin.text.a0.z(r6, r0, r7)
            if (r6 == 0) goto L23
            goto L27
        L23:
            int r4 = r4 + 1
            goto L13
        L26:
            r5 = 0
        L27:
            if (r5 != 0) goto L2a
            goto L2c
        L2a:
            r10 = r5
            goto L2f
        L2c:
            pwa.n r5 = pwa.n.STANDARD
            goto L2a
        L2f:
            java.lang.String r0 = "showShareSheet"
            java.lang.Object r0 = r12.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L43
            java.lang.Boolean r0 = kotlin.text.d0.E0(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
        L43:
            r8 = r1
            java.lang.String r0 = "source"
            java.lang.Object r12 = r12.get(r0)
            r9 = r12
            java.lang.String r9 = (java.lang.String) r9
            com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig$InviteCampaignHomeNavigationDestination r6 = new com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig$InviteCampaignHomeNavigationDestination
            r7 = 0
            r11 = 1
            r6.<init>(r7, r8, r9, r10, r11)
            com.revolut.retail.core.navigation.FeatureCommand r12 = zh9.u0.f(r6)
            if (r13 == 0) goto L69
            dy0.o r13 = dy0.o.RIGHT
            com.revolut.retail.core.navigation.FeatureCommand r13 = b(r13)
            com.revolut.retail.core.navigation.CompositeCommand r12 = com.revolut.retail.core.navigation.a.c(r13, r12)
            ufm.b r12 = efm.d0.m(r12)
            return r12
        L69:
            ufm.b r12 = efm.d0.m(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: mxa.g.j(jf0.c, boolean):ufm.b");
    }

    public static ufm.b k() {
        ufm.b bVarM = d0.m(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6))), u0.f(new ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination(true, false, null, null, 14))));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "referral");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mxa.g.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c cVar, boolean z) throws IOException {
        d0 d0VarJ;
        if (y.D(cVar, "deeplink", 2, "multi-level-modal")) {
            d0VarJ = k();
        } else if (Intrinsics.f(cVar.e(2), "c2b")) {
            d0VarJ = d0.m(u0.f(ReferralsBizFeatureConfig.C2BReferralsNavigationDestination.f81831a));
            Intrinsics.checkNotNullExpressionValue(d0VarJ, "just(...)");
        } else if (Intrinsics.f(cVar.e(2), "troubleshooter")) {
            d0VarJ = i();
        } else if (Intrinsics.f(cVar.e(2), "details")) {
            d0VarJ = d(cVar, z);
        } else if (Intrinsics.f(cVar.e(2), "personalized-tracking") && Intrinsics.f(cVar.e(3), "details")) {
            d0VarJ = g(cVar, z);
        } else if (Intrinsics.f(cVar.e(2), "help")) {
            d0VarJ = h(cVar, z);
        } else {
            d0VarJ = j(cVar, z && cVar.l());
        }
        i iVar = new i(new ufm.f(d0VarJ, new bc(new a7(this, 10), 10), 3), new bc(new oc(3), 11), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final d0 g(jf0.c cVar, boolean z) throws IOException {
        n nVar;
        String str = (String) cVar.d.get("inviteId");
        HashMap map = cVar.d;
        String str2 = (String) map.get("code");
        String str3 = (String) map.get("campaignType");
        if (str3 != null) {
            n[] nVarArrValues = n.values();
            int length = nVarArrValues.length;
            for (int i = 0; i < length; i++) {
                nVar = nVarArrValues[i];
                if (a0.z(nVar.name(), str3, true)) {
                    break;
                }
            }
            nVar = null;
        } else {
            nVar = null;
        }
        ReferralsDeeplinkApi$Toggles.SalaryReferral salaryReferral = ReferralsDeeplinkApi$Toggles.SalaryReferral.f81672c;
        gte.a aVar = this.f210244b;
        if (((jte.d) aVar).c(salaryReferral) && ((str == null || kotlin.text.d0.W(str)) && str2 != null && !kotlin.text.d0.W(str2) && l.c(nVar))) {
            if (nVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            i iVar = new i(new i(this.f210245c.f(false), new bc(new d(str2, this, nVar), 12), 0), new bc(new d(this, str2, nVar), 13), 2);
            Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
            return iVar;
        }
        PersonalizedTrackingControllerContract$InputData.InviteId inviteId = (str == null || kotlin.text.d0.W(str)) ? null : new PersonalizedTrackingControllerContract$InputData.InviteId(str, nVar);
        if (inviteId != null) {
            ufm.b bVarM = d0.m(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new PersonalizedTrackingControllerContract$PersonalizedTrackingNavigationDestination(inviteId), false, (Integer) null, 0, 61)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        String strE = t.e("\n                Wrong combination: inviteId [" + str + "], \n                salaryReferral [" + ((jte.d) aVar).c(salaryReferral) + "],\n                code [" + str2 + "] and campaignType [" + nVar + "]\n            ");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "ReferralsActionPerformerImpl", strE, null, h0Var);
        return j(cVar, z);
    }
}
