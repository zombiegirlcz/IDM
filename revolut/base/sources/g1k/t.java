package g1k;

import cli.y;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthNewsArticleReaderDestination;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsScreen;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WealthAllNewsScreen f139710w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(WealthAllNewsScreen wealthAllNewsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139710w = wealthAllNewsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f139710w, continuation, 0);
                tVar.v = obj2;
                return tVar;
            default:
                t tVar2 = new t(this.f139710w, continuation, 1);
                tVar2.v = obj2;
                return tVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t) create((tdh.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t) create((rzj.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WealthAllNewsScreen wealthAllNewsScreen = this.f139710w;
        switch (i) {
            case 0:
                tdh.a filter = (tdh.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b bVar = (com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b) wealthAllNewsScreen.R2();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(filter, "filter");
                y yVar = bVar.f101863r;
                LinkedHashSet linkedHashSetA = gc0.c.A(((d) ((j2) yVar.f22677a).getValue()).f139687a, filter);
                bVar.H2(yVar, new an9.t(linkedHashSetA, 6));
                bVar.l2(new i(bVar, linkedHashSetA, (Continuation) null), new yi5.b(26));
                break;
            default:
                rzj.f article = (rzj.f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b bVar2 = (com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b) wealthAllNewsScreen.R2();
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(article, "article");
                bVar2.C1(new WealthNewsArticleReaderDestination(article.d(), !((d) ((j2) bVar2.f101863r.f22677a).getValue()).f139687a.isEmpty(), com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE)));
                break;
        }
        return Unit.f186387a;
    }
}
