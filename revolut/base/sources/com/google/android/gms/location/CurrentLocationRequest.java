package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeo;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "CurrentLocationRequestCreator")
@SafeParcelable.Reserved({8})
public final class CurrentLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new zzj();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long f46416zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int f46417zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 3)
    private final int f46418zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 4)
    private final long f46419zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 5)
    private final boolean f46420zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 7)
    private final int f46421zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 6)
    private final WorkSource f46422zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getImpersonation", id = 9)
    private final ClientIdentity f46423zzh;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private long f46424zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f46425zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f46426zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private long f46427zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private final boolean f46428zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private final int f46429zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private final WorkSource f46430zzg;

        /* JADX INFO: renamed from: zzh, reason: collision with root package name */
        private final ClientIdentity f46431zzh;

        public Builder() {
            this.f46424zza = 10000L;
            this.f46425zzb = 0;
            this.f46426zzc = 102;
            this.f46427zzd = Long.MAX_VALUE;
            this.f46428zze = false;
            this.f46429zzf = 0;
            this.f46430zzg = null;
            this.f46431zzh = null;
        }

        @NonNull
        public CurrentLocationRequest build() {
            return new CurrentLocationRequest(this.f46424zza, this.f46425zzb, this.f46426zzc, this.f46427zzd, this.f46428zze, this.f46429zzf, new WorkSource(this.f46430zzg), this.f46431zzh);
        }

        @NonNull
        public Builder setDurationMillis(long j2) {
            Preconditions.checkArgument(j2 > 0, "durationMillis must be greater than 0");
            this.f46427zzd = j2;
            return this;
        }

        @NonNull
        public Builder setGranularity(int i) {
            zzq.zza(i);
            this.f46425zzb = i;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateAgeMillis(long j2) {
            Preconditions.checkArgument(j2 >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.f46424zza = j2;
            return this;
        }

        @NonNull
        public Builder setPriority(int i) {
            zzan.zza(i);
            this.f46426zzc = i;
            return this;
        }

        public Builder(@NonNull CurrentLocationRequest currentLocationRequest) {
            this.f46424zza = currentLocationRequest.getMaxUpdateAgeMillis();
            this.f46425zzb = currentLocationRequest.getGranularity();
            this.f46426zzc = currentLocationRequest.getPriority();
            this.f46427zzd = currentLocationRequest.getDurationMillis();
            this.f46428zze = currentLocationRequest.zza();
            this.f46429zzf = currentLocationRequest.zzb();
            this.f46430zzg = new WorkSource(currentLocationRequest.zzc());
            this.f46431zzh = currentLocationRequest.zzd();
        }
    }

    @SafeParcelable.Constructor
    public CurrentLocationRequest(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) long j3, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 7) int i3, @SafeParcelable.Param(id = 6) WorkSource workSource, @SafeParcelable.Param(id = 9) ClientIdentity clientIdentity) {
        this.f46416zza = j2;
        this.f46417zzb = i;
        this.f46418zzc = i2;
        this.f46419zzd = j3;
        this.f46420zze = z;
        this.f46421zzf = i3;
        this.f46422zzg = workSource;
        this.f46423zzh = clientIdentity;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj2;
        return this.f46416zza == currentLocationRequest.f46416zza && this.f46417zzb == currentLocationRequest.f46417zzb && this.f46418zzc == currentLocationRequest.f46418zzc && this.f46419zzd == currentLocationRequest.f46419zzd && this.f46420zze == currentLocationRequest.f46420zze && this.f46421zzf == currentLocationRequest.f46421zzf && Objects.equal(this.f46422zzg, currentLocationRequest.f46422zzg) && Objects.equal(this.f46423zzh, currentLocationRequest.f46423zzh);
    }

    public long getDurationMillis() {
        return this.f46419zzd;
    }

    public int getGranularity() {
        return this.f46417zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.f46416zza;
    }

    public int getPriority() {
        return this.f46418zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f46416zza), Integer.valueOf(this.f46417zzb), Integer.valueOf(this.f46418zzc), Long.valueOf(this.f46419zzd));
    }

    @NonNull
    public String toString() {
        StringBuilder sbS = a.s("CurrentLocationRequest[");
        sbS.append(zzan.zzb(this.f46418zzc));
        if (this.f46416zza != Long.MAX_VALUE) {
            sbS.append(", maxAge=");
            zzeo.zzc(this.f46416zza, sbS);
        }
        if (this.f46419zzd != Long.MAX_VALUE) {
            sbS.append(", duration=");
            sbS.append(this.f46419zzd);
            sbS.append("ms");
        }
        if (this.f46417zzb != 0) {
            sbS.append(", ");
            sbS.append(zzq.zzb(this.f46417zzb));
        }
        if (this.f46420zze) {
            sbS.append(", bypass");
        }
        if (this.f46421zzf != 0) {
            sbS.append(", ");
            sbS.append(zzar.zzb(this.f46421zzf));
        }
        if (!WorkSourceUtil.isEmpty(this.f46422zzg)) {
            sbS.append(", workSource=");
            sbS.append(this.f46422zzg);
        }
        if (this.f46423zzh != null) {
            sbS.append(", impersonation=");
            sbS.append(this.f46423zzh);
        }
        sbS.append(']');
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeInt(parcel, 3, getPriority());
        SafeParcelWriter.writeLong(parcel, 4, getDurationMillis());
        SafeParcelWriter.writeBoolean(parcel, 5, this.f46420zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f46422zzg, i, false);
        SafeParcelWriter.writeInt(parcel, 7, this.f46421zzf);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f46423zzh, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza() {
        return this.f46420zze;
    }

    public final int zzb() {
        return this.f46421zzf;
    }

    @NonNull
    public final WorkSource zzc() {
        return this.f46422zzg;
    }

    public final ClientIdentity zzd() {
        return this.f46423zzh;
    }
}
