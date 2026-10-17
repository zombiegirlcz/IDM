package rh;

import android.content.Context;
import android.os.RemoteException;
import ch.k;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzj;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f254280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzp f254281b = new zzp(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f254282c;
    public zzh d;

    public c(Context context) {
        this.f254280a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c8  */
    @Override // rh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.mlkit.vision.text.Text a(com.google.mlkit.vision.common.InputImage r32) throws com.google.mlkit.common.MlKitException {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.c.a(com.google.mlkit.vision.common.InputImage):com.google.mlkit.vision.text.Text");
    }

    @Override // rh.e
    public final void zzb() throws MlKitException {
        Context context = this.f254280a;
        if (this.d != null) {
            return;
        }
        try {
            zzh zzhVarZzd = zzj.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).zzd(ObjectWrapper.wrap(context), this.f254281b);
            this.d = zzhVarZzd;
            if (zzhVarZzd != null || this.f254282c) {
                return;
            }
            Feature[] featureArr = k.f24030a;
            k.a(context, zzaf.zzh("ocr"));
            this.f254282c = true;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to create legacy text recognizer.");
        } catch (DynamiteModule.LoadingException e2) {
            throw new MlKitException(13, e2, "Failed to load deprecated vision dynamite module.");
        }
    }

    @Override // rh.e
    public final void zzc() {
        zzh zzhVar = this.d;
        if (zzhVar != null) {
            try {
                zzhVar.zzd();
            } catch (RemoteException e) {
            }
            this.d = null;
        }
    }
}
