package js7;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;
import w4l.k;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final up3.b f178156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ys7.d f178157b;

    public f(up3.b availabilityInteractor, ys7.d repository) {
        Intrinsics.checkNotNullParameter(availabilityInteractor, "availabilityInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f178156a = availabilityInteractor;
        this.f178157b = repository;
    }

    public final v1 a(String facilityId, wr7.a insuranceType, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(insuranceType, "insuranceType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new v1(new fc0.e(this, insuranceType, facilityId, loadingStrategy, (Continuation) null, 12));
    }
}
