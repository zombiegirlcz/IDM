package obi;

import com.revolut.feature_retail_user_declarations.identity_declarations.IdentityDeclarationsFlowContract$State;
import com.revolut.feature_retail_user_declarations.identity_declarations.IdentityDeclarationsFlowInputData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import obi.g;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.identity_declarations.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature_retail_user_declarations.identity_declarations.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature_retail_user_declarations.identity_declarations.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar3 = aVar2.f97689p;
            IdentityDeclarationsFlowInputData identityDeclarationsFlowInputData = aVar2.o;
            String str = identityDeclarationsFlowInputData.f97669a;
            String str2 = identityDeclarationsFlowInputData.f97670b;
            ArrayList arrayListD = aVar2.f97690q.d(((IdentityDeclarationsFlowContract$State) ((j2) aVar2.f97692s.f22677a).getValue()).f97655a.values());
            this.u = 1;
            if (jvh.a.i(aVar3, str2, arrayListD, null, str, this, 4) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        aVar2.C2(g.b.f223964a);
        return Unit.f186387a;
    }
}
