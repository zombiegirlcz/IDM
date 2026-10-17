package pme;

import ajk.f;
import kotlin.jvm.internal.Intrinsics;
import mre.c;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f80.a f237551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f237552m;

    public b(c termsNavigationFactory, f80.a uriHelper, f pricingPlanNavigationCommandsProvider) {
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(pricingPlanNavigationCommandsProvider, "pricingPlanNavigationCommandsProvider");
        this.f237551l = uriHelper;
        this.f237552m = pricingPlanNavigationCommandsProvider;
    }
}
