package fsl;

import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import com.revolut.trading.orders.ui.delegates.invest.widget.InvestOrdersWidgetContract$InvestOrdersContent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import yhm.m;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InvestOrdersParams f137740b;

    public /* synthetic */ v(InvestOrdersParams investOrdersParams, int i) {
        this.f137739a = i;
        this.f137740b = investOrdersParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Object objA;
        int i = this.f137739a;
        boolean z = true;
        InvestOrdersParams investOrdersParams = this.f137740b;
        switch (i) {
            case 0:
                List investOrders = (List) obj2;
                Intrinsics.checkNotNullParameter(investOrders, "investOrders");
                return new InvestOrdersWidgetContract$InvestOrdersContent(investOrders, investOrdersParams);
            case 1:
                InvestOrder order = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(order, "order");
                if (investOrdersParams.getF106807b() != null && investOrdersParams.getF106807b() != order.getF104632c()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                InvestOrder order2 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(order2, "order");
                if (!investOrdersParams.b().isEmpty() && !investOrdersParams.b().contains(order2.getF104635j())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                InvestOrder order3 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(order3, "order");
                if (investOrdersParams.getD() != null && !Intrinsics.f(com.revolut.retail.trading.core.domain.orders.a.e(order3), investOrdersParams.getD())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                InvestOrder order4 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(order4, "order");
                if (investOrdersParams.getE() != null && !Intrinsics.f(order4.getJ(), investOrdersParams.getE())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                InvestOrder order5 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(order5, "order");
                if (investOrdersParams.getD() != null && !Intrinsics.f(investOrdersParams.getD(), com.revolut.retail.trading.core.domain.orders.a.e(order5))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                InvestOrder order6 = (InvestOrder) obj2;
                Intrinsics.checkNotNullParameter(order6, "order");
                if (investOrdersParams.getE() != null && !Intrinsics.f(order6.getJ(), investOrdersParams.getE())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                List<orl.o> list = (List) obj2;
                Intrinsics.h(list);
                ArrayList arrayList = new ArrayList();
                for (orl.o oVar : list) {
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        objA = mrl.d.f(oVar);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    Throwable thA = yhm.m.a(objA);
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    InvestOrder investOrder = (InvestOrder) objA;
                    if (investOrder != null) {
                        arrayList.add(investOrder);
                    }
                    break;
                }
                return y.J(y.n(y.n(d0.Q(arrayList), new v(investOrdersParams, 5)), new v(investOrdersParams, 6)));
        }
    }

    public /* synthetic */ v(prl.f fVar, InvestOrdersParams investOrdersParams) {
        this.f137739a = 7;
        this.f137740b = investOrdersParams;
    }
}
