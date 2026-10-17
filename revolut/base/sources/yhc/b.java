package yhc;

import h4g.g;
import kotlin.jvm.internal.Intrinsics;
import sic.d;
import sic.e;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements kgc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f313907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f313908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kgc.c f313909c;
    public final a d;

    public b(d perkIconImageMapper, e perkLabelMapper, kgc.c perkTagMapper, a perkAvailabilityStatusMapper, g shopsFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(perkIconImageMapper, "perkIconImageMapper");
        Intrinsics.checkNotNullParameter(perkLabelMapper, "perkLabelMapper");
        Intrinsics.checkNotNullParameter(perkTagMapper, "perkTagMapper");
        Intrinsics.checkNotNullParameter(perkAvailabilityStatusMapper, "perkAvailabilityStatusMapper");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        this.f313907a = perkIconImageMapper;
        this.f313908b = perkLabelMapper;
        this.f313909c = perkTagMapper;
        this.d = perkAvailabilityStatusMapper;
    }
}
