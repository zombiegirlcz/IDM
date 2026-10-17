package hh;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpj;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes17.dex */
public final class m implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f152218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f152219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzah f152220c;
    public final zztx d;
    public zzaj e;

    public m(Context context, eh.a aVar, zztx zztxVar) {
        zzah zzahVar = new zzah();
        this.f152220c = zzahVar;
        this.f152219b = context;
        zzahVar.f41238zza = aVar.f125676a;
        this.d = zztxVar;
    }

    @Override // hh.j
    public final ArrayList a(InputImage inputImage) throws MlKitException {
        zzu[] zzuVarArrZzf;
        if (this.e == null) {
            zzc();
        }
        zzaj zzajVar = this.e;
        if (zzajVar == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        zzaj zzajVar2 = (zzaj) Preconditions.checkNotNull(zzajVar);
        zzan zzanVar = new zzan(inputImage.d, inputImage.e, 0, 0L, xam.a.g(inputImage.f));
        try {
            int i = inputImage.f49669g;
            if (i == -1) {
                zzuVarArrZzf = zzajVar2.zzf(ObjectWrapper.wrap(inputImage.f49666a), zzanVar);
            } else if (i == 17) {
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(inputImage.f49667b), zzanVar);
            } else if (i == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(inputImage.k());
                zzanVar.f41240zza = planeArr[0].getRowStride();
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(planeArr[0].getBuffer()), zzanVar);
            } else {
                if (i != 842094169) {
                    throw new MlKitException("Unsupported image format: " + inputImage.f49669g, 3);
                }
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(yh5.b.k(inputImage)), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzuVarArrZzf) {
                arrayList.add(new fh.a(new k(zzuVar, 1), inputImage.f49670h));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to detect with legacy barcode detector");
        }
    }

    @Override // hh.j
    public final void zzb() {
        zzaj zzajVar = this.e;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException e) {
            }
            this.e = null;
        }
    }

    @Override // hh.j
    public final boolean zzc() throws MlKitException {
        Context context = this.f152219b;
        if (this.e != null) {
            return false;
        }
        try {
            zzaj zzajVarZzd = zzal.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(ObjectWrapper.wrap(context), this.f152220c);
            this.e = zzajVarZzd;
            zztx zztxVar = this.d;
            if (zzajVarZzd == null && !this.f152218a) {
                Feature[] featureArr = ch.k.f24030a;
                ch.k.a(context, zzaf.zzh("barcode"));
                this.f152218a = true;
                b.b(zztxVar, zzpj.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            b.b(zztxVar, zzpj.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to create legacy barcode detector.");
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException(13, e2, "Failed to load deprecated vision dynamite module.");
        }
    }
}
