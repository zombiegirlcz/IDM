package nzj;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f221087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zj2.a f221088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f221089c;

    public p(ln.a navigationCommandsDispatcher, zj2.a atmDestinationsResolver, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(atmDestinationsResolver, "atmDestinationsResolver");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f221087a = navigationCommandsDispatcher;
        this.f221088b = atmDestinationsResolver;
        this.f221089c = featureToggleInteractor;
    }

    public final efm.b a() {
        return okl.m.w(null, null, null, 7, this.f221087a);
    }

    public final pfm.h b(FeatureCommand featureCommand) {
        pfm.h hVar = new pfm.h(new ne0.o(this, featureCommand, 9), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
