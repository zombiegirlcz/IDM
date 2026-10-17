package n4d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 implements Comparator {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        ?? r06 = r0.f212393m;
        Integer num = (Integer) r06.get(((FavouritesAssetTypeKey) obj2).f86866a);
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        Integer num2 = (Integer) r06.get(((FavouritesAssetTypeKey) obj3).f86866a);
        return cim.b.b(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
    }
}
