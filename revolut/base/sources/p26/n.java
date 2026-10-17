package p26;

import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiAssetDetailsScreenContract$InputData f232095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f232096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g26.b f232097c;
    public final a8j.a d;
    public final o9j.b e;
    public final j2 f;

    public n(DeFiAssetDetailsScreenContract$InputData inputData, c dataSource, g26.b assetDetailsInteractor, a8j.a chartState, o9j.b chartMapper, e chartHeaderMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(assetDetailsInteractor, "assetDetailsInteractor");
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        Intrinsics.checkNotNullParameter(chartHeaderMapper, "chartHeaderMapper");
        this.f232095a = inputData;
        this.f232096b = dataSource;
        this.f232097c = assetDetailsInteractor;
        this.d = chartState;
        this.e = chartMapper;
        this.f = q.c(null);
    }
}
