package eac;

import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.revolutpay.management.api.articles.RevolutPayArticleKey;
import com.revolut.feature.revolutpay.management.impl.ui.management.home.RevolutPayManagementHomeController;
import com.revolut.feature.revolutpay.management.impl.ui.management.home.RevolutPayManagementHomeControllerContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevolutPayManagementHomeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RevolutPayManagementHomeController revolutPayManagementHomeController, Continuation continuation) {
        super(2, continuation);
        this.v = revolutPayManagementHomeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((HeroBannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HeroBannerDelegate.Model model = (HeroBannerDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        String listId = model.f52424a;
        com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar2 = (com.revolut.feature.revolutpay.management.impl.ui.management.home.a) iVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_REV_POINTS_BUILT_IN_BANNER")) {
            oki.h.v2(aVar2.B, new RevolutPayManagementHomeControllerContract$Step.ProductArticle(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(RevolutPayArticleKey.AboutRevPoints))), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        } else if (Intrinsics.f(listId, "ID_PAY_WITH_SMILE_BANNER")) {
            aVar2.I2();
        }
        return Unit.f186387a;
    }
}
