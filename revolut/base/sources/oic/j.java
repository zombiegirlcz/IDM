package oic;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import ofa.n;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kgc.b f225609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f225610b;

    public j(kgc.b perkListItemsMapper) {
        Intrinsics.checkNotNullParameter(perkListItemsMapper, "perkListItemsMapper");
        this.f225609a = perkListItemsMapper;
        this.f225610b = yhm.j.b(new n(20));
    }
}
