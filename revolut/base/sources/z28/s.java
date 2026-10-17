package z28;

import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends gim.i implements Function2 {
    public FeatureCommand u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f319030w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x xVar, Continuation continuation) {
        super(2, continuation);
        this.f319030w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s(this.f319030w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FeatureCommand featureCommand;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FeatureCommand featureCommandF = u0.f(new WealthTradeRedesignDestination(sih.c.CFD));
            p2b.i iVar = this.f319030w.f319031a;
            this.u = featureCommandF;
            this.v = 1;
            Object objA = iVar.a(this);
            if (objA == aVar) {
                return aVar;
            }
            featureCommand = featureCommandF;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            featureCommand = this.u;
            yhm.o.b(obj2);
        }
        return ((Boolean) obj2).booleanValue() ? gc0.c.f(new KompotOverlayFeatureConfig(new CfdTradingFeatureConfig.CfdRiskWarningFlowDestination(featureCommand, null, null), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)) : featureCommand;
    }
}
