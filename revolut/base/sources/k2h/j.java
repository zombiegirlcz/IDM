package k2h;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import l3d.h0;
import zhm.d0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180588a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f180589b;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objG;
        List list;
        switch (this.f180588a) {
            case 0:
                Map map = this.f180589b;
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Set setA = ((ybl.a) entry.getValue()).a();
                    ArrayList arrayList = new ArrayList(w.t(setA, 10));
                    Iterator it8 = setA.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((TradingProductCode) it8.next()).getF105337a());
                    }
                    linkedHashMap.put(key, d0.i1(arrayList));
                }
                return linkedHashMap;
            default:
                Map map2 = this.f180589b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(map2.size()));
                for (Map.Entry entry2 : map2.entrySet()) {
                    Object key2 = entry2.getKey();
                    ogd.g gVar = (ogd.g) ((Data) entry2.getValue()).getContent();
                    if (gVar == null || (list = gVar.d) == null) {
                        objG = r0.g();
                    } else {
                        List list2 = list;
                        int iB = q0.b(w.t(list2, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        objG = new LinkedHashMap(iB);
                        Iterator it9 = list2.iterator();
                        if (it9.hasNext()) {
                            throw v0.a.e(it9);
                        }
                    }
                    linkedHashMap2.put(key2, objG);
                }
                return linkedHashMap2;
        }
    }

    public /* synthetic */ j(h0 h0Var, Map map) {
        this.f180589b = map;
    }
}
