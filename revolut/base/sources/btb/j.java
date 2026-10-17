package btb;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SharedStep f18532w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AddressFlowContract$OutputData f18533x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, SharedStep sharedStep, AddressFlowContract$OutputData addressFlowContract$OutputData, Continuation continuation) {
        super(1, continuation);
        this.v = lVar;
        this.f18532w = sharedStep;
        this.f18533x = addressFlowContract$OutputData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f18532w, this.f18533x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            jvh.a aVar2 = this.v.f18541q;
            String str = ((SharedStep.ResidentialAddressCollectionV2) this.f18532w).f105784b;
            MobileScreenParams.ResidentialAddressCollectionV2 residentialAddressCollectionV2 = new MobileScreenParams.ResidentialAddressCollectionV2(this.f18533x.f60940a);
            this.u = 1;
            if (aVar2.j(str, residentialAddressCollectionV2, this) == aVar) {
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
