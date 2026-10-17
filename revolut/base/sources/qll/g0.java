package qll;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pjl.z0;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.unified.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.sso.impl.ui.combined_authentication.unified.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.sso.impl.ui.combined_authentication.unified.a aVar = this.v;
        cli.y yVar = aVar.D;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            uil.a aVar3 = aVar.f106436r;
            ((rqk.k) aVar.f106437s).getClass();
            cjl.b bVar = cjl.b.RETAIL;
            this.u = 1;
            obj2 = ((z0) aVar3).i(bVar, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        List list = (List) obj2;
        if (list.isEmpty()) {
            aVar.H2(yVar, new ql6.s(4));
        } else {
            aVar.H2(yVar, new q2j.j(list, 11));
        }
        return Unit.f186387a;
    }
}
