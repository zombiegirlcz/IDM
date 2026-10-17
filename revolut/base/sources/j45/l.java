package j45;

import com.revolut.feature.credit.loan.autopay.api.account_selector.AccountSelectorV2$InputData;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.SelectAccountV2ControllerContract$ModalStep;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.common.ModalDestination;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            wx4.b bVar2 = bVar.f70304s;
            AccountSelectorV2$InputData accountSelectorV2$InputData = bVar.o;
            ProductArticleKey productArticleKey = accountSelectorV2$InputData.f70286c;
            Map mapQ = foh.i.q(new Pair("loan_id", accountSelectorV2$InputData.e));
            this.u = 1;
            obj2 = bVar2.a(productArticleKey, mapQ, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        ProductArticleParams productArticleParams = (ProductArticleParams) obj2;
        if (productArticleParams != null) {
            oki.h.v2(bVar.u, new SelectAccountV2ControllerContract$ModalStep.Article(productArticleParams), ModalDestination.Style.POPUP.f98311a);
        } else {
            bVar.n2(new k(bVar, null, 0), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
