package oh;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzon;
import com.google.mlkit.vision.face.FaceDetectorOptions;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ch.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.h f225252a;

    public e(ch.h hVar) {
        this.f225252a = hVar;
    }

    @Override // ch.e
    public final Object create(Object obj2) {
        FaceDetectorOptions faceDetectorOptions = (FaceDetectorOptions) obj2;
        Context contextB = this.f225252a.b();
        zzoc zzocVarZzb = zzon.zzb(true != i.b() ? "play-services-mlkit-face-detection" : "face-detection");
        return new h(zzon.zzb(true != i.b() ? "play-services-mlkit-face-detection" : "face-detection"), faceDetectorOptions, (DynamiteModule.getLocalVersion(contextB, "com.google.mlkit.dynamite.face") <= 0 && GoogleApiAvailabilityLight.getInstance().getApkVersion(contextB) < 204500000) ? new k(contextB, faceDetectorOptions, zzocVarZzb) : new b(contextB, faceDetectorOptions, zzocVarZzb));
    }
}
