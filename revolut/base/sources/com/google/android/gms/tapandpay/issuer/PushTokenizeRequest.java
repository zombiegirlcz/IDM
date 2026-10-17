package com.google.android.gms.tapandpay.issuer;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PushTokenizeRequestCreator")
@SafeParcelable.Reserved({1})
public class PushTokenizeRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PushTokenizeRequest> CREATOR = new zzi();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final int f48630zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final int f48631zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final byte[] f48632zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final String f48633zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    final String f48634zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    final UserAddress f48635zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    final boolean f48636zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    final int[] f48637zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    final IBinder f48638zzi;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f48639zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f48640zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private byte[] f48641zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private String f48642zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private String f48643zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private UserAddress f48644zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private boolean f48645zzg;

        /* JADX INFO: renamed from: zzh, reason: collision with root package name */
        private Executor f48646zzh;

        /* JADX INFO: renamed from: zzi, reason: collision with root package name */
        private WalletAvailabilityChecker f48647zzi;

        /* JADX INFO: renamed from: zzj, reason: collision with root package name */
        private PaymentCredentialsGenerator f48648zzj;

        @NonNull
        public PushTokenizeRequest build() {
            PushTokenizeCallbacks pushTokenizeCallbacksTryCreate = PushTokenizeCallbacks.tryCreate(this.f48646zzh, this.f48647zzi, this.f48648zzj);
            int i = this.f48639zza;
            int i2 = this.f48640zzb;
            byte[] bArr = this.f48641zzc;
            String str = this.f48642zzd;
            String str2 = this.f48643zze;
            UserAddress userAddress = this.f48644zzf;
            boolean z = this.f48645zzg;
            int[] supportedCallbackRequestTypes = pushTokenizeCallbacksTryCreate == null ? new int[0] : pushTokenizeCallbacksTryCreate.getSupportedCallbackRequestTypes();
            if (pushTokenizeCallbacksTryCreate == null) {
                pushTokenizeCallbacksTryCreate = null;
            }
            return new PushTokenizeRequest(i, i2, bArr, str, str2, userAddress, z, supportedCallbackRequestTypes, pushTokenizeCallbacksTryCreate);
        }

        @NonNull
        public Builder setCallbackRequestExecutor(@NonNull Executor executor) {
            this.f48646zzh = executor;
            return this;
        }

        @NonNull
        public Builder setDisplayName(@NonNull String str) {
            this.f48643zze = str;
            return this;
        }

        @NonNull
        public Builder setIsTransit(boolean z) {
            this.f48645zzg = z;
            return this;
        }

        @NonNull
        public Builder setLastDigits(@NonNull String str) {
            this.f48642zzd = str;
            return this;
        }

        @NonNull
        public Builder setNetwork(int i) {
            this.f48639zza = i;
            return this;
        }

        @NonNull
        public Builder setOpaquePaymentCard(@NonNull byte[] bArr) {
            this.f48641zzc = bArr;
            return this;
        }

        @NonNull
        public Builder setPaymentCredentialsGenerator(@NonNull PaymentCredentialsGenerator paymentCredentialsGenerator) {
            this.f48648zzj = paymentCredentialsGenerator;
            return this;
        }

        @NonNull
        public Builder setTokenServiceProvider(int i) {
            this.f48640zzb = i;
            return this;
        }

        @NonNull
        public Builder setUserAddress(@NonNull UserAddress userAddress) {
            this.f48644zzf = userAddress;
            return this;
        }

        @NonNull
        public Builder setWalletAvailabilityChecker(@NonNull WalletAvailabilityChecker walletAvailabilityChecker) {
            this.f48647zzi = walletAvailabilityChecker;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public PushTokenizeRequest(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) UserAddress userAddress, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) int[] iArr, @SafeParcelable.Param(id = 10) IBinder iBinder) {
        this.f48630zza = i;
        this.f48631zzb = i2;
        this.f48632zzc = bArr;
        this.f48633zzd = str;
        this.f48634zze = str2;
        this.f48635zzf = userAddress;
        this.f48636zzg = z;
        this.f48637zzh = iArr;
        this.f48638zzi = iBinder;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f48630zza);
        SafeParcelWriter.writeInt(parcel, 3, this.f48631zzb);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f48632zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48633zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.f48634zze, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f48635zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f48636zzg);
        SafeParcelWriter.writeIntArray(parcel, 9, this.f48637zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, this.f48638zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
