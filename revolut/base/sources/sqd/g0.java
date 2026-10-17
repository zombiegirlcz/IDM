package sqd;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends gim.i implements Function1 {
    public com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i f265061w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ wi0.b f265062x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i iVar, wi0.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f265061w = iVar;
        this.f265062x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g0(this.f265061w, this.f265062x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i iVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i iVar2 = this.f265061w;
            mre.c cVar = iVar2.f87871x;
            TermsScope.INSTANCE.getClass();
            ufm.i iVarC = ((rre.d) cVar).c(TermsScope.o, this.f265062x);
            this.u = iVar2;
            this.v = 1;
            Object objB = nim.a.b(iVarC, this);
            if (objB == aVar) {
                return aVar;
            }
            iVar = iVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return iVar.C1(u0.b((NaviCommand) obj2));
    }
}
