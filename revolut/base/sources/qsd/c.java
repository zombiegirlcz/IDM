package qsd;

import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        dj0.d dVar = ((CustomAsset) obj3).f99218c;
        Long lValueOf = Long.valueOf(dVar != null ? dVar.f115082a : 0L);
        dj0.d dVar2 = ((CustomAsset) obj2).f99218c;
        return cim.b.b(lValueOf, Long.valueOf(dVar2 != null ? dVar2.f115082a : 0L));
    }
}
