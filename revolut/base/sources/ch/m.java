package ch;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.tracing.Trace;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class m implements y8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f24043c;
    public final Object d;

    public m() {
        this.f24042b = new Object();
        this.f24043c = new ArrayDeque();
        this.d = new AtomicReference();
    }

    public synchronized void a() {
        try {
            if (this.f24041a) {
                return;
            }
            Boolean boolC = c();
            this.f24043c = boolC;
            if (boolC == null) {
                a5.a aVar = new a5.a(6);
                ce.o oVar = (ce.o) ((ze.c) this.f24042b);
                oVar.a(oVar.f23313c, aVar);
            }
            this.f24041a = true;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public synchronized boolean b() {
        Boolean bool;
        try {
            a();
            bool = (Boolean) this.f24043c;
        } catch (Throwable th10) {
            throw th10;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).f49451a.h();
    }

    public Boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        pd.g gVar = ((FirebaseMessaging) this.d).f49451a;
        gVar.a();
        Context context = gVar.f235023a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public boolean d(String str, String str2) {
        synchronized (this) {
            try {
                if (!((ke.e) ((AtomicMarkableReference) this.f24042b).getReference()).b(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f24042b;
                atomicMarkableReference.set((ke.e) atomicMarkableReference.getReference(), true);
                androidx.view.d dVar = new androidx.view.d(this, 17);
                AtomicReference atomicReference = (AtomicReference) this.d;
                while (!atomicReference.compareAndSet(null, dVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((je.d) ((oe.c) this.f24043c).f224499c).f173168b.b(dVar);
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public void e(Executor executor, Runnable runnable) {
        synchronized (this.f24042b) {
            try {
                if (this.f24041a) {
                    ((ArrayDeque) this.f24043c).add(new x(executor, runnable));
                } else {
                    this.f24041a = true;
                    g(executor, runnable);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public void f() {
        synchronized (this.f24042b) {
            try {
                if (((ArrayDeque) this.f24043c).isEmpty()) {
                    this.f24041a = false;
                } else {
                    x xVar = (x) ((ArrayDeque) this.f24043c).remove();
                    g(xVar.f24095a, xVar.f24096b);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public void g(Executor executor, Runnable runnable) {
        try {
            executor.execute(new p(this, runnable, 1));
        } catch (RejectedExecutionException unused) {
            f();
        }
    }

    @Override // y8.g
    public Object get() {
        if (this.f24041a) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.f24041a = true;
        try {
            return ue0.e.g((com.bumptech.glide.b) this.f24042b, (List) this.f24043c, (s8.a) this.d);
        } finally {
            this.f24041a = false;
            Trace.endSection();
        }
    }

    public m(com.bumptech.glide.b bVar, List list, s8.a aVar) {
        this.f24042b = bVar;
        this.f24043c = list;
        this.d = aVar;
    }

    public m(e8.r rVar, r8.p pVar) {
        this.d = new fcm.a(this, 1);
        this.f24043c = rVar;
        this.f24042b = pVar;
    }

    public m(oe.c cVar, boolean z) {
        this.f24043c = cVar;
        this.d = new AtomicReference(null);
        this.f24041a = z;
        this.f24042b = new AtomicMarkableReference(new ke.e(z ? 8192 : 1024), false);
    }

    public m(FirebaseMessaging firebaseMessaging, ze.c cVar) {
        this.d = firebaseMessaging;
        this.f24042b = cVar;
    }
}
