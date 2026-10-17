package p48;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$InputData;
import g48.r0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function1 {
    public io3.d u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.close_flow.a f232843w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.joint.impl.ui.close_flow.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f232843w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.f232843w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.joint.impl.ui.close_flow.a aVar = this.f232843w;
        JointCloseFlowContract$InputData jointCloseFlowContract$InputData = aVar.o;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            ufm.i iVarY = aVar.f76519r.y(jointCloseFlowContract$InputData.f76512a);
            this.v = 1;
            obj2 = nim.a.b(iVarY, this);
            if (obj2 != aVar2) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            io3.d dVar = this.u;
            o.b(obj2);
            return dVar;
        }
        o.b(obj2);
        io3.d dVar2 = (io3.d) obj2;
        r0 r0Var = aVar.f76517p;
        AccountId.Joint joint = jointCloseFlowContract$InputData.f76512a;
        this.u = dVar2;
        this.v = 2;
        return r0Var.u(joint, this) == aVar2 ? aVar2 : dVar2;
    }
}
