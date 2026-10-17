package fj7;

import efm.r;
import kj7.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ti7.d;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements si7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi7.b f135546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi7.a f135547b;

    public b(xi7.b insuranceRepository, xi7.a remoteInsuranceDetailsRepository) {
        Intrinsics.checkNotNullParameter(insuranceRepository, "insuranceRepository");
        Intrinsics.checkNotNullParameter(remoteInsuranceDetailsRepository, "remoteInsuranceDetailsRepository");
        this.f135546a = insuranceRepository;
        this.f135547b = remoteInsuranceDetailsRepository;
    }

    public final r e(dl7.a subtype, d limitKey) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(limitKey, "limitKey");
        return nim.a.w(nim.a.w(((o) this.f135546a).f.f(Unit.f186387a, false), new fca.d(subtype, 27)), new fca.d(limitKey, 28));
    }
}
