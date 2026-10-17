package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "ActivityRecognitionRequestCreator")
@SafeParcelable.Reserved({1000})
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIntervalMillis", id = 1)
    private final long f46557zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTriggerUpdate", id = 2)
    private final boolean f46558zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWorkSource", id = 3)
    private final WorkSource f46559zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTag", id = 4)
    private final String f46560zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getNondefaultActivities", id = 5)
    private final int[] f46561zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRequestSensorData", id = 6)
    private final boolean f46562zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAccountName", id = 7)
    private final String f46563zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "ActivityRecognitionRequest.DEFAULT_MAX_REPORT_LATENCY_MILLIS", getter = "getMaxReportLatencyMillis", id = 8)
    private final long f46564zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getContextAttributionTag", id = 9)
    private String f46565zzi;

    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) WorkSource workSource, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) int[] iArr, @SafeParcelable.Param(id = 6) boolean z3, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) long j3, @SafeParcelable.Param(id = 9) String str3) {
        this.f46557zza = j2;
        this.f46558zzb = z;
        this.f46559zzc = workSource;
        this.f46560zzd = str;
        this.f46561zze = iArr;
        this.f46562zzf = z3;
        this.f46563zzg = str2;
        this.f46564zzh = j3;
        this.f46565zzi = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f46557zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f46558zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f46559zzc, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46560zzd, false);
        SafeParcelWriter.writeIntArray(parcel, 5, this.f46561zze, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f46562zzf);
        SafeParcelWriter.writeString(parcel, 7, this.f46563zzg, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f46564zzh);
        SafeParcelWriter.writeString(parcel, 9, this.f46565zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzb zza(String str) {
        this.f46565zzi = str;
        return this;
    }
}
