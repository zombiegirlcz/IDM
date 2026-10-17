package ejb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f126833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FeatureCommand f126834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f126835c;
    public final SavingsProductData d;

    public a(f statistic, FeatureCommand transactionNaviCommand, m timeFrame, SavingsProductData productData) {
        Intrinsics.checkNotNullParameter(statistic, "statistic");
        Intrinsics.checkNotNullParameter(transactionNaviCommand, "transactionNaviCommand");
        Intrinsics.checkNotNullParameter(timeFrame, "timeFrame");
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f126833a = statistic;
        this.f126834b = transactionNaviCommand;
        this.f126835c = timeFrame;
        this.d = productData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f126833a.equals(aVar.f126833a) && this.f126834b.equals(aVar.f126834b) && this.f126835c == aVar.f126835c && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f126835c.hashCode() + ((this.f126834b.f98638a.hashCode() + (this.f126833a.hashCode() * 31)) * 31)) * 31);
    }
}
