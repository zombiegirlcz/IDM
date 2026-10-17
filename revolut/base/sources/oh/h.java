package oh;

import android.os.SystemClock;
import ch.q;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_face.zzdl;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzke;
import com.google.android.gms.internal.mlkit_vision_face.zzkf;
import com.google.android.gms.internal.mlkit_vision_face.zzkj;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoe;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import oh.g;

/* JADX INFO: loaded from: classes.dex */
public final class h extends ch.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicBoolean f225257j = new AtomicBoolean(true);
    public static final jh.b k = jh.b.f174101a;
    public final FaceDetectorOptions d;
    public final zzoc e;
    public final zzoe f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f225258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f225259h;
    public final jh.a i = new jh.a();

    public h(zzoc zzocVar, FaceDetectorOptions faceDetectorOptions, c cVar) {
        Preconditions.checkNotNull(faceDetectorOptions, "FaceDetectorOptions can not be null");
        this.d = faceDetectorOptions;
        this.e = zzocVar;
        this.f225258g = cVar;
        this.f = zzoe.zza(ch.h.c().b());
    }

    public static void e(ArrayList arrayList) {
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((mh.a) it8.next()).f();
        }
    }

    @Override // ch.f
    public final synchronized void b() {
        this.f225259h = this.f225258g.zzd();
    }

    @Override // ch.f
    public final synchronized void c() {
        try {
            this.f225258g.zzb();
            f225257j.set(true);
            zzoc zzocVar = this.e;
            zzku zzkuVar = new zzku();
            zzkuVar.zze(this.f225259h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
            zzocVar.zzd(zzof.zzf(zzkuVar), zzkt.ON_DEVICE_FACE_CLOSE);
        } catch (Throwable th10) {
            throw th10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108 A[Catch: all -> 0x002b, MlKitException -> 0x002e, Merged into TryCatch #1 {all -> 0x002b, MlKitException -> 0x002e, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0033, B:42:0x0102, B:50:0x0118, B:49:0x0112, B:45:0x0108, B:19:0x0041, B:20:0x0048, B:21:0x0051, B:23:0x0057, B:24:0x0062, B:26:0x0068, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:34:0x00d9, B:36:0x00e4, B:39:0x00f1, B:41:0x00fa, B:53:0x0123, B:55:0x0129, B:58:0x0130, B:59:0x0139, B:57:0x012d), top: B:63:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0112 A[Catch: all -> 0x002b, MlKitException -> 0x002e, Merged into TryCatch #1 {all -> 0x002b, MlKitException -> 0x002e, blocks: (B:4:0x0005, B:5:0x000e, B:9:0x0021, B:10:0x002a, B:16:0x0033, B:42:0x0102, B:50:0x0118, B:49:0x0112, B:45:0x0108, B:19:0x0041, B:20:0x0048, B:21:0x0051, B:23:0x0057, B:24:0x0062, B:26:0x0068, B:28:0x0074, B:30:0x007a, B:32:0x0088, B:34:0x00d9, B:36:0x00e4, B:39:0x00f1, B:41:0x00fa, B:53:0x0123, B:55:0x0129, B:58:0x0130, B:59:0x0139, B:57:0x012d), top: B:63:0x0005 }] */
    @Override // ch.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.mlkit.vision.common.InputImage r20) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oh.h.d(com.google.mlkit.vision.common.InputImage):java.lang.Object");
    }

    public final synchronized void f(final zzks zzksVar, long j2, final InputImage inputImage, final int i, final int i2) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
        this.e.zzf(new zzoa() { // from class: oh.f
            @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
            public final zznr zza() {
                zzlj zzljVar = new zzlj();
                zzkj zzkjVar = new zzkj();
                zzkjVar.zzc(Long.valueOf(jElapsedRealtime));
                zzkjVar.zzd(zzksVar);
                zzkjVar.zze(Boolean.valueOf(h.f225257j.get()));
                Boolean bool = Boolean.TRUE;
                zzkjVar.zza(bool);
                zzkjVar.zzb(bool);
                zzljVar.zzg(zzkjVar.zzf());
                h hVar = this.f225253a;
                zzljVar.zze(i.a(hVar.d));
                zzljVar.zzd(Integer.valueOf(i));
                zzljVar.zzh(Integer.valueOf(i2));
                h.k.getClass();
                InputImage inputImage2 = inputImage;
                int i3 = inputImage2.f49669g;
                int iB = jh.b.b(inputImage2);
                zzke zzkeVar = new zzke();
                zzkeVar.zza(i3 != -1 ? i3 != 35 ? i3 != 842094169 ? i3 != 16 ? i3 != 17 ? zzkf.UNKNOWN_FORMAT : zzkf.NV21 : zzkf.NV16 : zzkf.YV12 : zzkf.YUV_420_888 : zzkf.BITMAP);
                zzkeVar.zzb(Integer.valueOf(iB));
                zzljVar.zzf(zzkeVar.zzd());
                zzll zzllVarZzi = zzljVar.zzi();
                zzku zzkuVar = new zzku();
                zzkuVar.zze(hVar.f225259h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
                zzkuVar.zzg(zzllVarZzi);
                return zzof.zzf(zzkuVar);
            }
        }, zzkt.ON_DEVICE_FACE_DETECT);
        zzdl zzdlVar = new zzdl();
        zzdlVar.zzc(zzksVar);
        zzdlVar.zzd(Boolean.valueOf(f225257j.get()));
        zzdlVar.zza(Integer.valueOf(i));
        zzdlVar.zze(Integer.valueOf(i2));
        zzdlVar.zzb(i.a(this.d));
        final zzdn zzdnVarZzf = zzdlVar.zzf();
        final g gVar = new g(this);
        final zzoc zzocVar = this.e;
        final zzkt zzktVar = zzkt.AGGREGATED_ON_DEVICE_FACE_DETECTION;
        final byte[] bArr = null;
        q.f24050zza.execute(new Runnable(zzktVar, zzdnVarZzf, jElapsedRealtime, gVar, bArr) { // from class: com.google.android.gms.internal.mlkit_vision_face.zzny

            /* JADX INFO: renamed from: zzb, reason: collision with root package name */
            public final /* synthetic */ zzkt f44354zzb;

            /* JADX INFO: renamed from: zzc, reason: collision with root package name */
            public final /* synthetic */ Object f44355zzc;

            /* JADX INFO: renamed from: zzd, reason: collision with root package name */
            public final /* synthetic */ long f44356zzd;

            /* JADX INFO: renamed from: zze, reason: collision with root package name */
            public final /* synthetic */ g f44357zze;

            @Override // java.lang.Runnable
            public final void run() {
                this.f44353zza.zzh(this.f44354zzb, this.f44355zzc, this.f44356zzd, this.f44357zze);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f.zzc(true != this.f225259h ? 24303 : 24304, zzksVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }
}
