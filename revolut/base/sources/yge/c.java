package yge;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import oim.n;
import vkm.j2;
import yhm.o;
import zhm.d0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements n {
    public /* synthetic */ List u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ List f313641w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProductContext f313642x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f313643y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ProductContext productContext, e eVar, Continuation continuation) {
        super(4, continuation);
        this.f313642x = productContext;
        this.f313643y = eVar;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        c cVar = new c(this.f313642x, this.f313643y, (Continuation) obj5);
        cVar.u = (List) obj2;
        cVar.v = (Data) obj3;
        cVar.f313641w = (List) obj4;
        return cVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        List list = this.u;
        Data data = this.v;
        List list2 = this.f313641w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        List<ProductAccountDescriptor$Value> list3 = list;
        int i = 10;
        int iB = q0.b(w.t(list3, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (ProductAccountDescriptor$Value productAccountDescriptor$Value : list3) {
            linkedHashMap.put(productAccountDescriptor$Value.getF89728b().f89729a, productAccountDescriptor$Value.getF89727a());
        }
        List<vfe.a> list4 = list2;
        int iB2 = q0.b(w.t(list4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        for (vfe.a aVar2 : list4) {
            linkedHashMap2.put(aVar2.f288606a, aVar2.f288607b);
        }
        ProductContext productContext = this.f313642x;
        tge.a aVar3 = new tge.a(productContext.f89554b, productContext.f89555c);
        Set setA = v13.d.a(list2);
        e eVar = this.f313643y;
        try {
            Object content = data.getContent();
            if (content != null) {
                ArrayList<ProductAccount> arrayList2 = new ArrayList();
                arrayList = new ArrayList();
                for (Object obj3 : (List) content) {
                    ProductAccount productAccount = (ProductAccount) obj3;
                    ProductAccount.ValueItem.Main main = productAccount instanceof ProductAccount.ValueItem.Main ? (ProductAccount.ValueItem.Main) productAccount : null;
                    if (main != null && linkedHashMap.get(main.f89504c.f89729a) == productContext.f89553a) {
                        arrayList2.add(obj3);
                    } else {
                        arrayList.add(obj3);
                    }
                }
                j2 j2Var = eVar.e;
                while (true) {
                    Object value = j2Var.getValue();
                    LinkedHashMap linkedHashMapZ = r0.z(((b) value).f313640b);
                    Iterator it8 = linkedHashMapZ.entrySet().iterator();
                    while (it8.hasNext()) {
                        if (!setA.contains(((Map.Entry) it8.next()).getKey())) {
                            it8.remove();
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, i));
                    for (ProductAccount productAccountT : arrayList2) {
                        if (productAccountT instanceof ProductAccount.ValueItem.Main) {
                            productAccountT = ProductAccount.ValueItem.Main.T((ProductAccount.ValueItem.Main) productAccountT, null, null, null, null, 383);
                        }
                        arrayList3.add(e.a(eVar, productAccountT, aVar3, linkedHashMap2));
                    }
                    linkedHashMapZ.put(aVar3, arrayList3);
                    if (j2Var.h(value, new b(d0.d1(linkedHashMap.keySet()), linkedHashMapZ))) {
                        break;
                    }
                    i = 10;
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
