package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "LocationRequestInternalCreator")
@SafeParcelable.Reserved({2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1000})
@Deprecated
public final class zzeg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeg> CREATOR = new zzeh();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "null", id = 1)
    LocationRequest f39733zza;

    @SafeParcelable.Constructor
    public zzeg(@SafeParcelable.Param(id = 1) LocationRequest locationRequest, @SafeParcelable.RemovedParam(defaultValueUnchecked = "null", id = 5) List list, @SafeParcelable.RemovedParam(defaultValue = "false", id = 8) boolean z, @SafeParcelable.RemovedParam(defaultValue = "false", id = 9) boolean z3, @SafeParcelable.RemovedParam(defaultValue = "false", id = 11) boolean z4, @SafeParcelable.RemovedParam(defaultValue = "false", id = 12) boolean z6, @SafeParcelable.RemovedParam(defaultValueUnchecked = "null", id = 13) String str, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", id = 14) long j2) {
        WorkSource workSource;
        LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it8.next();
                    WorkSourceUtil.add(workSource, clientIdentity.f38029uid, clientIdentity.packageName);
                }
            }
            builder.zzc(workSource);
        }
        if (z) {
            builder.setGranularity(1);
        }
        if (z3) {
            builder.zza(2);
        }
        if (z4) {
            builder.zzb(true);
        }
        if (z6) {
            builder.setWaitForAccurateLocation(true);
        }
        if (j2 != Long.MAX_VALUE) {
            builder.setMaxUpdateAgeMillis(j2);
        }
        this.f39733zza = builder.build();
    }

    @Deprecated
    public static zzeg zza(String str, LocationRequest locationRequest) {
        return new zzeg(locationRequest, null, false, false, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzeg) {
            return Objects.equal(this.f39733zza, ((zzeg) obj2).f39733zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39733zza.hashCode();
    }

    public final String toString() {
        return this.f39733zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f39733zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
