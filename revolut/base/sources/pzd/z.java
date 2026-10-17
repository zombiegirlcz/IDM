package pzd;

import com.revolut.feature.statements.api.StatementsMode;
import com.revolut.feature.statements.api.models.StatementProductType;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;
import vkm.v1;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f240982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f240983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.consolidated.screen.a f240984y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i, com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f240984y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                z zVar = new z(0, this.f240984y, continuation);
                zVar.f240982w = flowCollector;
                zVar.f240983x = obj3;
                return zVar.invokeSuspend(Unit.f186387a);
            default:
                z zVar2 = new z(1, this.f240984y, continuation);
                zVar2.f240982w = flowCollector;
                zVar2.f240983x = obj3;
                return zVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Set setB;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f240982w;
                    Set productTypes = (Set) this.f240983x;
                    com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar2 = this.f240984y;
                    StatementsMode statementsMode = ((p) ((j2) aVar2.f88322x.f22677a).getValue()).i.f88295a;
                    aVar2.o.getClass();
                    io3.h availablePeriodType = g.b(statementsMode);
                    i0e.q qVar = (i0e.q) aVar2.f88317q;
                    qVar.getClass();
                    Intrinsics.checkNotNullParameter(productTypes, "productTypes");
                    Intrinsics.checkNotNullParameter(availablePeriodType, "availablePeriodType");
                    ghk.a0 a0VarD3 = qVar.d3(nim.a.v(new v1(new hsd.c((Object) qVar, (Object) productTypes, false, (Continuation) null, 8)), new a83.d0(28, productTypes)), availablePeriodType, h0.f322473a);
                    this.f240982w = null;
                    this.f240983x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, a0VarD3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar3 = this.f240984y;
                g gVar = aVar3.o;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f240982w;
                    StatementsMode mode = ((p) ((j2) aVar3.f88322x.f22677a).getValue()).i.f88295a;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(mode, "mode");
                    if (mode instanceof StatementsMode.Consolidated) {
                        StatementProductType[] elements = {StatementProductType.COMMODITIES, StatementProductType.CRYPTO, StatementProductType.JOINT_CURRENT, StatementProductType.PERSONAL_CURRENT, StatementProductType.PRO, StatementProductType.SAVINGS, StatementProductType.JOINT_SAVINGS, StatementProductType.STOCK, StatementProductType.TAX_ADVANTAGED_INVESTING};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        setB = kotlin.collections.d.y0(elements);
                    } else {
                        if (!(mode instanceof StatementsMode.TaxCertificate) && !(mode instanceof StatementsMode.TaxFiling)) {
                            if (!Intrinsics.f(mode, StatementsMode.BankIDAnnualStatements.f88212a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalArgumentException(mode + " not supported");
                        }
                        setB = y0.b(StatementProductType.PERSONAL_CURRENT);
                    }
                    gVar.getClass();
                    ghk.a0 a0VarG = i0e.e.G(aVar3.f88317q, setB, g.b(mode), null, 12);
                    this.f240982w = null;
                    this.f240983x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, a0VarG, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
