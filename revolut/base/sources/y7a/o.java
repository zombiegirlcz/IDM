package y7a;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.picker.legacy.PickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(PickerScreen pickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.v.T2().z2(model.f52519a);
        return Unit.f186387a;
    }
}
