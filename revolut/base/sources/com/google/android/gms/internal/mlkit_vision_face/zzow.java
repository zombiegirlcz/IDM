package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "FaceParcelCreator")
public final class zzow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzow> CREATOR = new zzox();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getId", id = 1)
    private final int f44402zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBoundingBox", id = 2)
    private final Rect f44403zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRollAngle", id = 3)
    private final float f44404zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPanAngle", id = 4)
    private final float f44405zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTiltAngle", id = 5)
    private final float f44406zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLeftEyeOpenProbability", id = 6)
    private final float f44407zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRightEyeOpenProbability", id = 7)
    private final float f44408zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSmileProbability", id = 8)
    private final float f44409zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConfidenceScore", id = 9)
    private final float f44410zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLandmarkParcelList", id = 10)
    private final List f44411zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getContourParcelList", id = 11)
    private final List f44412zzk;

    @SafeParcelable.Constructor
    public zzow(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Rect rect, @SafeParcelable.Param(id = 3) float f, @SafeParcelable.Param(id = 4) float f4, @SafeParcelable.Param(id = 5) float f5, @SafeParcelable.Param(id = 6) float f6, @SafeParcelable.Param(id = 7) float f32, @SafeParcelable.Param(id = 8) float f35, @SafeParcelable.Param(id = 9) float f36, @SafeParcelable.Param(id = 10) List list, @SafeParcelable.Param(id = 11) List list2) {
        this.f44402zza = i;
        this.f44403zzb = rect;
        this.f44404zzc = f;
        this.f44405zzd = f4;
        this.f44406zze = f5;
        this.f44407zzf = f6;
        this.f44408zzg = f32;
        this.f44409zzh = f35;
        this.f44410zzi = f36;
        this.f44411zzj = list;
        this.f44412zzk = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f44402zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f44403zzb, i, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.f44404zzc);
        SafeParcelWriter.writeFloat(parcel, 4, this.f44405zzd);
        SafeParcelWriter.writeFloat(parcel, 5, this.f44406zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.f44407zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.f44408zzg);
        SafeParcelWriter.writeFloat(parcel, 8, this.f44409zzh);
        SafeParcelWriter.writeFloat(parcel, 9, this.f44410zzi);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f44411zzj, false);
        SafeParcelWriter.writeTypedList(parcel, 11, this.f44412zzk, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final float zza() {
        return this.f44407zzf;
    }

    public final float zzb() {
        return this.f44405zzd;
    }

    public final float zzc() {
        return this.f44408zzg;
    }

    public final float zzd() {
        return this.f44404zzc;
    }

    public final float zze() {
        return this.f44409zzh;
    }

    public final float zzf() {
        return this.f44406zze;
    }

    public final int zzg() {
        return this.f44402zza;
    }

    public final Rect zzh() {
        return this.f44403zzb;
    }

    public final List zzi() {
        return this.f44412zzk;
    }

    public final List zzj() {
        return this.f44411zzj;
    }
}
