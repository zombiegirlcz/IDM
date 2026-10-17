package s7a;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.picker.PickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PickerController pickerController, Continuation continuation) {
        super(2, continuation);
        this.v = pickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j0 j0VarR2 = this.v.R2();
        String listId = model.f52373a;
        com.revolut.feature.picker.a aVar2 = (com.revolut.feature.picker.a) j0VarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ERROR_STATE_LIST_ID")) {
            aVar2.I2(true);
        } else if (Intrinsics.f(listId, "NO_SEARCH_RESULT_LIST_ID")) {
            aVar2.C2(new a0(z.f260661a));
        }
        return Unit.f186387a;
    }
}
