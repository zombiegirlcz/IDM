package m3d;

import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f202375a;

    public j(Set providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Set set = providers;
        int iB = q0.b(w.t(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : set) {
            linkedHashMap.put(((x3d.g) obj2).a(), obj2);
        }
        this.f202375a = linkedHashMap;
    }

    public final Flow a(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        x3d.g gVar = (x3d.g) this.f202375a.get(item.f86898a.d);
        if (gVar != null) {
            return gVar.b(item);
        }
        throw new IllegalStateException(j6.a.q("provide mapper for key=", item.f86898a.d.f86866a));
    }
}
