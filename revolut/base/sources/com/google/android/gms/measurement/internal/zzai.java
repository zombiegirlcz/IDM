package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new zzaj();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public String f46856zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public String f46857zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public zzqb f46858zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    public long f46859zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public boolean f46860zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    public String f46861zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    public final zzbh f46862zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    public long f46863zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    public zzbh f46864zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    public final long f46865zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    public final zzbh f46866zzk;

    public zzai(zzai zzaiVar) {
        Preconditions.checkNotNull(zzaiVar);
        this.f46856zza = zzaiVar.f46856zza;
        this.f46857zzb = zzaiVar.f46857zzb;
        this.f46858zzc = zzaiVar.f46858zzc;
        this.f46859zzd = zzaiVar.f46859zzd;
        this.f46860zze = zzaiVar.f46860zze;
        this.f46861zzf = zzaiVar.f46861zzf;
        this.f46862zzg = zzaiVar.f46862zzg;
        this.f46863zzh = zzaiVar.f46863zzh;
        this.f46864zzi = zzaiVar.f46864zzi;
        this.f46865zzj = zzaiVar.f46865zzj;
        this.f46866zzk = zzaiVar.f46866zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f46856zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46857zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f46858zzc, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f46859zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f46860zze);
        SafeParcelWriter.writeString(parcel, 7, this.f46861zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f46862zzg, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.f46863zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f46864zzi, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.f46865zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f46866zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzai(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzqb zzqbVar, @SafeParcelable.Param(id = 5) long j2, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) zzbh zzbhVar, @SafeParcelable.Param(id = 9) long j3, @SafeParcelable.Param(id = 10) zzbh zzbhVar2, @SafeParcelable.Param(id = 11) long j5, @SafeParcelable.Param(id = 12) zzbh zzbhVar3) {
        this.f46856zza = str;
        this.f46857zzb = str2;
        this.f46858zzc = zzqbVar;
        this.f46859zzd = j2;
        this.f46860zze = z;
        this.f46861zzf = str3;
        this.f46862zzg = zzbhVar;
        this.f46863zzh = j3;
        this.f46864zzi = zzbhVar2;
        this.f46865zzj = j5;
        this.f46866zzk = zzbhVar3;
    }
}
