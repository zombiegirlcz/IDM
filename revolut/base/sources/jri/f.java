package jri;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import iri.h;
import iri.i;
import iri.j;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f178025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f178026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f178027c;

    public f(h flowComponentsFactory, lm.c cVar) {
        Intrinsics.checkNotNullParameter(flowComponentsFactory, "flowComponentsFactory");
        this.f178025a = flowComponentsFactory;
        this.f178026b = new LinkedHashMap();
        Context context = (Context) cVar.invoke();
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            boolean zF = Intrinsics.f(Looper.getMainLooper(), Looper.myLooper());
            d dVar = d.f178020a;
            if (zF) {
                application.unregisterActivityLifecycleCallbacks(dVar);
                application.registerActivityLifecycleCallbacks(dVar);
            } else {
                new Handler(Looper.getMainLooper()).post(new androidx.view.d(application, 15));
            }
            this.f178027c = dVar;
        }
    }

    public final synchronized void a() {
        j jVarE;
        ifm.b bVarF;
        try {
            LinkedHashMap linkedHashMap = this.f178026b;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((e) entry.getValue()).d <= 1 && ((e) entry.getValue()).f178023b) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                hri.a aVar = ((e) entry2.getValue()).f178022a;
                if (aVar != null && (bVarF = aVar.f()) != null) {
                    bVarF.dispose();
                }
                if (aVar != null && (jVarE = aVar.e()) != null) {
                    i state = i.DISPOSED;
                    Intrinsics.checkNotNullParameter(state, "state");
                    jVarE.f168059a = state;
                }
                this.f178026b.remove(entry2.getKey());
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final synchronized hri.a b(Parcelable parcelable, String flowName) {
        e eVarA;
        try {
            Intrinsics.checkNotNullParameter(flowName, "flowName");
            d dVar = this.f178027c;
            if (dVar != null) {
                dVar.a(flowName);
            }
            e eVar = (e) this.f178026b.get(flowName);
            if (eVar == null) {
                eVarA = new e(this.f178025a.u1(parcelable, flowName), false, false, 1, false);
            } else {
                eVarA = e.a(eVar, false, false, eVar.f178024c ? eVar.d : eVar.d + 1, 19);
            }
            this.f178026b.put(flowName, eVarA);
        } catch (Throwable th10) {
            throw th10;
        }
        return eVarA.f178022a;
    }
}
