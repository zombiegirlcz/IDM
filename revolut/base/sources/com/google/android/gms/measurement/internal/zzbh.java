package com.google.android.gms.measurement.internal;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final String f46951zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final zzbf f46952zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public final String f46953zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    public final long f46954zzd;

    public zzbh(zzbh zzbhVar, long j2) {
        Preconditions.checkNotNull(zzbhVar);
        this.f46951zza = zzbhVar.f46951zza;
        this.f46952zzb = zzbhVar.f46952zzb;
        this.f46953zzc = zzbhVar.f46953zzc;
        this.f46954zzd = j2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f46952zzb);
        StringBuilder sb6 = new StringBuilder("origin=");
        sb6.append(this.f46953zzc);
        sb6.append(",name=");
        return d.u(sb6, this.f46951zza, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzbi.zza(this, parcel, i);
    }

    @SafeParcelable.Constructor
    public zzbh(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) zzbf zzbfVar, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) long j2) {
        this.f46951zza = str;
        this.f46952zzb = zzbfVar;
        this.f46953zzc = str2;
        this.f46954zzd = j2;
    }
}
