package i06;

import com.revolut.feature.customer_present.tips.impl.screen.tips_management.TipsManagementScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TipsManagementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(TipsManagementScreen tipsManagementScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = tipsManagementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                ((b) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            default:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TipsManagementScreen tipsManagementScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q) tipsManagementScreen.e3()).B2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q controllerModel = (q) tipsManagementScreen.e3();
                controllerModel.f157305p.getClass();
                Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
                throw new IllegalStateException("How tips work article is not supported in Retail app");
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar = (q) tipsManagementScreen.e3();
                qVar.H2(qVar.f157307r, new m(qVar, 0));
                qVar.n2(new p(qVar, null, 0), new whi.b(6));
                qVar.n2(new p(qVar, null, 1), new whi.b(6));
                return Unit.f186387a;
        }
    }
}
