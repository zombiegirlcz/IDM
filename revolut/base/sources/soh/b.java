package soh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerEnumOption;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilter$Options;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f264832a = new b();

    private b() {
    }

    public static ScreenerFilter$Options a(zel.g metric, TextLocalisedClause title, ScreenerFilterInfo infoDialog, c viewType, List values, Map optionNames, Map map) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(infoDialog, "infoDialog");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(optionNames, "optionNames");
        List list = values;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new ScreenerEnumOption((Enum) it8.next()));
        }
        ArrayList arrayList2 = new ArrayList(optionNames.size());
        Iterator it9 = optionNames.entrySet().iterator();
        while (true) {
            linkedHashMap = null;
            if (!it9.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it9.next();
            arrayList2.add(new Pair(new ScreenerEnumOption((Enum) entry.getKey()), new TextLocalisedClause(((Number) entry.getValue()).intValue(), null, null, 14)));
        }
        Map mapT = r0.t(arrayList2);
        if (map != null) {
            linkedHashMap = new LinkedHashMap(q0.b(map.size()));
            for (Map.Entry entry2 : map.entrySet()) {
                linkedHashMap.put(new ScreenerEnumOption((Enum) entry2.getKey()), entry2.getValue());
            }
        }
        return new ScreenerFilter$Options(metric, title, infoDialog, viewType, arrayList, mapT, linkedHashMap);
    }
}
