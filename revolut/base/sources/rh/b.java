package rh;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import ch.k;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzux;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuy;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f254277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh.c f254278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f254279c;
    public boolean d;
    public final zzuc e;
    public zzuv f;

    public b(Context context, qh.c cVar, zzuc zzucVar) {
        this.f254277a = context;
        this.f254278b = cVar;
        this.e = zzucVar;
    }

    public static zzvh b(qh.c cVar) {
        int i;
        String strB = cVar.b();
        String strF = cVar.f();
        switch (cVar.e()) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 9;
                break;
            default:
                i = 1;
                break;
        }
        return new zzvh(strB, strF, null, true, i - 1, cVar.d(), false);
    }

    @Override // rh.e
    public final Text a(InputImage inputImage) throws MlKitException {
        if (this.f == null) {
            zzb();
        }
        zzuv zzuvVar = (zzuv) Preconditions.checkNotNull(this.f);
        boolean z = this.f254279c;
        qh.c cVar = this.f254278b;
        if (!z) {
            try {
                zzuvVar.zze();
                this.f254279c = true;
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to init text recognizer ".concat(cVar.a()));
            }
        }
        zzuq zzuqVar = new zzuq(inputImage.f49669g, inputImage.d, inputImage.e, xam.a.g(inputImage.f), SystemClock.elapsedRealtime());
        jh.b.f174101a.getClass();
        try {
            return new Text(zzuvVar.zzd(jh.b.a(inputImage), zzuqVar), inputImage.f49670h);
        } catch (RemoteException e2) {
            throw new MlKitException(13, e2, "Failed to run text recognizer ".concat(cVar.a()));
        }
    }

    @Override // rh.e
    public final void zzb() throws MlKitException {
        zzuv zzuvVarZzd;
        zzuc zzucVar = this.e;
        Context context = this.f254277a;
        qh.c cVar = this.f254278b;
        if (this.f != null) {
            return;
        }
        try {
            if (cVar.c()) {
                zzuvVarZzd = zzux.zza(DynamiteModule.load(context, DynamiteModule.PREFER_LOCAL, cVar.h()).instantiate("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).zze(ObjectWrapper.wrap(context), b(cVar));
            } else {
                zzuy zzuyVarZza = zzux.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, cVar.h()).instantiate("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"));
                zzuvVarZzd = cVar.e() == 1 ? zzuyVarZza.zzd(ObjectWrapper.wrap(context)) : zzuyVarZza.zze(ObjectWrapper.wrap(context), b(cVar));
            }
            this.f = zzuvVarZzd;
            zzucVar.zzf(new dki.h(cVar.c(), zzou.NO_ERROR), zzov.ON_DEVICE_TEXT_LOAD);
        } catch (RemoteException e) {
            zzucVar.zzf(new dki.h(cVar.c(), zzou.OPTIONAL_MODULE_INIT_ERROR), zzov.ON_DEVICE_TEXT_LOAD);
            throw new MlKitException(13, e, "Failed to create text recognizer ".concat(cVar.a()));
        } catch (DynamiteModule.LoadingException e2) {
            zzucVar.zzf(new dki.h(cVar.c(), zzou.OPTIONAL_MODULE_NOT_AVAILABLE), zzov.ON_DEVICE_TEXT_LOAD);
            if (cVar.c()) {
                throw new MlKitException(13, e2, a0.d.s("Failed to load text module ", cVar.a(), ". ", e2.getMessage()));
            }
            if (!this.d) {
                k.b(context, gj7.b.X(cVar));
                this.d = true;
            }
            throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // rh.e
    public final void zzc() {
        zzuv zzuvVar = this.f;
        if (zzuvVar != null) {
            try {
                zzuvVar.zzf();
            } catch (RemoteException e) {
                "Failed to release text recognizer ".concat(this.f254278b.a());
            }
            this.f = null;
        }
        this.f254279c = false;
    }
}
