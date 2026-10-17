package ez5;

import a09.a0;
import com.google.android.material.color.utilities.g;
import efm.r;
import hul.v;
import hy2.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hz5.a f130915a;

    public b(hz5.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f130915a = repository;
    }

    public static r a(b bVar, dz5.b orderKey, LinkedHashMap values, g gVar, dz5.a aVar, int i) {
        if ((i & 4) != 0) {
            gVar = null;
        }
        g gVar2 = gVar;
        if ((i & 8) != 0) {
            aVar = dz5.a.ADD_TO_BEGINNING;
        }
        dz5.a newItemsHandlingStrategy = aVar;
        Intrinsics.checkNotNullParameter(orderKey, "orderKey");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(newItemsHandlingStrategy, "newItemsHandlingStrategy");
        String key = orderKey.name();
        Intrinsics.checkNotNullParameter(key, "orderKeyString");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(newItemsHandlingStrategy, "newItemsHandlingStrategy");
        hz5.a aVar2 = bVar.f130915a;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        r map = w.w0(aVar2.f157034b).map(new l(new v(aVar2, key, 11), 13));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarFlatMapSingle = map.flatMapSingle(new ey7.a(new a5b.a((Object) values, (Object) gVar2, (Object) newItemsHandlingStrategy, (Object) bVar, key, 12), 2));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        return rVarFlatMapSingle;
    }

    public final pfm.r b(String key, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        ArrayList values = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            String str = (String) linkedHashMap2.get(it8.next());
            if (str != null) {
                values.add(str);
            }
        }
        hz5.a aVar = this.f130915a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        h hVar = new h(new a0(aVar, 16, key, values), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return w.g0(hVar);
    }

    public final pfm.r c(dz5.b orderKey, ArrayList values) {
        Intrinsics.checkNotNullParameter(orderKey, "orderKey");
        Intrinsics.checkNotNullParameter(values, "values");
        String key = orderKey.name();
        hz5.a aVar = this.f130915a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        h hVar = new h(new a0(aVar, 16, key, values), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return w.g0(hVar);
    }
}
