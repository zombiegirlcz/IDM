package yg9;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SubformScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SubformScreen subformScreen, Continuation continuation) {
        super(2, continuation);
        this.v = subformScreen;
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
        ((com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a) this.v.d()).L2(textData.f52597a, textData.f52598b.toString(), null);
        return Unit.f186387a;
    }
}
