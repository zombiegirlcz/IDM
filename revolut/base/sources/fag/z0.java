package fag;

import com.revolut.feature.travel.hotels.impl.network.TravelHotelsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsService f133406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9g.n f133407b;

    public z0(TravelHotelsService api2, j9g.n searchItemMapper) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(searchItemMapper, "searchItemMapper");
        this.f133406a = api2;
        this.f133407b = searchItemMapper;
    }
}
