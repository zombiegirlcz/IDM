package z66;

import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.defi.trade.impl.ui.trade.a f319696b;

    public /* synthetic */ l(com.revolut.feature.defi.trade.impl.ui.trade.a aVar, int i) {
        this.f319695a = i;
        this.f319696b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        switch (this.f319695a) {
            case 0:
                b it8 = (b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f319696b.getClass();
                if (it8.f319688h.isEmpty()) {
                    list = f0.f322471a;
                } else {
                    List list2 = it8.f319688h;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(((DefiCurrency) it9.next()).getCurrency());
                    }
                    list = arrayList;
                }
                List listN = c6d.b.N(list);
                xi0.b bVar = it8.d;
                if (listN == null || bVar == null) {
                    return null;
                }
                return new Pair(listN, bVar);
            default:
                dw5.b outputData = (dw5.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                com.revolut.feature.defi.trade.impl.ui.trade.a aVar = this.f319696b;
                aVar.H2(aVar.f71892x, new z2.a(outputData, 12));
                return Unit.f186387a;
        }
    }
}
