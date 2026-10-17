package x5f;

import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.impl.domain.model.ManagedPortfolioReferenceData;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements oim.n {
    public /* synthetic */ Data u;
    public /* synthetic */ a6f.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f302966w;

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        j jVar = new j(4, (Continuation) obj5);
        jVar.u = (Data) obj2;
        jVar.v = (a6f.f) obj3;
        jVar.f302966w = zBooleanValue;
        return jVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = this.u;
        a6f.f fVar = this.v;
        boolean z = this.f302966w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p6f.f fVar2 = (p6f.f) data.getContent();
        if (fVar2 == null) {
            return null;
        }
        ArrayList arrayList = fVar2.e;
        if (arrayList.isEmpty()) {
            return null;
        }
        Pair pairR = do3.q.r(fVar);
        return new ManagedPortfolioReferenceData.Contribution(((p6f.b) arrayList.get(Math.min(pairR != null ? ((Number) pairR.f186386b).intValue() : arrayList.size() - 1, arrayList.size() - 1))).f233260c, z);
    }
}
