package fjh;

import kotlin.jvm.internal.Intrinsics;
import mjh.h;
import njh.d;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ojh.a f135635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f135636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kjh.a f135637c;
    public final h d;
    public final rjh.a e;

    public a(ojh.a securitiesWidgetMapper, d roboWidgetMapper, kjh.a commodityWidgetMapper, h marginWidgetMapper, rjh.a taxAdvantageAccountWidgetMapper) {
        Intrinsics.checkNotNullParameter(securitiesWidgetMapper, "securitiesWidgetMapper");
        Intrinsics.checkNotNullParameter(roboWidgetMapper, "roboWidgetMapper");
        Intrinsics.checkNotNullParameter(commodityWidgetMapper, "commodityWidgetMapper");
        Intrinsics.checkNotNullParameter(marginWidgetMapper, "marginWidgetMapper");
        Intrinsics.checkNotNullParameter(taxAdvantageAccountWidgetMapper, "taxAdvantageAccountWidgetMapper");
        this.f135635a = securitiesWidgetMapper;
        this.f135636b = roboWidgetMapper;
        this.f135637c = commodityWidgetMapper;
        this.d = marginWidgetMapper;
        this.e = taxAdvantageAccountWidgetMapper;
    }
}
