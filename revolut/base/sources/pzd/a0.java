package pzd;

import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.consolidated.screen.a f240953w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i, com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f240953w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(0, this.f240953w, continuation);
                a0Var.v = obj2;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(1, this.f240953w, continuation);
                a0Var2.v = obj2;
                return a0Var2;
            case 2:
                a0 a0Var3 = new a0(2, this.f240953w, continuation);
                a0Var3.v = obj2;
                return a0Var3;
            case 3:
                a0 a0Var4 = new a0(3, this.f240953w, continuation);
                a0Var4.v = obj2;
                return a0Var4;
            default:
                a0 a0Var5 = new a0(4, this.f240953w, continuation);
                a0Var5.v = obj2;
                return a0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((i0e.w) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a0) create((StatementPeriod) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a0) create((StatementPeriodType) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((a0) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((w) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NaviCommand naviCommandA;
        int i = this.u;
        com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar = this.f240953w;
        switch (i) {
            case 0:
                i0e.w wVar = (i0e.w) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f88322x, new azd.i(wVar, 3));
                return Unit.f186387a;
            case 1:
                StatementPeriod statementPeriod = (StatementPeriod) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f88322x, new a0e.x(statementPeriod, 6));
                return Unit.f186387a;
            case 2:
                StatementPeriodType statementPeriodType = (StatementPeriodType) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f88322x, new pth.l(statementPeriodType, 26));
                return Unit.f186387a;
            case 3:
                Set set = (Set) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f88322x, new imk.e(27, set));
                return Unit.f186387a;
            default:
                w wVar2 = (w) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0e.b bVar = aVar.f88318r;
                if (wVar2 instanceof v) {
                    naviCommandA = bVar.c(null, ((v) wVar2).f240980a);
                } else {
                    if (!(wVar2 instanceof u)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    naviCommandA = bVar.a(((u) wVar2).f240979a);
                }
                aVar.C1(u0.b(naviCommandA));
                return Unit.f186387a;
        }
    }
}
