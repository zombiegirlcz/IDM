package ie;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f160555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f160556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ao.h f160557c;
    public final long d;
    public cpi.g e;
    public cpi.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f160558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f160559h;
    public final oe.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ee.a f160560j;
    public final ee.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f160561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fe.a f160562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mp.r f160563n;
    public final je.d o;

    public r(pd.g gVar, z zVar, fe.a aVar, u uVar, ee.a aVar2, ee.a aVar3, oe.c cVar, k kVar, mp.r rVar, je.d dVar) {
        this.f160556b = uVar;
        gVar.a();
        this.f160555a = gVar.f235023a;
        this.f160559h = zVar;
        this.f160562m = aVar;
        this.f160560j = aVar2;
        this.k = aVar3;
        this.i = cVar;
        this.f160561l = kVar;
        this.f160563n = rVar;
        this.o = dVar;
        this.d = System.currentTimeMillis();
        this.f160557c = new ao.h(15);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void a(fc.g gVar) {
        je.d.a();
        je.d.a();
        this.e.l();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        try {
            this.f160560j.c(new o(this));
            this.f160558g.g();
            if (!gVar.b().f245005b.f123478a) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            }
            if (!this.f160558g.d(gVar)) {
            }
            this.f160558g.h(((TaskCompletionSource) ((AtomicReference) gVar.i).get()).getTask());
            c();
        } catch (Exception e) {
            c();
        } catch (Throwable th10) {
            c();
            throw th10;
        }
    }

    public final void b(fc.g gVar) {
        Future<?> futureSubmit = this.o.f173167a.a().submit(new d0.c(this, gVar, 20));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
        } catch (TimeoutException e4) {
        }
    }

    public final void c() {
        je.d.a();
        try {
            cpi.g gVar = this.e;
            oe.c cVar = (oe.c) gVar.f107955c;
            String str = (String) gVar.f107954b;
            cVar.getClass();
            if (new File((File) cVar.f224499c, str).delete()) {
            }
        } catch (Exception e) {
        }
    }
}
