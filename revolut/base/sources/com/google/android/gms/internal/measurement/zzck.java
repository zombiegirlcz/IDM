package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes16.dex */
public final class zzck {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Method f39898zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Method f39899zzb;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
            }
            declaredMethod = null;
        }
        f39898zza = declaredMethod;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
            }
        }
        f39899zzb = declaredMethod2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(android.content.Context r3, android.app.job.JobInfo r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r5 = "jobscheduler"
            java.lang.Object r5 = r3.getSystemService(r5)
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            java.lang.Object r5 = com.google.common.base.Preconditions.checkNotNull(r5)
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            java.lang.reflect.Method r6 = com.google.android.gms.internal.measurement.zzck.f39898zza
            if (r6 == 0) goto L6b
            java.lang.String r6 = "android.permission.UPDATE_DEVICE_STATS"
            int r3 = r3.checkSelfPermission(r6)
            if (r3 == 0) goto L1b
            goto L6b
        L1b:
            java.lang.reflect.Method r3 = com.google.android.gms.internal.measurement.zzck.f39899zzb
            r6 = 0
            if (r3 == 0) goto L34
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r1 = 0
            java.lang.Object r3 = r3.invoke(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L32
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L32
            if (r3 == 0) goto L34
            int r3 = r3.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L30 java.lang.IllegalAccessException -> L32
            goto L43
        L30:
            r3 = move-exception
            goto L36
        L32:
            r3 = move-exception
            goto L36
        L34:
            r3 = r6
            goto L43
        L36:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L34
            java.lang.String r0 = "myUserId invocation illegal"
            goto L34
        L43:
            java.lang.String r0 = "UploadAlarm"
            java.lang.String r1 = "com.google.android.gms"
            java.lang.reflect.Method r2 = com.google.android.gms.internal.measurement.zzck.f39898zza
            if (r2 == 0) goto L66
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L62
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r1, r3, r0}     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L62
            java.lang.Object r3 = r2.invoke(r5, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L62
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L62
            if (r3 == 0) goto L6a
            int r6 = r3.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L60 java.lang.IllegalAccessException -> L62
            goto L6a
        L60:
            r3 = move-exception
            goto L63
        L62:
            r3 = move-exception
        L63:
            java.lang.String r6 = "error calling scheduleAsPackage"
        L66:
            int r6 = r5.schedule(r4)
        L6a:
            return r6
        L6b:
            int r3 = r5.schedule(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzck.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
