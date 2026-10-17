package mb6;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function1 {
    public com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a f204166w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f204166w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.f204166w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.donations.impl.ui.kompot.flow.acceptterms.a aVar3 = this.f204166w;
            mre.c cVar = aVar3.f72014p;
            TermsScope.INSTANCE.getClass();
            ufm.i iVarC = ((rre.d) cVar).c(TermsScope.f90378r, null);
            this.u = aVar3;
            this.v = 1;
            Object objB = nim.a.b(iVarC, this);
            if (objB == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return aVar.C1(u0.b((NaviCommand) obj2));
    }
}
