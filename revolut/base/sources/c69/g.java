package c69;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.masav.impl.ui.form.MasavDirectDebitFormScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MasavDirectDebitFormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MasavDirectDebitFormScreen masavDirectDebitFormScreen, Continuation continuation) {
        super(2, continuation);
        this.v = masavDirectDebitFormScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.masav.impl.ui.form.c) this.v.R2()).J2(new r(model.f52580a));
        return Unit.f186387a;
    }
}
