package t48;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TermsScope f267940w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, TermsScope termsScope, Continuation continuation) {
        super(2, continuation);
        this.v = yVar;
        this.f267940w = termsScope;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.v, this.f267940w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        y yVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            obj2 = y.A2(yVar, this.f267940w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return yVar.C1(new BridgeDestination((NaviCommand) obj2));
    }
}
