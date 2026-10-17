package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import ch.l;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import hh.d;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class zzus {

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final GmsLogger f42520zzf = new GmsLogger("AutoZoom");

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final zzuu f42521zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzbz f42522zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    ScheduledFuture f42523zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    String f42524zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    int f42525zze;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final AtomicBoolean f42526zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final Object f42527zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final ScheduledExecutorService f42528zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final zzbf f42529zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final zztx f42530zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final String f42531zzl;
    private Executor zzm;
    private float zzn;
    private float zzo;
    private long zzp;
    private long zzq;
    private boolean zzr;
    private d zzs;

    private zzus(Context context, zzuu zzuuVar, String str) {
        zzg.zza();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(2));
        zzbf zzbfVarZza = zzar.zza();
        zztx zztxVar = new zztx(context, new l(context), new zztq(context, zztp.zzd("scanner-auto-zoom").zzd()), "scanner-auto-zoom");
        this.f42527zzh = new Object();
        this.f42521zza = zzuuVar;
        this.f42526zzg = new AtomicBoolean(false);
        this.f42522zzb = zzbz.zzz();
        this.f42528zzi = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        this.f42529zzj = zzbfVarZza;
        this.f42530zzk = zztxVar;
        this.f42531zzl = str;
        this.f42525zze = 1;
        this.zzn = 1.0f;
        this.zzo = -1.0f;
        this.zzp = zzbfVarZza.zza();
    }

    public static zzus zzd(Context context, String str) {
        return new zzus(context, zzuu.f42533zzb, str);
    }

    public static /* synthetic */ void zzf(zzus zzusVar) {
        ScheduledFuture scheduledFuture;
        synchronized (zzusVar.f42527zzh) {
            try {
                if (zzusVar.f42525zze == 2 && !zzusVar.f42526zzg.get() && (scheduledFuture = zzusVar.f42523zzc) != null && !scheduledFuture.isCancelled()) {
                    if (zzusVar.zzn > 1.0f && zzusVar.zza() >= zzusVar.f42521zza.zzi()) {
                        f42520zzf.i("AutoZoom", "Reset zoom = 1");
                        zzusVar.zzl(1.0f, zzpk.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                    }
                }
            } finally {
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzg(zzus zzusVar, float f) {
        synchronized (zzusVar.f42527zzh) {
            zzusVar.zzn = f;
            zzusVar.zzr(false);
        }
    }

    private final float zzp(float f) {
        float f4 = this.zzo;
        if (f < 1.0f) {
            f = 1.0f;
        }
        return (f4 <= BitmapDescriptorFactory.HUE_RED || f <= f4) ? f : f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzq(zzpk zzpkVar, float f, float f4, zzuv zzuvVar) {
        long jConvert;
        if (this.f42524zzd != null) {
            zzsb zzsbVar = new zzsb();
            zzsbVar.zza(this.f42531zzl);
            String str = this.f42524zzd;
            str.getClass();
            zzsbVar.zze(str);
            zzsbVar.zzf(Float.valueOf(f));
            zzsbVar.zzc(Float.valueOf(f4));
            synchronized (this.f42527zzh) {
                jConvert = TimeUnit.MILLISECONDS.convert(this.f42529zzj.zza() - this.zzq, TimeUnit.NANOSECONDS);
            }
            zzsbVar.zzb(Long.valueOf(jConvert));
            if (zzuvVar != null) {
                zzsc zzscVar = new zzsc();
                zzscVar.zzc(Float.valueOf(zzuvVar.zzc()));
                zzscVar.zze(Float.valueOf(zzuvVar.zze()));
                zzscVar.zzb(Float.valueOf(zzuvVar.zzb()));
                zzscVar.zzd(Float.valueOf(zzuvVar.zzd()));
                zzscVar.zza(Float.valueOf(BitmapDescriptorFactory.HUE_RED));
                zzsbVar.zzd(zzscVar.zzf());
            }
            zztx zztxVar = this.f42530zzk;
            zzpl zzplVar = new zzpl();
            zzplVar.zzi(zzsbVar.zzh());
            zztxVar.zzd(zzua.zzf(zzplVar), zzpkVar);
        }
    }

    private final void zzr(boolean z) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f42527zzh) {
            try {
                this.f42522zzb.zzs();
                this.zzp = this.f42529zzj.zza();
                if (z && (scheduledFuture = this.f42523zzc) != null) {
                    scheduledFuture.cancel(false);
                    this.f42523zzc = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final long zza() {
        long jConvert;
        synchronized (this.f42527zzh) {
            jConvert = TimeUnit.MILLISECONDS.convert(this.f42529zzj.zza() - this.zzp, TimeUnit.NANOSECONDS);
        }
        return jConvert;
    }

    public final /* synthetic */ zzev zzc(float f) throws Exception {
        d dVar = this.zzs;
        zzp(f);
        dVar.getClass();
        eh.a aVar = hh.a.f152194g;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023d A[Catch: all -> 0x018e, Merged into TryCatch #0 {all -> 0x000a, all -> 0x018e, blocks: (B:4:0x0003, B:6:0x0008, B:10:0x000e, B:12:0x0014, B:14:0x001d, B:16:0x0027, B:18:0x002b, B:19:0x0035, B:21:0x008b, B:22:0x0090, B:24:0x0096, B:27:0x00a4, B:28:0x00c5, B:29:0x00d4, B:31:0x00da, B:33:0x00ec, B:35:0x00f8, B:38:0x0100, B:39:0x0147, B:41:0x0151, B:42:0x015c, B:44:0x0168, B:46:0x0170, B:73:0x025b, B:48:0x017a, B:49:0x017c, B:76:0x025e, B:77:0x025f, B:50:0x017d, B:52:0x018b, B:56:0x0192, B:57:0x01be, B:59:0x01c4, B:62:0x01ed, B:64:0x01fc, B:66:0x020b, B:68:0x0216, B:69:0x023b, B:71:0x023d, B:72:0x025a), top: B:81:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(int r14, com.google.android.gms.internal.mlkit_vision_barcode.zzuv r15) {
        /*
            Method dump skipped, instruction units count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode.zzus.zzi(int, com.google.android.gms.internal.mlkit_vision_barcode.zzuv):void");
    }

    public final void zzj() {
        synchronized (this.f42527zzh) {
            try {
                if (this.f42525zze == 4) {
                    return;
                }
                zzn(false);
                this.f42528zzi.shutdown();
                this.f42525zze = 4;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void zzk(float f) {
        synchronized (this.f42527zzh) {
            zzbc.zzc(f >= 1.0f);
            this.zzo = f;
        }
    }

    public final void zzl(float f, zzpk zzpkVar, zzuv zzuvVar) {
        synchronized (this.f42527zzh) {
        }
    }

    public final void zzm() {
        synchronized (this.f42527zzh) {
            try {
                int i = this.f42525zze;
                if (i != 2 && i != 4) {
                    zzr(true);
                    this.f42523zzc = this.f42528zzi.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzuq
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzus.zzf(this.f42514zza);
                        }
                    }, 500L, 500L, TimeUnit.MILLISECONDS);
                    if (this.f42525zze == 1) {
                        this.f42524zzd = UUID.randomUUID().toString();
                        this.zzq = this.f42529zzj.zza();
                        this.zzr = false;
                        zzpk zzpkVar = zzpk.SCANNER_AUTO_ZOOM_START;
                        float f = this.zzn;
                        zzq(zzpkVar, f, f, null);
                    } else {
                        zzpk zzpkVar2 = zzpk.SCANNER_AUTO_ZOOM_RESUME;
                        float f4 = this.zzn;
                        zzq(zzpkVar2, f4, f4, null);
                    }
                    this.f42525zze = 2;
                }
            } finally {
            }
        }
    }

    public final void zzn(boolean z) {
        synchronized (this.f42527zzh) {
            try {
                int i = this.f42525zze;
                if (i != 1 && i != 4) {
                    zzr(true);
                    if (z) {
                        if (!this.zzr) {
                            zzpk zzpkVar = zzpk.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                            float f = this.zzn;
                            zzq(zzpkVar, f, f, null);
                        }
                        zzpk zzpkVar2 = zzpk.SCANNER_AUTO_ZOOM_SCAN_SUCCESS;
                        float f4 = this.zzn;
                        zzq(zzpkVar2, f4, f4, null);
                    } else {
                        zzpk zzpkVar3 = zzpk.SCANNER_AUTO_ZOOM_SCAN_FAILED;
                        float f5 = this.zzn;
                        zzq(zzpkVar3, f5, f5, null);
                    }
                    this.zzr = false;
                    this.f42525zze = 1;
                    this.f42524zzd = null;
                }
            } finally {
            }
        }
    }

    public final void zzo(d dVar, Executor executor) {
        this.zzs = dVar;
        this.zzm = executor;
    }
}
