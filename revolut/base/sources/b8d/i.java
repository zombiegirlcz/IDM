package b8d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FaqArticleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(FaqArticleScreen faqArticleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = faqArticleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarT2 = this.v.T2();
        com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar = (com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) sVarT2;
        cVar.D2(model.u, model.f53228a);
        return Unit.f186387a;
    }
}
