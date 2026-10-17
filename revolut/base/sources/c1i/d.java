package c1i;

import com.revolut.feature.exchange.models.ExchangeOrder;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z0i.h;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f20521b;

    public /* synthetic */ d(g gVar, int i) {
        this.f20520a = i;
        this.f20521b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f20520a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ne0.d dVar = this.f20521b.f20525c;
                dVar.getClass();
                return (List) dVar.get("ORDERS_CONTENT_KEY");
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                g gVar = this.f20521b;
                xe0.e eVar = gVar.f20524b;
                Type exchangeOrderListType = gVar.d;
                Intrinsics.checkNotNullExpressionValue(exchangeOrderListType, "exchangeOrderListType");
                List list = (List) eVar.T2("ORDERS_CONTENT_KEY", exchangeOrderListType);
                if (list == null) {
                    return null;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList.add(a1i.b.d((h) it10.next()));
                }
                return arrayList;
            case 2:
                ExchangeOrder.Active createdOrder = (ExchangeOrder.Active) obj2;
                Intrinsics.checkNotNullParameter(createdOrder, "createdOrder");
                return this.f20521b.e.g(Unit.f186387a, false).D(createdOrder);
            default:
                ExchangeOrder.Active createdOrder2 = (ExchangeOrder.Active) obj2;
                Intrinsics.checkNotNullParameter(createdOrder2, "createdOrder");
                return this.f20521b.e.g(Unit.f186387a, false).D(createdOrder2);
        }
    }
}
