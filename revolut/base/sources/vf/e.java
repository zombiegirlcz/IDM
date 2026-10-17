package vf;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runtime f288379a = Runtime.getRuntime();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityManager f288380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityManager.MemoryInfo f288381c;

    static {
        qf.a.d();
    }

    public e(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f288380b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f288381c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
