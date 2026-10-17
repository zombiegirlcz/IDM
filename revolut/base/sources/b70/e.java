package b70;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f12864b;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12863a = context;
        this.f12864b = j.b(new androidx.lifecycle.b(this, 4));
    }

    public final Set a() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f12864b.getValue();
        if (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) == null) {
            enabledAccessibilityServiceList = f0.f322471a;
        }
        List<AccessibilityServiceInfo> list = enabledAccessibilityServiceList;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((AccessibilityServiceInfo) it8.next()).getResolveInfo().serviceInfo.packageName);
        }
        return d0.i1(arrayList);
    }
}
