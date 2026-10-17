package rh;

import android.os.SystemClock;
import ch.m;
import ch.q;
import com.google.android.gms.internal.mlkit_vision_text_common.zzeq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzes;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzob;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zztr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzub;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzue;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends ch.f {
    public static boolean i = true;
    public final e d;
    public final zzuc e;
    public final zzue f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh.c f254276g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final jh.b f254275j = jh.b.f174101a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f254274h = new m();

    public a(zzuc zzucVar, e eVar, qh.c cVar) {
        super((cVar.e() == 8 || cVar.e() == 7) ? new m() : f254274h);
        this.e = zzucVar;
        this.d = eVar;
        this.f = zzue.zza(ch.h.c().b());
        this.f254276g = cVar;
    }

    @Override // ch.f
    public final synchronized void b() {
        this.d.zzb();
    }

    @Override // ch.f
    public final synchronized void c() {
        i = true;
        this.d.zzc();
    }

    @Override // ch.f
    public final Object d(InputImage inputImage) {
        Text textA;
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                textA = this.d.a(inputImage);
                f(jElapsedRealtime, zzou.NO_ERROR, inputImage);
                i = false;
            } catch (MlKitException e) {
                f(jElapsedRealtime, e.f49665a == 14 ? zzou.MODEL_NOT_DOWNLOADED : zzou.UNKNOWN_ERROR, inputImage);
                throw e;
            }
        }
        return textA;
    }

    public final zztr e(long j2, zzou zzouVar, InputImage inputImage) {
        zzrx zzrxVar = new zzrx();
        zzoh zzohVar = new zzoh();
        zzohVar.zzc(Long.valueOf(j2));
        zzohVar.zzd(zzouVar);
        zzohVar.zze(Boolean.valueOf(i));
        Boolean bool = Boolean.TRUE;
        zzohVar.zza(bool);
        zzohVar.zzb(bool);
        zzrxVar.zzd(zzohVar.zzf());
        f254275j.getClass();
        int i2 = inputImage.f49669g;
        int iB = jh.b.b(inputImage);
        zzoa zzoaVar = new zzoa();
        zzoaVar.zza(i2 != -1 ? i2 != 35 ? i2 != 842094169 ? i2 != 16 ? i2 != 17 ? zzob.UNKNOWN_FORMAT : zzob.NV21 : zzob.NV16 : zzob.YV12 : zzob.YUV_420_888 : zzob.BITMAP);
        zzoaVar.zzb(Integer.valueOf(iB));
        zzrxVar.zzc(zzoaVar.zzd());
        zzsa zzsaVar = new zzsa();
        qh.c cVar = this.f254276g;
        zzsaVar.zza(gc0.c.B(cVar.e()));
        zzrxVar.zze(zzsaVar.zzc());
        zzrz zzrzVarZzf = zzrxVar.zzf();
        zzow zzowVar = new zzow();
        zzowVar.zze(cVar.c() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzowVar.zzh(zzrzVarZzf);
        return zzuf.zzf(zzowVar);
    }

    public final void f(long j2, final zzou zzouVar, final InputImage inputImage) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        this.e.zzf(new zzub() { // from class: rh.i
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
            public final zztr zza() {
                return this.f254288a.e(jElapsedRealtime, zzouVar, inputImage);
            }
        }, zzov.ON_DEVICE_TEXT_DETECT);
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzouVar);
        zzeqVar.zzb(Boolean.valueOf(i));
        zzsa zzsaVar = new zzsa();
        qh.c cVar = this.f254276g;
        zzsaVar.zza(gc0.c.B(cVar.e()));
        zzeqVar.zzc(zzsaVar.zzc());
        final zzes zzesVarZzd = zzeqVar.zzd();
        final j jVar = new j(this);
        final zzov zzovVar = zzov.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
        q qVar = q.f24050zza;
        final zzuc zzucVar = this.e;
        qVar.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzua
            @Override // java.lang.Runnable
            public final void run() {
                zzucVar.zzh(zzovVar, zzesVarZzd, jElapsedRealtime, jVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iG = cVar.g();
        int iZza = zzouVar.zza();
        this.f.zzc(iG, iZza, jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }
}
