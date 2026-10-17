package qrk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import w4l.h;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lrk.a f248735a;

    public a(lrk.a assetDataPointsRepository) {
        Intrinsics.checkNotNullParameter(assetDataPointsRepository, "assetDataPointsRepository");
        this.f248735a = assetDataPointsRepository;
    }

    public static vkm.d a(a aVar, String ref2, List series, int i, int i2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(series, "series");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        lrk.a aVar2 = aVar.f248735a;
        cel.b params = new cel.b(i, i2, ref2, series);
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return aVar2.f199524a.b(params, loadingStrategy);
    }
}
