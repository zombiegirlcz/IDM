package k8d;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.list.FaqListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FaqListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FaqListScreen faqListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = faqListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarT2 = this.v.T2();
        com.revolut.feature.shared.help_centre.impl.faq.screens.list.b bVar = (com.revolut.feature.shared.help_centre.impl.faq.screens.list.b) lVarT2;
        bVar.C2(model.e, model.f51822a);
        return Unit.f186387a;
    }
}
