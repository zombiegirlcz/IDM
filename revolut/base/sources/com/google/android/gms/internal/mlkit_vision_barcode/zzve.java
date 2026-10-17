package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PersonNameParcelCreator")
public final class zzve extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzve> CREATOR = new zzvx();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFormattedName", id = 1)
    private final String f42576zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPronunciation", id = 2)
    private final String f42577zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPrefix", id = 3)
    private final String f42578zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFirst", id = 4)
    private final String f42579zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMiddle", id = 5)
    private final String f42580zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLast", id = 6)
    private final String f42581zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSuffix", id = 7)
    private final String f42582zzg;

    @SafeParcelable.Constructor
    public zzve(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) String str5, @SafeParcelable.Param(id = 6) String str6, @SafeParcelable.Param(id = 7) String str7) {
        this.f42576zza = str;
        this.f42577zzb = str2;
        this.f42578zzc = str3;
        this.f42579zzd = str4;
        this.f42580zze = str5;
        this.f42581zzf = str6;
        this.f42582zzg = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42576zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42577zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f42578zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f42579zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.f42580zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.f42581zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.f42582zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        return this.f42579zzd;
    }

    public final String zzb() {
        return this.f42576zza;
    }

    public final String zzc() {
        return this.f42581zzf;
    }

    public final String zzd() {
        return this.f42580zze;
    }

    public final String zze() {
        return this.f42578zzc;
    }

    public final String zzf() {
        return this.f42577zzb;
    }

    public final String zzg() {
        return this.f42582zzg;
    }
}
