package com.google.mlkit.vision.face;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;

/* JADX INFO: loaded from: classes.dex */
public final class FaceDetectorOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49673c;
    public final int d;
    public final float e;

    public /* synthetic */ FaceDetectorOptions(int i, int i2, int i3, int i5, float f) {
        this.f49671a = i;
        this.f49672b = i2;
        this.f49673c = i3;
        this.d = i5;
        this.e = f;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof FaceDetectorOptions)) {
            return false;
        }
        FaceDetectorOptions faceDetectorOptions = (FaceDetectorOptions) obj2;
        if (Float.floatToIntBits(this.e) != Float.floatToIntBits(faceDetectorOptions.e) || !Objects.equal(Integer.valueOf(this.f49671a), Integer.valueOf(faceDetectorOptions.f49671a)) || !Objects.equal(Integer.valueOf(this.f49672b), Integer.valueOf(faceDetectorOptions.f49672b)) || !Objects.equal(Integer.valueOf(this.d), Integer.valueOf(faceDetectorOptions.d))) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        return Objects.equal(bool, bool) && Objects.equal(Integer.valueOf(this.f49673c), Integer.valueOf(faceDetectorOptions.f49673c)) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Float.floatToIntBits(this.e)), Integer.valueOf(this.f49671a), Integer.valueOf(this.f49672b), Integer.valueOf(this.d), Boolean.FALSE, Integer.valueOf(this.f49673c), null);
    }

    public final String toString() {
        zzv zzvVarZza = zzw.zza("FaceDetectorOptions");
        zzvVarZza.zzb("landmarkMode", this.f49671a);
        zzvVarZza.zzb("contourMode", this.f49672b);
        zzvVarZza.zzb("classificationMode", this.f49673c);
        zzvVarZza.zzb("performanceMode", this.d);
        zzvVarZza.zzd("trackingEnabled", false);
        zzvVarZza.zza("minFaceSize", this.e);
        return zzvVarZza.toString();
    }
}
