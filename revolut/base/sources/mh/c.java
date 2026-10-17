package mh;

import android.graphics.PointF;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f205341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f205342b;

    public c(int i, PointF pointF) {
        this.f205341a = i;
        this.f205342b = pointF;
    }

    public final String toString() {
        zzv zzvVarZza = zzw.zza("FaceLandmark");
        zzvVarZza.zzb("type", this.f205341a);
        zzvVarZza.zzc("position", this.f205342b);
        return zzvVarZza.toString();
    }
}
