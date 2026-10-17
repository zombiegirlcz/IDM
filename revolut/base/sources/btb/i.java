package btb;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f18529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ plc.i f18530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SharedStep f18531y;
    public final /* synthetic */ AddressFlowContract$OutputData z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l lVar, plc.i iVar, SharedStep sharedStep, AddressFlowContract$OutputData addressFlowContract$OutputData, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f18529w = lVar;
        this.f18530x = iVar;
        this.f18531y = sharedStep;
        this.z = addressFlowContract$OutputData;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f18529w, this.f18530x, this.f18531y, this.z, continuation, 0);
            default:
                return new i(this.f18529w, this.f18530x, this.f18531y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    SharedStep sharedStep = this.f18531y;
                    AddressFlowContract$OutputData addressFlowContract$OutputData = this.z;
                    l lVar = this.f18529w;
                    h hVar = new h(lVar, sharedStep, addressFlowContract$OutputData, null);
                    this.v = 1;
                    if (lVar.Y2(this, hVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                this.f18530x.invoke(new od9.h(false));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    SharedStep sharedStep2 = this.f18531y;
                    AddressFlowContract$OutputData addressFlowContract$OutputData2 = this.z;
                    l lVar2 = this.f18529w;
                    j jVar = new j(lVar2, sharedStep2, addressFlowContract$OutputData2, null);
                    this.v = 1;
                    if (lVar2.Y2(this, jVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                this.f18530x.invoke(new od9.h(false));
                return Unit.f186387a;
        }
    }
}
