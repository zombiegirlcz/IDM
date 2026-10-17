package xy7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends ori.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx7.g f309635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fx7.f f309636c;
    public final r d;

    public k(fx7.g petIssueInteractor, fx7.f petInteractor, r pricingDifferenceMapper) {
        Intrinsics.checkNotNullParameter(petIssueInteractor, "petIssueInteractor");
        Intrinsics.checkNotNullParameter(petInteractor, "petInteractor");
        Intrinsics.checkNotNullParameter(pricingDifferenceMapper, "pricingDifferenceMapper");
        this.f309635b = petIssueInteractor;
        this.f309636c = petInteractor;
        this.d = pricingDifferenceMapper;
    }
}
