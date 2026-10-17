package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "CalendarEventParcelCreator")
public final class zzuz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuz> CREATOR = new zzvo();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSummary", id = 1)
    private final String f42544zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDescription", id = 2)
    private final String f42545zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLocation", id = 3)
    private final String f42546zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getOrganizer", id = 4)
    private final String f42547zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatus", id = 5)
    private final String f42548zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStart", id = 6)
    private final zzuy f42549zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEnd", id = 7)
    private final zzuy f42550zzg;

    @SafeParcelable.Constructor
    public zzuz(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) String str5, @SafeParcelable.Param(id = 6) zzuy zzuyVar, @SafeParcelable.Param(id = 7) zzuy zzuyVar2) {
        this.f42544zza = str;
        this.f42545zzb = str2;
        this.f42546zzc = str3;
        this.f42547zzd = str4;
        this.f42548zze = str5;
        this.f42549zzf = zzuyVar;
        this.f42550zzg = zzuyVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42544zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42545zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f42546zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f42547zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.f42548zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f42549zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f42550zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzuy zza() {
        return this.f42550zzg;
    }

    public final zzuy zzb() {
        return this.f42549zzf;
    }

    public final String zzc() {
        return this.f42545zzb;
    }

    public final String zzd() {
        return this.f42546zzc;
    }

    public final String zze() {
        return this.f42547zzd;
    }

    public final String zzf() {
        return this.f42548zze;
    }

    public final String zzg() {
        return this.f42544zza;
    }
}
