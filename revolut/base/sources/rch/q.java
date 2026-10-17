package rch;

import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f253285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final adh.o f253286b;

    public q(u mapper, adh.o wealthMapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(wealthMapper, "wealthMapper");
        this.f253285a = mapper;
        this.f253286b = wealthMapper;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(nb0.b(pb0.Companion, a0.d.n("POPULAR_ASSET_ITEM_ID_", i), false, 0, false, 30));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}
