package lsl;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f199710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f199711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ndf.f f199712c;
    public final Lazy d;

    public l(msl.a badgeMapper, q detailsCellBuilder, gte.a featureToggleInteractor, ndf.f investSecuritiesOrderDetailsMapper) {
        Intrinsics.checkNotNullParameter(badgeMapper, "badgeMapper");
        Intrinsics.checkNotNullParameter(detailsCellBuilder, "detailsCellBuilder");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(investSecuritiesOrderDetailsMapper, "investSecuritiesOrderDetailsMapper");
        this.f199710a = detailsCellBuilder;
        this.f199711b = featureToggleInteractor;
        this.f199712c = investSecuritiesOrderDetailsMapper;
        this.d = yhm.j.b(new ljd.e(this, 14));
    }
}
