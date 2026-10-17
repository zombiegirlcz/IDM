package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "CalendarEventCreator")
@SafeParcelable.Reserved({1})
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzx();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public String f41814zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public String f41815zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public String f41816zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    public String f41817zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public String f41818zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    public zzj f41819zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    public zzj f41820zzg;

    public zzk() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f41814zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f41815zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.f41816zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.f41817zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.f41818zze, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f41819zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f41820zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) zzj zzjVar, @SafeParcelable.Param(id = 8) zzj zzjVar2) {
        this.f41814zza = str;
        this.f41815zzb = str2;
        this.f41816zzc = str3;
        this.f41817zzd = str4;
        this.f41818zze = str5;
        this.f41819zzf = zzjVar;
        this.f41820zzg = zzjVar2;
    }
}
