package rh;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import com.google.mlkit.vision.text.TextRecognizer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f extends jh.c implements TextRecognizer {
    public final qh.c f;

    public f(a aVar, Executor executor, zzuc zzucVar, qh.c cVar) {
        super(aVar, executor);
        this.f = cVar;
        zzow zzowVar = new zzow();
        zzowVar.zze(cVar.c() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzrx zzrxVar = new zzrx();
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(gc0.c.B(cVar.e()));
        zzrxVar.zze(zzsaVar.zzc());
        zzowVar.zzh(zzrxVar.zzf());
        zzucVar.zzd(zzuf.zzg(zzowVar, 1), zzov.ON_DEVICE_TEXT_CREATE);
    }

    @Override // ph.a
    public final int getDetectorType() {
        return 4;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return gj7.b.X(this.f);
    }
}
