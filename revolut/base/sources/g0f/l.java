package g0f;

import com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId;
import com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData;
import e0f.r1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.mcy.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0f.f f139487w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.topup_screen.impl.mcy.b bVar, h0f.f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f139487w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, this.f139487w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        try {
            if (i == 0) {
                o.b(obj2);
                com.revolut.feature.topup_screen.impl.mcy.b bVar = this.v;
                h0f.f fVar = this.f139487w;
                u51.a aVar2 = bVar.v;
                McyTopupFlowContract$InputData mcyTopupFlowContract$InputData = bVar.o;
                PreselectedTopUpMethodId.StoredMethodId storedMethodId = new PreselectedTopUpMethodId.StoredMethodId(fVar.f148389a);
                String str = mcyTopupFlowContract$InputData.getF91048a().f90550a;
                yte.n nVar = mcyTopupFlowContract$InputData.getF91048a().f90551b;
                this.u = 1;
                if (((r1) aVar2).k(storedMethodId, str, nVar, true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
            return null;
        }
    }
}
