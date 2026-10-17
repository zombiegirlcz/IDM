package u95;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreen;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OverdraftDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OverdraftDetailsScreen overdraftDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = overdraftDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.credit.overdraft.impl.ui.details.a aVar2 = (com.revolut.feature.credit.overdraft.impl.ui.details.a) iVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Continuation continuation = null;
        if (Intrinsics.f(str, "ID_GET_HELP")) {
            f15.a aVar3 = aVar2.f70642q;
            ux4.i iVar = ux4.m.Companion;
            String facilityId = aVar2.o.f70637a;
            ux4.l variant = ux4.l.FAQ_AND_FINANCIAL_DIFFICULTIES;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(variant, "variant");
            aVar3.O(new ux4.m(new ux4.k(facilityId, ux4.j.OVERDRAFT), variant, null));
        } else if (Intrinsics.f(str, "ID_INCREASE_LIMIT")) {
            yji.l.j2(aVar2, aVar2.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("overdraft-management.increase-your-limit-pa.v-1")), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, null, 2);
        } else if (a0.H(str, "ID_DOCUMENT_", false)) {
            Object obj3 = model.u;
            ux4.d dVar = obj3 instanceof ux4.d ? (ux4.d) obj3 : null;
            if (dVar != null) {
                aVar2.A1(new u2i.g(aVar2, dVar, continuation, 5), new yi5.b(25));
            }
        }
        return Unit.f186387a;
    }
}
