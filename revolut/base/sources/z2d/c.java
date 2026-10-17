package z2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import go.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l2d.h;
import zhm.d0;
import zhm.h0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f319059a;

    public c(Set interactors) {
        Intrinsics.checkNotNullParameter(interactors, "interactors");
        Set set = interactors;
        int iB = q0.b(w.t(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : set) {
            linkedHashMap.put(((u3d.b) obj2).a(), obj2);
        }
        this.f319059a = linkedHashMap;
    }

    public final Flow a(Set assetTypeKeysRaw) {
        Intrinsics.checkNotNullParameter(assetTypeKeysRaw, "assetTypeKeysRaw");
        if (assetTypeKeysRaw.isEmpty()) {
            return new g(h0.f322473a, 2);
        }
        Set<FavouritesAssetTypeKey> set = assetTypeKeysRaw;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (FavouritesAssetTypeKey favouritesAssetTypeKey : set) {
            u3d.b bVar = (u3d.b) this.f319059a.get(favouritesAssetTypeKey);
            arrayList.add(new h(bVar != null ? bVar.isAvailable() : new g(Boolean.FALSE, 2), favouritesAssetTypeKey, 2));
        }
        return new uf0.b((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 20);
    }
}
