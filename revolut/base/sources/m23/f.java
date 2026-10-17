package m23;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.dialogs.CardSubtypePickerBottomSheetController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardSubtypePickerBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CardSubtypePickerBottomSheetController cardSubtypePickerBottomSheetController, Continuation continuation) {
        super(2, continuation);
        this.v = cardSubtypePickerBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ProductSelectionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductSelectionDelegate.Model model = (ProductSelectionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ay4.a aVar2 = this.v.S;
        Object obj3 = model.i;
        aVar2.getClass();
        a aVar3 = obj3 instanceof a ? (a) obj3 : null;
        if (aVar3 != null) {
            aVar2.C2(new e(aVar3));
        }
        return Unit.f186387a;
    }
}
