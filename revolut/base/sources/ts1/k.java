package ts1;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.apm.bizum.impl.ui.area.homescreen.BizumAreaHomescreenScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ BizumAreaHomescreenScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BizumAreaHomescreenScreen bizumAreaHomescreenScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bizumAreaHomescreenScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((u) this.u.T2()).B2(h12.e.f148448a);
        return Unit.f186387a;
    }
}
