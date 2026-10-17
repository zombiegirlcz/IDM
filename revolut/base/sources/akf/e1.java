package akf;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import tof.h3;
import tof.p6;

/* JADX INFO: loaded from: classes8.dex */
public final class e1 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ f1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, Continuation continuation) {
        super(1, continuation);
        this.v = f1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e1(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e1) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        p6 p6Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f1 f1Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            Flow flowH = f1Var.f5832l.h(new aik.d(18));
            this.u = 1;
            obj2 = vkm.q.z(flowH, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        h3 h3Var = (h3) obj2;
        String str = (h3Var == null || (p6Var = h3Var.f272780b) == null) ? null : p6Var.f272991a;
        if (str != null) {
            return f1Var.A2(zh9.u0.b(com.revolut.retail.core.navigation.a.c(((f73.c) f1Var.f5834n).c(new CardScreenAction.Select(str, 6, false, false), AccountId.Personal.f51414a), new FinishCommand(null, null, null, 7))));
        }
        return null;
    }
}
