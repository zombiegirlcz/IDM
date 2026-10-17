package wyd;

import com.revolut.feature.statements.api.models.StatementPeriod;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import s7a.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.account.a f301255w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.statements.impl.ui.account.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f301255w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f301255w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f301255w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            case 2:
                h hVar3 = new h(this.f301255w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
            default:
                h hVar4 = new h(this.f301255w, continuation, 3);
                hVar4.v = obj2;
                return hVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((StatementPeriod) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((i0e.w) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.statements.impl.ui.account.a aVar = this.f301255w;
        switch (i) {
            case 0:
                u uVar = (u) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f88293y, new wvg.d0(uVar, 18));
                break;
            case 1:
                StatementPeriod statementPeriod = (StatementPeriod) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f88293y, new a0e.x(statementPeriod, 8));
                break;
            case 2:
                Set set = (Set) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f88293y, new m0(20, set));
                break;
            default:
                i0e.w wVar = (i0e.w) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f88293y, new azd.i(wVar, 5));
                break;
        }
        return Unit.f186387a;
    }
}
