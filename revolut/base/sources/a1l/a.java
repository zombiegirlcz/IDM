package a1l;

import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.start.StartContract$Configuration;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import pfm.t;
import te0.s;
import te0.w;
import y0l.g;
import y0l.h;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f646b;

    public /* synthetic */ a(d dVar, int i) {
        this.f645a = i;
        this.f646b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f645a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h hVar = (h) this.f646b.f650j.f310223a;
                return hVar.f310227b.getValue(hVar, h.f310226c[0]).c(s.f270018a).firstOrError();
            default:
                d dVar = this.f646b;
                y0l.b bVar = dVar.f649h;
                StartContract$Configuration startContract$Configuration = dVar.i;
                Boolean isOnboardingStarted = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isOnboardingStarted, "isOnboardingStarted");
                if (isOnboardingStarted.booleanValue() || startContract$Configuration.f104281b) {
                    return m.w(null, null, null, 7, ((g) bVar).f310225b);
                }
                h hVar2 = (h) dVar.f650j.f310223a;
                t tVarZ0 = w.z0(hVar2.f310227b.getValue(hVar2, h.f310226c[0]), Boolean.TRUE);
                TradingOnboardingFeatureConfig onboardingLaunchingConfig = startContract$Configuration.f104280a;
                g gVar = (g) bVar;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(onboardingLaunchingConfig, "onboardingLaunchingConfig");
                return tVarZ0.e(gVar.f310224a.c0(myk.a.a(onboardingLaunchingConfig, null, false, true)));
        }
    }
}
