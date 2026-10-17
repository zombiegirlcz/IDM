package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzff {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static volatile zzff f40035zzc;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected final Clock f40036zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    protected final ExecutorService f40037zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f40038zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final AppMeasurementSdk f40039zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final List f40040zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private int f40041zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private boolean f40042zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final String f40043zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private volatile zzcv f40044zzj;

    public zzff(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !zzX(str2, str3)) {
            this.f40038zzd = "FA";
        } else {
            this.f40038zzd = str;
        }
        this.f40036zza = DefaultClock.getInstance();
        zzcq.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzeg(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f40037zzb = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f40039zze = new AppMeasurementSdk(this);
        this.f40040zzf = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.zzmg.zzc(context, "google_app_id", com.google.android.gms.measurement.internal.zzig.zza(context)) != null && !zzT()) {
                this.f40043zzi = null;
                this.f40042zzh = true;
                String str4 = this.f40038zzd;
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (zzX(str2, str3)) {
            this.f40043zzi = str2;
        } else {
            this.f40043zzi = "fa";
            if (str2 == null || str3 == null) {
                if ((str3 == null) ^ (str2 == null)) {
                    String str5 = this.f40038zzd;
                }
            } else {
                String str6 = this.f40038zzd;
            }
        }
        zzW(new zzdu(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            String str7 = this.f40038zzd;
        } else {
            application.registerActivityLifecycleCallbacks(new zzfe(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU(Exception exc2, boolean z, boolean z3) {
        zzff zzffVar;
        this.f40042zzh |= z;
        if (z) {
            String str = this.f40038zzd;
            return;
        }
        if (z3) {
            zzffVar = this;
            zzffVar.zzB(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            zzffVar = this;
        }
        String str2 = zzffVar.f40038zzd;
    }

    private final void zzV(String str, String str2, Bundle bundle, boolean z, boolean z3, Long l2) {
        zzW(new zzet(this, l2, str, str2, bundle, z, z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzW(zzeu zzeuVar) {
        this.f40037zzb.execute(zzeuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzX(String str, String str2) {
        return (str2 == null || str == null || zzT()) ? false : true;
    }

    public static zzff zzg(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (f40035zzc == null) {
            synchronized (zzff.class) {
                try {
                    if (f40035zzc == null) {
                        f40035zzc = new zzff(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f40035zzc;
    }

    public final void zzA(String str, String str2, Bundle bundle, long j2) {
        zzV(str, str2, bundle, true, false, Long.valueOf(j2));
    }

    public final void zzB(int i, String str, Object obj2, Object obj3, Object obj4) {
        zzW(new zzeh(this, false, 5, str, obj2, null, null));
    }

    public final void zzC(com.google.android.gms.measurement.internal.zzkc zzkcVar) {
        Preconditions.checkNotNull(zzkcVar);
        List list = this.f40040zzf;
        synchronized (list) {
            for (int i = 0; i < list.size(); i++) {
                try {
                    if (zzkcVar.equals(((Pair) list.get(i)).first)) {
                        String str = this.f40038zzd;
                        return;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            zzew zzewVar = new zzew(zzkcVar);
            list.add(new Pair(zzkcVar, zzewVar));
            if (this.f40044zzj != null) {
                try {
                    this.f40044zzj.registerOnMeasurementEventListener(zzewVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    String str2 = this.f40038zzd;
                }
            }
            zzW(new zzer(this, zzewVar));
        }
    }

    public final void zzD() {
        zzW(new zzdt(this));
    }

    public final void zzE(Runnable runnable) {
        zzW(new zzdz(this, runnable));
    }

    public final void zzF(Bundle bundle) {
        zzW(new zzdm(this, bundle));
    }

    public final void zzG(Bundle bundle) {
        zzW(new zzds(this, bundle));
    }

    public final void zzH(zzdj zzdjVar, String str, String str2) {
        zzW(new zzdq(this, zzdjVar, str, str2));
    }

    public final void zzI(boolean z) {
        zzW(new zzen(this, z));
    }

    public final void zzJ(Bundle bundle) {
        zzW(new zzeo(this, bundle));
    }

    public final void zzK(com.google.android.gms.measurement.internal.zzkb zzkbVar) {
        zzev zzevVar = new zzev(zzkbVar);
        if (this.f40044zzj != null) {
            try {
                this.f40044zzj.setEventInterceptor(zzevVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                String str = this.f40038zzd;
            }
        }
        zzW(new zzep(this, zzevVar));
    }

    public final void zzL(Boolean bool) {
        zzW(new zzdr(this, bool));
    }

    public final void zzM(long j2) {
        zzW(new zzdv(this, j2));
    }

    public final void zzN(Intent intent) {
        zzW(new zzeq(this, intent));
    }

    public final void zzO(String str) {
        zzW(new zzdp(this, str));
    }

    public final void zzP(String str, String str2, Object obj2, boolean z) {
        zzW(new zzdl(this, str, str2, obj2, z));
    }

    public final void zzQ(com.google.android.gms.measurement.internal.zzkc zzkcVar) {
        Pair pair;
        Preconditions.checkNotNull(zzkcVar);
        List list = this.f40040zzf;
        synchronized (list) {
            int i = 0;
            while (true) {
                try {
                    if (i >= list.size()) {
                        pair = null;
                        break;
                    } else {
                        if (zzkcVar.equals(((Pair) list.get(i)).first)) {
                            pair = (Pair) list.get(i);
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            if (pair == null) {
                String str = this.f40038zzd;
                return;
            }
            list.remove(pair);
            zzew zzewVar = (zzew) pair.second;
            if (this.f40044zzj != null) {
                try {
                    this.f40044zzj.unregisterOnMeasurementEventListener(zzewVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    String str2 = this.f40038zzd;
                }
            }
            zzW(new zzes(this, zzewVar));
        }
    }

    public final boolean zzT() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzff.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final int zza(String str) {
        zzcs zzcsVar = new zzcs();
        zzW(new zzej(this, str, zzcsVar));
        Integer num = (Integer) zzcs.zzf(zzcsVar.zzb(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zzb() {
        zzcs zzcsVar = new zzcs();
        zzW(new zzec(this, zzcsVar));
        Long lZzc = zzcsVar.zzc(500L);
        if (lZzc != null) {
            return lZzc.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f40036zza.currentTimeMillis()).nextLong();
        int i = this.f40041zzg + 1;
        this.f40041zzg = i;
        return jNextLong + ((long) i);
    }

    public final Bundle zzc(Bundle bundle, boolean z) {
        zzcs zzcsVar = new zzcs();
        zzW(new zzei(this, bundle, zzcsVar));
        if (z) {
            return zzcsVar.zzb(5000L);
        }
        return null;
    }

    public final AppMeasurementSdk zzd() {
        return this.f40039zze;
    }

    public final zzcv zzf(Context context, boolean z) {
        try {
            return zzcu.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, "com.google.android.gms.measurement.dynamite").instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            zzU(e, true, false);
            return null;
        }
    }

    public final Long zzh() {
        zzcs zzcsVar = new zzcs();
        zzW(new zzel(this, zzcsVar));
        return zzcsVar.zzc(120000L);
    }

    public final Object zzi(int i) {
        zzcs zzcsVar = new zzcs();
        zzW(new zzem(this, zzcsVar, i));
        return zzcs.zzf(zzcsVar.zzb(MotionCaptureViewModelImpl.MAX_RECORDING_TIME_MILLISECONDS), Object.class);
    }

    public final String zzk() {
        return this.f40043zzi;
    }

    public final String zzl() {
        zzcs zzcsVar = new zzcs();
        zzW(new zzek(this, zzcsVar));
        return zzcsVar.zzd(120000L);
    }

    public final String zzm() {
        zzcs zzcsVar = new zzcs();
        zzW(new zzeb(this, zzcsVar));
        return zzcsVar.zzd(50L);
    }

    public final String zzn() {
        zzcs zzcsVar = new zzcs();
        zzW(new zzee(this, zzcsVar));
        return zzcsVar.zzd(500L);
    }

    public final String zzo() {
        zzcs zzcsVar = new zzcs();
        zzW(new zzed(this, zzcsVar));
        return zzcsVar.zzd(500L);
    }

    public final String zzp() {
        zzcs zzcsVar = new zzcs();
        zzW(new zzea(this, zzcsVar));
        return zzcsVar.zzd(500L);
    }

    public final List zzq(String str, String str2) {
        zzcs zzcsVar = new zzcs();
        zzW(new zzdo(this, str, str2, zzcsVar));
        List list = (List) zzcs.zzf(zzcsVar.zzb(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final Map zzr(String str, String str2, boolean z) {
        zzcs zzcsVar = new zzcs();
        zzW(new zzef(this, str, str2, z, zzcsVar));
        Bundle bundleZzb = zzcsVar.zzb(5000L);
        if (bundleZzb == null || bundleZzb.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleZzb.size());
        for (String str3 : bundleZzb.keySet()) {
            Object obj2 = bundleZzb.get(str3);
            if ((obj2 instanceof Double) || (obj2 instanceof Long) || (obj2 instanceof String)) {
                map.put(str3, obj2);
            }
        }
        return map;
    }

    public final void zzv(String str) {
        zzW(new zzdw(this, str));
    }

    public final void zzw(String str, String str2, Bundle bundle) {
        zzW(new zzdn(this, str, str2, bundle));
    }

    public final void zzx(String str) {
        zzW(new zzdx(this, str));
    }

    public final void zzy(@NonNull String str, Bundle bundle) {
        zzV(null, str, bundle, false, true, null);
    }

    public final void zzz(String str, String str2, Bundle bundle) {
        zzV(str, str2, bundle, true, true, null);
    }
}
