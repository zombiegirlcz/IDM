package btb;

import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import v0d.b;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ v0d.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f18534w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SharedStep f18535x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ plc.i f18536y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v0d.b bVar, l lVar, SharedStep sharedStep, plc.i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f18534w = lVar;
        this.f18535x = sharedStep;
        this.f18536y = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, this.f18534w, this.f18535x, this.f18536y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        plc.i iVar = this.f18536y;
        if (i == 0) {
            yhm.o.b(obj2);
            v0d.b bVar = this.v;
            if (!(bVar instanceof v0d.c)) {
                if (!(bVar instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar.invoke(new od9.f(null));
                return Unit.f186387a;
            }
            jvh.a aVar2 = this.f18534w.f18541q;
            String str = ((SharedStep.SendGuardianInvitation) this.f18535x).f105792b;
            this.u = 1;
            if (aVar2.j(str, MobileScreenParams.SendGuardianInvitation.f105446a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        iVar.invoke(new od9.h(false));
        return Unit.f186387a;
    }
}
