package bg9;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.PayBillsAndTaxesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PayBillsAndTaxesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PayBillsAndTaxesScreen payBillsAndTaxesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = payBillsAndTaxesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarE3 = this.v.R2();
        String listId = textData.f52597a;
        String extractedValue = textData.f52598b.toString();
        r rVar = (r) bVarE3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        xf9.a aVarI2 = rVar.I2();
        if (aVarI2 != null) {
            aVarI2.g3(listId, extractedValue, null);
        }
        return Unit.f186387a;
    }
}
