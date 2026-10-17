package r0a;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.screen.TransferOnlyChatScreen;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import vkm.j2;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransferOnlyChatScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TransferOnlyChatScreen transferOnlyChatScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transferOnlyChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            case 2:
                return new d(this.v, continuation, 2);
            default:
                return new d(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransferOnlyChatScreen transferOnlyChatScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                transferOnlyChatScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = (y) transferOnlyChatScreen.d();
                yVar.C2(new k(((i) ((j2) yVar.E.f22677a).getValue()).f250735b));
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar2 = (y) transferOnlyChatScreen.d();
                m0a.g gVar = yVar2.f250758q;
                cli.y yVar3 = yVar2.E;
                ChatTransferRecipient chatTransferRecipient = ((i) ((j2) yVar3.f22677a).getValue()).f250735b;
                List list = (List) ((i) ((j2) yVar3.f22677a).getValue()).f250734a.getContent();
                ChatItem chatItem = list != null ? (ChatItem) d0.o0(list) : null;
                m0a.k kVar = (m0a.k) gVar;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
                kVar.T2(new m0a.j(kVar, chatTransferRecipient, chatItem, (Continuation) null), new yi5.b(27));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar4 = (y) transferOnlyChatScreen.d();
                m0a.g gVar2 = yVar4.f250758q;
                ChatTransferRecipient contact = ((i) ((j2) yVar4.E.f22677a).getValue()).f250735b;
                m0a.k kVar2 = (m0a.k) gVar2;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(contact, "chatTransferRecipient");
                kVar2.f201124l.getClass();
                Intrinsics.checkNotNullParameter(contact, "contact");
                if (contact instanceof ChatTransferRecipient.ApmTransferRecipient) {
                    kVar2.A2(u0.b(u0.f(r1.f241222c.g(((ChatTransferRecipient.ApmTransferRecipient) contact).f79715a, hrf.f.INCOMING, new TransferMoneyPocket(null, null, 3)))));
                    return Unit.f186387a;
                }
                if (!(contact instanceof ChatTransferRecipient.BeneficiaryRecipient) && !(contact instanceof ChatTransferRecipient.CardRecipient) && !(contact instanceof ChatTransferRecipient.CharityRecipient) && !(contact instanceof ChatTransferRecipient.ContactRecipient) && !(contact instanceof ChatTransferRecipient.CryptoAddressRecipient) && !(contact instanceof ChatTransferRecipient.PaymentCounterpartyRecipient)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("Recipient is not supported, type=" + o0.f186429a.b(contact.getClass()).m() + ", name=" + contact.getName()).toString());
        }
    }
}
