package td;

import af.f;
import android.os.Bundle;
import ao.h;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;
import ud.e;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f269903c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f269904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f269905b;

    public c(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f269904a = appMeasurementSdk;
        this.f269905b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (ud.a.c(str) && ud.a.b(bundle, str2) && ud.a.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f269904a.logEvent(str, str2, bundle);
        }
    }

    public final f b(String str, h hVar) {
        Preconditions.checkNotNull(hVar);
        if (ud.a.c(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f269905b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.f269904a;
                Object cVar = zEquals ? new ud.c(appMeasurementSdk, hVar) : "clx".equals(str) ? new e(appMeasurementSdk, hVar) : null;
                if (cVar != null) {
                    concurrentHashMap.put(str, cVar);
                    return new f(15);
                }
            }
        }
        return null;
    }
}
