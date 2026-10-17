package q56;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.DeFiSendAddBeneficiaryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pig.y;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeFiSendAddBeneficiaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DeFiSendAddBeneficiaryScreen deFiSendAddBeneficiaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deFiSendAddBeneficiaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a aVar2 = (com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.f(listId, "DEFI_SEND_ADD_BENEFICIARY_ADDRESS_ITEM_ID")) {
            aVar2.f71819s.k(text);
        } else if (Intrinsics.f(listId, "DEFI_SEND_ADD_BENEFICIARY_LABEL_ITEM_ID")) {
            aVar2.H2(aVar2.f71820t, new y(text, 20));
        }
        return Unit.f186387a;
    }
}
