package lt7;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.feature.insurance_credit.impl.ui.screen.contact.ContactScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ContactScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ContactScreen contactScreen, Continuation continuation) {
        super(2, continuation);
        this.v = contactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CounterTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CounterTextDelegate.Model model = (CounterTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        m mVar = (m) jVarE3;
        mVar.I2(model.f52164j, model.f52159a);
        return Unit.f186387a;
    }
}
