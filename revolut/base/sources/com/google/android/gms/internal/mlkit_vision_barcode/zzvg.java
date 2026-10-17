package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SmsParcelCreator")
public final class zzvg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvg> CREATOR = new zzvz();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMessage", id = 1)
    private final String f42585zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPhoneNumber", id = 2)
    private final String f42586zzb;

    @SafeParcelable.Constructor
    public zzvg(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.f42585zza = str;
        this.f42586zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42585zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42586zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        return this.f42585zza;
    }

    public final String zzb() {
        return this.f42586zzb;
    }
}
