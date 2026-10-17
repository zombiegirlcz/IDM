package owf;

import com.revolut.feature.transport.api.navigation.TransportFlowDestination;
import com.revolut.feature.transport.api.navigation.TransportStartType;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import iuf.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        m mVar;
        Object objQ;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        m mVar2 = this.v;
        Continuation continuation = null;
        if (i == 0) {
            o.b(obj2);
            y yVar = new y(mVar2, 16);
            k kVar = new k(mVar2, continuation, 1);
            this.u = 1;
            mVar = mVar2;
            objQ = n14.k.Q(mVar, null, null, yVar, kVar, this, 2);
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            mVar = mVar2;
            objQ = obj2;
        }
        nii.e eVar = (nii.e) objQ;
        if (eVar instanceof nii.c) {
            return Unit.f186387a;
        }
        if (eVar instanceof nii.d) {
            return mVar.C1(u0.b(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new TransportFlowDestination(TransportStartType.Hub.Transit.f92499a), false, (Integer) null, 0, 61)), new FinishCommand(null, null, null, 7))));
        }
        throw new NoWhenBranchMatchedException();
    }
}
