package w38;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 implements pfe.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g48.r0 f294154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f294155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p38.a f294156c;

    public a1(g48.r0 jointAccountsInteractor, gte.a featureToggleInteractor, p38.a jointAccountsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsProductFeatureChecker, "jointAccountsProductFeatureChecker");
        this.f294154a = jointAccountsInteractor;
        this.f294155b = featureToggleInteractor;
        this.f294156c = jointAccountsProductFeatureChecker;
    }

    @Override // pfe.h
    public final Flow a() {
        return new v1(new z0(this, null));
    }
}
