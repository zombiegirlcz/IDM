package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdj;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.measurement.internal.zzlx;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import pd.g;
import sd.c;
import sd.d;
import sd.e;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f49439c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzff f49440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f49441b;

    public FirebaseAnalytics(zzff zzffVar) {
        Preconditions.checkNotNull(zzffVar);
        this.f49440a = zzffVar;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f49439c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f49439c == null) {
                        f49439c = new FirebaseAnalytics(zzff.zzg(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return f49439c;
    }

    @Keep
    public static zzlx getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzff zzffVarZzg = zzff.zzg(context, null, null, null, bundle);
        if (zzffVarZzg == null) {
            return null;
        }
        return new e(zzffVarZzg);
    }

    public final Task a() {
        c cVar;
        try {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (this.f49441b == null) {
                        this.f49441b = new c(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    }
                    cVar = this.f49441b;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return Tasks.call(cVar, new d(this, 0));
        } catch (RuntimeException e) {
            this.f49440a.zzB(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e);
        }
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj2 = df.d.f113725m;
            g gVarC = g.c();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            return (String) Tasks.await(((df.d) gVarC.b(df.e.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        this.f49440a.zzH(zzdj.zza(activity), str, str2);
    }
}
