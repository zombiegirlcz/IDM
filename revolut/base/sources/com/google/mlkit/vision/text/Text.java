package com.google.mlkit.vision.text;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import hd.e;
import java.util.ArrayList;
import java.util.List;
import om4.d0;
import qh.d;

/* JADX INFO: loaded from: classes17.dex */
public final class Text {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f49674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49675b;

    public Text(zzvf zzvfVar, Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.f49674a = arrayList;
        this.f49675b = zzvfVar.zza();
        arrayList.addAll(zzbu.zza(zzvfVar.zzb(), new d(matrix, 0)));
    }

    public Text(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.f49674a = arrayList;
        arrayList.addAll(list);
        this.f49675b = str;
    }

    public static class Line extends e {
        public final List d;

        public Line(zzvd zzvdVar, Matrix matrix) {
            super(zzvdVar.zze(), zzvdVar.zzc(), zzvdVar.zzf(), zzvdVar.zzd(), matrix);
            this.d = zzbu.zza(zzvdVar.zzg(), new d0(matrix, 6));
        }

        public Line(String str, Rect rect, List list, String str2, Matrix matrix, List list2) {
            super(str, rect, list, str2, matrix);
            this.d = list2;
        }
    }
}
