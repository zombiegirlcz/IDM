package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.UserHandle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class GmsClientSupervisor {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static HandlerThread f38067zza = null;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Object f38068zzb = new Object();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static int f38069zzc = 9;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static zzq f38070zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static Executor f38071zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static boolean f38072zzf;

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return 4225;
    }

    @NonNull
    @KeepForSdk
    public static GmsClientSupervisor getInstance(@NonNull Context context) {
        synchronized (f38068zzb) {
            try {
                if (f38070zzd == null) {
                    if (!f38072zzf) {
                        f38072zzf = GmsClientFlags.isBindServiceOptimizationEnabled(context.getPackageName());
                    }
                    f38070zzd = new zzq(context.getApplicationContext(), f38072zzf ? getOrStartHandlerThread().getLooper() : context.getMainLooper(), f38071zze);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return f38070zzd;
    }

    @NonNull
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized (f38068zzb) {
            try {
                HandlerThread handlerThread = f38067zza;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return f38067zza;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f38069zzc);
                f38067zza = handlerThread2;
                handlerThread2.start();
                return f38067zza;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @KeepForSdk
    public static void setDefaultBindExecutor(Executor executor) {
        synchronized (f38068zzb) {
            try {
                zzq zzqVar = f38070zzd;
                if (zzqVar != null) {
                    zzqVar.zze(executor);
                }
                f38071zze = executor;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @KeepForSdk
    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int i) {
        synchronized (f38068zzb) {
            try {
                if (f38067zza != null) {
                    return false;
                }
                f38069zzc = i;
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized (f38068zzb) {
            try {
                zzq zzqVar = f38070zzd;
                if (zzqVar != null && !f38072zzf) {
                    zzqVar.zzd(getOrStartHandlerThread().getLooper());
                }
                f38072zzf = true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @KeepForSdk
    public boolean bindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        return zza(new zzn(componentName, 4225, (UserHandle) null), serviceConnection, str, null).isSuccess();
    }

    @KeepForSdk
    public void unbindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str) {
        zzc(new zzn(componentName, 4225, (UserHandle) null), serviceConnection, str);
    }

    public abstract ConnectionResult zza(zzn zznVar, ServiceConnection serviceConnection, String str, Executor executor);

    public final void zzb(@NonNull String str, @NonNull String str2, int i, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z, UserHandle userHandle) {
        zzc(new zzn(str, str2, 4225, z, userHandle), serviceConnection, str3);
    }

    public abstract void zzc(zzn zznVar, ServiceConnection serviceConnection, String str);

    @KeepForSdk
    public void unbindService(@NonNull String str, @NonNull ServiceConnection serviceConnection, @NonNull String str2) {
        zzc(new zzn(str, 4225, false), serviceConnection, str2);
    }

    @KeepForSdk
    public boolean bindService(@NonNull ComponentName componentName, @NonNull ServiceConnection serviceConnection, @NonNull String str, Executor executor) {
        return zza(new zzn(componentName, 4225, (UserHandle) null), serviceConnection, str, executor).isSuccess();
    }

    @NonNull
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread(int i) {
        synchronized (f38068zzb) {
            try {
                HandlerThread handlerThread = f38067zza;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return f38067zza;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", i);
                f38067zza = handlerThread2;
                handlerThread2.start();
                return f38067zza;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @KeepForSdk
    public boolean bindService(@NonNull String str, @NonNull ServiceConnection serviceConnection, @NonNull String str2) {
        return zza(new zzn(str, 4225, false), serviceConnection, str2, null).isSuccess();
    }
}
