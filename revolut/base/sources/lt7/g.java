package lt7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.insurance_credit.impl.ui.screen.contact.ContactScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ ContactScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ContactScreen contactScreen, Continuation continuation) {
        super(2, continuation);
        this.u = contactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVar = (m) this.u.d();
        mVar.getClass();
        mVar.n2(new lo.c(mVar, (Continuation) null, 7), new whi.b(6));
        return Unit.f186387a;
    }
}
