package ynb;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function1 {
    public r u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f315405w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zm3.a f315406x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, zm3.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f315405w = rVar;
        this.f315406x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.f315405w, this.f315406x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r rVar2 = this.f315405w;
            ufm.b bVarB = q8k.g.b(rVar2.z, this.f315406x, m1l.a.SCHEDULE_ENABLED, TransferFlowType.Default.f92257b, null, new FlowExtras(new FinishCommand(null, null, null, 7)), null, null, 232);
            this.u = rVar2;
            this.v = 1;
            Object objB = nim.a.b(bVarB, this);
            if (objB == aVar) {
                return aVar;
            }
            rVar = rVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return rVar.A2(u0.c((FeatureConfig) obj2));
    }
}
