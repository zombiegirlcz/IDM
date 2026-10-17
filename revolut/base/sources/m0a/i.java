package m0a;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.messaging.data.api.model.DonationItem;
import com.revolut.feature.payments.messaging.data.api.model.MoneyRequestItem;
import com.revolut.feature.payments.messaging.data.api.model.TransactionItem;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$Details$ByMoneyRequest;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import tof.a3;
import yhm.o;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function1 {
    public k u;
    public k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f201118w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ChatItem f201119x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f201120y;
    public final /* synthetic */ ChatTransferRecipient z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, ChatItem chatItem, ChatTransferRecipient chatTransferRecipient, Continuation continuation) {
        super(1, continuation);
        this.f201119x = chatItem;
        this.f201120y = kVar;
        this.z = chatTransferRecipient;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.f201120y, this.f201119x, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NaviCommand featureCommand;
        k kVar;
        k kVar2;
        k kVar3;
        k kVar4;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f201118w;
        ModalDestination.Style.FullscreenPaged fullscreenPaged = ModalDestination.Style.FullscreenPaged.f98310a;
        if (i != 0) {
            if (i == 1) {
                kVar3 = this.v;
                kVar4 = this.u;
                o.b(obj2);
                yji.n.P2(kVar4, kVar3.o2((aii.e) obj2), fullscreenPaged, null, 2);
                return Unit.f186387a;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.v;
            kVar2 = this.u;
            o.b(obj2);
            yji.n.P2(kVar2, kVar.o2((aii.e) obj2), fullscreenPaged, null, 2);
            return Unit.f186387a;
        }
        o.b(obj2);
        ChatItem chatItem = this.f201119x;
        boolean z = chatItem instanceof TransactionItem;
        ChatTransferRecipient chatTransferRecipient = this.z;
        k kVar5 = this.f201120y;
        if (z) {
            vz9.o oVar = kVar5.f201128q;
            a3 a3Var = ((TransactionItem) chatItem).f79576g;
            this.u = kVar5;
            this.v = kVar5;
            this.f201118w = 1;
            obj2 = oVar.a(a3Var, chatTransferRecipient, this);
            if (obj2 != aVar) {
                kVar3 = kVar5;
                kVar4 = kVar3;
                yji.n.P2(kVar4, kVar3.o2((aii.e) obj2), fullscreenPaged, null, 2);
                return Unit.f186387a;
            }
        } else {
            boolean z3 = chatItem instanceof DonationItem;
            if (!z3) {
                kVar5.f201124l.getClass();
                Intrinsics.checkNotNullParameter(chatItem, "chatItem");
                if (z) {
                    featureCommand = new FeatureCommand(new TransactionsFeatureConfig.Details(q.P(((TransactionItem) chatItem).f79576g), com.revolut.feature.transactions.api.navigation.a.PAYMENTS_CHAT, null, null, 124));
                } else if (chatItem instanceof MoneyRequestItem) {
                    featureCommand = new FeatureCommand(new MoneyRequestFeatureConfig$Details$ByMoneyRequest(((MoneyRequestItem) chatItem).f79564g, null));
                } else if (z3) {
                    featureCommand = new FeatureCommand(new TransactionsFeatureConfig.Details(q.P(((DonationItem) chatItem).d), null, null, null, 126));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(a0.d.l(chatItem.getClass(), "Unsupported message type in Transfer Only kompot screen "));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    featureCommand = DummyCommand.f98635a;
                }
                return kVar5.A2(u0.b(featureCommand));
            }
            vz9.o oVar2 = kVar5.f201128q;
            a3 a3Var2 = ((DonationItem) chatItem).d;
            this.u = kVar5;
            this.v = kVar5;
            this.f201118w = 2;
            obj2 = oVar2.a(a3Var2, chatTransferRecipient, this);
            if (obj2 != aVar) {
                kVar = kVar5;
                kVar2 = kVar;
                yji.n.P2(kVar2, kVar.o2((aii.e) obj2), fullscreenPaged, null, 2);
                return Unit.f186387a;
            }
        }
        return aVar;
    }
}
