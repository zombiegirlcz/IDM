package b8d;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FaqArticleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FaqArticleScreen faqArticleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = faqArticleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarT2 = this.v.T2();
        CharSequence comment = textData.f52598b;
        com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar = (com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) sVarT2;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(comment, "comment");
        cVar.u.t1(comment);
        return Unit.f186387a;
    }
}
