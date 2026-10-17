package oh;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzoy;
import com.google.android.gms.internal.mlkit_vision_face.zzpa;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import e8.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f225245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FaceDetectorOptions f225246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f225247c;
    public boolean d;
    public boolean e;
    public final zzoc f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzoy f225248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzoy f225249h;

    public b(Context context, FaceDetectorOptions faceDetectorOptions, zzoc zzocVar) {
        this.f225245a = context;
        this.f225246b = faceDetectorOptions;
        this.f = zzocVar;
    }

    public static ArrayList d(zzoy zzoyVar, InputImage inputImage) throws MlKitException {
        if (inputImage.h() == -1) {
            inputImage = InputImage.c(yh5.b.k(inputImage), inputImage.m(), inputImage.i(), inputImage.l());
        }
        zzoq zzoqVar = new zzoq(inputImage.h(), inputImage.m(), inputImage.i(), xam.a.g(inputImage.l()), SystemClock.elapsedRealtime());
        jh.b.f174101a.getClass();
        try {
            List listZzd = zzoyVar.zzd(jh.b.a(inputImage), zzoqVar);
            ArrayList arrayList = new ArrayList();
            Iterator it8 = listZzd.iterator();
            while (it8.hasNext()) {
                arrayList.add(new mh.a((zzow) it8.next(), inputImage.g()));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to run face detector.");
        }
    }

    @Override // oh.c
    public final Pair a(InputImage inputImage) throws MlKitException {
        ArrayList arrayListD;
        if (this.f225249h == null && this.f225248g == null) {
            zzd();
        }
        if (!this.f225247c) {
            try {
                zzoy zzoyVar = this.f225249h;
                if (zzoyVar != null) {
                    zzoyVar.zze();
                }
                zzoy zzoyVar2 = this.f225248g;
                if (zzoyVar2 != null) {
                    zzoyVar2.zze();
                }
                this.f225247c = true;
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to init face detector.");
            }
        }
        zzoy zzoyVar3 = this.f225249h;
        ArrayList arrayListD2 = null;
        if (zzoyVar3 != null) {
            arrayListD = d(zzoyVar3, inputImage);
            this.f225246b.getClass();
            h.e(arrayListD);
        } else {
            arrayListD = null;
        }
        zzoy zzoyVar4 = this.f225248g;
        if (zzoyVar4 != null) {
            arrayListD2 = d(zzoyVar4, inputImage);
            h.e(arrayListD2);
        }
        return new Pair(arrayListD, arrayListD2);
    }

    public final void b() {
        FaceDetectorOptions faceDetectorOptions = this.f225246b;
        if (faceDetectorOptions.f49672b != 2) {
            if (this.f225249h == null) {
                this.f225249h = c(new zzou(faceDetectorOptions.d, faceDetectorOptions.f49671a, faceDetectorOptions.f49673c, 1, false, faceDetectorOptions.e));
                return;
            }
            return;
        }
        if (this.f225248g == null) {
            this.f225248g = c(new zzou(faceDetectorOptions.d, 1, 1, 2, false, faceDetectorOptions.e));
        }
        if ((faceDetectorOptions.f49671a == 2 || faceDetectorOptions.f49673c == 2 || faceDetectorOptions.d == 2) && this.f225249h == null) {
            this.f225249h = c(new zzou(faceDetectorOptions.d, faceDetectorOptions.f49671a, faceDetectorOptions.f49673c, 1, false, faceDetectorOptions.e));
        }
    }

    public final zzoy c(zzou zzouVar) {
        boolean z = this.d;
        Context context = this.f225245a;
        return z ? zzpa.zza(DynamiteModule.load(context, DynamiteModule.PREFER_LOCAL, "com.google.mlkit.dynamite.face").instantiate("com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator")).zzd(ObjectWrapper.wrap(context), zzouVar) : zzpa.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.face").instantiate("com.google.android.gms.vision.face.mlkit.FaceDetectorCreator")).zzd(ObjectWrapper.wrap(context), zzouVar);
    }

    @Override // oh.c
    public final void zzb() {
        try {
            zzoy zzoyVar = this.f225249h;
            if (zzoyVar != null) {
                zzoyVar.zzf();
                this.f225249h = null;
            }
            zzoy zzoyVar2 = this.f225248g;
            if (zzoyVar2 != null) {
                zzoyVar2.zzf();
                this.f225248g = null;
            }
        } catch (RemoteException e) {
        }
        this.f225247c = false;
    }

    @Override // oh.c
    public final boolean zzd() throws MlKitException {
        if (this.f225249h != null || this.f225248g != null) {
            return this.d;
        }
        Context context = this.f225245a;
        int localVersion = DynamiteModule.getLocalVersion(context, "com.google.mlkit.dynamite.face");
        zzoc zzocVar = this.f;
        if (localVersion > 0) {
            this.d = true;
            try {
                b();
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to create thick face detector.");
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException(13, e2, "Failed to load the bundled face module.");
            }
        } else {
            this.d = false;
            try {
                b();
            } catch (RemoteException e4) {
                boolean z = this.d;
                zzks zzksVar = zzks.OPTIONAL_MODULE_INIT_ERROR;
                AtomicReference atomicReference = i.f225260a;
                zzocVar.zzf(new i0(z, zzksVar), zzkt.ON_DEVICE_FACE_LOAD);
                throw new MlKitException(13, e4, "Failed to create thin face detector.");
            } catch (DynamiteModule.LoadingException e5) {
                if (!this.e) {
                    Feature[] featureArr = ch.k.f24030a;
                    ch.k.a(context, zzaf.zzh("face"));
                    this.e = true;
                }
                boolean z3 = this.d;
                zzks zzksVar2 = zzks.OPTIONAL_MODULE_NOT_AVAILABLE;
                AtomicReference atomicReference2 = i.f225260a;
                zzocVar.zzf(new i0(z3, zzksVar2), zzkt.ON_DEVICE_FACE_LOAD);
                throw new MlKitException(14, e5, "Waiting for the face module to be downloaded. Please wait.");
            }
        }
        boolean z4 = this.d;
        zzks zzksVar3 = zzks.NO_ERROR;
        AtomicReference atomicReference3 = i.f225260a;
        zzocVar.zzf(new i0(z4, zzksVar3), zzkt.ON_DEVICE_FACE_LOAD);
        return this.d;
    }
}
