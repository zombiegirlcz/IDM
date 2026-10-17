package ie;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f160571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd.g f160572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f160573c;
    public TaskCompletionSource d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f160574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TaskCompletionSource f160575h;

    public u(pd.g gVar) {
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj2 = new Object();
        this.f160573c = obj2;
        this.d = new TaskCompletionSource();
        this.e = false;
        this.f = false;
        this.f160575h = new TaskCompletionSource();
        gVar.a();
        Context context = gVar.f235023a;
        this.f160572b = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f160571a = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException e) {
            }
            Boolean boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            if (boolValueOf2 == null) {
                this.f = false;
                boolValueOf = null;
            } else {
                this.f = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f160574g = boolValueOf;
        synchronized (obj2) {
            try {
                if (a()) {
                    this.d.trySetResult(null);
                    this.e = true;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final synchronized boolean a() {
        boolean zH;
        Boolean bool = this.f160574g;
        if (bool != null) {
            zH = bool.booleanValue();
        } else {
            try {
                zH = this.f160572b.h();
            } catch (IllegalStateException unused) {
                zH = false;
            }
        }
        j6.a.s("Crashlytics automatic data collection ", zH ? "ENABLED" : "DISABLED", " by ", this.f160574g == null ? "global Firebase setting" : this.f ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
        return zH;
    }
}
