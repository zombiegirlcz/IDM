package nyb;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jxb.f f220800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.a f220801b;

    public j(jxb.f revPointsRepository, eub.a revPointsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(revPointsRepository, "revPointsRepository");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        this.f220800a = revPointsRepository;
        this.f220801b = revPointsAvailabilityInteractor;
    }

    public static efm.r a(j jVar) {
        jVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jxb.l lVar = (jxb.l) jVar.f220800a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return lVar.f179128h.e(Unit.f186387a, loadingStrategy);
    }
}
