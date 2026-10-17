package snk;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function1 {
    public r u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f264645w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, Continuation continuation) {
        super(1, continuation);
        this.f264645w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.f264645w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r rVar2 = this.f264645w;
            mre.c cVar = rVar2.v;
            TermsScope.INSTANCE.getClass();
            ufm.i iVarC = ((rre.d) cVar).c(TermsScope.u0, null);
            this.u = rVar2;
            this.v = 1;
            Object objB = nim.a.b(iVarC, this);
            if (objB == aVar) {
                return aVar;
            }
            rVar = rVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return rVar.C1(u0.b((NaviCommand) obj2));
    }
}
