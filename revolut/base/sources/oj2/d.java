package oj2;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.articles_deeplinks_impl.screen.ArticleWebViewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ ArticleWebViewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ArticleWebViewScreen articleWebViewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = articleWebViewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.u.R2();
        iVar.H2(iVar.f225722s, new oh3.a(16));
        iVar.f225721r.a();
        return Unit.f186387a;
    }
}
