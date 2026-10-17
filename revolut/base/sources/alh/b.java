package alh;

import com.revolut.feature.global_markets.domain.MarketAsset;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends atc.b {
    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        MarketAsset.Index instance = (MarketAsset.Index) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        targetCollection.add(instance.f74573c);
    }
}
