package hh;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpz;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzua;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.common.InputImage;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a extends jh.c implements BarcodeScanner {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final eh.a f152194g = new eh.a(0);
    public final boolean f;

    public a(eh.a aVar, i iVar, Executor executor, zztx zztxVar) {
        super(iVar, executor);
        boolean zC = b.c();
        this.f = zC;
        zzpx zzpxVar = new zzpx();
        zzpxVar.zzi(b.a(aVar));
        zzpz zzpzVarZzj = zzpxVar.zzj();
        zzpl zzplVar = new zzpl();
        zzplVar.zze(zC ? zzpi.TYPE_THICK : zzpi.TYPE_THIN);
        zzplVar.zzg(zzpzVarZzj);
        zztxVar.zzd(zzua.zzg(zzplVar, 1), zzpk.ON_DEVICE_BARCODE_CREATE);
    }

    @Override // jh.c, java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    public final synchronized void close() {
        super.close();
    }

    @Override // ph.a
    public final int getDetectorType() {
        return 1;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f ? ch.k.f24030a : new Feature[]{ch.k.f24031b};
    }

    @Override // jh.c, com.google.mlkit.vision.barcode.BarcodeScanner
    public final Task process(InputImage inputImage) {
        return d(inputImage).onSuccessTask(new fkg.a(this, inputImage.m(), inputImage.i()));
    }
}
