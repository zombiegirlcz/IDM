package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
public final class zzbf extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbf> CREATOR = new zzbg();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "z", id = 2)
    private final Bundle f46950zza;

    @SafeParcelable.Constructor
    public zzbf(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f46950zza = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzbe(this);
    }

    public final String toString() {
        return this.f46950zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzc(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f46950zza.size();
    }

    public final Bundle zzc() {
        return new Bundle(this.f46950zza);
    }

    public final Double zzd(String str) {
        return Double.valueOf(this.f46950zza.getDouble("value"));
    }

    public final Long zze(String str) {
        return Long.valueOf(this.f46950zza.getLong(str));
    }

    public final Object zzf(String str) {
        return this.f46950zza.get(str);
    }

    public final String zzg(String str) {
        return this.f46950zza.getString(str);
    }
}
