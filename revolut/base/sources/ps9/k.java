package ps9;

import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupChatSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(GroupChatSettingsScreen groupChatSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupChatSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((GroupTransactionItem.Bill) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        GroupTransactionItem.Bill parcel = (GroupTransactionItem.Bill) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.d();
        Intrinsics.h(parcel);
        com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar = (com.revolut.feature.payments.groups.impl.ui_chat.settings.d) rVarE3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        dVar.l2(new z(dVar, parcel, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
