package hh;

import android.os.SystemClock;
import ch.q;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzop;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzow;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpx;
import com.google.android.gms.internal.mlkit_vision_barcode.zztm;
import com.google.android.gms.internal.mlkit_vision_barcode.zztw;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zztz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzua;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i extends ch.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final jh.b f152208j = jh.b.f174101a;
    public static boolean k = true;
    public final eh.a d;
    public final j e;
    public final zztx f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zztz f152209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jh.a f152210h = new jh.a();
    public boolean i;

    public i(ch.h hVar, eh.a aVar, j jVar, zztx zztxVar) {
        Preconditions.checkNotNull(hVar, "MlKitContext can not be null");
        Preconditions.checkNotNull(aVar, "BarcodeScannerOptions can not be null");
        this.d = aVar;
        this.e = jVar;
        this.f = zztxVar;
        this.f152209g = zztz.zza(hVar.b());
    }

    @Override // ch.f
    public final synchronized void b() {
        this.i = this.e.zzc();
    }

    @Override // ch.f
    public final synchronized void c() {
        try {
            this.e.zzb();
            k = true;
            zztx zztxVar = this.f;
            zzpl zzplVar = new zzpl();
            zzplVar.zze(this.i ? zzpi.TYPE_THICK : zzpi.TYPE_THIN);
            zzpx zzpxVar = new zzpx();
            zzpxVar.zzi(b.a(this.d));
            zzplVar.zzg(zzpxVar.zzj());
            zztxVar.zzd(zzua.zzf(zzplVar), zzpk.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // ch.f
    public final Object d(InputImage inputImage) throws Throwable {
        i iVar;
        InputImage inputImage2;
        synchronized (this) {
            try {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    this.f152210h.a(inputImage);
                    try {
                        ArrayList arrayListA = this.e.a(inputImage);
                        iVar = this;
                        inputImage2 = inputImage;
                        try {
                            iVar.e(zzpj.NO_ERROR, jElapsedRealtime, inputImage2, arrayListA);
                            k = false;
                            return arrayListA;
                        } catch (MlKitException e) {
                            e = e;
                            MlKitException mlKitException = e;
                            iVar.e(mlKitException.f49665a == 14 ? zzpj.MODEL_NOT_DOWNLOADED : zzpj.UNKNOWN_ERROR, jElapsedRealtime, inputImage2, null);
                            throw mlKitException;
                        }
                    } catch (MlKitException e2) {
                        e = e2;
                        iVar = this;
                        inputImage2 = inputImage;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    throw th;
                }
            } catch (Throwable th11) {
                th = th11;
            }
        }
    }

    public final void e(final zzpj zzpjVar, long j2, final InputImage inputImage, List list) {
        final zzcs zzcsVar = new zzcs();
        final zzcs zzcsVar2 = new zzcs();
        if (list != null) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                fh.a aVar = (fh.a) it8.next();
                zzpv zzpvVar = (zzpv) b.f152195a.get(aVar.a());
                if (zzpvVar == null) {
                    zzpvVar = zzpv.FORMAT_UNKNOWN;
                }
                zzcsVar.zzd(zzpvVar);
                zzpw zzpwVar = (zzpw) b.f152196b.get(aVar.b());
                if (zzpwVar == null) {
                    zzpwVar = zzpw.TYPE_UNKNOWN;
                }
                zzcsVar2.zzd(zzpwVar);
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        this.f.zzf(new zztw() { // from class: hh.g
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztw
            public final zztm zza() {
                zzpx zzpxVar = new zzpx();
                zzow zzowVar = new zzow();
                zzowVar.zzc(Long.valueOf(jElapsedRealtime));
                zzowVar.zzd(zzpjVar);
                zzowVar.zze(Boolean.valueOf(i.k));
                Boolean bool = Boolean.TRUE;
                zzowVar.zza(bool);
                zzowVar.zzb(bool);
                zzpxVar.zzh(zzowVar.zzf());
                i iVar = this.f152204a;
                zzpxVar.zzi(b.a(iVar.d));
                zzpxVar.zze(zzcsVar.zzf());
                zzpxVar.zzf(zzcsVar2.zzf());
                InputImage inputImage2 = inputImage;
                int i = inputImage2.f49669g;
                i.f152208j.getClass();
                int iB = jh.b.b(inputImage2);
                zzop zzopVar = new zzop();
                zzopVar.zza(i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzoq.UNKNOWN_FORMAT : zzoq.NV21 : zzoq.NV16 : zzoq.YV12 : zzoq.YUV_420_888 : zzoq.BITMAP);
                zzopVar.zzb(Integer.valueOf(iB));
                zzpxVar.zzg(zzopVar.zzd());
                zzpl zzplVar = new zzpl();
                zzplVar.zze(iVar.i ? zzpi.TYPE_THICK : zzpi.TYPE_THIN);
                zzplVar.zzg(zzpxVar.zzj());
                return zzua.zzf(zzplVar);
            }
        }, zzpk.ON_DEVICE_BARCODE_DETECT);
        zzft zzftVar = new zzft();
        zzftVar.zze(zzpjVar);
        zzftVar.zzf(Boolean.valueOf(k));
        zzftVar.zzg(b.a(this.d));
        zzftVar.zzc(zzcsVar.zzf());
        zzftVar.zzd(zzcsVar2.zzf());
        final zzfv zzfvVarZzh = zzftVar.zzh();
        final h hVar = new h(this);
        final zzpk zzpkVar = zzpk.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        q qVar = q.f24050zza;
        final zztx zztxVar = this.f;
        qVar.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zztu
            @Override // java.lang.Runnable
            public final void run() {
                zztxVar.zzh(zzpkVar, zzfvVarZzh, jElapsedRealtime, hVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j3 = jCurrentTimeMillis - jElapsedRealtime;
        this.f152209g.zzc(true != this.i ? 24301 : 24302, zzpjVar.zza(), j3, jCurrentTimeMillis);
    }
}
