package hh;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzol;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpl;
import com.google.android.gms.internal.mlkit_vision_barcode.zztm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzua;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f152207a;

    public final zztm a(Object obj2, int i, zzol zzolVar) {
        zzfv zzfvVar = (zzfv) obj2;
        i iVar = this.f152207a;
        iVar.getClass();
        zzpl zzplVar = new zzpl();
        zzplVar.zze(iVar.i ? zzpi.TYPE_THICK : zzpi.TYPE_THIN);
        zzfs zzfsVar = new zzfs();
        zzfsVar.zza(Integer.valueOf(i));
        zzfsVar.zzc(zzfvVar);
        zzfsVar.zzb(zzolVar);
        zzplVar.zzd(zzfsVar.zze());
        return zzua.zzf(zzplVar);
    }
}
