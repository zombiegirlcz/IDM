package mr4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.card.impl.ui.display_amount_selector.bottom_sheet.CreditCardDisplayAmountBottomSheetContract$DisplayOptionClickParcel;
import com.revolut.feature.credit.card.impl.ui.display_amount_selector.bottom_sheet.CreditCardDisplayAmountBottomSheetController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CreditCardDisplayAmountBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CreditCardDisplayAmountBottomSheetController creditCardDisplayAmountBottomSheetController, Continuation continuation) {
        super(2, continuation);
        this.v = creditCardDisplayAmountBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yw4.a aVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.V.getValue();
        Object obj3 = model.u;
        gVar.getClass();
        CreditCardDisplayAmountBottomSheetContract$DisplayOptionClickParcel creditCardDisplayAmountBottomSheetContract$DisplayOptionClickParcel = obj3 instanceof CreditCardDisplayAmountBottomSheetContract$DisplayOptionClickParcel ? (CreditCardDisplayAmountBottomSheetContract$DisplayOptionClickParcel) obj3 : null;
        if (creditCardDisplayAmountBottomSheetContract$DisplayOptionClickParcel != null) {
            String str = creditCardDisplayAmountBottomSheetContract$DisplayOptionClickParcel.f69285a;
            a aVar3 = (a) ((b) ((j2) gVar.f208057s.f22677a).getValue()).f208050a.getContent();
            if (aVar3 != null && (aVar = aVar3.f208047a) != null) {
                if (Intrinsics.f(str, aVar.name())) {
                    gVar.B2();
                } else {
                    gVar.C2(new zl4.h(aVar.name(), str));
                }
            }
        }
        return Unit.f186387a;
    }
}
