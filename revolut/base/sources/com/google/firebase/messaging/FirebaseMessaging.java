package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {
    public static af.j k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f49450m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd.g f49451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f49452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ce.v f49453c;
    public final k d;
    public final ch.m e;
    public final ScheduledThreadPoolExecutor f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f49454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f49455h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f49448j = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static cf.b f49449l = new ce.h(2);

    public FirebaseMessaging(pd.g gVar, cf.b bVar, cf.b bVar2, df.e eVar, cf.b bVar3, ze.c cVar) {
        gVar.a();
        Context context = gVar.f235023a;
        final o oVar = new o(context);
        final ce.v vVar = new ce.v(gVar, oVar, bVar, bVar2, eVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        final int i = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        final int i2 = 0;
        this.i = false;
        f49449l = bVar3;
        this.f49451a = gVar;
        this.e = new ch.m(this, cVar);
        gVar.a();
        final Context context2 = gVar.f235023a;
        this.f49452b = context2;
        coi.a aVar = new coi.a();
        this.f49455h = oVar;
        this.f49453c = vVar;
        this.d = new k(executorServiceNewSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.f49454g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(aVar);
        } else {
            String str = "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.";
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f49510b;

            {
                this.f49510b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f49510b;
                        if (firebaseMessaging.e.b() && firebaseMessaging.g(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.f(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f49510b;
                        Context context3 = firebaseMessaging2.f49452b;
                        com.bumptech.glide.c.p(context3);
                        ce.v vVar2 = firebaseMessaging2.f49453c;
                        boolean zE = firebaseMessaging2.e();
                        if (PlatformVersion.isAtLeastQ()) {
                            SharedPreferences sharedPreferencesJ = com.bumptech.glide.d.j(context3);
                            if (!sharedPreferencesJ.contains("proxy_retention") || sharedPreferencesJ.getBoolean("proxy_retention", false) != zE) {
                                ((Rpc) vVar2.f23326c).setRetainProxiedNotifications(zE).addOnSuccessListener(new l.a(2), new r(context3, zE));
                            }
                        }
                        if (firebaseMessaging2.e()) {
                            ((Rpc) vVar2.f23326c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging2.f, new m(firebaseMessaging2, 1));
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i3 = a0.f49470j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                y yVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                o oVar2 = oVar;
                ce.v vVar2 = vVar;
                synchronized (y.class) {
                    try {
                        WeakReference weakReference = y.f49557b;
                        yVar = weakReference != null ? (y) weakReference.get() : null;
                        if (yVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            y yVar2 = new y();
                            synchronized (yVar2) {
                                yVar2.f49558a = u.a(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            y.f49557b = new WeakReference(yVar2);
                            yVar = yVar2;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return new a0(firebaseMessaging, oVar2, yVar, vVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new m(this, i2));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f49510b;

            {
                this.f49510b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f49510b;
                        if (firebaseMessaging.e.b() && firebaseMessaging.g(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.f(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f49510b;
                        Context context3 = firebaseMessaging2.f49452b;
                        com.bumptech.glide.c.p(context3);
                        ce.v vVar2 = firebaseMessaging2.f49453c;
                        boolean zE = firebaseMessaging2.e();
                        if (PlatformVersion.isAtLeastQ()) {
                            SharedPreferences sharedPreferencesJ = com.bumptech.glide.d.j(context3);
                            if (!sharedPreferencesJ.contains("proxy_retention") || sharedPreferencesJ.getBoolean("proxy_retention", false) != zE) {
                                ((Rpc) vVar2.f23326c).setRetainProxiedNotifications(zE).addOnSuccessListener(new l.a(2), new r(context3, zE));
                            }
                        }
                        if (firebaseMessaging2.e()) {
                            ((Rpc) vVar2.f23326c).getProxiedNotificationData().addOnSuccessListener(firebaseMessaging2.f, new m(firebaseMessaging2, 1));
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(long j2, Runnable runnable) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f49450m == null) {
                    f49450m = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f49450m.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public static synchronized af.j c(Context context) {
        try {
            if (k == null) {
                k = new af.j(context);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return k;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull pd.g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() {
        Task taskContinueWithTask;
        v vVarD = d();
        if (!g(vVarD)) {
            return vVarD.f49548a;
        }
        String strD = o.d(this.f49451a);
        k kVar = this.d;
        synchronized (kVar) {
            taskContinueWithTask = (Task) ((ArrayMap) kVar.f49508b).get(strD);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String str = "Making new request for: " + strD;
                }
                ce.v vVar = this.f49453c;
                taskContinueWithTask = vVar.h(vVar.l(o.d((pd.g) vVar.f23324a), "*", new Bundle())).onSuccessTask(this.f49454g, new ag.p(this, 2, strD, vVarD)).continueWithTask((Executor) kVar.f49507a, new ae.a(kVar, strD, 5));
                ((ArrayMap) kVar.f49508b).put(strD, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                String str2 = "Joining ongoing request for: " + strD;
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final v d() {
        v vVarB;
        af.j jVarC = c(this.f49452b);
        pd.g gVar = this.f49451a;
        gVar.a();
        String strD = "[DEFAULT]".equals(gVar.f235024b) ? "" : gVar.d();
        String strD2 = o.d(this.f49451a);
        synchronized (jVarC) {
            vVarB = v.b(jVarC.f3816a.getString(strD + "|T|" + strD2 + "|*", null));
        }
        return vVarB;
    }

    public final boolean e() {
        Context context = this.f49452b;
        com.bumptech.glide.c.p(context);
        if (PlatformVersion.isAtLeastQ()) {
            if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
                String str = "error retrieving notification delegate for package " + context.getPackageName();
                return false;
            }
            if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                }
                if (this.f49451a.b(td.b.class) != null) {
                    return true;
                }
                if (vc.s.m() && f49449l != null) {
                    return true;
                }
            }
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return false;
    }

    public final synchronized void f(long j2) {
        b(j2, new w(this, Math.min(Math.max(30L, 2 * j2), f49448j)));
        this.i = true;
    }

    public final boolean g(v vVar) {
        if (vVar != null) {
            return System.currentTimeMillis() > vVar.f49550c + v.d || !this.f49455h.c().equals(vVar.f49549b);
        }
        return true;
    }
}
