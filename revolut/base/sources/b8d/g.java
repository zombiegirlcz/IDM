package b8d;

import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FaqArticleScreen f13161w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(FaqArticleScreen faqArticleScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f13161w = faqArticleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f13161w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f13161w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f13161w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            default:
                g gVar4 = new g(this.f13161w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((ip0.y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FaqArticleScreen faqArticleScreen = this.f13161w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarT2 = faqArticleScreen.T2();
                Intrinsics.h(itemId);
                com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar = (com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) sVarT2;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (Intrinsics.f(itemId, "DONE_BUTTON_ITEM_ID")) {
                    cVar.v2(a.C0540a.f86235a);
                }
                break;
            case 1:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) faqArticleScreen.T2()).S0(aVar2.f275445a);
                break;
            case 2:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) faqArticleScreen.T2()).S0(aVar4.f275445a);
                break;
            default:
                ip0.y clickData = (ip0.y) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarT22 = faqArticleScreen.T2();
                Intrinsics.h(clickData);
                com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar2 = (com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) sVarT22;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                cVar2.u.v1(clickData);
                break;
        }
        return Unit.f186387a;
    }
}
