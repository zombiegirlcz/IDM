package uh0;

import android.content.Context;
import ecm.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import r8.o;
import vc.s;
import wc.n;

/* JADX INFO: loaded from: classes19.dex */
public final class c {
    public static ryc.a a(Context context) {
        q qVar;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (s.class) {
            try {
                if (s.f287601a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    s.f287601a = new q(new o(context));
                }
                qVar = s.f287601a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        vc.b splitInstallManager = (vc.b) ((n) qVar.f124861b).zza();
        Intrinsics.checkNotNullExpressionValue(splitInstallManager, "create(...)");
        Intrinsics.checkNotNullParameter(splitInstallManager, "splitInstallManager");
        ryc.a aVar = new ryc.a();
        aVar.f258289a = splitInstallManager;
        aVar.f258290b = new LinkedHashMap();
        return aVar;
    }
}
