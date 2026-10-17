package qh;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzy;
import com.google.mlkit.vision.text.Text;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class d implements zzu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Matrix f246385b;

    public /* synthetic */ d(Matrix matrix, int i) {
        this.f246384a = i;
        this.f246385b = matrix;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public final Object zza(Object obj2) {
        switch (this.f246384a) {
            case 0:
                return new com.google.mlkit.vision.text.a((zzuz) obj2, this.f246385b);
            default:
                zzl zzlVar = (zzl) obj2;
                zzv zzvVar = rh.d.f254283a;
                List listR = hx7.a.R(zzlVar.f44768zzb);
                String str = zzy.zzb(zzlVar.f44771zze) ? "" : zzlVar.f44771zze;
                Rect rectP = hx7.a.P(listR);
                String str2 = zzy.zzb(zzlVar.f44773zzg) ? "und" : zzlVar.f44773zzg;
                List listAsList = Arrays.asList(zzlVar.f44767zza);
                Matrix matrix = this.f246385b;
                List listZza = zzbu.zza(listAsList, new e(matrix, 1));
                float f = zzlVar.f44768zzb.f44571zze;
                return new Text.Line(str, rectP, listR, str2, matrix, listZza);
        }
    }
}
