package c7e;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function1 {
    public g u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f21935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zm3.a f21936x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, zm3.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f21935w = gVar;
        this.f21936x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.f21935w, this.f21936x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g gVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            g gVar2 = this.f21935w;
            ufm.b bVarB = q8k.g.b(gVar2.u, this.f21936x, m1l.a.SCHEDULE_ENABLED, TransferFlowType.Default.f92257b, null, new FlowExtras(new FinishCommand(null, null, null, 7)), null, null, 232);
            this.u = gVar2;
            this.v = 1;
            Object objB = nim.a.b(bVarB, this);
            if (objB == aVar) {
                return aVar;
            }
            gVar = gVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = this.u;
            o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return gVar.A2(u0.c((FeatureConfig) obj2));
    }
}
