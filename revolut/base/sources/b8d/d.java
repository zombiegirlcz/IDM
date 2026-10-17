package b8d;

import com.revolut.core.ui_kit.delegates.CellDetailsSingleButtonDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreen;
import e8d.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v20.d1;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FaqArticleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FaqArticleScreen faqArticleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = faqArticleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsSingleButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsSingleButtonDelegate.Model model = (CellDetailsSingleButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarT2 = this.v.T2();
        String itemId = model.f51890a;
        Object obj3 = model.f;
        com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar = (com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) sVarT2;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (obj3 instanceof b.a) {
            cVar.n2(new g0(0, cVar, null), new whi.b(6));
        } else if (obj3 instanceof d1) {
            cVar.E2(obj3);
        }
        return Unit.f186387a;
    }
}
