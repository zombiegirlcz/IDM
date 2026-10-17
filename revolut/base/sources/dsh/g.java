package dsh;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f117321a = new LinkedHashMap();

    public final void a(Class widgetContextClass, Map providers) {
        Intrinsics.checkNotNullParameter(widgetContextClass, "widgetContextClass");
        Intrinsics.checkNotNullParameter(providers, "providers");
        LinkedHashMap linkedHashMap = this.f117321a;
        Object linkedHashMap2 = linkedHashMap.get(widgetContextClass);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(widgetContextClass, linkedHashMap2);
        }
        ((Map) linkedHashMap2).putAll(providers);
    }
}
