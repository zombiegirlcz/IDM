package h8d;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.shared.help_centre.impl.faq.screens.faqsearch.FaqSearchRev10Screen;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FaqSearchRev10Screen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FaqSearchRev10Screen faqSearchRev10Screen, Continuation continuation) {
        super(2, continuation);
        this.v = faqSearchRev10Screen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarT2 = this.v.T2();
        ActionsView.Item item = yVar.f167226b;
        v vVar = (v) nVarT2;
        vVar.y2(item.f58324n, item.f58316a);
        return Unit.f186387a;
    }
}
