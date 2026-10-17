package s7a;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.picker.PickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(PickerController pickerController, Continuation continuation) {
        super(2, continuation);
        this.v = pickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.picker.a) this.v.R2()).K2(model.f53324a);
        return Unit.f186387a;
    }
}
