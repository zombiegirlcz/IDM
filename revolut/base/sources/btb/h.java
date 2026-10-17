package btb;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SharedStep f18527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AddressFlowContract$OutputData f18528x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, SharedStep sharedStep, AddressFlowContract$OutputData addressFlowContract$OutputData, Continuation continuation) {
        super(1, continuation);
        this.v = lVar;
        this.f18527w = sharedStep;
        this.f18528x = addressFlowContract$OutputData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f18527w, this.f18528x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            jvh.a aVar2 = this.v.f18541q;
            String str = ((SharedStep.ResidentialAddressCollection) this.f18527w).f105781b;
            MobileScreenParams.ResidentialAddressCollection residentialAddressCollection = new MobileScreenParams.ResidentialAddressCollection(this.f18528x.f60940a);
            this.u = 1;
            if (aVar2.j(str, residentialAddressCollection, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
