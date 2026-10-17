package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "ComplianceOptionsCreator")
public final class ComplianceOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    public static final ComplianceOptions f37708zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallerProductId", id = 1)
    private final int f37709zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDataOwnerProductId", id = 2)
    private final int f37710zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getProcessingReason", id = 3)
    private final int f37711zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "true", getter = "isUserData", id = 4)
    private final boolean f37712zze;

    @KeepForSdk
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f37713zza = -1;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f37714zzb = -1;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f37715zzc = 0;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private boolean f37716zzd = true;

        @NonNull
        @KeepForSdk
        public ComplianceOptions build() {
            return new ComplianceOptions(this.f37713zza, this.f37714zzb, this.f37715zzc, this.f37716zzd);
        }

        @NonNull
        @KeepForSdk
        public Builder setCallerProductId(int i) {
            this.f37713zza = i;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setDataOwnerProductId(int i) {
            this.f37714zzb = i;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setIsUserData(boolean z) {
            this.f37716zzd = z;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setProcessingReason(int i) {
            this.f37715zzc = i;
            return this;
        }
    }

    static {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setCallerProductId(-1);
        builderNewBuilder.setDataOwnerProductId(-1);
        builderNewBuilder.setProcessingReason(0);
        builderNewBuilder.setIsUserData(true);
        f37708zza = builderNewBuilder.build();
        CREATOR = new zzc();
    }

    @SafeParcelable.Constructor
    public ComplianceOptions(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) boolean z) {
        this.f37709zzb = i;
        this.f37710zzc = i2;
        this.f37711zzd = i3;
        this.f37712zze = z;
    }

    @NonNull
    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj2;
        return this.f37709zzb == complianceOptions.f37709zzb && this.f37710zzc == complianceOptions.f37710zzc && this.f37711zzd == complianceOptions.f37711zzd && this.f37712zze == complianceOptions.f37712zze;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f37709zzb), Integer.valueOf(this.f37710zzc), Integer.valueOf(this.f37711zzd), Boolean.valueOf(this.f37712zze));
    }

    @NonNull
    @KeepForSdk
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setCallerProductId(this.f37709zzb);
        builder.setDataOwnerProductId(this.f37710zzc);
        builder.setProcessingReason(this.f37711zzd);
        builder.setIsUserData(this.f37712zze);
        return builder;
    }

    @NonNull
    public final String toString() {
        int i = this.f37709zzb;
        int length = String.valueOf(i).length();
        int i2 = this.f37710zzc;
        int length2 = String.valueOf(i2).length();
        int i3 = this.f37711zzd;
        int length3 = String.valueOf(i3).length();
        boolean z = this.f37712zze;
        StringBuilder sb6 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        sb6.append("ComplianceOptions{callerProductId=");
        sb6.append(i);
        sb6.append(", dataOwnerProductId=");
        sb6.append(i2);
        sb6.append(", processingReason=");
        sb6.append(i3);
        sb6.append(", isUserData=");
        sb6.append(z);
        sb6.append("}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.f37709zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.f37710zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.f37711zzd);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f37712zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    @KeepForSdk
    public static final Builder newBuilder(@NonNull Context context) {
        return newBuilder();
    }
}
