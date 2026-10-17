package ha8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.junior.isa.impl.ui.child_picker.JuniorIsaChildPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ JuniorIsaChildPickerScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(JuniorIsaChildPickerScreen juniorIsaChildPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.u = juniorIsaChildPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((i) ((f) this.u.Q.getValue())).u.a();
        return Unit.f186387a;
    }
}
