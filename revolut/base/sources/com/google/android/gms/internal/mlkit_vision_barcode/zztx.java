package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import ch.c;
import ch.g;
import ch.l;
import ch.q;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import hh.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zztx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzcv f42446zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzcx f42447zzb = zzcx.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f42448zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f42449zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zztn f42450zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final l f42451zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final Task f42452zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final Task f42453zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final String f42454zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final int f42455zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final Map f42456zzk = new HashMap();

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final Map f42457zzl = new HashMap();

    public zztx(Context context, final l lVar, zztn zztnVar, String str) {
        this.f42448zzc = context.getPackageName();
        this.f42449zzd = c.a(context);
        this.f42451zzf = lVar;
        this.f42450zze = zztnVar;
        zzuj.zza();
        this.f42454zzi = str;
        g gVarA = g.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zztr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f42432zza.zzb();
            }
        };
        gVarA.getClass();
        this.f42452zzg = g.b(callable);
        g gVarA2 = g.a();
        lVar.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzts
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lVar.a();
            }
        };
        gVarA2.getClass();
        this.f42453zzh = g.b(callable2);
        zzcx zzcxVar = f42447zzb;
        this.f42455zzj = zzcxVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzcxVar.get(str)) : -1;
    }

    public static long zza(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    @NonNull
    private static synchronized zzcv zzi() {
        try {
            zzcv zzcvVar = f42446zza;
            if (zzcvVar != null) {
                return zzcvVar;
            }
            LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
            zzcs zzcsVar = new zzcs();
            for (int i = 0; i < locales.size(); i++) {
                zzcsVar.zzd(c.b(locales.get(i)));
            }
            zzcv zzcvVarZzf = zzcsVar.zzf();
            f42446zza = zzcvVarZzf;
            return zzcvVarZzf;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    private final String zzj() {
        return this.f42452zzg.isSuccessful() ? (String) this.f42452zzg.getResult() : LibraryVersion.getInstance().getVersion(this.f42454zzi);
    }

    private final boolean zzk(zzpk zzpkVar, long j2, long j3) {
        return this.f42456zzk.get(zzpkVar) == null || j2 - ((Long) this.f42456zzk.get(zzpkVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    public final /* synthetic */ String zzb() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f42454zzi);
    }

    public final /* synthetic */ void zzc(zztm zztmVar, zzpk zzpkVar, String str) {
        zztmVar.zzb(zzpkVar);
        String strZzd = zztmVar.zzd();
        zzsj zzsjVar = new zzsj();
        zzsjVar.zzb(this.f42448zzc);
        zzsjVar.zzc(this.f42449zzd);
        zzsjVar.zzh(zzi());
        zzsjVar.zzg(Boolean.TRUE);
        zzsjVar.zzl(strZzd);
        zzsjVar.zzj(str);
        zzsjVar.zzi(this.f42453zzh.isSuccessful() ? (String) this.f42453zzh.getResult() : this.f42451zzf.a());
        zzsjVar.zzd(10);
        zzsjVar.zzk(Integer.valueOf(this.f42455zzj));
        zztmVar.zzc(zzsjVar);
        this.f42450zze.zza(zztmVar);
    }

    public final void zzd(zztm zztmVar, zzpk zzpkVar) {
        zze(zztmVar, zzpkVar, zzj());
    }

    public final void zze(final zztm zztmVar, final zzpk zzpkVar, final String str) {
        q.f24050zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zztt
            @Override // java.lang.Runnable
            public final void run() {
                this.f42434zza.zzc(zztmVar, zzpkVar, str);
            }
        });
    }

    public final void zzf(zztw zztwVar, zzpk zzpkVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzpkVar, jElapsedRealtime, 30L)) {
            this.f42456zzk.put(zzpkVar, Long.valueOf(jElapsedRealtime));
            zze(zztwVar.zza(), zzpkVar, zzj());
        }
    }

    public final /* synthetic */ void zzg(zzpk zzpkVar, h hVar) {
        zzdb zzdbVar = (zzdb) this.f42457zzl.get(zzpkVar);
        if (zzdbVar != null) {
            for (Object obj2 : zzdbVar.zzw()) {
                ArrayList arrayList = new ArrayList(zzdbVar.zze(obj2));
                Collections.sort(arrayList);
                zzoj zzojVar = new zzoj();
                Iterator it8 = arrayList.iterator();
                long jLongValue = 0;
                while (it8.hasNext()) {
                    jLongValue += ((Long) it8.next()).longValue();
                }
                zzojVar.zza(Long.valueOf(jLongValue / ((long) arrayList.size())));
                zzojVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzojVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzojVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzojVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzojVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zze(hVar.a(obj2, arrayList.size(), zzojVar.zzg()), zzpkVar, zzj());
            }
            this.f42457zzl.remove(zzpkVar);
        }
    }

    public final void zzh(final zzpk zzpkVar, Object obj2, long j2, final h hVar) {
        if (!this.f42457zzl.containsKey(zzpkVar)) {
            this.f42457zzl.put(zzpkVar, zzbz.zzz());
        }
        ((zzdb) this.f42457zzl.get(zzpkVar)).zzt(obj2, Long.valueOf(j2));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzpkVar, jElapsedRealtime, 30L)) {
            this.f42456zzk.put(zzpkVar, Long.valueOf(jElapsedRealtime));
            q.f24050zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zztv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42443zza.zzg(zzpkVar, hVar);
                }
            });
        }
    }
}
