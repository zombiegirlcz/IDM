package com.google.android.gms.internal.mlkit_vision_text_common;

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
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import rh.a;
import rh.j;

/* JADX INFO: loaded from: classes16.dex */
public final class zzuc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzbk f44996zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzbm f44997zzb = zzbm.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f44998zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f44999zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zzts f45000zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final l f45001zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final Task f45002zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final Task f45003zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final String f45004zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final int f45005zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final Map f45006zzk = new HashMap();

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final Map f45007zzl = new HashMap();

    public zzuc(Context context, final l lVar, zzts zztsVar, String str) {
        this.f44998zzc = context.getPackageName();
        this.f44999zzd = c.a(context);
        this.f45001zzf = lVar;
        this.f45000zze = zztsVar;
        zzuo.zza();
        this.f45004zzi = str;
        g gVarA = g.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzty
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f44989zza.zzb();
            }
        };
        gVarA.getClass();
        this.f45002zzg = g.b(callable);
        g gVarA2 = g.a();
        Objects.requireNonNull(lVar);
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lVar.a();
            }
        };
        gVarA2.getClass();
        this.f45003zzh = g.b(callable2);
        zzbm zzbmVar = f44997zzb;
        this.f45005zzj = zzbmVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzbmVar.get(str)) : -1;
    }

    public static long zza(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    @NonNull
    private static synchronized zzbk zzi() {
        try {
            zzbk zzbkVar = f44996zza;
            if (zzbkVar != null) {
                return zzbkVar;
            }
            LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
            zzbh zzbhVar = new zzbh();
            for (int i = 0; i < locales.size(); i++) {
                zzbhVar.zza(c.b(locales.get(i)));
            }
            zzbk zzbkVarZzb = zzbhVar.zzb();
            f44996zza = zzbkVarZzb;
            return zzbkVarZzb;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    private final String zzj() {
        if (this.f45002zzg.isSuccessful()) {
            return (String) this.f45002zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.f45004zzi);
    }

    private final boolean zzk(zzov zzovVar, long j2, long j3) {
        return this.f45006zzk.get(zzovVar) == null || j2 - ((Long) this.f45006zzk.get(zzovVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    public final /* synthetic */ String zzb() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f45004zzi);
    }

    public final /* synthetic */ void zzc(zztr zztrVar, zzov zzovVar, String str) {
        zztrVar.zzb(zzovVar);
        String strZzd = zztrVar.zzd();
        zzsr zzsrVar = new zzsr();
        zzsrVar.zzb(this.f44998zzc);
        zzsrVar.zzc(this.f44999zzd);
        zzsrVar.zzh(zzi());
        zzsrVar.zzg(Boolean.TRUE);
        zzsrVar.zzl(strZzd);
        zzsrVar.zzj(str);
        zzsrVar.zzi(this.f45003zzh.isSuccessful() ? (String) this.f45003zzh.getResult() : this.f45001zzf.a());
        zzsrVar.zzd(10);
        zzsrVar.zzk(Integer.valueOf(this.f45005zzj));
        zztrVar.zzc(zzsrVar);
        this.f45000zze.zza(zztrVar);
    }

    public final void zzd(zztr zztrVar, zzov zzovVar) {
        zze(zztrVar, zzovVar, zzj());
    }

    public final void zze(final zztr zztrVar, final zzov zzovVar, final String str) {
        q.f24050zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztw
            @Override // java.lang.Runnable
            public final void run() {
                this.f44982zza.zzc(zztrVar, zzovVar, str);
            }
        });
    }

    public final void zzf(zzub zzubVar, zzov zzovVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzovVar, jElapsedRealtime, 30L)) {
            this.f45006zzk.put(zzovVar, Long.valueOf(jElapsedRealtime));
            zze(zzubVar.zza(), zzovVar, zzj());
        }
    }

    public final void zzg(zzov zzovVar, j jVar) {
        zzbp zzbpVar = (zzbp) this.f45007zzl.get(zzovVar);
        if (zzbpVar != null) {
            for (Object obj2 : zzbpVar.zzo()) {
                ArrayList arrayList = new ArrayList(zzbpVar.zzc(obj2));
                Collections.sort(arrayList);
                zznu zznuVar = new zznu();
                Iterator it8 = arrayList.iterator();
                long jLongValue = 0;
                while (it8.hasNext()) {
                    jLongValue += ((Long) it8.next()).longValue();
                }
                zznuVar.zza(Long.valueOf(jLongValue / ((long) arrayList.size())));
                zznuVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zznuVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zznuVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zznuVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zznuVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zznw zznwVarZzg = zznuVar.zzg();
                int size = arrayList.size();
                a aVar = jVar.f254291a;
                zzes zzesVar = (zzes) obj2;
                zzow zzowVar = new zzow();
                zzowVar.zze(aVar.f254276g.c() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
                zzep zzepVar = new zzep();
                zzepVar.zza(Integer.valueOf(size));
                zzepVar.zzc(zzesVar);
                zzepVar.zzb(zznwVarZzg);
                zzowVar.zzd(zzepVar.zze());
                zze(zzuf.zzf(zzowVar), zzovVar, zzj());
            }
            this.f45007zzl.remove(zzovVar);
        }
    }

    public final void zzh(final zzov zzovVar, Object obj2, long j2, final j jVar) {
        if (!this.f45007zzl.containsKey(zzovVar)) {
            this.f45007zzl.put(zzovVar, zzao.zzp());
        }
        ((zzbp) this.f45007zzl.get(zzovVar)).zzm(obj2, Long.valueOf(j2));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzovVar, jElapsedRealtime, 30L)) {
            this.f45006zzk.put(zzovVar, Long.valueOf(jElapsedRealtime));
            q.f24050zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zztx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44986zza.zzg(zzovVar, jVar);
                }
            });
        }
    }
}
