package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ServerPushProvisionRequestCreator")
public final class ServerPushProvisionRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ServerPushProvisionRequest> CREATOR = new zzj();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSessionContext", id = 1)
    private final PushProvisionSessionContext f48649zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDisplayName", id = 2)
    private final String f48650zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUserAddress", id = 3)
    private final UserAddress f48651zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions.defaultOptions()", getter = "getExtraOptions", id = 4)
    private final ExtraOptions f48652zzd;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private PushProvisionSessionContext f48653zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private String f48654zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private UserAddress f48655zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private ExtraOptions f48656zzd;

        @NonNull
        public ServerPushProvisionRequest build() {
            return new ServerPushProvisionRequest(this.f48653zza, this.f48654zzb, this.f48655zzc, this.f48656zzd);
        }

        @NonNull
        public Builder setDisplayName(@NonNull String str) {
            this.f48654zzb = str;
            return this;
        }

        @NonNull
        public Builder setExtraOptions(@NonNull ExtraOptions extraOptions) {
            this.f48656zzd = extraOptions;
            return this;
        }

        @NonNull
        public Builder setSessionContext(@NonNull PushProvisionSessionContext pushProvisionSessionContext) {
            this.f48653zza = pushProvisionSessionContext;
            return this;
        }

        @NonNull
        public Builder setUserAddress(@NonNull UserAddress userAddress) {
            this.f48655zzc = userAddress;
            return this;
        }
    }

    @SafeParcelable.Class(creator = "ExtraOptionsCreator")
    public static class ExtraOptions extends AbstractSafeParcelable implements ReflectedParcelable {

        @NonNull
        public static final Parcelable.Creator<ExtraOptions> CREATOR = new zzb();

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        @SafeParcelable.Field(defaultValue = "false", getter = "getServerSideAddressDeliveryEnabled", id = 1)
        private boolean f48657zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        @SafeParcelable.Field(defaultValue = "false", getter = "getVirtualCardsSetting", id = 2)
        private boolean f48658zzb;

        @SafeParcelable.Constructor
        public ExtraOptions(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z3) {
            this.f48657zza = z;
            this.f48658zzb = z3;
        }

        @NonNull
        public static ExtraOptions defaultOptions() {
            return new ExtraOptions(false, false);
        }

        public boolean getServerSideAddressDeliveryEnabled() {
            return this.f48657zza;
        }

        public boolean getVirtualCardsSetting() {
            return this.f48658zzb;
        }

        @NonNull
        public ExtraOptions setServerSideAddressDeliveryEnabled(boolean z) {
            this.f48657zza = z;
            return this;
        }

        @NonNull
        public ExtraOptions setVirtualCardsSetting(boolean z) {
            this.f48658zzb = z;
            return this;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, getServerSideAddressDeliveryEnabled());
            SafeParcelWriter.writeBoolean(parcel, 2, getVirtualCardsSetting());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    @SafeParcelable.Constructor
    public ServerPushProvisionRequest(@SafeParcelable.Param(id = 1) PushProvisionSessionContext pushProvisionSessionContext, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) UserAddress userAddress, @SafeParcelable.Param(id = 4) ExtraOptions extraOptions) {
        this.f48649zza = pushProvisionSessionContext;
        this.f48650zzb = str;
        this.f48651zzc = userAddress;
        this.f48652zzd = extraOptions;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f48649zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f48650zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48651zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48652zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
