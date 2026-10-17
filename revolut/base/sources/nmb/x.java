package nmb;

import c2d.v0;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u = 1;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a f217260w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f217260w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(continuation, this.f217260w);
                xVar.v = obj2;
                return xVar;
            default:
                x xVar2 = new x(this.f217260w, continuation);
                xVar2.v = obj2;
                return xVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((x) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a aVar = this.f217260w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar = (yhm.r) pair.f186385a;
                Object obj3 = pair.f186386b;
                Object obj4 = rVar.f314201a;
                Object obj5 = rVar.f314202b;
                wi0.b bVar = (wi0.b) obj3;
                hha.d dVar = (hha.d) rVar.f314203c;
                xi0.b baseCurrency = (xi0.b) obj5;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : (List) obj4) {
                    SavingsProductData savingsProductData = (SavingsProductData) obj6;
                    SavingsProduct savingsProduct = savingsProductData.f86683a;
                    ProductGroup productGroup = savingsProductData.f86684b;
                    if (Intrinsics.f(savingsProduct.i, dVar.f152287a) && productGroup.f86521a == aVar.f83324t.f83318a) {
                        arrayList.add(obj6);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj7 : arrayList) {
                    xi0.b bVar2 = ((SavingsProductData) obj7).f86683a.f86618b;
                    Object arrayList2 = linkedHashMap.get(bVar2);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(bVar2, arrayList2);
                    }
                    ((List) arrayList2).add(obj7);
                }
                a aVar3 = k.Companion;
                Collection collectionValues = linkedHashMap.values();
                ArrayList arrayList3 = new ArrayList();
                Iterator it8 = collectionValues.iterator();
                while (true) {
                    ncd.a aVar4 = null;
                    Object next = null;
                    SavingsProductData savingsProductData2 = null;
                    if (!it8.hasNext()) {
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                        List listP0 = d0.P0(arrayList3, new v0(2, baseCurrency));
                        if (!listP0.isEmpty()) {
                            SavingsProductData savingsProductData3 = ((c) ((j2) aVar.f83325w.f22677a).getValue()).f217236b;
                            if (savingsProductData3 == null) {
                                savingsProductData3 = ((ncd.a) d0.b0(listP0)).f214169a;
                            }
                            return new Pair(savingsProductData3, new b(listP0, listP0, baseCurrency, bVar));
                        }
                        IllegalStateException illegalStateException = new IllegalStateException("Products must not be empty");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        throw illegalStateException;
                    }
                    List list = (List) it8.next();
                    SavingsProductData savingsProductDataC = opg.a.c(list);
                    if (savingsProductDataC != null) {
                        Intrinsics.checkNotNullParameter(savingsProductDataC, "<this>");
                        if (ocd.c.i(savingsProductDataC)) {
                            Intrinsics.checkNotNullParameter(list, "<this>");
                            Intrinsics.checkNotNullParameter(list, "<this>");
                            Iterator it9 = list.iterator();
                            if (it9.hasNext()) {
                                next = it9.next();
                                if (it9.hasNext()) {
                                    SavingsProductData savingsProductData4 = (SavingsProductData) next;
                                    double dB = ocd.c.i(savingsProductData4) ? Double.MIN_VALUE : ocd.c.b(savingsProductData4);
                                    do {
                                        Object next2 = it9.next();
                                        SavingsProductData savingsProductData5 = (SavingsProductData) next2;
                                        double dB2 = ocd.c.i(savingsProductData5) ? Double.MIN_VALUE : ocd.c.b(savingsProductData5);
                                        if (Double.compare(dB, dB2) < 0) {
                                            next = next2;
                                            dB = dB2;
                                        }
                                    } while (it9.hasNext());
                                }
                            }
                            savingsProductData2 = (SavingsProductData) next;
                        }
                        aVar4 = new ncd.a(savingsProductDataC, savingsProductData2);
                    }
                    if (aVar4 != null) {
                        arrayList3.add(aVar4);
                    }
                }
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f83325w, new nci.q(data, 21));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Continuation continuation, com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a aVar) {
        super(2, continuation);
        this.f217260w = aVar;
    }
}
