package ccf;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.goodbye_screen.AddOnsGoodbyeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddOnsGoodbyeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AddOnsGoodbyeScreen addOnsGoodbyeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addOnsGoodbyeScreen;
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
        p pVarJ3 = this.v.T2();
        String feedback = textData.f52598b.toString();
        t tVar = (t) pVarJ3;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        tVar.x2(new c86.c(feedback, 3));
        return Unit.f186387a;
    }
}
