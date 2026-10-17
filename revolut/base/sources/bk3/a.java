package bk3;

import bjg.d;
import com.revolut.feature.commodities.onboarding.api.navigation.CommoditiesOnboardingDestination$Risks;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import te0.w;
import ufm.i;
import wgb.v;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f16240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jf0.c f16241c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ a(c cVar, jf0.c cVar2, boolean z, int i) {
        this.f16239a = i;
        this.f16240b = cVar;
        this.f16241c = cVar2;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ufm.b bVarO0;
        int i = this.f16239a;
        boolean z = this.d;
        jf0.c cVar = this.f16241c;
        c cVar2 = this.f16240b;
        switch (i) {
            case 0:
                uj3.a featureState = (uj3.a) obj2;
                Intrinsics.checkNotNullParameter(featureState, "featureState");
                Intrinsics.checkNotNullParameter(featureState, "<this>");
                int i2 = 1;
                if (!(featureState != uj3.a.FEATURE_UNAVAILABLE)) {
                    ufm.b bVarM = d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                boolean zF = Intrinsics.f(cVar.e(3), "onboarding");
                int i3 = 8;
                DummyCommand targetCommandIfOnboardingComplete = DummyCommand.f98635a;
                if (zF) {
                    bVarO0 = d0.m(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CommoditiesOnboardingDestination$Risks(targetCommandIfOnboardingComplete), false, (Integer) null, 0, 61)));
                    Intrinsics.checkNotNullExpressionValue(bVarO0, "just(...)");
                } else if (uj3.b.q(featureState)) {
                    bVarO0 = d0.m(c.b());
                    Intrinsics.checkNotNullExpressionValue(bVarO0, "just(...)");
                } else {
                    sj3.a aVar = cVar2.f16245b;
                    dfa.a aVar2 = dfa.a.POCKET_SWITCHER;
                    wj3.a aVar3 = (wj3.a) aVar;
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(targetCommandIfOnboardingComplete, "targetCommandIfOnboardingComplete");
                    bVarO0 = w.o0(g.f186406a, new v(aVar3, targetCommandIfOnboardingComplete, null, i3));
                }
                return new i(bVarO0, new d(i3, new a(cVar2, cVar, z, i2)), 1);
            default:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                m mVar = cVar2.f16246c;
                if (cVar.l() && z) {
                    command = com.revolut.retail.core.navigation.a.c(c.b(), command);
                }
                mVar.c(command);
                return Boolean.TRUE;
        }
    }
}
