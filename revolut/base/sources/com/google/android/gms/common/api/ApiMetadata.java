package com.google.android.gms.common.api;

import a0.d;
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
@SafeParcelable.Class(creator = "ApiMetadataCreator")
public final class ApiMetadata extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    public static final ApiMetadata f37692zza;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getComplianceOptions", id = 1)
    private final ComplianceOptions f37694zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isCallbackSupportEnabled", id = 2)
    private final boolean f37695zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private boolean f37696zze;

    @NonNull
    public static final Parcelable.Creator<ApiMetadata> CREATOR = zza.zza();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final ApiMetadata f37693zzb = newBuilder().build();

    @KeepForSdk
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private ComplianceOptions f37697zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private boolean f37698zzb = false;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private boolean f37699zzc;

        @NonNull
        @KeepForSdk
        public ApiMetadata build() {
            ApiMetadata apiMetadata = new ApiMetadata(this.f37697zza, this.f37698zzb);
            apiMetadata.zza(this.f37699zzc);
            return apiMetadata;
        }

        @NonNull
        @KeepForSdk
        public Builder setCallbackSupportEnabled(boolean z) {
            this.f37698zzb = z;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder setComplianceOptions(ComplianceOptions complianceOptions) {
            this.f37697zza = complianceOptions;
            return this;
        }

        public final /* synthetic */ Builder zza(boolean z) {
            this.f37699zzc = z;
            return this;
        }
    }

    static {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.zza(true);
        f37692zza = builderNewBuilder.build();
    }

    @SafeParcelable.Constructor
    public ApiMetadata(@SafeParcelable.Param(id = 1) ComplianceOptions complianceOptions, @SafeParcelable.Param(id = 2) boolean z) {
        this.f37694zzc = complianceOptions;
        this.f37695zzd = z;
    }

    @NonNull
    @KeepForSdk
    public static final ApiMetadata fromComplianceOptions(@NonNull ComplianceOptions complianceOptions) {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setComplianceOptions(complianceOptions);
        return builderNewBuilder.build();
    }

    @NonNull
    @KeepForSdk
    public static final ApiMetadata getEmptyInstance() {
        return f37693zzb;
    }

    @NonNull
    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj2;
        return Objects.equal(this.f37694zzc, apiMetadata.f37694zzc) && this.f37696zze == apiMetadata.f37696zze && this.f37695zzd == apiMetadata.f37695zzd;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f37694zzc, Boolean.valueOf(this.f37696zze), Boolean.valueOf(this.f37695zzd));
    }

    @NonNull
    @KeepForSdk
    public Builder toBuilder() {
        Builder builderNewBuilder = newBuilder();
        builderNewBuilder.setComplianceOptions(this.f37694zzc);
        builderNewBuilder.setCallbackSupportEnabled(this.f37695zzd);
        builderNewBuilder.zza(this.f37696zze);
        return builderNewBuilder;
    }

    @NonNull
    public final String toString() {
        String strValueOf = String.valueOf(this.f37694zzc);
        return d.u(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        if (this.f37696zze) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f37694zzc, i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f37695zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final /* synthetic */ void zza(boolean z) {
        this.f37696zze = z;
    }
}
