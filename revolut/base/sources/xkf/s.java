package xkf;

import kotlin.jvm.internal.Intrinsics;
import sgm.e3;

/* JADX INFO: loaded from: classes8.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f306766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f306767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ao.h f306768c;
    public final q d;

    public s(klf.h0 commonDataSource, e3 juniorTransferRequestInteractor, ao.h juniorCoparentInteractor, p availabilityChecker, q mapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorTransferRequestInteractor, "juniorTransferRequestInteractor");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(availabilityChecker, "availabilityChecker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f306766a = commonDataSource;
        this.f306767b = juniorTransferRequestInteractor;
        this.f306768c = juniorCoparentInteractor;
        this.d = mapper;
    }
}
