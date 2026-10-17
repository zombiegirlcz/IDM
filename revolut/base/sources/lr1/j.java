package lr1;

import com.revolut.feature.apm.bills.postal_check.api.R$string;
import com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult;
import com.revolut.feature.apm.bills.postal_check.impl.articles.PostalCheckArticles;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.y0;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.bills.postal_check.impl.ui.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PostalCheckQrScanResult.TermsRequired f199376w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar, PostalCheckQrScanResult.TermsRequired termsRequired, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f199376w = termsRequired;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f199376w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y0 y0VarA;
        com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar = this.v;
        kr1.g gVar = bVar.f61525r;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = ((kka.h) bVar.f61523p).e(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(PostalCheckArticles.ONBOARDING)), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((Boolean) obj2).booleanValue()) {
            int i2 = R$string.postal_check_terms_and_conditions_title;
            gVar.getClass();
            y0VarA = kr1.g.a(i2);
        } else {
            int i3 = R$string.postal_check_terms_and_conditions_title_update;
            gVar.getClass();
            y0VarA = kr1.g.a(i3);
        }
        return l.b1(bVar, bVar.X1(y0VarA), null, new i(bVar, this.f199376w, null), 3);
    }
}
