package oh;

import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzjx;
import com.google.android.gms.internal.mlkit_vision_face.zzjy;
import com.google.android.gms.internal.mlkit_vision_face.zzjz;
import com.google.android.gms.internal.mlkit_vision_face.zzka;
import com.google.android.gms.internal.mlkit_vision_face.zzkb;
import com.google.android.gms.internal.mlkit_vision_face.zzkd;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f225260a = new AtomicReference();

    public static zzkd a(FaceDetectorOptions faceDetectorOptions) {
        zzjx zzjxVar = new zzjx();
        int i = faceDetectorOptions.f49671a;
        zzjxVar.zzd(i != 1 ? i != 2 ? zzka.UNKNOWN_LANDMARKS : zzka.ALL_LANDMARKS : zzka.NO_LANDMARKS);
        int i2 = faceDetectorOptions.f49673c;
        zzjxVar.zza(i2 != 1 ? i2 != 2 ? zzjy.UNKNOWN_CLASSIFICATIONS : zzjy.ALL_CLASSIFICATIONS : zzjy.NO_CLASSIFICATIONS);
        int i3 = faceDetectorOptions.d;
        zzjxVar.zzf(i3 != 1 ? i3 != 2 ? zzkb.UNKNOWN_PERFORMANCE : zzkb.ACCURATE : zzkb.FAST);
        int i5 = faceDetectorOptions.f49672b;
        zzjxVar.zzb(i5 != 1 ? i5 != 2 ? zzjz.UNKNOWN_CONTOURS : zzjz.ALL_CONTOURS : zzjz.NO_CONTOURS);
        zzjxVar.zzc(Boolean.FALSE);
        zzjxVar.zze(Float.valueOf(faceDetectorOptions.e));
        return zzjxVar.zzk();
    }

    public static boolean b() {
        AtomicReference atomicReference = f225260a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z = DynamiteModule.getLocalVersion(ch.h.c().b(), "com.google.mlkit.dynamite.face") > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }
}
