package v25;

import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import uyh.s;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f285649w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = oVar;
        this.f285649w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f285649w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f285649w;
        o oVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r rVarG = m70.a.g(((y45.f) oVar.f285664m).k(str, w4l.j.f294644c), null, new s(27), 1);
            this.u = 1;
            obj2 = nim.a.c(rVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        if (((q35.r) obj2) instanceof q35.o) {
            oVar.A2(new LoanKompotFeatureConfig.SelectAutoPayNavigationDestination(str));
        } else {
            oVar.A2(new BridgeDestination(new FeatureCommand(new LoanKompotFeatureConfig.AutoPay(str, false))));
        }
        return Unit.f186387a;
    }
}
