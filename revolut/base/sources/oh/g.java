package oh;

import com.google.android.gms.internal.mlkit_vision_face.zzdk;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzjv;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzof;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f225256a;

    public /* synthetic */ g(h hVar) {
        this.f225256a = hVar;
    }

    public final zznr a(Object obj2, int i, zzjv zzjvVar) {
        zzdn zzdnVar = (zzdn) obj2;
        h hVar = this.f225256a;
        hVar.getClass();
        zzku zzkuVar = new zzku();
        zzkuVar.zze(hVar.f225259h ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzdk zzdkVar = new zzdk();
        zzdkVar.zza(Integer.valueOf(i));
        zzdkVar.zzc(zzdnVar);
        zzdkVar.zzb(zzjvVar);
        zzkuVar.zzd(zzdkVar.zze());
        return zzof.zzf(zzkuVar);
    }
}
