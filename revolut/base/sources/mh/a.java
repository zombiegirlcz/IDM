package mh;

import a0.d;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f205333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f205334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f205335c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f205336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f205337h;
    public final SparseArray i = new SparseArray();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseArray f205338j = new SparseArray();

    public a(zzf zzfVar, Matrix matrix) {
        float f = zzfVar.f43694zzc;
        float f4 = zzfVar.f43696zze / 2.0f;
        float f5 = zzfVar.f43695zzd;
        float f6 = zzfVar.f43697zzf / 2.0f;
        Rect rect = new Rect((int) (f - f4), (int) (f5 - f6), (int) (f + f4), (int) (f5 + f6));
        this.f205333a = rect;
        if (matrix != null) {
            xam.a.I(rect, matrix);
        }
        this.f205334b = zzfVar.f43693zzb;
        for (zzn zznVar : zzfVar.f43701zzj) {
            if (g(zznVar.f44338zzd)) {
                PointF pointF = new PointF(zznVar.f44336zzb, zznVar.f44337zzc);
                if (matrix != null) {
                    float[] fArr = {pointF.x, pointF.y};
                    matrix.mapPoints(fArr);
                    pointF.set(fArr[0], fArr[1]);
                }
                SparseArray sparseArray = this.i;
                int i = zznVar.f44338zzd;
                sparseArray.put(i, new c(i, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.zzn) {
            int i2 = zzdVar.f43566zzb;
            if (i2 <= 15 && i2 > 0) {
                PointF[] pointFArr = zzdVar.f43565zza;
                pointFArr.getClass();
                int length = pointFArr.length;
                long j2 = ((long) length) + 5 + ((long) (length / 10));
                ArrayList arrayList = new ArrayList(j2 > 2147483647L ? Integer.MAX_VALUE : (int) j2);
                Collections.addAll(arrayList, pointFArr);
                if (matrix != null) {
                    xam.a.H(arrayList, matrix);
                }
                this.f205338j.put(i2, new b(i2, arrayList));
            }
        }
        this.f = zzfVar.f43700zzi;
        this.f205336g = zzfVar.f43698zzg;
        this.f205337h = zzfVar.f43699zzh;
        this.e = zzfVar.zzm;
        this.d = zzfVar.f43702zzk;
        this.f205335c = zzfVar.f43703zzl;
    }

    public static boolean g(int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    public final Rect a() {
        return this.f205333a;
    }

    public final Float b() {
        float f = this.e;
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            return null;
        }
        return Float.valueOf(this.d);
    }

    public final Float c() {
        float f = this.f205335c;
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            return null;
        }
        return Float.valueOf(f);
    }

    public final SparseArray d() {
        return this.f205338j;
    }

    public final void e(SparseArray sparseArray) {
        SparseArray sparseArray2 = this.f205338j;
        sparseArray2.clear();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), (b) sparseArray.valueAt(i));
        }
    }

    public final void f() {
        this.f205334b = -1;
    }

    public final String toString() {
        zzv zzvVarZza = zzw.zza("Face");
        zzvVarZza.zzc("boundingBox", this.f205333a);
        zzvVarZza.zzb("trackingId", this.f205334b);
        zzvVarZza.zza("rightEyeOpenProbability", this.f205335c);
        zzvVarZza.zza("leftEyeOpenProbability", this.d);
        zzvVarZza.zza("smileProbability", this.e);
        zzvVarZza.zza("eulerX", this.f);
        zzvVarZza.zza("eulerY", this.f205336g);
        zzvVarZza.zza("eulerZ", this.f205337h);
        zzv zzvVarZza2 = zzw.zza("Landmarks");
        for (int i = 0; i <= 11; i++) {
            if (g(i)) {
                zzvVarZza2.zzc(d.n("landmark_", i), (c) this.i.get(i));
            }
        }
        zzvVarZza.zzc("landmarks", zzvVarZza2.toString());
        zzv zzvVarZza3 = zzw.zza("Contours");
        for (int i2 = 1; i2 <= 15; i2++) {
            zzvVarZza3.zzc(d.n("Contour_", i2), (b) this.f205338j.get(i2));
        }
        zzvVarZza.zzc("contours", zzvVarZza3.toString());
        return zzvVarZza.toString();
    }

    public a(zzow zzowVar, Matrix matrix) {
        Rect rectZzh = zzowVar.zzh();
        this.f205333a = rectZzh;
        if (matrix != null) {
            xam.a.I(rectZzh, matrix);
        }
        this.f205334b = zzowVar.zzg();
        for (zzpc zzpcVar : zzowVar.zzj()) {
            if (g(zzpcVar.zza())) {
                PointF pointFZzb = zzpcVar.zzb();
                if (matrix != null) {
                    float[] fArr = {pointFZzb.x, pointFZzb.y};
                    matrix.mapPoints(fArr);
                    pointFZzb.set(fArr[0], fArr[1]);
                }
                this.i.put(zzpcVar.zza(), new c(zzpcVar.zza(), pointFZzb));
            }
        }
        for (zzos zzosVar : zzowVar.zzi()) {
            int iZza = zzosVar.zza();
            if (iZza <= 15 && iZza > 0) {
                List listZzb = zzosVar.zzb();
                listZzb.getClass();
                ArrayList arrayList = new ArrayList(listZzb);
                if (matrix != null) {
                    xam.a.H(arrayList, matrix);
                }
                this.f205338j.put(iZza, new b(iZza, arrayList));
            }
        }
        this.f = zzowVar.zzf();
        this.f205336g = zzowVar.zzb();
        this.f205337h = -zzowVar.zzd();
        this.e = zzowVar.zze();
        this.d = zzowVar.zza();
        this.f205335c = zzowVar.zzc();
    }
}
