package com.google.android.gms.internal.identity;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import j6.a;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "DeviceOrientationRequestInternalCreator")
public final class zzh extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_DEVICE_ORIENTATION_REQUEST", id = 1)
    final DeviceOrientationRequest f39771zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_CLIENTS", id = 2)
    final List f39772zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "null", id = 3)
    final String f39773zze;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final List f39769zza = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final DeviceOrientationRequest f39770zzb = new DeviceOrientationRequest.Builder(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT).build();
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    @SafeParcelable.Constructor
    public zzh(@SafeParcelable.Param(id = 1) DeviceOrientationRequest deviceOrientationRequest, @SafeParcelable.Param(id = 2) List list, @SafeParcelable.Param(id = 3) String str) {
        this.f39771zzc = deviceOrientationRequest;
        this.f39772zzd = list;
        this.f39773zze = str;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj2;
        return Objects.equal(this.f39771zzc, zzhVar.f39771zzc) && Objects.equal(this.f39772zzd, zzhVar.f39772zzd) && Objects.equal(this.f39773zze, zzhVar.f39773zze);
    }

    public final int hashCode() {
        return this.f39771zzc.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f39771zzc);
        String strValueOf2 = String.valueOf(this.f39772zzd);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        String str = this.f39773zze;
        StringBuilder sb6 = new StringBuilder(length + 68 + length2 + 7 + String.valueOf(str).length() + 2);
        a.D(sb6, "DeviceOrientationRequestInternal[deviceOrientationRequest=", strValueOf, ", clients=", strValueOf2);
        return d.u(sb6, ", tag='", str, "']");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f39771zzc, i, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f39772zzd, false);
        SafeParcelWriter.writeString(parcel, 3, this.f39773zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
