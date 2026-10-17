package amh;

import ael.b1;
import ael.u0;
import ael.z0;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.statement.StatementProduct;
import com.revolut.feature.wealth.api.domain.model.statement.StatementType;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ x v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ybl.n f6421w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, ybl.n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = xVar;
        this.f6421w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, this.f6421w, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((ylh.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.r rVarX;
        xbl.d dVar;
        efm.r rVarX2;
        ylh.a aVar = (ylh.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        LocalDate from = aVar.f314705a;
        LocalDate to6 = aVar.f314706b;
        x xVar = this.v;
        f fVar = xVar.o;
        StatementType statementType = fVar.f6399b;
        boolean zF = Intrinsics.f(statementType, StatementType.Account.f95315a);
        ybl.n format = this.f6421w;
        if (zF) {
            StatementProduct statementProduct = fVar.f6398a;
            if (statementProduct instanceof StatementProduct.Commodities) {
                rVarX2 = efm.r.just(new Data(null, new Throwable("Account statements for commodities are not supported"), false, 5, null));
            } else if (statementProduct instanceof StatementProduct.MarginTrading) {
                rVarX2 = xVar.I2(((StatementProduct.MarginTrading) statementProduct).f95311a, format, from, to6).x();
            } else if (statementProduct instanceof StatementProduct.Robo) {
                rVarX2 = xVar.I2(((StatementProduct.Robo) statementProduct).f95312a, format, from, to6).x();
            } else if (statementProduct instanceof StatementProduct.TaxAdvantage) {
                rVarX2 = xVar.I2(((StatementProduct.TaxAdvantage) statementProduct).f95314a, format, from, to6).x();
            } else {
                if (!(statementProduct instanceof StatementProduct.Stocks)) {
                    throw new NoWhenBranchMatchedException();
                }
                rVarX2 = xVar.I2(((StatementProduct.Stocks) statementProduct).f95313a, format, from, to6).x();
            }
            Intrinsics.h(rVarX2);
            return rd0.e.b(rVarX2);
        }
        if (!Intrinsics.f(statementType, StatementType.Pnl.f95316a)) {
            throw new NoWhenBranchMatchedException();
        }
        StatementProduct statementProduct2 = fVar.f6398a;
        if (statementProduct2 instanceof StatementProduct.Commodities) {
            ybl.o oVar = xVar.f6430t;
            ybl.m product = ybl.m.COMMODITIES;
            b1 b1Var = (b1) oVar;
            b1Var.getClass();
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to6, "to");
            xbl.e eVar = xbl.e.REALISED_PNL;
            int i = z0.f3684a[format.ordinal()];
            if (i == 1) {
                dVar = xbl.d.PDF;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = xbl.d.CSV;
            }
            ufm.i iVar = new ufm.i(b1Var.c(new u0(product, b1Var, from, to6, dVar, eVar, 0)), new aed.f(new acb.f(format, b1Var, 15), 11), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            rVarX = iVar.x();
        } else if (statementProduct2 instanceof StatementProduct.MarginTrading) {
            rVarX = xVar.J2(((StatementProduct.MarginTrading) statementProduct2).f95311a, format, from, to6).x();
        } else if (statementProduct2 instanceof StatementProduct.Robo) {
            rVarX = xVar.J2(((StatementProduct.Robo) statementProduct2).f95312a, format, from, to6).x();
        } else if (statementProduct2 instanceof StatementProduct.Stocks) {
            rVarX = xVar.J2(((StatementProduct.Stocks) statementProduct2).f95313a, format, from, to6).x();
        } else {
            if (!(statementProduct2 instanceof StatementProduct.TaxAdvantage)) {
                throw new NoWhenBranchMatchedException();
            }
            rVarX = xVar.J2(((StatementProduct.TaxAdvantage) statementProduct2).f95314a, format, from, to6).x();
        }
        return rd0.e.b(rVarX);
    }
}
