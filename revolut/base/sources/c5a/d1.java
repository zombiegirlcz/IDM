package c5a;

import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.Rev10ChatTransferScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class d1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Rev10ChatTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Rev10ChatTransferScreen rev10ChatTransferScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = rev10ChatTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d1(this.v, continuation, 0);
            case 1:
                return new d1(this.v, continuation, 1);
            case 2:
                return new d1(this.v, continuation, 2);
            case 3:
                return new d1(this.v, continuation, 3);
            case 4:
                return new d1(this.v, continuation, 4);
            default:
                return new d1(this.v, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d1) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        h9b.a aVar = h9b.a.f150222a;
        Rev10ChatTransferScreen rev10ChatTransferScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) rev10ChatTransferScreen.d();
                fVar.getClass();
                fVar.l2(new l0(fVar, null, 3), new yi5.b(26));
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar2 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) rev10ChatTransferScreen.d();
                if (fVar2.Y.E()) {
                    yji.l.j2(fVar2, fVar2.e1(aVar), bottom_dialog, null, 2);
                }
                break;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar3 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) rev10ChatTransferScreen.d();
                fVar3.getClass();
                fVar3.l2(new l0(fVar3, null, 4), new yi5.b(26));
                break;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar4 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) rev10ChatTransferScreen.d();
                fVar4.getClass();
                fVar4.l2(new l0(fVar4, null, 3), new yi5.b(26));
                break;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar5 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) rev10ChatTransferScreen.d();
                if (fVar5.Y.E()) {
                    yji.l.j2(fVar5, fVar5.e1(aVar), bottom_dialog, null, 2);
                }
                break;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar6 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) rev10ChatTransferScreen.d();
                fVar6.getClass();
                fVar6.l2(new l0(fVar6, null, 4), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
