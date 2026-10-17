package com.google.android.gms.internal.mlkit_vision_common;

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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class zzmj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static zzp f43392zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzr f43393zzb = zzr.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f43394zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f43395zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final zzmc f43396zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final l f43397zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final Task f43398zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final Task f43399zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final String f43400zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final int f43401zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final Map f43402zzk = new HashMap();

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final Map f43403zzl = new HashMap();

    public zzmj(Context context, final l lVar, zzmc zzmcVar, String str) {
        this.f43394zzc = context.getPackageName();
        this.f43395zzd = c.a(context);
        this.f43397zzf = lVar;
        this.f43396zze = zzmcVar;
        zzmw.zza();
        this.f43400zzi = str;
        g gVarA = g.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f43386zza.zza();
            }
        };
        gVarA.getClass();
        this.f43398zzg = g.b(callable);
        g gVarA2 = g.a();
        lVar.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lVar.a();
            }
        };
        gVarA2.getClass();
        this.f43399zzh = g.b(callable2);
        zzr zzrVar = f43393zzb;
        this.f43401zzj = zzrVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzrVar.get(str)) : -1;
    }

    @NonNull
    private static synchronized zzp zzd() {
        try {
            zzp zzpVar = f43392zza;
            if (zzpVar != null) {
                return zzpVar;
            }
            LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
            zzm zzmVar = new zzm();
            for (int i = 0; i < locales.size(); i++) {
                zzmVar.zzb(c.b(locales.get(i)));
            }
            zzp zzpVarZzc = zzmVar.zzc();
            f43392zza = zzpVarZzc;
            return zzpVarZzc;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final /* synthetic */ String zza() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f43400zzi);
    }

    public final /* synthetic */ void zzb(zzmb zzmbVar, zziv zzivVar, String str) {
        zzmbVar.zza(zzivVar);
        String strZzc = zzmbVar.zzc();
        zzky zzkyVar = new zzky();
        zzkyVar.zzb(this.f43394zzc);
        zzkyVar.zzc(this.f43395zzd);
        zzkyVar.zzh(zzd());
        zzkyVar.zzg(Boolean.TRUE);
        zzkyVar.zzl(strZzc);
        zzkyVar.zzj(str);
        zzkyVar.zzi(this.f43399zzh.isSuccessful() ? (String) this.f43399zzh.getResult() : this.f43397zzf.a());
        zzkyVar.zzd(10);
        zzkyVar.zzk(Integer.valueOf(this.f43401zzj));
        zzmbVar.zzb(zzkyVar);
        this.f43396zze.zza(zzmbVar);
    }

    public final void zzc(zzmt zzmtVar, final zziv zzivVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f43402zzk.get(zzivVar) != null && jElapsedRealtime - ((Long) this.f43402zzk.get(zzivVar)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f43402zzk.put(zzivVar, Long.valueOf(jElapsedRealtime));
        int i = zzmtVar.f43414zza;
        int i2 = zzmtVar.f43415zzb;
        int i3 = zzmtVar.f43416zzc;
        int i5 = zzmtVar.f43417zzd;
        int i6 = zzmtVar.f43418zze;
        long j2 = zzmtVar.f43419zzf;
        int i21 = zzmtVar.f43420zzg;
        zzin zzinVar = new zzin();
        zzinVar.zzd(i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzii.UNKNOWN_FORMAT : zzii.NV21 : zzii.NV16 : zzii.YV12 : zzii.YUV_420_888 : zzii.BITMAP);
        zzinVar.zzf(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? zzio.ANDROID_MEDIA_IMAGE : zzio.FILEPATH : zzio.BYTEBUFFER : zzio.BYTEARRAY : zzio.BITMAP);
        zzinVar.zzc(Integer.valueOf(i3));
        zzinVar.zze(Integer.valueOf(i5));
        zzinVar.zzg(Integer.valueOf(i6));
        zzinVar.zzb(Long.valueOf(j2));
        zzinVar.zzh(Integer.valueOf(i21));
        zziq zziqVarZzj = zzinVar.zzj();
        zziw zziwVar = new zziw();
        zziwVar.zzd(zziqVarZzj);
        final zzmb zzmbVarZze = zzmk.zze(zziwVar);
        final String version = this.f43398zzg.isSuccessful() ? (String) this.f43398zzg.getResult() : LibraryVersion.getInstance().getVersion(this.f43400zzi);
        q.f24050zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmi
            @Override // java.lang.Runnable
            public final void run() {
                this.f43388zza.zzb(zzmbVarZze, zzivVar, version);
            }
        });
    }
}
