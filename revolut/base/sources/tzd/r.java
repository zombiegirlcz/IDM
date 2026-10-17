package tzd;

import a0e.x;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.retail.core.navigation.NaviCommand;
import i0e.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f275938w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f275938w = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f275938w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(this.f275938w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
            default:
                r rVar3 = new r(this.f275938w, continuation, 2);
                rVar3.v = obj2;
                return rVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((w) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((StatementPeriod) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NaviCommand naviCommandA;
        int i = this.u;
        t tVar = this.f275938w;
        switch (i) {
            case 0:
                w wVar = (w) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.H2(tVar.u, new azd.i(wVar, 4));
                return Unit.f186387a;
            case 1:
                StatementPeriod statementPeriod = (StatementPeriod) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.H2(tVar.u, new x(statementPeriod, 7));
                return Unit.f186387a;
            default:
                o oVar = (o) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0e.b bVar = tVar.f275943s;
                if (oVar instanceof n) {
                    naviCommandA = bVar.c(null, ((n) oVar).f275935a);
                } else {
                    if (!(oVar instanceof m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    naviCommandA = bVar.a(((m) oVar).f275934a);
                }
                tVar.C1(u0.b(naviCommandA));
                return Unit.f186387a;
        }
    }
}
