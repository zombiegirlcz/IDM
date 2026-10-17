package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "LineBoxParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final zzr[] f44767zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final zzf f44768zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public final zzf f44769zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    public final zzf f44770zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public final String f44771zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    public final float f44772zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    public final String f44773zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    public final int f44774zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    public final boolean f44775zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    public final int f44776zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    public final int f44777zzk;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(id = 2) zzr[] zzrVarArr, @SafeParcelable.Param(id = 3) zzf zzfVar, @SafeParcelable.Param(id = 4) zzf zzfVar2, @SafeParcelable.Param(id = 5) zzf zzfVar3, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) float f, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) int i, @SafeParcelable.Param(id = 10) boolean z, @SafeParcelable.Param(id = 11) int i2, @SafeParcelable.Param(id = 12) int i3) {
        this.f44767zza = zzrVarArr;
        this.f44768zzb = zzfVar;
        this.f44769zzc = zzfVar2;
        this.f44770zzd = zzfVar3;
        this.f44771zze = str;
        this.f44772zzf = f;
        this.f44773zzg = str2;
        this.f44774zzh = i;
        this.f44775zzi = z;
        this.f44776zzj = i2;
        this.f44777zzk = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzr[] zzrVarArr = this.f44767zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, zzrVarArr, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f44768zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f44769zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f44770zzd, i, false);
        SafeParcelWriter.writeString(parcel, 6, this.f44771zze, false);
        SafeParcelWriter.writeFloat(parcel, 7, this.f44772zzf);
        SafeParcelWriter.writeString(parcel, 8, this.f44773zzg, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f44774zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f44775zzi);
        SafeParcelWriter.writeInt(parcel, 11, this.f44776zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.f44777zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
