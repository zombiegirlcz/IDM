package ks9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.mappers.settings.GroupSettingsAction;
import com.revolut.feature.support.api.navigation.SupportFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;
import wr9.c;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends yji.n implements h {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mq9.f f189325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jt0.b f189326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mr9.d f189327n;
    public final wr9.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f189328p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sf0.h f189329q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f189330r;

    public f0(mq9.f groupsInteractor, jt0.b groupsDebtsInteractor, mr9.d groupsRemindersInteractor, wr9.e memberDialogMapper, j60.a bottomExpandableDialog, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        Intrinsics.checkNotNullParameter(groupsDebtsInteractor, "groupsDebtsInteractor");
        Intrinsics.checkNotNullParameter(groupsRemindersInteractor, "groupsRemindersInteractor");
        Intrinsics.checkNotNullParameter(memberDialogMapper, "memberDialogMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f189325l = groupsInteractor;
        this.f189326m = groupsDebtsInteractor;
        this.f189327n = groupsRemindersInteractor;
        this.o = memberDialogMapper;
        this.f189328p = bottomExpandableDialog;
        this.f189329q = serverErrorParser;
        this.f189330r = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
    }

    public final void Z2(PaymentGroup group, GroupSettingsAction action) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(action, "action");
        Continuation continuation = null;
        if (action instanceof GroupSettingsAction.LeaveGroup) {
            T2(new kq5.d(this, group, continuation, 8), new yi5.b(27));
            return;
        }
        if (!(action instanceof GroupSettingsAction.RemoveMember)) {
            if (action instanceof GroupSettingsAction.ReInviteMember) {
                T2(new kq5.d(this, ((GroupSettingsAction.ReInviteMember) action).f79322a, continuation, 9), new yi5.b(27));
                return;
            }
            if (action instanceof GroupSettingsAction.Report) {
                A2(new BridgeDestination(new FeatureCommand(SupportFeatureConfig.f89363a)));
                return;
            }
            if (!(action instanceof GroupSettingsAction.SmartSettlementSetting)) {
                throw new NoWhenBranchMatchedException();
            }
            st9.b bVar = ((GroupSettingsAction.SmartSettlementSetting) action).f79325a;
            T2(new knd.h0(this, group, bVar, continuation, 10), new k65.d(1, this, f0.class, "handleSmartSettlementSettingError", "handleSmartSettlementSettingError(Ljava/lang/Throwable;)Z", 0, 24));
            return;
        }
        oq9.o member = ((GroupSettingsAction.RemoveMember) action).f79323a;
        this.o.getClass();
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(member, "member");
        Clause clauseD = tr9.e.d(member, true);
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.payments_groups_members_remove_dialog_title, zhm.v.k(clauseD, group.f79286b), null, 12), new TextLocalisedClause(R$string.payments_groups_members_remove_dialog_subtitle, zhm.u.c(clauseD), null, 12), null, 28);
        List listK = zhm.v.k(new LargeActionButtonDelegate.Model("GROUP_DETAILS_REMOVE_DIALOG_POSITIVE_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.payments_groups_members_remove_dialog_action, null, null, 14), false, null, new wr9.d(member), 0, R$attr.uikit_dp16, 0, 0, 7024), new LargeActionButtonDelegate.Model("GROUP_DETAILS_REMOVE_DIALOG_NEGATIVE_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.payments_groups_members_remove_dialog_cancel, null, null, 14), false, null, c.a.f299529a, 0, R$attr.uikit_dp16, 0, 0, 7024));
        int i = R$attr.uikit_dp16;
        yp0.b.k(listK, i, i, 0, 0, 28);
        this.f189328p.x(new rp0.y(listK, tVar, null, null, null, null, 1020));
    }
}
