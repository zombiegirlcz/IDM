package com.google.mlkit.vision.text;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import hd.e;
import java.util.List;
import pak.h;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends e {
    public final List d;

    public a(zzuz zzuzVar, Matrix matrix) {
        super(zzuzVar.zzc(), zzuzVar.zza(), zzuzVar.zzd(), zzuzVar.zzb(), matrix);
        this.d = zzbu.zza(zzuzVar.zze(), new h(matrix, 5));
    }

    public a(String str, Rect rect, List list, String str2, Matrix matrix, List list2) {
        super(str, rect, list, str2, matrix);
        this.d = list2;
    }
}
