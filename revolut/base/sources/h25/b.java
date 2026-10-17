package h25;

import com.revolut.feature.credit.application.plugins.impl.ui.close.flow.CreditApplicationCloseFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.close.flow.CreditApplicationCloseFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import ft3.a1;
import ft3.d1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public e u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f148696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d1 f148697x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f148698y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, d1 d1Var, a1 a1Var, Continuation continuation) {
        super(1, continuation);
        this.f148696w = eVar;
        this.f148697x = d1Var;
        this.f148698y = a1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f148696w, this.f148697x, this.f148698y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e eVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        e eVar2 = this.f148696w;
        if (i == 0) {
            o.b(obj2);
            h64.d dVar = eVar2.f148707n;
            this.u = eVar2;
            this.v = 1;
            dVar.getClass();
            obj2 = new CreditApplicationCloseFlow(new CreditApplicationCloseFlowContract$InputData(null, this.f148697x, this.f148698y, false));
            if (obj2 == aVar) {
                return aVar;
            }
            eVar = eVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = this.u;
            o.b(obj2);
        }
        n.P2(eVar, (ViewController) obj2, null, new gwe.d(eVar2, 18), 1);
        return Unit.f186387a;
    }
}
