package iv0;

import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f168699a = new LinkedHashMap();

    public final int a(Class key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = this.f168699a;
        Object objValueOf = linkedHashMap.get(key);
        if (objValueOf == null) {
            objValueOf = Integer.valueOf(View.generateViewId());
            linkedHashMap.put(key, objValueOf);
        }
        return ((Number) objValueOf).intValue();
    }
}
