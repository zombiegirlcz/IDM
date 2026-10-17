package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "EmailParcelCreator")
public final class zzvc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvc> CREATOR = new zzvr();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getType", id = 1)
    private final int f42570zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAddress", id = 2)
    private final String f42571zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSubject", id = 3)
    private final String f42572zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBody", id = 4)
    private final String f42573zzd;

    @SafeParcelable.Constructor
    public zzvc(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3) {
        this.f42570zza = i;
        this.f42571zzb = str;
        this.f42572zzc = str2;
        this.f42573zzd = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f42570zza);
        SafeParcelWriter.writeString(parcel, 2, this.f42571zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f42572zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f42573zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f42570zza;
    }

    public final String zzb() {
        return this.f42571zzb;
    }

    public final String zzc() {
        return this.f42573zzd;
    }

    public final String zzd() {
        return this.f42572zzc;
    }
}
