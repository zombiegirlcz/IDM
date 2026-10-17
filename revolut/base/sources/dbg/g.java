package dbg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8g.c f112750a;

    public g(mag.b exchangedAmountMapper, fcg.b travelHotelsBreakdownItemsFactory, p8g.c featureInteractor) {
        Intrinsics.checkNotNullParameter(exchangedAmountMapper, "exchangedAmountMapper");
        Intrinsics.checkNotNullParameter(travelHotelsBreakdownItemsFactory, "travelHotelsBreakdownItemsFactory");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        this.f112750a = featureInteractor;
    }
}
