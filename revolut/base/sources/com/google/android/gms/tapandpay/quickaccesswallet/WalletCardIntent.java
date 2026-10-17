package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "WalletCardIntentCreator")
public final class WalletCardIntent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WalletCardIntent> CREATOR = new zzl();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getClassName", id = 1)
    private String f48726zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAction", id = 2)
    private String f48727zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExtras", id = 3)
    private WalletCardIntentExtra[] f48728zzc;

    @ShowFirstParty
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final WalletCardIntent f48729zza;

        public Builder() {
            this.f48729zza = new WalletCardIntent(null);
        }

        @NonNull
        public WalletCardIntent build() {
            return this.f48729zza;
        }

        @NonNull
        public Builder setAction(@NonNull String str) {
            this.f48729zza.f48727zzb = str;
            return this;
        }

        @NonNull
        public Builder setClassName(@NonNull String str) {
            this.f48729zza.f48726zza = str;
            return this;
        }

        @NonNull
        public Builder setExtras(@NonNull WalletCardIntentExtra[] walletCardIntentExtraArr) {
            this.f48729zza.f48728zzc = walletCardIntentExtraArr;
            return this;
        }

        public Builder(@NonNull WalletCardIntent walletCardIntent) {
            WalletCardIntent walletCardIntent2 = new WalletCardIntent(null);
            this.f48729zza = walletCardIntent2;
            walletCardIntent2.f48726zza = walletCardIntent.f48726zza;
            walletCardIntent2.f48727zzb = walletCardIntent.f48727zzb;
            walletCardIntent2.f48728zzc = walletCardIntent.f48728zzc;
        }
    }

    private WalletCardIntent() {
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof WalletCardIntent) {
            WalletCardIntent walletCardIntent = (WalletCardIntent) obj2;
            if (Objects.equal(this.f48726zza, walletCardIntent.f48726zza) && Objects.equal(this.f48727zzb, walletCardIntent.f48727zzb) && Arrays.equals(this.f48728zzc, walletCardIntent.f48728zzc)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getAction() {
        return this.f48727zzb;
    }

    @NonNull
    public String getClassName() {
        return this.f48726zza;
    }

    @NonNull
    public WalletCardIntentExtra[] getExtras() {
        return this.f48728zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.f48726zza, this.f48727zzb, Integer.valueOf(Arrays.hashCode(this.f48728zzc)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getClassName(), false);
        SafeParcelWriter.writeString(parcel, 2, getAction(), false);
        SafeParcelWriter.writeTypedArray(parcel, 3, getExtras(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ WalletCardIntent(zzk zzkVar) {
    }

    @SafeParcelable.Constructor
    public WalletCardIntent(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) WalletCardIntentExtra[] walletCardIntentExtraArr) {
        this.f48726zza = str;
        this.f48727zzb = str2;
        this.f48728zzc = walletCardIntentExtraArr;
    }
}
