package v6e;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.feature.vaults.api.VaultsApi$Toggles;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements j6e.b {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f286355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.g f286356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6e.d f286357c;
    public final ang.f d;
    public final gte.a e;
    public final q06.b f;

    public j(sri.m navigator, g6e.g navigationProvider, g6e.d subaccountInteractor, ang.f userInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f286355a = navigator;
        this.f286356b = navigationProvider;
        this.f286357c = subaccountInteractor;
        this.d = userInteractor;
        this.e = featureToggleInteractor;
        this.f = new q06.b(ibb.c.f160140a, null);
    }

    public static NaviCommand b(NaviCommand naviCommand, boolean z) {
        return !z ? naviCommand : com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), null, null, 6))), naviCommand);
    }

    public static String c(jf0.c cVar) {
        return (String) cVar.d.get("id");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SubaccountType d(jf0.c cVar) {
        String str = (String) cVar.d.get("type");
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -979830338:
                if (str.equals("proTax")) {
                    return SubaccountType.ProTax.f88965a;
                }
                return null;
            case 111277:
                if (str.equals("pro")) {
                    return SubaccountType.Pro.f88964a;
                }
                return null;
            case 3023879:
                if (!str.equals("bill")) {
                    return null;
                }
                break;
            case 98629247:
                if (str.equals("group")) {
                    return SubaccountType.Group.f88960a;
                }
                return null;
            case 101304458:
                if (str.equals("joint")) {
                    return SubaccountType.Joint.f88961a;
                }
                return null;
            case 443164224:
                if (!str.equals("personal")) {
                    return null;
                }
                break;
            default:
                return null;
        }
        return SubaccountType.Personal.f88963a;
    }

    public static ActivityNavigateCommand g(String str, String str2) {
        com.revolut.feature.blue_prompt.fullscreen.a aVar = ms2.g.Companion;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.subaccounts_prompt_group_closed_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.subaccounts_prompt_group_closed_description, v.k(str, str2), null, 12);
        BluePromptContent.MediaContent mediaContent = new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d051", null, null, null, 30));
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.subaccounts_prompt_group_closed_action_title, null, null, 14);
        FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
        k9 k9Var = k9.Accounts;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return com.revolut.feature.blue_prompt.fullscreen.a.a(aVar, textLocalisedClause, textLocalisedClause2, mediaContent, null, textLocalisedClause3, null, finishCommand, null, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 33291953);
    }

    public static ActivityNavigateCommand h(String str, String str2) {
        com.revolut.feature.blue_prompt.fullscreen.a aVar = ms2.g.Companion;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.subaccounts_prompt_group_removed_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.subaccounts_prompt_group_removed_description, v.k(str, str2), null, 12);
        BluePromptContent.MediaContent mediaContent = new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d051", null, null, null, 30));
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.subaccounts_prompt_group_removed_action_title, null, null, 14);
        FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
        k9 k9Var = k9.Accounts;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return com.revolut.feature.blue_prompt.fullscreen.a.a(aVar, textLocalisedClause, textLocalisedClause2, mediaContent, null, textLocalisedClause3, null, finishCommand, null, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 33291953);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(1);
        if (Intrinsics.f(strE, "subaccounts")) {
            if (Intrinsics.f(d(deeplink), SubaccountType.Joint.f88961a)) {
                if (!((jte.d) this.e).c(VaultsApi$Toggles.JointSubaccounts.f94695c)) {
                    return false;
                }
            }
        } else if (!Intrinsics.f(strE, "create-pocket")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0139  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v6e.j.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bc  */
    @Override // jf0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.d0 f(jf0.c r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v6e.j.f(jf0.c, boolean):efm.d0");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(jf0.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof v6e.f
            if (r0 == 0) goto L13
            r0 = r6
            v6e.f r0 = (v6e.f) r0
            int r1 = r0.f286350w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286350w = r1
            goto L18
        L13:
            v6e.f r0 = new v6e.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286350w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r5 = c(r5)
            if (r5 != 0) goto L3a
            r5 = 0
            return r5
        L3a:
            r0.f286350w = r3
            g6e.g r6 = r4.f286356b
            v6e.r r6 = (v6e.r) r6
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            q06.h r5 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r6)
            q06.b r6 = r4.f
            r5.<init>(r0, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v6e.j.i(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(jf0.c r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof v6e.g
            if (r0 == 0) goto L13
            r0 = r8
            v6e.g r0 = (v6e.g) r0
            int r1 = r0.f286352x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286352x = r1
            goto L18
        L13:
            v6e.g r0 = new v6e.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286352x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L6d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            java.lang.String r8 = c(r7)
            if (r8 != 0) goto L3c
            goto L71
        L3c:
            com.revolut.feature.subaccount.api.models.SubaccountType r7 = d(r7)
            if (r7 != 0) goto L43
            goto L71
        L43:
            g6e.d r2 = r6.f286357c
            s6e.z r2 = (s6e.z) r2
            vkm.d r7 = r2.v(r8, r7)
            kotlin.coroutines.g r2 = kotlin.coroutines.g.f186406a
            efm.r r7 = rd0.e.c(r7, r2)
            r2 = 3
            efm.r r7 = m70.a.g(r7, r4, r4, r2)
            efm.k r7 = r7.firstElement()
            java.lang.String r2 = "firstElement(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.u = r8
            r0.f286352x = r3
            java.lang.Object r7 = nim.a.i(r7, r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            r5 = r8
            r8 = r7
            r7 = r5
        L6d:
            com.revolut.feature.subaccount.api.models.Subaccount r8 = (com.revolut.feature.subaccount.api.models.Subaccount) r8
            if (r8 != 0) goto L72
        L71:
            return r4
        L72:
            q06.h r8 = new q06.h
            com.revolut.feature.subaccount.api.SubaccountAddMoneyDestination r0 = new com.revolut.feature.subaccount.api.SubaccountAddMoneyDestination
            r0.<init>(r7)
            q06.b r7 = r6.f
            r8.<init>(r0, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v6e.j.j(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(jf0.c r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof v6e.h
            if (r0 == 0) goto L13
            r0 = r7
            v6e.h r0 = (v6e.h) r0
            int r1 = r0.f286353w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286353w = r1
            goto L18
        L13:
            v6e.h r0 = new v6e.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286353w
            q06.b r3 = r5.f
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            com.revolut.feature.subaccount.api.models.SubaccountType r6 = d(r6)
            com.revolut.feature.subaccount.api.models.SubaccountType$Joint r7 = com.revolut.feature.subaccount.api.models.SubaccountType.Joint.f88961a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 == 0) goto L5a
            r0.f286353w = r4
            g6e.g r6 = r5.f286356b
            v6e.r r6 = (v6e.r) r6
            java.lang.Object r7 = r6.g(r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            q06.h r6 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r7)
            r6.<init>(r0, r3)
            return r6
        L5a:
            com.revolut.feature.subaccount.api.models.SubaccountType$Junior r7 = com.revolut.feature.subaccount.api.models.SubaccountType.Junior.f88962a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            r0 = 0
            if (r7 != 0) goto La0
            com.revolut.feature.subaccount.api.models.SubaccountType$Pro r7 = com.revolut.feature.subaccount.api.models.SubaccountType.Pro.f88964a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 != 0) goto La0
            com.revolut.feature.subaccount.api.models.SubaccountType$ProTax r7 = com.revolut.feature.subaccount.api.models.SubaccountType.ProTax.f88965a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 != 0) goto La0
            com.revolut.feature.subaccount.api.models.SubaccountType$Teen r7 = com.revolut.feature.subaccount.api.models.SubaccountType.Teen.f88966a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 == 0) goto L7c
            goto La0
        L7c:
            com.revolut.feature.subaccount.api.models.SubaccountType$Personal r7 = com.revolut.feature.subaccount.api.models.SubaccountType.Personal.f88963a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 != 0) goto L95
            com.revolut.feature.subaccount.api.models.SubaccountType$Group r7 = com.revolut.feature.subaccount.api.models.SubaccountType.Group.f88960a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 != 0) goto L95
            if (r6 != 0) goto L8f
            goto L95
        L8f:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L95:
            q06.h r6 = new q06.h
            com.revolut.feature.subaccount.api.CreateSubaccountScreenDestination r7 = new com.revolut.feature.subaccount.api.CreateSubaccountScreenDestination
            r7.<init>(r0)
            r6.<init>(r7, r3)
            return r6
        La0:
            q06.h r6 = new q06.h
            com.revolut.feature.subaccount.api.CreateSubaccountScreenDestination r7 = new com.revolut.feature.subaccount.api.CreateSubaccountScreenDestination
            r7.<init>(r0)
            r6.<init>(r7, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v6e.j.k(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(jf0.c r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof v6e.i
            if (r0 == 0) goto L13
            r0 = r10
            v6e.i r0 = (v6e.i) r0
            int r1 = r0.f286354w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286354w = r1
            goto L18
        L13:
            v6e.i r0 = new v6e.i
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286354w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r10)
            goto L71
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            yhm.o.b(r10)
            java.lang.String r10 = c(r9)
            if (r10 != 0) goto L3a
            goto L75
        L3a:
            com.revolut.feature.subaccount.api.models.SubaccountType r9 = d(r9)
            if (r9 != 0) goto L41
            goto L75
        L41:
            g6e.d r2 = r8.f286357c
            s6e.z r2 = (s6e.z) r2
            vkm.d r9 = r2.v(r10, r9)
            kotlin.coroutines.g r10 = kotlin.coroutines.g.f186406a
            efm.r r9 = rd0.e.c(r9, r10)
            ang.f r10 = r8.d
            r2 = 0
            efm.r r10 = r10.k(r2)
            efm.r r9 = kli.a.h(r9, r10)
            r10 = 3
            efm.r r9 = m70.a.g(r9, r4, r4, r10)
            efm.k r9 = r9.firstElement()
            java.lang.String r10 = "firstElement(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            r0.f286354w = r3
            java.lang.Object r10 = nim.a.i(r9, r0)
            if (r10 != r1) goto L71
            return r1
        L71:
            kotlin.Pair r10 = (kotlin.Pair) r10
            if (r10 != 0) goto L76
        L75:
            return r4
        L76:
            java.lang.Object r9 = r10.f186385a
            r1 = r9
            com.revolut.feature.subaccount.api.models.Subaccount r1 = (com.revolut.feature.subaccount.api.models.Subaccount) r1
            java.lang.Object r9 = r10.f186386b
            do3.n r9 = (do3.n) r9
            boolean r2 = x8e.a.c(r1, r9)
            r6 = 0
            r7 = 508(0x1fc, float:7.12E-43)
            g6e.g r0 = r8.f286356b
            r3 = 0
            r4 = 0
            r5 = 0
            com.revolut.retail.core.navigation.FeatureCommand r9 = g6e.g.b(r0, r1, r2, r3, r4, r5, r6, r7)
            q06.h r10 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r9)
            q06.b r9 = r8.f
            r10.<init>(r0, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: v6e.j.l(jf0.c, gim.c):java.lang.Object");
    }
}
