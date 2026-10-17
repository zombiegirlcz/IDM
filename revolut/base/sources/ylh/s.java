package ylh;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.ProductStatementPeriods;
import com.revolut.feature.wealth.api.domain.model.statement.StatementProduct;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends gim.i implements oim.n {
    public /* synthetic */ q u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Data f314725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f314726x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f314727y;
    public final /* synthetic */ StatementProduct z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, e eVar, StatementProduct statementProduct, Continuation continuation) {
        super(4, continuation);
        this.f314726x = tVar;
        this.f314727y = eVar;
        this.z = statementProduct;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        e eVar = this.f314727y;
        StatementProduct statementProduct = this.z;
        s sVar = new s(this.f314726x, eVar, statementProduct, (Continuation) obj5);
        sVar.u = (q) obj2;
        sVar.v = (Data) obj3;
        sVar.f314725w = (Data) obj4;
        return sVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g gVar;
        ProductStatementPeriods productStatementPeriodsZ2;
        q qVar = this.u;
        Data data = this.v;
        Data data2 = this.f314725w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (pyd.c.E(data2) && data2.getError() != null) {
            return new Data(null, data2.getError(), false, 5, null);
        }
        if (pyd.c.E(data) && data.getError() != null) {
            return new Data(null, data.getError(), false, 5, null);
        }
        e eVar = this.f314727y;
        StatementProduct statementProduct = this.z;
        try {
            Object content = data.getContent();
            if (content != null) {
                ProductStatementPeriods productStatementPeriods = (ProductStatementPeriods) content;
                Pair pair = (Pair) data2.getContent();
                t tVar = this.f314726x;
                if (pair != null && (productStatementPeriodsZ2 = t.Z2(tVar, productStatementPeriods, statementProduct, pair)) != null) {
                    productStatementPeriods = productStatementPeriodsZ2;
                }
                k kVar = tVar.o;
                h0 h0Var = h0.f322473a;
                a aVar2 = qVar.f314723b;
                if (aVar2 == null) {
                    aVar2 = (a) tVar.f314732q.getValue();
                }
                LinkedHashMap linkedHashMapA = ((d0) kVar).a(productStatementPeriods, h0Var, eVar, aVar2);
                c cVar = eVar instanceof c ? (c) eVar : null;
                w wVar = cVar != null ? cVar.f314712a : null;
                w wVar2 = qVar.f314722a;
                if (wVar2 != null) {
                    wVar = wVar2;
                } else if (wVar == null || linkedHashMapA.get(wVar) == null) {
                    wVar = (w) zhm.d0.a0(linkedHashMapA.keySet());
                }
                gVar = new g(wVar, linkedHashMapA);
            } else {
                gVar = null;
            }
            return new Data(gVar, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }
}
