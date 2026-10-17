package y7a;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.picker.legacy.PickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PickerScreen pickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pickerScreen;
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
        f0 f0VarT2 = this.v.T2();
        String listId = model.f52373a;
        f0VarT2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ERROR_STATE_LIST_ID")) {
            f0VarT2.x2(new y66.p(8));
            f0VarT2.f311443r.b(Unit.f186387a);
        } else if (Intrinsics.f(listId, "NO_SEARCH_RESULT_LIST_ID")) {
            f0VarT2.v2(new v(u.f311453a));
        }
        return Unit.f186387a;
    }
}
