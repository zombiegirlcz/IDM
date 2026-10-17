package oh;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.android.gms.internal.mlkit_vision_face.zzon;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a extends jh.c implements FaceDetector {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FaceDetectorOptions f225244g = new FaceDetectorOptions(1, 1, 1, 1, 0.1f);
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(h hVar, ch.d dVar, FaceDetectorOptions faceDetectorOptions) {
        faceDetectorOptions.getClass();
        Executor executor = (Executor) dVar.f24016a.get();
        zzoc zzocVarZzb = zzon.zzb(true != i.b() ? "play-services-mlkit-face-detection" : "face-detection");
        super(hVar, executor);
        boolean zB = i.b();
        this.f = zB;
        zzku zzkuVar = new zzku();
        zzkuVar.zze(zB ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzlj zzljVar = new zzlj();
        zzljVar.zze(i.a(faceDetectorOptions));
        zzkuVar.zzg(zzljVar.zzi());
        zzocVarZzb.zzd(zzof.zzg(zzkuVar, 1), zzkt.ON_DEVICE_FACE_CREATE);
    }

    @Override // ph.a
    public final int getDetectorType() {
        return 2;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f ? ch.k.f24030a : new Feature[]{ch.k.f24032c};
    }
}
