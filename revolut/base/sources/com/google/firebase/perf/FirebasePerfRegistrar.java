package com.google.firebase.perf;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.ProcessLifecycleOwner;
import ce.c;
import ce.n;
import ce.t;
import com.bumptech.glide.k;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jh.d;
import lf.a;
import lf.b;
import pd.g;
import wb.i;
import wf.e;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-perf";
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";

    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(t tVar, c cVar) {
        AppStartTrace appStartTrace;
        g gVar = (g) cVar.a(g.class);
        pd.a aVar = (pd.a) cVar.c(pd.a.class).get();
        Executor executor = (Executor) cVar.d(tVar);
        a aVar2 = new a();
        gVar.a();
        Context context = gVar.f235023a;
        nf.a aVarE = nf.a.e();
        aVarE.getClass();
        nf.a.d.f245203b = d.i(context);
        aVarE.f214767c.c(context);
        mf.c cVarA = mf.c.a();
        synchronized (cVarA) {
            if (!cVarA.f204812p) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(cVarA);
                    cVarA.f204812p = true;
                }
            }
        }
        lf.c cVar2 = new lf.c();
        synchronized (cVarA.f204806g) {
            cVarA.f204806g.add(cVar2);
        }
        if (aVar != null) {
            if (AppStartTrace.f49563x != null) {
                appStartTrace = AppStartTrace.f49563x;
            } else {
                e eVar = e.f296850s;
                ah.a aVar3 = new ah.a(3);
                if (AppStartTrace.f49563x == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.f49563x == null) {
                                AppStartTrace.f49563x = new AppStartTrace(eVar, aVar3, nf.a.e(), new ThreadPoolExecutor(0, 1, 10 + AppStartTrace.f49562w, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } finally {
                        }
                    }
                }
                appStartTrace = AppStartTrace.f49563x;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.f49565a) {
                    ProcessLifecycleOwner.get().getLifecycle().addObserver(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        appStartTrace.u = appStartTrace.u || AppStartTrace.c((Application) applicationContext2);
                        appStartTrace.f49565a = true;
                        appStartTrace.e = (Application) applicationContext2;
                    }
                }
            }
            executor.execute(new k(appStartTrace, 15));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b providesFirebasePerformance(c cVar) {
        cVar.a(a.class);
        return new of.a(new com.google.firebase.messaging.t((g) cVar.a(g.class), (df.e) cVar.a(df.e.class), cVar.c(zf.g.class), cVar.c(i.class), 13)).a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<ce.b> getComponents() {
        t tVar = new t(vd.d.class, Executor.class);
        ce.a aVarB = ce.b.b(b.class);
        aVarB.f23279a = "fire-perf";
        aVarB.a(n.c(g.class));
        aVarB.a(new n(zf.g.class, 1, 1));
        aVarB.a(n.c(df.e.class));
        aVarB.a(new n(i.class, 1, 1));
        aVarB.a(n.c(a.class));
        aVarB.f = new a5.a(21);
        ce.b bVarB = aVarB.b();
        ce.a aVarB2 = ce.b.b(a.class);
        aVarB2.f23279a = "fire-perf-early";
        aVarB2.a(n.c(g.class));
        aVarB2.a(n.a(pd.a.class));
        aVarB2.a(new n(tVar, 1, 0));
        aVarB2.c(2);
        aVarB2.f = new af.b(tVar, 2);
        return Arrays.asList(bVarB, aVarB2.b(), mo3.a.d("fire-perf", "21.0.5"));
    }
}
