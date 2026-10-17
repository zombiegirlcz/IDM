package oyb;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import ox5.t0;
import oxd.m;
import ufm.i;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f230931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f230932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f230933c;

    public e(t pricingPlanInteractor, gte.a featureToggleInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f230931a = pricingPlanInteractor;
        this.f230932b = featureToggleInteractor;
        this.f230933c = userInteractor;
    }

    public final i a() {
        i iVar = new i(new i(this.f230933c.f(false), new oy9.b(new t0(21), 14), 1), new oy9.b(new m(this, 5), 15), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
