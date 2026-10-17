package ps9;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.groups.impl.mappers.settings.GroupSettingsAction;
import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreenContract$Step;
import com.revolut.feature.payments.groups.models.GroupMemberSettleInfo;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ks9.f0;
import ks9.n0;
import vkm.j2;
import vr9.l;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GroupChatSettingsScreen f239436w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(GroupChatSettingsScreen groupChatSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f239436w = groupChatSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f239436w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f239436w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f(this.f239436w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            default:
                f fVar4 = new f(this.f239436w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((vr9.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((GroupSettingsAction) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((GroupTransactionItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ur9.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GroupChatSettingsScreen groupChatSettingsScreen = this.f239436w;
        switch (i) {
            case 0:
                vr9.j parcel = (vr9.j) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE3 = groupChatSettingsScreen.d();
                Intrinsics.h(parcel);
                com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar = (com.revolut.feature.payments.groups.impl.ui_chat.settings.d) rVarE3;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ((n0) dVar.o).e3(parcel, ((p) ((j2) dVar.C.f22677a).getValue()).f239437a);
                return Unit.f186387a;
            case 1:
                GroupSettingsAction parcel2 = (GroupSettingsAction) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE32 = groupChatSettingsScreen.d();
                Intrinsics.h(parcel2);
                com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar2 = (com.revolut.feature.payments.groups.impl.ui_chat.settings.d) rVarE32;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                ((f0) dVar2.v).Z2(((p) ((j2) dVar2.C.f22677a).getValue()).f239437a, parcel2);
                return Unit.f186387a;
            case 2:
                GroupTransactionItem parcel3 = (GroupTransactionItem) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE33 = groupChatSettingsScreen.d();
                Intrinsics.h(parcel3);
                com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar3 = (com.revolut.feature.payments.groups.impl.ui_chat.settings.d) rVarE33;
                dVar3.getClass();
                com.revolut.kompot.navigable.vc.modal.a aVar4 = dVar3.D;
                Intrinsics.checkNotNullParameter(parcel3, "parcel");
                boolean z = parcel3 instanceof GroupTransactionItem.Bill;
                ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                if (z) {
                    oq9.i iVar = ((GroupTransactionItem.Bill) parcel3).f79326a;
                    String strK = xam.a.k(iVar);
                    if (strK != null) {
                        dVar3.C1(u0.c(new TransactionsFeatureConfig.Details(new k71.c(strK), com.revolut.feature.transactions.api.navigation.a.PAYMENT_GROUP_DETAILS, null, null, 124)));
                    } else {
                        oki.h.v2(aVar4, new GroupChatSettingsScreenContract$Step.BillDetailsScreen(iVar), popup);
                    }
                } else {
                    if (!(parcel3 instanceof GroupTransactionItem.Settlement)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.v2(aVar4, new GroupChatSettingsScreenContract$Step.SettlementDetailsScreen(((GroupTransactionItem.Settlement) parcel3).f79327a), popup);
                }
                return Unit.f186387a;
            default:
                ur9.c parcel4 = (ur9.c) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE34 = groupChatSettingsScreen.d();
                Intrinsics.h(parcel4);
                com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar4 = (com.revolut.feature.payments.groups.impl.ui_chat.settings.d) rVarE34;
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(parcel4, "parcel");
                if (parcel4 instanceof ur9.a) {
                    ur9.a aVar6 = (ur9.a) parcel4;
                    j60.a aVar7 = dVar4.u;
                    vr9.r rVar = dVar4.f79389t;
                    l.b bVar = vr9.l.Companion;
                    hr9.a aVar8 = aVar6.f282255a;
                    bVar.getClass();
                    vr9.l type = l.b.a(aVar8);
                    GroupMemberSettleInfo member = edl.a.H(aVar6.f282257c, dVar4.I2().f248756a);
                    do3.n currentUser = dVar4.I2().f248756a;
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(type, "type");
                    Intrinsics.checkNotNullParameter(member, "member");
                    Intrinsics.checkNotNullParameter(currentUser, "currentUser");
                    List listC = zhm.u.c(member);
                    zhm.f0 f0Var = zhm.f0.f322471a;
                    List listC2 = zhm.u.c(rVar.i(type, member, listC, f0Var, currentUser));
                    yp0.b.k(listC2, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
                    TextDelegate.Model modelB = rVar.b(type, currentUser, zhm.u.c(member));
                    List listA = vr9.r.a(type, listC, f0Var);
                    aim.e eVarB = zhm.u.b();
                    eVarB.addAll(listC2);
                    if (modelB != null) {
                        eVarB.add(modelB);
                    }
                    eVarB.addAll(listA);
                    aVar7.x(new rp0.y(zhm.u.a(eVarB), new rp0.t(vr9.r.g(type), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
                } else {
                    if (!(parcel4 instanceof ur9.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar4.H2(dVar4.C, new pj3.b(dVar4, (ur9.b) parcel4, 20));
                }
                return Unit.f186387a;
        }
    }
}
