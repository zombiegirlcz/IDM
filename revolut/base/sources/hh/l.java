package hh;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwc;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class l implements j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zzcv f152213h = zzcv.zzh("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f152214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f152215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f152216c;
    public final Context d;
    public final eh.a e;
    public final zztx f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzvt f152217g;

    public l(Context context, eh.a aVar, zztx zztxVar) {
        this.d = context;
        this.e = aVar;
        this.f = zztxVar;
    }

    @Override // hh.j
    public final ArrayList a(InputImage inputImage) throws MlKitException {
        if (this.f152217g == null) {
            zzc();
        }
        zzvt zzvtVar = (zzvt) Preconditions.checkNotNull(this.f152217g);
        if (!this.f152214a) {
            try {
                zzvtVar.zze();
                this.f152214a = true;
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to init barcode scanner.");
            }
        }
        int iM = inputImage.m();
        if (inputImage.h() == 35) {
            iM = ((Image.Plane[]) Preconditions.checkNotNull(inputImage.k()))[0].getRowStride();
        }
        zzwc zzwcVar = new zzwc(inputImage.h(), iM, inputImage.i(), xam.a.g(inputImage.l()), SystemClock.elapsedRealtime());
        jh.b.f174101a.getClass();
        try {
            List listZzd = zzvtVar.zzd(jh.b.a(inputImage), zzwcVar);
            ArrayList arrayList = new ArrayList();
            Iterator it8 = listZzd.iterator();
            while (it8.hasNext()) {
                arrayList.add(new fh.a(new k((zzvj) it8.next(), 0), inputImage.g()));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new MlKitException(13, e2, "Failed to run barcode scanner.");
        }
    }

    public final zzvt b(DynamiteModule.VersionPolicy versionPolicy, String str, String str2) {
        Context context = this.d;
        return zzvv.zza(DynamiteModule.load(context, versionPolicy, str).instantiate(str2)).zzd(ObjectWrapper.wrap(context), new zzvl(this.e.f125676a, false));
    }

    @Override // hh.j
    public final void zzb() {
        zzvt zzvtVar = this.f152217g;
        if (zzvtVar != null) {
            try {
                zzvtVar.zzf();
            } catch (RemoteException e) {
            }
            this.f152217g = null;
            this.f152214a = false;
        }
    }

    @Override // hh.j
    public final boolean zzc() throws MlKitException {
        if (this.f152217g != null) {
            return this.f152215b;
        }
        Context context = this.d;
        int localVersion = DynamiteModule.getLocalVersion(context, "com.google.mlkit.dynamite.barcode");
        zztx zztxVar = this.f;
        if (localVersion > 0) {
            this.f152215b = true;
            try {
                this.f152217g = b(DynamiteModule.PREFER_LOCAL, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to create thick barcode scanner.");
            } catch (DynamiteModule.LoadingException e2) {
                throw new MlKitException(13, e2, "Failed to load the bundled barcode module.");
            }
        } else {
            boolean zAreModulesAvailable = false;
            this.f152215b = false;
            Feature[] featureArr = ch.k.f24030a;
            int apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
            zzcv zzcvVar = f152213h;
            if (apkVersion >= 221500000) {
                final Feature[] featureArrC = ch.k.c(zzcvVar, ch.k.f24038n);
                try {
                    zAreModulesAvailable = ((ModuleAvailabilityResponse) Tasks.await(ModuleInstall.getClient(context).areModulesAvailable(new OptionalModuleApi() { // from class: ch.w
                        @Override // com.google.android.gms.common.api.OptionalModuleApi
                        public final Feature[] getOptionalFeatures() {
                            Feature[] featureArr2 = k.f24030a;
                            return featureArrC;
                        }
                    }).addOnFailureListener(new p96.a(6)))).areModulesAvailable();
                } catch (InterruptedException | ExecutionException e4) {
                }
            } else {
                try {
                    Iterator it8 = zzcvVar.iterator();
                    while (it8.hasNext()) {
                        DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, (String) it8.next());
                    }
                    zAreModulesAvailable = true;
                } catch (DynamiteModule.LoadingException unused) {
                }
            }
            if (!zAreModulesAvailable) {
                if (!this.f152216c) {
                    ch.k.a(context, zzcv.zzh("barcode", "tflite_dynamite"));
                    this.f152216c = true;
                }
                b.b(zztxVar, zzpj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f152217g = b(DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e5) {
                b.b(zztxVar, zzpj.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException(13, e5, "Failed to create thin barcode scanner.");
            }
        }
        b.b(zztxVar, zzpj.NO_ERROR);
        return this.f152215b;
    }
}
