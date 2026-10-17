package uye;

import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i f284319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TopupFlowContract$Step f284320x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, TopupFlowContract$Step topupFlowContract$Step, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f284319w = iVar;
        this.f284320x = topupFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f284319w, this.f284320x, continuation, 0);
            default:
                return new s(this.f284319w, this.f284320x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    TopupFlowContract$Step topupFlowContract$Step = this.f284320x;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar = this.f284319w;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.d dVar = new com.revolut.feature.topup_screen.impl.flows.topup.flow.d(topupFlowContract$Step, iVar, null);
                    this.v = 1;
                    if (iVar.p2(this, dVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    TopupFlowContract$Step topupFlowContract$Step2 = this.f284320x;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar2 = this.f284319w;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.g gVar = new com.revolut.feature.topup_screen.impl.flows.topup.flow.g(topupFlowContract$Step2, iVar2, null);
                    this.v = 1;
                    if (iVar2.p2(this, gVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
