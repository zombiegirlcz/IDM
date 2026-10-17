package hea;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.pocket_details.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            mre.c cVar = aVar2.O;
            TermsScope.INSTANCE.getClass();
            ufm.i iVarC = ((rre.d) cVar).c(TermsScope.B, null);
            this.u = 1;
            obj2 = nim.a.b(iVarC, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        NaviCommand naviCommand = (NaviCommand) obj2;
        Intrinsics.h(naviCommand);
        return aVar2.C1(u0.b(naviCommand));
    }
}
