package bs9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreenContract$ModalSteps;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ks9.r0;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GroupChatScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(GroupChatScreen groupChatScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = groupChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            case 1:
                return new j(this.v, continuation, 1);
            case 2:
                return new j(this.v, continuation, 2);
            case 3:
                return new j(this.v, continuation, 3);
            case 4:
                return new j(this.v, continuation, 4);
            case 5:
                return new j(this.v, continuation, 5);
            default:
                return new j(this.v, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        GroupChatScreen groupChatScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.payments.groups.impl.ui_chat.chat.a) groupChatScreen.d()).K2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar3 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) groupChatScreen.d();
                st9.a aVar4 = (st9.a) aVar3.J2().f18121j.getContent();
                int i2 = aVar4 == null ? -1 : z.f18141b[aVar4.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1 || i2 == 2) {
                        oki.h.v2(aVar3.X, GroupChatScreenContract$ModalSteps.EligibilityUnsupportedDialog.f79338a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    } else if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = GroupChatScreen.j0;
                ScreenContentRecyclerView groupChatConversationRecyclerView = groupChatScreen.e3().f11259j;
                Intrinsics.checkNotNullExpressionValue(groupChatConversationRecyclerView, "groupChatConversationRecyclerView");
                tw0.x.d(groupChatConversationRecyclerView);
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                groupChatScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar8 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) groupChatScreen.d();
                oki.h.v2(aVar8.X, new GroupChatScreenContract$ModalSteps.SettingsScreen(((o) ((j2) aVar8.W.f22677a).getValue()).f18116a), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                return Unit.f186387a;
            case 5:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar10 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) groupChatScreen.d();
                r0 r0Var = aVar10.f79349s;
                PaymentGroup group = aVar10.J2().f18116a;
                bc1.b action = new bc1.b(aVar10, 26);
                r0Var.getClass();
                Intrinsics.checkNotNullParameter(group, "group");
                Intrinsics.checkNotNullParameter(action, "action");
                boolean z = group.f79288g;
                String str = group.f79285a;
                if (z) {
                    action.invoke();
                } else {
                    j60.a aVar11 = r0Var.f189373n;
                    r0Var.f189372m.getClass();
                    Intrinsics.checkNotNullParameter(group, "group");
                    rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.payments_groups_details_disclaimer_untrusted_group_dialog_title, null, null, 14), new TextLocalisedClause(R$string.payments_groups_details_disclaimer_untrusted_group_dialog_description, null, null, 14), null, 28);
                    List listK = zhm.v.k(new LargeActionButtonDelegate.Model("GROUP_DETAILS_TRUSTING_DIALOG_POSITIVE_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.payments_groups_details_disclaimer_untrusted_group_action_join, null, null, 14), false, null, new vr9.t(str), R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, 6512), new LargeActionButtonDelegate.Model("GROUP_DETAILS_TRUSTING_DIALOG_NEGATIVE_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.payments_groups_details_disclaimer_untrusted_group_action_leave, null, null, 14), false, null, new vr9.u(str), 0, R$attr.uikit_dp16, 0, 0, 7024));
                    int i3 = R$attr.uikit_dp16;
                    yp0.b.k(listK, i3, i3, 0, 0, 28);
                    aVar11.x(new rp0.y(listK, tVar, null, null, null, null, 1020));
                }
                return Unit.f186387a;
            default:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.groups.impl.ui_chat.chat.a aVar13 = (com.revolut.feature.payments.groups.impl.ui_chat.chat.a) groupChatScreen.d();
                aVar13.getClass();
                aVar13.l2(new b0(aVar13, continuation, 5), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
