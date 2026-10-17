package rnd;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends gim.i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f255594w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, Continuation continuation) {
        super(3, continuation);
        this.f255594w = c0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        b0 b0Var = new b0(this.f255594w, (Continuation) obj4);
        b0Var.u = (Data) obj2;
        b0Var.v = (Set) obj3;
        return b0Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        boolean zContains;
        List list;
        Data data = this.u;
        Set set = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        try {
            Object content = data.getContent();
            if (content != null) {
                List list2 = (List) content;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof AnalyticsAccount.Junior.CurrencyPocket) {
                        arrayList2.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : arrayList2) {
                    String str = ((AnalyticsAccount.Junior.CurrencyPocket) obj4).f99186a;
                    Object arrayList3 = linkedHashMap.get(str);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(str, arrayList3);
                    }
                    ((List) arrayList3).add(obj4);
                }
                arrayList = new ArrayList();
                for (Object obj5 : list2) {
                    AnalyticsAccount analyticsAccount = (AnalyticsAccount) obj5;
                    if (analyticsAccount instanceof AnalyticsAccount.Junior.CurrencyPocket) {
                        zContains = set.contains(((AnalyticsAccount.Junior.CurrencyPocket) analyticsAccount).f99188c);
                    } else {
                        if (!(analyticsAccount instanceof AnalyticsAccount.Junior.All) || (list = (List) linkedHashMap.get(((AnalyticsAccount.Junior.All) analyticsAccount).f99184a)) == null) {
                            zContains = false;
                            break;
                        }
                        List list3 = list;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it8 = list3.iterator();
                            while (it8.hasNext()) {
                                if (!set.contains(((AnalyticsAccount.Junior.CurrencyPocket) it8.next()).f99188c)) {
                                    zContains = false;
                                    break;
                                }
                            }
                        }
                        zContains = true;
                    }
                    if (!zContains) {
                        arrayList.add(obj5);
                    }
                }
            } else {
                arrayList = null;
            }
            return new Data(arrayList, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }
}
