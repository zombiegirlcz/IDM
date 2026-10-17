package wqf;

import aii.q;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n14.k;
import nii.f;
import nii.g;
import nii.h;
import vkj.l;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            lic.a aVar2 = new lic.a(dVar, 26);
            l lVar = new l(dVar, 2);
            b bVar = new b(dVar, continuation, 1);
            this.u = 1;
            obj2 = k.S(dVar.X(), null, aVar2, lVar, bVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h hVar = (h) obj2;
        if (hVar instanceof f) {
            dVar.v2(q.f5292a);
            return Unit.f186387a;
        }
        if (hVar instanceof g) {
            return dVar.C1(new BridgeDestination(new FinishCommand(new Integer(199333), null, null, 6)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
