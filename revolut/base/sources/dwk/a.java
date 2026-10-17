package dwk;

import aim.e;
import aw0.e4;
import aw0.m8;
import bfl.g;
import com.revolut.core.ui_kit.delegates.ea;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.retail.wealth.resources.R$string;
import ip0.iz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k4l.r0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120486a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f120487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f120488c;

    public /* synthetic */ a(b bVar, List list, boolean z) {
        this.f120488c = list;
        this.f120487b = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Float fValueOf;
        float fFloatValue;
        Float fValueOf2;
        float fFloatValue2;
        switch (this.f120486a) {
            case 0:
                rel.a orderBook = (rel.a) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(orderBook, "orderBook");
                e eVarB = u.b();
                if (this.f120487b) {
                    ArrayList arrayList = orderBook.f253644b;
                    xi0.b bVar = orderBook.f253643a;
                    ArrayList arrayList2 = orderBook.f253645c;
                    if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                        return b.a();
                    }
                    eVarB.add(b.b(true));
                    Iterator it8 = arrayList.iterator();
                    if (it8.hasNext()) {
                        float fMax = ((rel.b) it8.next()).f253646a;
                        while (it8.hasNext()) {
                            fMax = Math.max(fMax, ((rel.b) it8.next()).f253646a);
                        }
                        fValueOf = Float.valueOf(fMax);
                    } else {
                        fValueOf = null;
                    }
                    if (fValueOf != null) {
                        fFloatValue = fValueOf.floatValue();
                    } else {
                        Iterator it9 = arrayList2.iterator();
                        if (!it9.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        float fMin = ((rel.b) it9.next()).f253646a;
                        while (it9.hasNext()) {
                            fMin = Math.min(fMin, ((rel.b) it9.next()).f253646a);
                        }
                        fFloatValue = fMin;
                    }
                    Iterator it10 = arrayList2.iterator();
                    if (it10.hasNext()) {
                        float fMin2 = ((rel.b) it10.next()).f253646a;
                        while (it10.hasNext()) {
                            fMin2 = Math.min(fMin2, ((rel.b) it10.next()).f253646a);
                        }
                        fValueOf2 = Float.valueOf(fMin2);
                    } else {
                        fValueOf2 = null;
                    }
                    if (fValueOf2 != null) {
                        fFloatValue2 = fValueOf2.floatValue();
                    } else {
                        Iterator it11 = arrayList.iterator();
                        if (!it11.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        float fMax2 = ((rel.b) it11.next()).f253646a;
                        while (it11.hasNext()) {
                            fMax2 = Math.max(fMax2, ((rel.b) it11.next()).f253646a);
                        }
                        fFloatValue2 = fMax2;
                    }
                    float f = (fFloatValue2 + fFloatValue) / 2.0f;
                    List list = this.f120488c;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : list) {
                        InvestOrder investOrder = (InvestOrder) obj5;
                        if (investOrder.getF104635j() == r0.LIMIT && ((investOrder instanceof InvestOrder.InvestSecuritiesOrder) || (investOrder instanceof InvestMarginOrder))) {
                            arrayList3.add(obj5);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj6 : arrayList3) {
                        if (((InvestOrder) obj6).getF104634h() == g.BUY) {
                            arrayList4.add(obj6);
                        } else {
                            arrayList5.add(obj6);
                        }
                    }
                    ArrayList arrayList6 = orderBook.f253644b;
                    iz izVar = new iz(new m8(b.e(arrayList6, bVar, f, g.BUY, b.d(arrayList6, arrayList4)), b.e(arrayList2, bVar, f, g.SELL, b.d(arrayList2, arrayList5)), f), null, 28);
                    int i = R$attr.uikit_dp16;
                    izVar.f164759c = i;
                    izVar.d = i;
                    eVarB.add(izVar);
                    ArrayList arrayListC = b.c(orderBook, false);
                    if (arrayListC != null) {
                        eVarB.addAll(arrayListC);
                    }
                } else {
                    eVarB.add(b.b(false));
                    ArrayList arrayListC2 = b.c(orderBook, true);
                    if (arrayListC2 != null) {
                        eVarB.addAll(arrayListC2);
                    }
                    eVarB.add(new ea(new TextLocalisedClause(R$string.trading_asset_details_order_book_restricted_upgrade_to_view, null, null, 14)));
                }
                e eVarA = u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return eVarA;
            default:
                List filters = (List) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(filters, "filters");
                return (!this.f120487b || filters.isEmpty()) ? e4.GONE : !filters.equals(this.f120488c) ? e4.ACTIVE : e4.INACTIVE;
        }
    }

    public /* synthetic */ a(boolean z, List list) {
        this.f120487b = z;
        this.f120488c = list;
    }
}
