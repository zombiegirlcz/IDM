package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "TextRecognizerOptionsCreator")
public final class zzvh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvh> CREATOR = new zzvi();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConfigLabel", id = 1)
    private final String f45049zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLoggingLibraryName", id = 2)
    private final String f45050zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getModelPath", id = 3)
    private final String f45051zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsMLKit", id = 4)
    private final boolean f45052zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDetectionTypeValue", id = 5)
    private final int f45053zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLanguageHint", id = 6)
    private final String f45054zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEnableLowLatencyInBackground", id = 7)
    private final boolean f45055zzg;

    @SafeParcelable.Constructor
    public zzvh(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) boolean z3) {
        this.f45049zza = str;
        this.f45050zzb = str2;
        this.f45051zzc = str3;
        this.f45054zzf = str4;
        this.f45053zze = i;
        this.f45052zzd = z;
        this.f45055zzg = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f45049zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.f45050zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f45051zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f45052zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.f45053zze);
        SafeParcelWriter.writeString(parcel, 6, this.f45054zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f45055zzg);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
