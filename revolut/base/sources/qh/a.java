package qh;

import android.graphics.Matrix;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends hd.e {
    public final List d;

    public a(zzvb zzvbVar, Matrix matrix) {
        super(zzvbVar.zze(), zzvbVar.zzc(), zzvbVar.zzf(), zzvbVar.zzd(), matrix);
        zzvbVar.zzb();
        zzvbVar.zza();
        List listZzg = zzvbVar.zzg();
        this.d = zzbu.zza(listZzg == null ? new ArrayList() : listZzg, new e(matrix, 0));
    }
}
