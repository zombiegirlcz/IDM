package ay5;

import kotlin.jvm.internal.Intrinsics;
import nw5.j;
import ny5.c;
import ny5.g;
import ny5.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv5.b f11071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f11072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f11073c;
    public final j d;

    public b(tv5.b currencyDiscoveryInteractor, g presentationModel, c cryptoCommodityPartiallyPredefinedOrderSorter, j cryptoStatsInteractor, u cryptoSorter) {
        Intrinsics.checkNotNullParameter(currencyDiscoveryInteractor, "currencyDiscoveryInteractor");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(cryptoCommodityPartiallyPredefinedOrderSorter, "cryptoCommodityPartiallyPredefinedOrderSorter");
        Intrinsics.checkNotNullParameter(cryptoStatsInteractor, "cryptoStatsInteractor");
        Intrinsics.checkNotNullParameter(cryptoSorter, "cryptoSorter");
        this.f11071a = currencyDiscoveryInteractor;
        this.f11072b = presentationModel;
        this.f11073c = cryptoCommodityPartiallyPredefinedOrderSorter;
        this.d = cryptoStatsInteractor;
    }
}
