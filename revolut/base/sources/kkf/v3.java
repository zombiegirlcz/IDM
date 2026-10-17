package kkf;

import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayOrderDetails;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v3 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f184980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kac.g f184981n;
    public final gte.a o;

    public v3(klf.h0 commonDataSource, klf.m1 juniorDataSource, kac.g orderDetailsUiMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(orderDetailsUiMapper, "orderDetailsUiMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f184979l = commonDataSource;
        this.f184980m = juniorDataSource;
        this.f184981n = orderDetailsUiMapper;
        this.o = featureToggleInteractor;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (obj2 instanceof kac.f) {
            A2(new RevolutPayFeatureConfig$RevolutPayOrderDetails(((kac.f) obj2).f182458a));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
