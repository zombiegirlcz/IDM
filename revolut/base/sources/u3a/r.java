package u3a;

import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f276874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f276875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f276876c;
    public final ne0.n d;

    /* JADX WARN: Multi-variable type inference failed */
    public r(f01.c uiKitResources, ImmutableMap caches, v searchableItemsUtil) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(caches, "caches");
        Intrinsics.checkNotNullParameter(searchableItemsUtil, "searchableItemsUtil");
        this.f276874a = uiKitResources;
        this.f276875b = searchableItemsUtil;
        this.f276876c = yhm.j.b(new tyl.a(this, 4));
        d dVar = d.CONTACTS;
        V v = caches.get(dVar);
        if (v != 0) {
            this.d = (ne0.n) v;
        } else {
            throw new IllegalArgumentException("No cache for cache context " + dVar);
        }
    }

    public final String a(zm3.a aVar) throws IOException {
        String strE = hx7.q.E(aVar);
        ne0.n nVar = this.d;
        Object objK0 = nVar.get(strE);
        if (objK0 == null) {
            objK0 = d0.k0(zhm.v.k(l9.l.b(aVar), (String) this.f276876c.getValue()), "|", null, null, 0, null, 62);
            nVar.f(strE, objK0);
        }
        return (String) objK0;
    }
}
