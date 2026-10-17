package lqk;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.feature.vaults.R$string;
import com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.tm0;
import ip0.um0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l3l.m;
import lb0.b0;
import pcd.s;
import pcd.x;
import rp0.t;
import rp0.y;
import rsi.g;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f199329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f199330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ppg.b f199331n;

    public d(j60.a expandableControllerExtension, f membersWidgetDialogFactory, ppg.b vaultsInteractor) {
        Intrinsics.checkNotNullParameter(expandableControllerExtension, "expandableControllerExtension");
        Intrinsics.checkNotNullParameter(membersWidgetDialogFactory, "membersWidgetDialogFactory");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        this.f199329l = expandableControllerExtension;
        this.f199330m = membersWidgetDialogFactory;
        this.f199331n = vaultsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable b3(lqk.d r5, java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof lqk.c
            if (r0 == 0) goto L16
            r0 = r8
            lqk.c r0 = (lqk.c) r0
            int r1 = r0.f199328x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f199328x = r1
            goto L1b
        L16:
            lqk.c r0 = new lqk.c
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f199328x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L54
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r8)
            ppg.b r5 = r5.f199331n
            ypg.p r5 = (ypg.p) r5
            efm.r r5 = r5.i(r6)
            r6 = 3
            efm.r r5 = m70.a.g(r5, r4, r4, r6)
            vkm.d r5 = rd0.e.b(r5)
            r0.u = r7
            r0.f199328x = r3
            java.lang.Object r8 = vkm.q.x(r5, r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            pcd.s r8 = (pcd.s) r8
            java.util.List r5 = r8.k
            if (r5 == 0) goto L7b
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L60:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L76
            java.lang.Object r6 = r5.next()
            r8 = r6
            pcd.x r8 = (pcd.x) r8
            java.lang.String r8 = r8.f234903a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r7)
            if (r8 == 0) goto L60
            r4 = r6
        L76:
            pcd.x r4 = (pcd.x) r4
            if (r4 == 0) goto L7b
            return r4
        L7b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Vault Member not found"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lqk.d.b3(lqk.d, java.lang.String, java.lang.String, gim.c):java.io.Serializable");
    }

    @Override // rsi.g
    public final Unit Z2(rsi.f fVar, Continuation continuation) {
        Unit unit;
        j60.a aVar = this.f199329l;
        Continuation continuation2 = null;
        j60.a.v(aVar, true, null, 2);
        GroupMemberClickData memberData = fVar.a();
        if (fVar instanceof rsi.c) {
            c3("remind", new a(this, memberData.f98697b.f234881a, memberData.f98696a.f234903a, continuation2, 1));
        } else {
            boolean z = fVar instanceof rsi.d;
            f fVar2 = this.f199330m;
            if (z) {
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(memberData, "memberData");
                s sVar = memberData.f98697b;
                x xVar = memberData.f98696a;
                String str = null;
                aVar.x(new y(u.c(new um0("ACTION_ID_CONFIRM_REMOVE", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), false, null, str, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_remove, null, null, 14), false, str, null, 56), (Object) memberData, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(new TextLocalisedClause(R$string.vaults_details_group_vaults_remove_member_alert_title, u.c(uj3.b.l(xVar)), null, 12), new TextLocalisedClause(com.revolut.retail.feature.actions.impl.R$string.retail_accounts_subaccount_members_widget_remove_dialog_description, v.k(uj3.b.l(xVar), sVar.f234885h.f234859a), null, 12), null, 28), null, null, null, null, "DELEGATES_KEY_REMOVE_CONFIRMATION_DIALOG", null, null, null, 3836));
            } else {
                if (!(fVar instanceof rsi.a)) {
                    if (fVar instanceof rsi.b) {
                        String str2 = memberData.f98697b.f234881a;
                        x xVar2 = memberData.f98696a;
                        j60.a.v(aVar, false, null, 3);
                        c3("toggle withdrawal", new b(this, xVar2, str2, (Continuation) null));
                        Unit unit2 = Unit.f186387a;
                        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                        return unit2;
                    }
                    if (!(fVar instanceof rsi.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x xVar3 = memberData.f98696a;
                    String str3 = memberData.f98697b.f234881a;
                    Set set = xVar3.f234906g;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        fVar2.getClass();
                        Intrinsics.checkNotNullParameter(memberData, "memberData");
                        String str4 = null;
                        int i = 56;
                        AnimatedResourceImage animatedResourceImage = null;
                        boolean z3 = false;
                        String str5 = null;
                        aVar.x(new y(u.c(new um0("ACTION_ID_CONFIRM_WITHDRAW", new tm0(LargeActionButton.ButtonStyle.f58726b, animatedResourceImage, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), z3, str5, str4, i), new tm0(LargeActionButton.ButtonStyle.f58725a, animatedResourceImage, new TextLocalisedClause(R.string.common_action_confirm, null, null, 14), z3, str5, str4, i), (Object) memberData, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(new TextLocalisedClause(R$string.vaults_withdrawal_permissions_grant_alert_title, null, null, 14), new TextLocalisedClause(R$string.vaults_withdrawal_permissions_grant_alert_subtitle, null, null, 14), null, 28), null, null, null, null, "DELEGATES_KEY_WITHDRAWAL_CONFIRMATION_DIALOG", null, null, null, 3836));
                        unit = Unit.f186387a;
                    } else {
                        Iterator it8 = set.iterator();
                        while (it8.hasNext()) {
                            if (((pcd.y) it8.next()) == pcd.y.WITHDRAW) {
                                j60.a.v(aVar, false, null, 3);
                                c3("toggle withdrawal", new b(this, xVar3, str3, (Continuation) null));
                                unit = Unit.f186387a;
                                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                                break;
                            }
                        }
                        fVar2.getClass();
                        Intrinsics.checkNotNullParameter(memberData, "memberData");
                        String str42 = null;
                        int i2 = 56;
                        AnimatedResourceImage animatedResourceImage2 = null;
                        boolean z310 = false;
                        String str52 = null;
                        aVar.x(new y(u.c(new um0("ACTION_ID_CONFIRM_WITHDRAW", new tm0(LargeActionButton.ButtonStyle.f58726b, animatedResourceImage2, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), z310, str52, str42, i2), new tm0(LargeActionButton.ButtonStyle.f58725a, animatedResourceImage2, new TextLocalisedClause(R.string.common_action_confirm, null, null, 14), z310, str52, str42, i2), (Object) memberData, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(new TextLocalisedClause(R$string.vaults_withdrawal_permissions_grant_alert_title, null, null, 14), new TextLocalisedClause(R$string.vaults_withdrawal_permissions_grant_alert_subtitle, null, null, 14), null, 28), null, null, null, null, "DELEGATES_KEY_WITHDRAWAL_CONFIRMATION_DIALOG", null, null, null, 3836));
                        unit = Unit.f186387a;
                    }
                    return unit == fim.a.COROUTINE_SUSPENDED ? unit : Unit.f186387a;
                }
                c3("confirm remove member", new a(this, memberData.f98697b.f234881a, memberData.f98696a.f234903a, continuation2, 0));
            }
        }
        return Unit.f186387a;
    }

    public final void c3(String str, Function1 function1) {
        T2(new b0(this, str, function1, (Continuation) null), new m(1, this, d.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 26));
    }
}
