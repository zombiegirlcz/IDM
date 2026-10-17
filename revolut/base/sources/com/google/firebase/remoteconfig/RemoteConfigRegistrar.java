package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import ce.c;
import ce.n;
import ce.t;
import com.google.firebase.components.ComponentRegistrar;
import df.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import qd.b;
import rd.a;
import zf.g;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static g lambda$getComponents$0(t tVar, c cVar) {
        b bVar;
        Context context = (Context) cVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) cVar.d(tVar);
        pd.g gVar = (pd.g) cVar.a(pd.g.class);
        e eVar = (e) cVar.a(e.class);
        a aVar = (a) cVar.a(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f253304a.containsKey("frc")) {
                    aVar.f253304a.put("frc", new b(aVar.f253305b));
                }
                bVar = (b) aVar.f253304a.get("frc");
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return new g(context, scheduledExecutorService, gVar, eVar, bVar, cVar.c(td.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ce.b> getComponents() {
        t tVar = new t(vd.b.class, ScheduledExecutorService.class);
        ce.a aVar = new ce.a(g.class, new Class[]{cg.a.class});
        aVar.f23279a = "fire-rc";
        aVar.a(n.c(Context.class));
        aVar.a(new n(tVar, 1, 0));
        aVar.a(n.c(pd.g.class));
        aVar.a(n.c(e.class));
        aVar.a(n.c(a.class));
        aVar.a(n.a(td.b.class));
        aVar.f = new af.b(tVar, 3);
        aVar.c(2);
        return Arrays.asList(aVar.b(), mo3.a.d("fire-rc", "22.1.2"));
    }
}
