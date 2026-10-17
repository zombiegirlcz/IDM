package com.google.android.gms.internal.mlkit_vision_face;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzoc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzbn f44361zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzbp f44362zzb = zzbp.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f44363zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f44364zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zzob f44365zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final l f44366zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final Task f44367zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final Task f44368zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final String f44369zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final int f44370zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final Map f44371zzk = new HashMap();

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final Map f44372zzl = new HashMap();

    public zzoc(Context context, final l lVar, zzob zzobVar, String str) {
        this.f44363zzc = context.getPackageName();
        this.f44364zzd = c.a(context);
        this.f44366zzf = lVar;
        this.f44365zze = zzobVar;
        zzoo.zza();
        this.f44369zzi = str;
        g gVarA = g.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f44347zza.zzb();
            }
        };
        gVarA.getClass();
        this.f44367zzg = g.b(callable);
        g gVarA2 = g.a();
        lVar.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lVar.a();
            }
        };
        gVarA2.getClass();
        this.f44368zzh = g.b(callable2);
        zzbp zzbpVar = f44362zzb;
        this.f44370zzj = zzbpVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzbpVar.get(str)) : -1;
    }

    public static long zza(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    @NonNull
    private static synchronized zzbn zzi() {
        try {
            zzbn zzbnVar = f44361zza;
            if (zzbnVar != null) {
                return zzbnVar;
            }
            LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
            zzbk zzbkVar = new zzbk();
            for (int i = 0; i < locales.size(); i++) {
                zzbkVar.zzb(c.b(locales.get(i)));
            }
            zzbn zzbnVarZzc = zzbkVar.zzc();
            f44361zza = zzbnVarZzc;
            return zzbnVarZzc;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    private final String zzj() {
        return this.f44367zzg.isSuccessful() ? (String) this.f44367zzg.getResult() : LibraryVersion.getInstance().getVersion(this.f44369zzi);
    }

    private final boolean zzk(zzkt zzktVar, long j2, long j3) {
        return this.f44371zzk.get(zzktVar) == null || j2 - ((Long) this.f44371zzk.get(zzktVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    public final /* synthetic */ String zzb() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f44369zzi);
    }

    public final /* synthetic */ void zzc(zznr zznrVar, zzkt zzktVar, String str) {
        zznrVar.zzb(zzktVar);
        String strZzd = zznrVar.zzd();
        zzmt zzmtVar = new zzmt();
        zzmtVar.zzb(this.f44363zzc);
        zzmtVar.zzc(this.f44364zzd);
        zzmtVar.zzh(zzi());
        zzmtVar.zzg(Boolean.TRUE);
        zzmtVar.zzl(strZzd);
        zzmtVar.zzj(str);
        zzmtVar.zzi(this.f44368zzh.isSuccessful() ? (String) this.f44368zzh.getResult() : this.f44366zzf.a());
        zzmtVar.zzd(10);
        zzmtVar.zzk(Integer.valueOf(this.f44370zzj));
        zznrVar.zzc(zzmtVar);
        this.f44365zze.zza(zznrVar);
    }

    public final void zzd(zznr zznrVar, zzkt zzktVar) {
        zze(zznrVar, zzktVar, zzj());
    }

    public final void zze(final zznr zznrVar, final zzkt zzktVar, final String str) {
        q.f24050zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznx
            @Override // java.lang.Runnable
            public final void run() {
                this.f44349zza.zzc(zznrVar, zzktVar, str);
            }
        });
    }

    public final void zzf(zzoa zzoaVar, zzkt zzktVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzktVar, jElapsedRealtime, 30L)) {
            this.f44371zzk.put(zzktVar, Long.valueOf(jElapsedRealtime));
            zze(zzoaVar.zza(), zzktVar, zzj());
        }
    }

    public final /* synthetic */ void zzg(zzkt zzktVar, oh.g gVar) {
        zzbs zzbsVar = (zzbs) this.f44372zzl.get(zzktVar);
        if (zzbsVar != null) {
            for (Object obj2 : zzbsVar.zzq()) {
                ArrayList arrayList = new ArrayList(zzbsVar.zzc(obj2));
                Collections.sort(arrayList);
                zzjt zzjtVar = new zzjt();
                Iterator it8 = arrayList.iterator();
                long jLongValue = 0;
                while (it8.hasNext()) {
                    jLongValue += ((Long) it8.next()).longValue();
                }
                zzjtVar.zza(Long.valueOf(jLongValue / ((long) arrayList.size())));
                zzjtVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzjtVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzjtVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzjtVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzjtVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zze(gVar.a(obj2, arrayList.size(), zzjtVar.zzg()), zzktVar, zzj());
            }
            this.f44372zzl.remove(zzktVar);
        }
    }

    public final void zzh(final zzkt zzktVar, Object obj2, long j2, final oh.g gVar) {
        if (!this.f44372zzl.containsKey(zzktVar)) {
            this.f44372zzl.put(zzktVar, zzas.zzr());
        }
        ((zzbs) this.f44372zzl.get(zzktVar)).zzo(obj2, Long.valueOf(j2));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzktVar, jElapsedRealtime, 30L)) {
            this.f44371zzk.put(zzktVar, Long.valueOf(jElapsedRealtime));
            final byte[] bArr = null;
            q.f24050zza.execute(new Runnable(zzktVar, gVar, bArr) { // from class: com.google.android.gms.internal.mlkit_vision_face.zznz

                /* JADX INFO: renamed from: zzb, reason: collision with root package name */
                public final /* synthetic */ zzkt f44359zzb;

                /* JADX INFO: renamed from: zzc, reason: collision with root package name */
                public final /* synthetic */ oh.g f44360zzc;

                @Override // java.lang.Runnable
                public final void run() {
                    this.f44358zza.zzg(this.f44359zzb, this.f44360zzc);
                }
            });
        }
    }
}
