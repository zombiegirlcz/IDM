package s91;

import com.revolut.feature.account_switching.api.AccountSwitchingApi$Toggles$AccountSwitchingFlow;
import go.g;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rd0.e;
import yoj.c;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f261086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f261087b;

    public a(xoj.a featuresInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f261086a = featuresInteractor;
        this.f261087b = featureToggleInteractor;
    }

    public final Flow a() {
        if (!((d) this.f261087b).c(AccountSwitchingApi$Toggles$AccountSwitchingFlow.f60556c)) {
            return new g(Boolean.FALSE, 2);
        }
        return e.b(((cpj.b) this.f261086a).l(c.ACCOUNT_SWITCHING));
    }
}
