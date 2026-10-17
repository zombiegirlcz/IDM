package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.identity.zzer;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "DeviceOrientationRequestCreator")
@SafeParcelable.Reserved({1, 3, 4, 5})
public final class DeviceOrientationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceOrientationRequest> CREATOR = new zzn();
    public static final long OUTPUT_PERIOD_DEFAULT = 20000;
    public static final long OUTPUT_PERIOD_FAST = 5000;
    public static final long OUTPUT_PERIOD_MEDIUM = 10000;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSamplingPeriodMicros", id = 2)
    private final long f46449zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "false", getter = "isVelocityEnabled", id = 6)
    private final boolean f46450zzb;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private long f46451zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final boolean f46452zzb;

        public Builder(long j2) {
            this.f46452zzb = false;
            setSamplingPeriodMicros(j2);
        }

        @NonNull
        public DeviceOrientationRequest build() {
            return new DeviceOrientationRequest(this.f46451zza, this.f46452zzb);
        }

        @NonNull
        public Builder setSamplingPeriodMicros(long j2) {
            boolean z = false;
            if (j2 >= 0 && j2 < Long.MAX_VALUE) {
                z = true;
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(j2).length() + 102);
            sb6.append("Invalid interval: ");
            sb6.append(j2);
            sb6.append(" should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
            zzer.zzb(z, sb6.toString());
            this.f46451zza = j2;
            return this;
        }

        public Builder(@NonNull DeviceOrientationRequest deviceOrientationRequest) {
            this.f46451zza = deviceOrientationRequest.zza();
            this.f46452zzb = deviceOrientationRequest.zzb();
        }
    }

    @SafeParcelable.Constructor
    public DeviceOrientationRequest(@SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 6) boolean z) {
        this.f46449zza = j2;
        this.f46450zzb = z;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeviceOrientationRequest)) {
            return false;
        }
        DeviceOrientationRequest deviceOrientationRequest = (DeviceOrientationRequest) obj2;
        return this.f46449zza == deviceOrientationRequest.f46449zza && this.f46450zzb == deviceOrientationRequest.f46450zzb;
    }

    public long getSamplingPeriodMicros() {
        return this.f46449zza;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f46449zza), Boolean.valueOf(this.f46450zzb));
    }

    @NonNull
    public String toString() {
        long j2 = this.f46449zza;
        int length = String.valueOf(j2).length();
        String str = true != this.f46450zzb ? "" : ", withVelocity";
        StringBuilder sb6 = new StringBuilder(str.length() + length + 46 + 1);
        sb6.append("DeviceOrientationRequest[samplingPeriodMicros=");
        sb6.append(j2);
        sb6.append(str);
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, getSamplingPeriodMicros());
        SafeParcelWriter.writeBoolean(parcel, 6, this.f46450zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final /* synthetic */ long zza() {
        return this.f46449zza;
    }

    public final /* synthetic */ boolean zzb() {
        return this.f46450zzb;
    }
}
