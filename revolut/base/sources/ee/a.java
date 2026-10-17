package ee;

import af.f;
import android.os.Bundle;
import android.util.Log;
import ao.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import mp.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements he.b, ge.a, cf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f125042a;

    public /* synthetic */ a(b bVar) {
        this.f125042a = bVar;
    }

    @Override // cf.a
    public void b(cf.b bVar) {
        b bVar2 = this.f125042a;
        fe.c cVar = fe.c.f134428a;
        cVar.b("AnalyticsConnector now available.");
        td.b bVar3 = (td.b) bVar.get();
        yf.c cVar2 = new yf.c(bVar3, 8);
        h hVar = new h(10, false);
        td.c cVar3 = (td.c) bVar3;
        f fVarB = cVar3.b("clx", hVar);
        if (fVarB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            }
            fVarB = cVar3.b("crash", hVar);
            if (fVarB != null) {
            }
        }
        if (fVarB == null) {
            cVar.f("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        cVar.b("Registered Firebase Analytics listener.");
        r rVar = new r(11);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        jpf.a aVar = new jpf.a();
        aVar.f177268b = new Object();
        aVar.f177267a = cVar2;
        synchronized (bVar2) {
            try {
                Iterator it8 = ((ArrayList) bVar2.f125043a).iterator();
                while (it8.hasNext()) {
                    rVar.c((he.a) it8.next());
                }
                hVar.f7848c = rVar;
                hVar.f7847b = aVar;
                bVar2.f125045c = rVar;
                bVar2.f125044b = aVar;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // he.b
    public void c(he.a aVar) {
        b bVar = this.f125042a;
        synchronized (bVar) {
            try {
                if (((he.b) bVar.f125045c) instanceof he.c) {
                    ((ArrayList) bVar.f125043a).add(aVar);
                }
                ((he.b) bVar.f125045c).c(aVar);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // ge.a
    public void i(Bundle bundle) {
        ((ge.a) this.f125042a.f125044b).i(bundle);
    }
}
