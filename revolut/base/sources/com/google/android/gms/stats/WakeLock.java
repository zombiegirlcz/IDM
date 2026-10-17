package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@KeepForSdk
public class WakeLock {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final long f48458zzb = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static volatile ScheduledExecutorService f48459zzc = null;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Object f48460zzd = new Object();

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static volatile zzd f48461zze = new zzb();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    com.google.android.gms.internal.stats.zzb f48462zza;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final Object f48463zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final PowerManager.WakeLock f48464zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private int f48465zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private Future<?> f48466zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private long f48467zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final Set<zze> f48468zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private boolean f48469zzl;
    private int zzm;
    private Clock zzn;
    private WorkSource zzo;
    private final String zzp;
    private final String zzq;
    private final Context zzr;
    private final Map<String, zzc> zzs;
    private AtomicInteger zzt;
    private final ScheduledExecutorService zzu;

    @KeepForSdk
    public WakeLock(@NonNull Context context, int i, @NonNull String str) {
        String packageName = context.getPackageName();
        this.f48463zzf = new Object();
        this.f48465zzh = 0;
        this.f48468zzk = new HashSet();
        this.f48469zzl = true;
        this.zzn = DefaultClock.getInstance();
        this.zzs = new HashMap();
        this.zzt = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.zzr = context.getApplicationContext();
        this.zzq = str;
        this.f48462zza = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.zzp = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.zzp = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb6 = new StringBuilder(29);
            sb6.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb6.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i, str);
        this.f48464zzg = wakeLockNewWakeLock;
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            WorkSource workSourceFromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
            this.zzo = workSourceFromPackage;
            if (workSourceFromPackage != null) {
                zze(wakeLockNewWakeLock, workSourceFromPackage);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f48459zzc;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f48460zzd) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f48459zzc;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f48459zzc = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.zzu = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void zza(@NonNull WakeLock wakeLock) {
        synchronized (wakeLock.f48463zzf) {
            try {
                if (wakeLock.isHeld()) {
                    String.valueOf(wakeLock.zzp).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                    wakeLock.zzc();
                    if (wakeLock.isHeld()) {
                        wakeLock.f48465zzh = 1;
                        wakeLock.zzd(0);
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    private final String zzb(String str) {
        if (this.f48469zzl) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    private final void zzc() {
        if (this.f48468zzk.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f48468zzk);
        this.f48468zzk.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private final void zzd(int i) {
        synchronized (this.f48463zzf) {
            try {
                if (isHeld()) {
                    if (this.f48469zzl) {
                        int i2 = this.f48465zzh - 1;
                        this.f48465zzh = i2;
                        if (i2 > 0) {
                            return;
                        }
                    } else {
                        this.f48465zzh = 0;
                    }
                    zzc();
                    Iterator<zzc> it8 = this.zzs.values().iterator();
                    while (it8.hasNext()) {
                        it8.next().f48471zza = 0;
                    }
                    this.zzs.clear();
                    Future<?> future = this.f48466zzi;
                    if (future != null) {
                        future.cancel(false);
                        this.f48466zzi = null;
                        this.f48467zzj = 0L;
                    }
                    this.zzm = 0;
                    if (this.f48464zzg.isHeld()) {
                        try {
                            try {
                                this.f48464zzg.release();
                                if (this.f48462zza != null) {
                                    this.f48462zza = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                String.valueOf(this.zzp).concat(" failed to release!");
                                if (this.f48462zza != null) {
                                    this.f48462zza = null;
                                }
                            }
                        } catch (Throwable th10) {
                            if (this.f48462zza != null) {
                                this.f48462zza = null;
                            }
                            throw th10;
                        }
                    } else {
                        String.valueOf(this.zzp).concat(" should be held!");
                    }
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    private static void zze(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            e.toString();
        }
    }

    @KeepForSdk
    public void acquire(long j2) {
        this.zzt.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f48458zzb), 1L);
        if (j2 > 0) {
            jMax = Math.min(j2, jMax);
        }
        synchronized (this.f48463zzf) {
            try {
                if (!isHeld()) {
                    this.f48462zza = com.google.android.gms.internal.stats.zzb.zza(false, null);
                    this.f48464zzg.acquire();
                    this.zzn.elapsedRealtime();
                }
                this.f48465zzh++;
                this.zzm++;
                zzb(null);
                zzc zzcVar = this.zzs.get(null);
                if (zzcVar == null) {
                    zzcVar = new zzc(null);
                    this.zzs.put(null, zzcVar);
                }
                zzcVar.f48471zza++;
                long jElapsedRealtime = this.zzn.elapsedRealtime();
                long j3 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j3 > this.f48467zzj) {
                    this.f48467zzj = j3;
                    Future<?> future = this.f48466zzi;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f48466zzi = this.zzu.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            WakeLock.zza(this.f48470zza);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @KeepForSdk
    public boolean isHeld() {
        boolean z;
        synchronized (this.f48463zzf) {
            z = this.f48465zzh > 0;
        }
        return z;
    }

    @KeepForSdk
    public void release() {
        if (this.zzt.decrementAndGet() < 0) {
            String.valueOf(this.zzp).concat(" release without a matched acquire!");
        }
        synchronized (this.f48463zzf) {
            try {
                zzb(null);
                if (this.zzs.containsKey(null)) {
                    zzc zzcVar = this.zzs.get(null);
                    if (zzcVar != null) {
                        int i = zzcVar.f48471zza - 1;
                        zzcVar.f48471zza = i;
                        if (i == 0) {
                            this.zzs.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.zzp).concat(" counter does not exist");
                }
                zzd(0);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @KeepForSdk
    public void setReferenceCounted(boolean z) {
        synchronized (this.f48463zzf) {
            this.f48469zzl = z;
        }
    }
}
