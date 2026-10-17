package qh;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvj;
import com.google.android.gms.internal.mlkit_vision_text_common.zzy;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class e implements zzu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Matrix f246387b;

    public /* synthetic */ e(Matrix matrix, int i) {
        this.f246386a = i;
        this.f246387b = matrix;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public final Object zza(Object obj2) {
        switch (this.f246386a) {
            case 0:
                zzvj zzvjVar = (zzvj) obj2;
                b bVar = new b(zzvjVar.zzd(), zzvjVar.zzc(), zzvjVar.zze(), "", this.f246387b);
                zzvjVar.zzb();
                zzvjVar.zza();
                return bVar;
            default:
                zzr zzrVar = (zzr) obj2;
                zzv zzvVar = rh.d.f254283a;
                List listR = hx7.a.R(zzrVar.f44923zzb);
                String str = zzy.zzb(zzrVar.f44925zzd) ? "" : zzrVar.f44925zzd;
                Rect rectP = hx7.a.P(listR);
                String str2 = zzy.zzb(zzrVar.f44927zzf) ? "und" : zzrVar.f44927zzf;
                float f = zzrVar.f44923zzb.f44571zze;
                zzbk.zzh();
                return new a(str, rectP, listR, str2, this.f246387b);
        }
    }
}
