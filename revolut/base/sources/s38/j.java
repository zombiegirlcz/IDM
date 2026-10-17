package s38;

import com.revolut.feature.joint.impl.account.handler.JointBereavementEventHandler$JointBereavementArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sfe.s;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends pfe.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final oqk.k f259467m;

    public j(oqk.k transactionsWidgetActionExtension) {
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        this.f259467m = transactionsWidgetActionExtension;
    }

    @Override // pfe.a
    public final Set Z2() {
        return y0.b(this.f259467m);
    }

    @Override // pfe.c
    public final Object b3(s sVar, Continuation continuation) {
        if (sVar instanceof sfe.m) {
            if (Intrinsics.f(((sfe.m) sVar).f262419a, "ACTION_LEARN_MORE")) {
                yji.n.P2(this, o2(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(JointBereavementEventHandler$JointBereavementArticleKey.BEREAVEMENT_LEARN_MORE)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56)), null, new s1c.a(25), 1);
            }
        } else if (sVar instanceof sfe.n) {
            V2(new s09.c(this, (sfe.n) sVar, null, 7), new yi5.b(29));
        }
        return Unit.f186387a;
    }
}
