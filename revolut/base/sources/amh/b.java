package amh;

import com.revolut.feature.wealth.ui.impl.statements.screen.StatementScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q0;
import vkm.t0;
import vkm.v1;
import vkm.y;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ StatementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(StatementScreen statementScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = statementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        ybl.n nVar;
        int i = this.u;
        StatementScreen statementScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x) ((g) statementScreen.M.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar = (x) ((g) statementScreen.M.getValue());
                h hVar = (h) ((j2) xVar.f6432x.f22677a).getValue();
                String str = hVar.f6400a;
                if (Intrinsics.f(str, "TAB_ID_PDF")) {
                    nVar = ybl.n.PDF;
                } else if (Intrinsics.f(str, "TAB_ID_EXCEL")) {
                    nVar = ybl.n.EXCEL;
                } else {
                    hx7.e.n(new IllegalArgumentException(j6.a.q("Unknown selected tab: ", hVar.f6400a)));
                    nVar = ybl.n.PDF;
                }
                t0 t0VarB = vkm.q.B(new t(xVar, nVar, null), new y(new s(xVar, null, 0), new v1(new ald.l(xVar, null, 1))));
                tji.f fVarX = xVar.X();
                vyd.a aVar3 = xVar.f6428r;
                yji.l.a1(xVar, new a6e.b(new q0(byd.g.c(t0VarB, fVarX, aVar3.d(), new afa.q(xVar, 26), new j(aVar3, xVar)), new s(xVar, null, 1), 1), 3), null, null, new a26.q(nVar, xVar, (Continuation) null, 12), 3);
                break;
        }
        return Unit.f186387a;
    }
}
