package m78;

import com.revolut.data.model.Data;
import efm.r;
import efm.w;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.hc;
import tof.va;
import zhm.d0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f203335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f203336c;

    public /* synthetic */ b(d dVar, String str, int i) {
        this.f203334a = i;
        this.f203335b = dVar;
        this.f203336c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Set setB;
        switch (this.f203334a) {
            case 0:
                va transactionsFilter = (va) obj2;
                Intrinsics.checkNotNullParameter(transactionsFilter, "transactionsFilter");
                d dVar = this.f203335b;
                dVar.getClass();
                String key = d0.k0(d0.O0(transactionsFilter.f273121a), "-", null, null, 0, null, 62);
                r rVarDoOnNext = com.revolut.domain.interactors.transactions.a.d(dVar.f203338b, transactionsFilter, u.c(new hc(this.f203336c, null)), 4, null, null, 24).doOnNext(new m30.b(29, new b(dVar, key, 1)));
                a aVar = dVar.d;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                r rVarStartWith = rVarDoOnNext.startWith((w) r.just(new Data((List) aVar.f203333a.get(key), null, true, 2, null)));
                Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                return rVarStartWith;
            case 1:
                List transactions = (List) ((Data) obj2).getContent();
                if (transactions != null) {
                    a aVar2 = this.f203335b.d;
                    aVar2.getClass();
                    String key2 = this.f203336c;
                    Intrinsics.checkNotNullParameter(key2, "key");
                    Intrinsics.checkNotNullParameter(transactions, "transactions");
                    aVar2.f203333a.put(key2, transactions);
                }
                return Unit.f186387a;
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                fo3.c cVar = (fo3.c) pair.f186385a;
                List list = (List) pair.f186386b;
                d dVar2 = this.f203335b;
                Set setA = dVar2.a(list, cVar);
                nce.b bVar = new nce.b(dVar2.f203339c.b(new h9e.c(list, cVar)), cVar.d.f306286a);
                String str = this.f203336c;
                if (str != null && (setB = y0.b(str)) != null) {
                    setA = setB;
                }
                return new Pair(new va(setA), bVar);
        }
    }
}
