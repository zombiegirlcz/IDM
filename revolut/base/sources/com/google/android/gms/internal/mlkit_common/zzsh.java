package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import bh.b;
import ch.c;
import ch.g;
import ch.j;
import ch.l;
import ch.q;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
public final class zzsh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzaf f41210zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzai f41211zzb = zzai.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f41212zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f41213zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zzrz f41214zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final l f41215zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final Task f41216zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final Task f41217zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final String f41218zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final int f41219zzj;

    public zzsh(Context context, final l lVar, zzrz zzrzVar, String str) {
        new HashMap();
        new HashMap();
        this.f41212zzc = context.getPackageName();
        this.f41213zzd = c.a(context);
        this.f41215zzf = lVar;
        this.f41214zze = zzrzVar;
        zzsv.zza();
        this.f41218zzi = str;
        g gVarA = g.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzse
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f41204zza.zza();
            }
        };
        gVarA.getClass();
        this.f41216zzg = g.b(callable);
        g gVarA2 = g.a();
        Objects.requireNonNull(lVar);
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lVar.a();
            }
        };
        gVarA2.getClass();
        this.f41217zzh = g.b(callable2);
        zzai zzaiVar = f41211zzb;
        this.f41219zzj = zzaiVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzaiVar.get(str)) : -1;
    }

    @NonNull
    private static synchronized zzaf zzh() {
        try {
            zzaf zzafVar = f41210zza;
            if (zzafVar != null) {
                return zzafVar;
            }
            LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
            zzac zzacVar = new zzac();
            for (int i = 0; i < locales.size(); i++) {
                zzacVar.zzb(c.b(locales.get(i)));
            }
            zzaf zzafVarZzc = zzacVar.zzc();
            f41210zza = zzafVarZzc;
            return zzafVarZzc;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    private final zzqt zzi(String str, String str2) {
        zzqt zzqtVar = new zzqt();
        zzqtVar.zzb(this.f41212zzc);
        zzqtVar.zzc(this.f41213zzd);
        zzqtVar.zzh(zzh());
        zzqtVar.zzg(Boolean.TRUE);
        zzqtVar.zzl(str);
        zzqtVar.zzj(str2);
        zzqtVar.zzi(this.f41217zzh.isSuccessful() ? (String) this.f41217zzh.getResult() : this.f41215zzf.a());
        zzqtVar.zzd(10);
        zzqtVar.zzk(Integer.valueOf(this.f41219zzj));
        return zzqtVar;
    }

    private final String zzj() {
        if (this.f41216zzg.isSuccessful()) {
            return (String) this.f41216zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.f41218zzi);
    }

    public final /* synthetic */ String zza() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f41218zzi);
    }

    public final /* synthetic */ void zzb(zzry zzryVar, zzmv zzmvVar, String str) {
        zzryVar.zza(zzmvVar);
        zzryVar.zzc(zzi(zzryVar.zzd(), str));
        this.f41214zze.zza(zzryVar);
    }

    public final /* synthetic */ void zzc(zzry zzryVar, zzsj zzsjVar, b bVar) {
        zzryVar.zza(zzmv.MODEL_DOWNLOAD);
        zzryVar.zzc(zzi(zzsjVar.zze(), zzj()));
        zzryVar.zzb(zzst.zza(bVar, this.f41215zzf, zzsjVar));
        this.f41214zze.zza(zzryVar);
    }

    public final void zzd(final zzry zzryVar, final zzmv zzmvVar) {
        final String strZzj = zzj();
        q.f24050zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsd
            @Override // java.lang.Runnable
            public final void run() {
                this.f41200zza.zzb(zzryVar, zzmvVar, strZzj);
            }
        });
    }

    public final void zze(zzry zzryVar, b bVar, boolean z, int i) {
        zzsj.zzh().zzf(false);
        throw null;
    }

    public final void zzf(zzry zzryVar, b bVar, zzmu zzmuVar, boolean z, j jVar, zzna zznaVar) {
        zzsi zzsiVarZzh = zzsj.zzh();
        zzsiVarZzh.zzf(z);
        zzsiVarZzh.zzd(jVar);
        zzsiVarZzh.zzb(zzmuVar);
        zzsiVarZzh.zza(zznaVar);
        zzg(zzryVar, bVar, zzsiVarZzh.zzh());
    }

    public final void zzg(final zzry zzryVar, final b bVar, final zzsj zzsjVar) {
        q.f24050zza.execute(new Runnable(zzryVar, zzsjVar, bVar) { // from class: com.google.android.gms.internal.mlkit_common.zzsg

            /* JADX INFO: renamed from: zzb, reason: collision with root package name */
            public final /* synthetic */ zzry f41207zzb;

            /* JADX INFO: renamed from: zzc, reason: collision with root package name */
            public final /* synthetic */ zzsj f41208zzc;

            /* JADX INFO: renamed from: zzd, reason: collision with root package name */
            public final /* synthetic */ b f41209zzd;

            @Override // java.lang.Runnable
            public final void run() {
                this.f41206zza.zzc(this.f41207zzb, this.f41208zzc, null);
            }
        });
    }
}
