package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeo;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "LastLocationRequestCreator")
@SafeParcelable.Reserved({4})
public final class LastLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzaa();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long f46471zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.location.Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int f46472zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 3)
    private final boolean f46473zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getImpersonation", id = 5)
    private final ClientIdentity f46474zzd;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private long f46475zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f46476zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private final boolean f46477zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private final ClientIdentity f46478zzd;

        public Builder() {
            this.f46475zza = Long.MAX_VALUE;
            this.f46476zzb = 0;
            this.f46477zzc = false;
            this.f46478zzd = null;
        }

        @NonNull
        public LastLocationRequest build() {
            return new LastLocationRequest(this.f46475zza, this.f46476zzb, this.f46477zzc, this.f46478zzd);
        }

        @NonNull
        public Builder setGranularity(int i) {
            zzq.zza(i);
            this.f46476zzb = i;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateAgeMillis(long j2) {
            Preconditions.checkArgument(j2 > 0, "maxUpdateAgeMillis must be greater than 0");
            this.f46475zza = j2;
            return this;
        }

        public Builder(@NonNull LastLocationRequest lastLocationRequest) {
            this.f46475zza = lastLocationRequest.getMaxUpdateAgeMillis();
            this.f46476zzb = lastLocationRequest.getGranularity();
            this.f46477zzc = lastLocationRequest.zza();
            this.f46478zzd = lastLocationRequest.zzb();
        }
    }

    @SafeParcelable.Constructor
    public LastLocationRequest(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 5) ClientIdentity clientIdentity) {
        this.f46471zza = j2;
        this.f46472zzb = i;
        this.f46473zzc = z;
        this.f46474zzd = clientIdentity;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj2;
        return this.f46471zza == lastLocationRequest.f46471zza && this.f46472zzb == lastLocationRequest.f46472zzb && this.f46473zzc == lastLocationRequest.f46473zzc && Objects.equal(this.f46474zzd, lastLocationRequest.f46474zzd);
    }

    public int getGranularity() {
        return this.f46472zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.f46471zza;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f46471zza), Integer.valueOf(this.f46472zzb), Boolean.valueOf(this.f46473zzc));
    }

    @NonNull
    public String toString() {
        StringBuilder sbS = a.s("LastLocationRequest[");
        if (this.f46471zza != Long.MAX_VALUE) {
            sbS.append("maxAge=");
            zzeo.zzc(this.f46471zza, sbS);
        }
        if (this.f46472zzb != 0) {
            sbS.append(", ");
            sbS.append(zzq.zzb(this.f46472zzb));
        }
        if (this.f46473zzc) {
            sbS.append(", bypass");
        }
        if (this.f46474zzd != null) {
            sbS.append(", impersonation=");
            sbS.append(this.f46474zzd);
        }
        sbS.append(']');
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeBoolean(parcel, 3, this.f46473zzc);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f46474zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza() {
        return this.f46473zzc;
    }

    public final ClientIdentity zzb() {
        return this.f46474zzd;
    }
}
