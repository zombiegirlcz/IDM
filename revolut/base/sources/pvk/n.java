package pvk;

import com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.InsightsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InsightsScreen f240293w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(InsightsScreen insightsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f240293w = insightsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f240293w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            default:
                n nVar2 = new n(this.f240293w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        x xVar = (x) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(xVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InsightsScreen insightsScreen = this.f240293w;
        switch (i) {
            case 0:
                x xVar = (x) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((e) insightsScreen.e3()).I2(xVar);
                break;
            default:
                x xVar2 = (x) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((e) insightsScreen.e3()).I2(xVar2);
                break;
        }
        return Unit.f186387a;
    }
}
