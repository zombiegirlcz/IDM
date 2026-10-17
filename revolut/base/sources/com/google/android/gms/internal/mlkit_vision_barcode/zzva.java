package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ContactInfoParcelCreator")
public final class zzva extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzva> CREATOR = new zzvp();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getName", id = 1)
    private final zzve f42551zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getOrganization", id = 2)
    private final String f42552zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private final String f42553zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPhones", id = 4)
    private final zzvf[] f42554zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEmails", id = 5)
    private final zzvc[] f42555zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUrls", id = 6)
    private final String[] f42556zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAddresses", id = 7)
    private final zzux[] f42557zzg;

    @SafeParcelable.Constructor
    public zzva(@SafeParcelable.Param(id = 1) zzve zzveVar, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzvf[] zzvfVarArr, @SafeParcelable.Param(id = 5) zzvc[] zzvcVarArr, @SafeParcelable.Param(id = 6) String[] strArr, @SafeParcelable.Param(id = 7) zzux[] zzuxVarArr) {
        this.f42551zza = zzveVar;
        this.f42552zzb = str;
        this.f42553zzc = str2;
        this.f42554zzd = zzvfVarArr;
        this.f42555zze = zzvcVarArr;
        this.f42556zzf = strArr;
        this.f42557zzg = zzuxVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f42551zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42552zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f42553zzc, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f42554zzd, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f42555zze, i, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.f42556zzf, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.f42557zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzve zza() {
        return this.f42551zza;
    }

    public final String zzb() {
        return this.f42552zzb;
    }

    public final String zzc() {
        return this.f42553zzc;
    }

    public final zzux[] zzd() {
        return this.f42557zzg;
    }

    public final zzvc[] zze() {
        return this.f42555zze;
    }

    public final zzvf[] zzf() {
        return this.f42554zzd;
    }

    public final String[] zzg() {
        return this.f42556zzf;
    }
}
