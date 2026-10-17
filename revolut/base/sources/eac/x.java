package eac;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey;
import com.revolut.feature.revolutpay.management.impl.ui.management.home.RevolutPayManagementHomeControllerContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.management.impl.ui.management.home.a f124185w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f124185w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(0, this.f124185w, continuation);
            default:
                return new x(1, this.f124185w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((x) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                x9c.d dVar = this.f124185w.f84595t;
                this.v = 1;
                dVar.getClass();
                Object objA = dVar.a(RevolutPayArticleKey.InfoWithRevPoints, RevolutPayArticleKey.InfoWithoutRevPoints, this);
                return objA == aVar ? aVar : objA;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar3 = this.f124185w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    x xVar = new x(0, aVar3, null);
                    this.v = 1;
                    obj2 = aVar3.p2(this, xVar);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                oki.h.v2(aVar3.B, new RevolutPayManagementHomeControllerContract$Step.ProductArticle((ProductArticleParams) obj2), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                return Unit.f186387a;
        }
    }
}
