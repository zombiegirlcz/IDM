package q18;

import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthNewsArticleReaderDestination;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;

/* JADX INFO: loaded from: classes4.dex */
public final class h {
    public final StackDestination a(Object obj2) {
        if (obj2 instanceof rzj.f) {
            return new WealthNewsArticleReaderDestination(((rzj.f) obj2).d(), true, com.revolut.kompot.common.transition.a.b(TransitionAnimation.INSTANCE));
        }
        if (obj2 instanceof x08.f) {
            return new AssetDetailsDestination(((x08.f) obj2).f.f301529a, null, false, null, null, null, 62);
        }
        return null;
    }
}
