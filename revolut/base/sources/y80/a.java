package y80;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f311612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w70.a f311613b;

    public a(Context context, w70.a androidVersion) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.f311612a = context;
        this.f311613b = androidVersion;
    }

    public final boolean a() {
        return this.f311613b.a(31) ? c("android.permission.BLUETOOTH_CONNECT") : c("android.permission.BLUETOOTH");
    }

    public final boolean b() {
        return this.f311613b.a(31) ? c("android.permission.BLUETOOTH_CONNECT") && c("android.permission.BLUETOOTH_SCAN") : c("android.permission.BLUETOOTH");
    }

    public final boolean c(String str) {
        return ContextCompat.checkSelfPermission(this.f311612a, str) == 0;
    }

    public final d d(Activity activity, List permissionNames) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissionNames, "permissionNames");
        List list = permissionNames;
        int iB = q0.b(w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : list) {
            linkedHashMap.put(obj2, Integer.valueOf(ContextCompat.checkSelfPermission(this.f311612a, (String) obj2)));
        }
        if (!linkedHashMap.isEmpty()) {
            Iterator it8 = linkedHashMap.entrySet().iterator();
            while (it8.hasNext()) {
                if (((Number) ((Map.Entry) it8.next()).getValue()).intValue() != 0) {
                    Set setKeySet = linkedHashMap.keySet();
                    if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                        Iterator it9 = setKeySet.iterator();
                        while (it9.hasNext()) {
                            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, (String) it9.next())) {
                                return d.DENIED_PERMANENTLY;
                            }
                        }
                    }
                    return d.DENIED;
                }
            }
        }
        return d.GRANTED;
    }

    public final ufm.c e(String str) {
        ufm.c cVar = new ufm.c(new ag.d(this, str, 6), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
