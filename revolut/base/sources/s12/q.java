package s12;

import a12.u;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import rtl.y;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f259053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f259054b;

    public q(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f259053a = featureToggleInteractor;
        this.f259054b = yhm.j.b(new y(this, 13));
    }
}
