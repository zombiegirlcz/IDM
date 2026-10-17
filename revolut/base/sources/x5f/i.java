package x5f;

import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.impl.domain.model.ManagedPortfolioReferenceData;
import com.revolut.feature.wealth.models.robo.BenchmarkInfo;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ a6f.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f302964w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f302965x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, h hVar, Continuation continuation) {
        super(3, continuation);
        this.f302964w = kVar;
        this.f302965x = hVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        i iVar = new i(this.f302964w, this.f302965x, (Continuation) obj4);
        iVar.u = (Data) obj2;
        iVar.v = (a6f.f) obj3;
        return iVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BigDecimal bigDecimalSubtract;
        Data data = this.u;
        a6f.f fVar = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p6f.d dVar = (p6f.d) data.getContent();
        if (dVar == null) {
            return null;
        }
        ArrayList arrayList = dVar.f233261a;
        if (arrayList.isEmpty()) {
            return null;
        }
        Pair pairR = do3.q.r(fVar);
        if (pairR == null) {
            pairR = new Pair(0, Integer.valueOf(arrayList.size() - 1));
        }
        BigDecimal bigDecimal = ((p6f.a) arrayList.get(Math.min(((Number) pairR.f186386b).intValue(), arrayList.size() - 1))).d;
        if (bigDecimal != null) {
            BigDecimal bigDecimal2 = ((p6f.a) arrayList.get(Math.min(((Number) pairR.f186385a).intValue(), arrayList.size() - 1))).d;
            if (bigDecimal2 == null) {
                bigDecimal2 = BigDecimal.ZERO;
            }
            Intrinsics.h(bigDecimal2);
            bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        } else {
            bigDecimalSubtract = null;
        }
        if (bigDecimalSubtract == null) {
            return null;
        }
        f fVar2 = (f) this.f302965x;
        boolean z = fVar2.f302961c;
        BenchmarkInfo benchmarkInfo = fVar2.f302959a;
        return new ManagedPortfolioReferenceData.Benchmark(z, benchmarkInfo.f95697a, benchmarkInfo.f95698b, bigDecimalSubtract);
    }
}
