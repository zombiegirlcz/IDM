package androidx.glance.appwidget;

import android.content.ComponentName;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import v0.a;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¨\u0006\u0005"}, d2 = {"reverseMapping", "", "", "", "Landroid/content/ComponentName;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class GlanceAppWidgetManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, List<ComponentName>> reverseMapping(Map<ComponentName, String> map) {
        Set<Map.Entry<ComponentName, String>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            String str = (String) entry.getValue();
            Object objO = linkedHashMap.get(str);
            if (objO == null) {
                objO = a.o(linkedHashMap, str);
            }
            ((List) objO).add((ComponentName) entry.getKey());
        }
        return linkedHashMap;
    }
}
