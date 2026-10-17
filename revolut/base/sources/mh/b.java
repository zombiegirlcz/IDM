package mh;

import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f205339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f205340b;

    public b(int i, ArrayList arrayList) {
        this.f205339a = i;
        this.f205340b = arrayList;
    }

    public final String toString() {
        zzv zzvVarZza = zzw.zza("FaceContour");
        zzvVarZza.zzb("type", this.f205339a);
        zzvVarZza.zzc("points", this.f205340b.toArray());
        return zzvVarZza.toString();
    }
}
