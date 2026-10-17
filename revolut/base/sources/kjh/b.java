package kjh;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f184407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ljh.a f184408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f184409c;

    public b(c commodityItemMapper, ljh.a expandCollapseItemsCtaMapper) {
        Intrinsics.checkNotNullParameter(commodityItemMapper, "commodityItemMapper");
        Intrinsics.checkNotNullParameter(expandCollapseItemsCtaMapper, "expandCollapseItemsCtaMapper");
        this.f184407a = commodityItemMapper;
        this.f184408b = expandCollapseItemsCtaMapper;
        this.f184409c = j.b(new ka9.b(21));
    }
}
