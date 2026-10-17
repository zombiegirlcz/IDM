package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "LoyaltyPointsCreator")
@SafeParcelable.Reserved({1, 4})
public final class LoyaltyPoints extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new zzj();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    String f48982zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    LoyaltyPointsBalance f48983zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    @Deprecated
    TimeInterval f48984zzc;

    public final class Builder {
        public /* synthetic */ Builder(zzg zzgVar) {
        }

        @NonNull
        public LoyaltyPoints build() {
            return LoyaltyPoints.this;
        }

        @NonNull
        public Builder setBalance(@NonNull LoyaltyPointsBalance loyaltyPointsBalance) {
            LoyaltyPoints.this.f48983zzb = loyaltyPointsBalance;
            return this;
        }

        @NonNull
        public Builder setLabel(@NonNull String str) {
            LoyaltyPoints.this.f48982zza = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setType(@NonNull String str) {
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            LoyaltyPoints.this.f48984zzc = timeInterval;
            return this;
        }
    }

    public LoyaltyPoints() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new LoyaltyPoints().new Builder(null);
    }

    @NonNull
    public LoyaltyPointsBalance getBalance() {
        return this.f48983zzb;
    }

    @NonNull
    public String getLabel() {
        return this.f48982zza;
    }

    @NonNull
    @Deprecated
    public String getType() {
        return "";
    }

    @NonNull
    @Deprecated
    public TimeInterval getValidTimeInterval() {
        return this.f48984zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48982zza, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48983zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f48984zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LoyaltyPoints(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) LoyaltyPointsBalance loyaltyPointsBalance, @SafeParcelable.Param(id = 5) TimeInterval timeInterval) {
        this.f48982zza = str;
        this.f48983zzb = loyaltyPointsBalance;
        this.f48984zzc = timeInterval;
    }
}
