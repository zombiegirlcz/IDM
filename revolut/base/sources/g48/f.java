package g48;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.joint.api.models.JointDeeplink;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements k38.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f140364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mp.r f140365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rqi.c f140366c;
    public final z d;
    public final gte.a e;

    public f(sri.m navigator, mp.r jointFeatureState, rqi.c navigationCommandFactory, z deeplinkNaviCommandProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(jointFeatureState, "jointFeatureState");
        Intrinsics.checkNotNullParameter(navigationCommandFactory, "navigationCommandFactory");
        Intrinsics.checkNotNullParameter(deeplinkNaviCommandProvider, "deeplinkNaviCommandProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f140364a = navigator;
        this.f140365b = jointFeatureState;
        this.f140366c = navigationCommandFactory;
        this.d = deeplinkNaviCommandProvider;
        this.e = featureToggleInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return u38.e.a(deeplink) != null;
    }

    public final efm.d0 b(JointDeeplink deeplink, boolean z) {
        boolean zA = this.e.a(SavingsApi$Toggles.JointAccountsSavings.f83075c);
        boolean zC = ((y91.b) this.f140365b.f207713b).c();
        if (zC && zA && deeplink.equals(JointDeeplink.SavingsCreate.f76480a)) {
            NaviCommand naviCommandC = c();
            if (z) {
                naviCommandC = com.revolut.retail.core.navigation.a.c(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(null, null), null, null, 12), naviCommandC);
            }
            ufm.b bVarM = efm.d0.m(naviCommandC);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (!zC) {
            NaviCommand naviCommandC2 = c();
            if (z) {
                naviCommandC2 = com.revolut.retail.core.navigation.a.c(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(null, null), null, null, 12), naviCommandC2);
            }
            ufm.b bVarM2 = efm.d0.m(naviCommandC2);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        boolean z3 = deeplink instanceof JointDeeplink.AccountId;
        int i = 0;
        z zVar = this.d;
        if (z3) {
            ufm.i iVar = new ufm.i(te0.w.o0(skm.p0.f264003c, new p(zVar, (JointDeeplink.AccountId) deeplink, null)), new g1i.i0(21, new g(zVar, i)), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return iVar;
        }
        if (deeplink instanceof JointDeeplink.Home) {
            return zVar.b();
        }
        int i2 = 2;
        if (deeplink instanceof JointDeeplink.InvitationRemind) {
            JointDeeplink.InvitationRemind invitationRemind = (JointDeeplink.InvitationRemind) deeplink;
            ufm.i iVar2 = new ufm.i(te0.w.o0(skm.p0.f264003c, new u(zVar, invitationRemind, null)), new k(7, new j(zVar, invitationRemind, i2)), 0);
            Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
            return iVar2;
        }
        if (deeplink instanceof JointDeeplink.TopUp) {
            ufm.i iVar3 = new ufm.i(te0.w.o0(skm.p0.f264003c, new x(zVar, null)), new g1i.i0(20, new g0f.f(zVar, (JointDeeplink.TopUp) deeplink, 27)), 0);
            Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
            return iVar3;
        }
        int i3 = 8;
        if (deeplink instanceof JointDeeplink.FirstPurchase) {
            return zVar.a(new g3e.h(i3));
        }
        if (deeplink instanceof JointDeeplink.CardOrdering) {
            return zVar.e(true, new g3e.s(i2));
        }
        if (deeplink instanceof JointDeeplink.CardOrderingSelection) {
            return zVar.e(((JointDeeplink.CardOrderingSelection) deeplink).f76469a, new g3e.s(4));
        }
        if (deeplink instanceof JointDeeplink.SavingsClosed) {
            ufm.i iVar4 = new ufm.i(zVar.d(), new g1i.i0(24, new a6j.a((JointDeeplink.SavingsClosed) deeplink, z, 26)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
            return iVar4;
        }
        int i5 = 28;
        if (deeplink instanceof JointDeeplink.SubaccountClosed) {
            ufm.i iVar5 = new ufm.i(zVar.d(), new g1i.i0(19, new a6j.a((JointDeeplink.SubaccountClosed) deeplink, z, i5)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar5, "map(...)");
            return iVar5;
        }
        int i6 = 3;
        if (deeplink instanceof JointDeeplink.CardToGooglePay) {
            return zVar.e(((JointDeeplink.CardToGooglePay) deeplink).f76470a, new g3e.s(i6));
        }
        if (deeplink instanceof JointDeeplink.TopUpMethods) {
            ufm.i iVar6 = new ufm.i(te0.w.o0(skm.p0.f264003c, new w(zVar, null)), new g1i.i0(22, new g0f.f(zVar, (JointDeeplink.TopUpMethods) deeplink, i5)), 0);
            Intrinsics.checkNotNullExpressionValue(iVar6, "flatMap(...)");
            return iVar6;
        }
        if (deeplink instanceof JointDeeplink.SavingsCreate) {
            return te0.w.o0(skm.p0.f264003c, new o(zVar, null));
        }
        if (!(deeplink instanceof JointDeeplink.Invitation)) {
            if (deeplink instanceof JointDeeplink.InvitationMcy) {
                return te0.w.o0(skm.p0.f264003c, new v(zVar, (JointDeeplink.InvitationMcy) deeplink, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invitation deeplink must be handled by JointDeeplinkGateway");
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        ufm.i iVar7 = new ufm.i(te0.w.o0(skm.p0.f264003c, new t(zVar, (JointDeeplink.Invitation) deeplink, null)), new k(i3, new g(zVar, i6)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
        return iVar7;
    }

    public final ActivityNavigateCommand c() {
        com.revolut.feature.blue_prompt.fullscreen.a aVar = ms2.g.Companion;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.joint_prompt_app_update_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.joint_prompt_app_update_description, null, null, 14);
        BluePromptContent.MediaContent mediaContent = new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D010", null, null, null, 30));
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.joint_prompt_app_update_button_title, null, null, 14);
        ActivityNavigateCommand activityNavigateCommandC = this.f140366c.c();
        k9 k9Var = k9.JointAccounts;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return com.revolut.feature.blue_prompt.fullscreen.a.a(aVar, textLocalisedClause, textLocalisedClause2, mediaContent, null, textLocalisedClause3, null, activityNavigateCommandC, null, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 33291953);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g48.e
            if (r0 == 0) goto L13
            r0 = r6
            g48.e r0 = (g48.e) r0
            int r1 = r0.f140362w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140362w = r1
            goto L1a
        L13:
            g48.e r0 = new g48.e
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140362w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            com.revolut.feature.joint.api.models.JointDeeplink r6 = u38.e.a(r5)
            if (r6 == 0) goto L5c
            boolean r5 = r5.l()
            efm.d0 r5 = r4.b(r6, r5)
            r0.f140362w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            q06.h r5 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            kotlin.jvm.internal.Intrinsics.h(r6)
            r0.<init>(r6)
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L5c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Required value was null."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g48.f.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        JointDeeplink jointDeeplinkA = u38.e.a(deeplink);
        if (jointDeeplinkA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ufm.i iVar = new ufm.i(b(jointDeeplinkA, z), new g1i.i0(18, new g1.b(this, 26)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
