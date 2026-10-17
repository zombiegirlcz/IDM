package n3d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import ifd.b;
import ifd.h;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x3d.d;
import x3d.f;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f211984a;

    public d(Set mappers) {
        Intrinsics.checkNotNullParameter(mappers, "mappers");
        Set set = mappers;
        int iB = q0.b(w.t(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : set) {
            linkedHashMap.put(((f) obj2).a(), obj2);
        }
        this.f211984a = linkedHashMap;
    }

    public static x3d.e a(ifd.c cVar) {
        x3d.d cVar2;
        boolean z = cVar.f161003b;
        ifd.b bVar = cVar.f161002a;
        if (bVar instanceof b.a) {
            cVar2 = d.a.f302726a;
        } else {
            if (!(bVar instanceof ifd.a)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar2 = new x3d.c(((ifd.a) bVar).f161000a);
        }
        return new x3d.e(cVar2, z);
    }

    public final int b(FavouritesAssetTypeKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        f fVar = (f) this.f211984a.get(key);
        if (fVar != null) {
            return fVar.g();
        }
        throw new IllegalStateException(j6.a.q("provide mapper for key = ", key.f86866a));
    }

    public final int c(FavouritesAssetTypeKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        f fVar = (f) this.f211984a.get(key);
        if (fVar != null) {
            return fVar.e();
        }
        throw new IllegalStateException(j6.a.q("provide mapper for key = ", key.f86866a));
    }

    public final String d(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        xi0.a aVar = xi0.b.Companion;
        String str = item.f86898a.f86863a;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        if (cp5.d.C(bVarA)) {
            return "instrument";
        }
        if (cp5.d.y(bVarA)) {
            return "commodity";
        }
        return null;
    }

    public final RowDelegate.Model e(FavouritesAssetTypeKey key, WatchlistItem item, String listId) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(listId, "listId");
        f fVar = (f) this.f211984a.get(key);
        if (fVar != null) {
            return fVar.h(item, listId);
        }
        throw new IllegalStateException(j6.a.q("provide mapper for key = ", key.f86866a));
    }

    public final Image f(FavouritesAssetTypeKey key, WatchlistItem item) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(item, "item");
        f fVar = (f) this.f211984a.get(key);
        if (fVar != null) {
            return fVar.d(item);
        }
        throw new IllegalStateException(j6.a.q("provide icon for key = ", key.f86866a));
    }
}
