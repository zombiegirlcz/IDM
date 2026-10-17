package oh;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
import com.google.android.gms.internal.mlkit_vision_face.zzj;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzl;
import com.google.android.gms.internal.mlkit_vision_face.zzm;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import e8.i0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes17.dex */
public final class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f225264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f225265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FaceDetectorOptions f225266c;
    public final int d;
    public final zzoc e;
    public zzj f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzj f225267g;

    public k(Context context, FaceDetectorOptions faceDetectorOptions, zzoc zzocVar) {
        this.f225265b = context;
        this.f225266c = faceDetectorOptions;
        this.d = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
        this.e = zzocVar;
    }

    @Override // oh.c
    public final Pair a(InputImage inputImage) throws MlKitException {
        ArrayList arrayListB;
        if (this.f == null && this.f225267g == null) {
            zzd();
        }
        zzj zzjVar = this.f;
        if (zzjVar == null && this.f225267g == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        ArrayList arrayListB2 = null;
        if (zzjVar != null) {
            arrayListB = b(zzjVar, inputImage);
            this.f225266c.getClass();
            h.e(arrayListB);
        } else {
            arrayListB = null;
        }
        zzj zzjVar2 = this.f225267g;
        if (zzjVar2 != null) {
            arrayListB2 = b(zzjVar2, inputImage);
            h.e(arrayListB2);
        }
        return new Pair(arrayListB, arrayListB2);
    }

    public final ArrayList b(zzj zzjVar, InputImage inputImage) throws MlKitException {
        zzf[] zzfVarArrZze;
        try {
            zzp zzpVar = new zzp(inputImage.d, inputImage.e, 0, SystemClock.elapsedRealtime(), xam.a.g(inputImage.f));
            if (inputImage.f49669g != 35 || this.d < 201500000) {
                zzfVarArrZze = zzjVar.zze(ObjectWrapper.wrap(yh5.b.k(inputImage)), zzpVar);
            } else {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(inputImage.k());
                zzfVarArrZze = zzjVar.zzf(ObjectWrapper.wrap(planeArr[0].getBuffer()), ObjectWrapper.wrap(planeArr[1].getBuffer()), ObjectWrapper.wrap(planeArr[2].getBuffer()), planeArr[0].getPixelStride(), planeArr[1].getPixelStride(), planeArr[2].getPixelStride(), planeArr[0].getRowStride(), planeArr[1].getRowStride(), planeArr[2].getRowStride(), zzpVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzf zzfVar : zzfVarArrZze) {
                arrayList.add(new mh.a(zzfVar, inputImage.f49670h));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to detect with legacy face detector");
        }
    }

    @Override // oh.c
    public final void zzb() {
        zzj zzjVar = this.f;
        if (zzjVar != null) {
            try {
                zzjVar.zzd();
            } catch (RemoteException e) {
            }
            this.f = null;
        }
        zzj zzjVar2 = this.f225267g;
        if (zzjVar2 != null) {
            try {
                zzjVar2.zzd();
            } catch (RemoteException e2) {
            }
            this.f225267g = null;
        }
    }

    @Override // oh.c
    public final boolean zzd() throws MlKitException {
        int i;
        int i2;
        int i3;
        int i5;
        int i6;
        int i21;
        Context context = this.f225265b;
        FaceDetectorOptions faceDetectorOptions = this.f225266c;
        boolean z = false;
        if (this.f != null || this.f225267g != null) {
            return false;
        }
        try {
            zzm zzmVarZza = zzl.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
            int i22 = faceDetectorOptions.f49672b;
            int i32 = faceDetectorOptions.d;
            int i33 = faceDetectorOptions.f49673c;
            int i43 = faceDetectorOptions.f49671a;
            if (i22 == 2) {
                if (this.f225267g == null) {
                    this.f225267g = zzmVarZza.zzd(iObjectWrapperWrap, new zzh(2, 2, 0, true, false, faceDetectorOptions.e));
                }
                if ((i43 == 2 || i33 == 2 || i32 == 2) && this.f == null) {
                    if (i32 == 1) {
                        i5 = 0;
                    } else {
                        if (i32 != 2) {
                            throw new IllegalArgumentException("Invalid mode type: " + i32);
                        }
                        i5 = 1;
                    }
                    if (i43 == 1) {
                        i6 = 0;
                    } else {
                        if (i43 != 2) {
                            throw new IllegalArgumentException("Invalid landmark type: " + i43);
                        }
                        i6 = 1;
                    }
                    if (i33 == 1) {
                        i21 = 0;
                    } else {
                        if (i33 != 2) {
                            throw new IllegalArgumentException("Invalid classification type: " + i33);
                        }
                        i21 = 1;
                    }
                    this.f = zzmVarZza.zzd(iObjectWrapperWrap, new zzh(i5, i6, i21, false, false, faceDetectorOptions.e));
                }
            } else if (this.f == null) {
                if (i32 == 1) {
                    i = 0;
                } else {
                    if (i32 != 2) {
                        throw new IllegalArgumentException("Invalid mode type: " + i32);
                    }
                    i = 1;
                }
                if (i43 == 1) {
                    i2 = 0;
                } else {
                    if (i43 != 2) {
                        throw new IllegalArgumentException("Invalid landmark type: " + i43);
                    }
                    i2 = 1;
                }
                if (i33 == 1) {
                    i3 = 0;
                } else {
                    if (i33 != 2) {
                        throw new IllegalArgumentException("Invalid classification type: " + i33);
                    }
                    i3 = 1;
                }
                this.f = zzmVarZza.zzd(iObjectWrapperWrap, new zzh(i, i2, i3, false, false, faceDetectorOptions.e));
            }
            if (this.f == null && this.f225267g == null && !this.f225264a) {
                Feature[] featureArr = ch.k.f24030a;
                ch.k.a(context, zzaf.zzh("barcode"));
                this.f225264a = true;
            }
            zzks zzksVar = zzks.NO_ERROR;
            AtomicReference atomicReference = i.f225260a;
            this.e.zzf(new i0(z, zzksVar), zzkt.ON_DEVICE_FACE_LOAD);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to create legacy face detector.");
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException(13, e2, "Failed to load deprecated vision dynamite module.");
        }
    }
}
