package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "LoyaltyPointsBalanceCreator")
@SafeParcelable.Reserved({1})
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new zzi();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    int f48986zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    String f48987zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    double f48988zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    String f48989zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    long f48990zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.wallet.wobs.LoyaltyPointsBalance.Type.UNDEFINED", id = 7)
    int f48991zzf;

    public final class Builder {
        public /* synthetic */ Builder(zzh zzhVar) {
        }

        @NonNull
        public LoyaltyPointsBalance build() {
            return LoyaltyPointsBalance.this;
        }

        @NonNull
        public Builder setDouble(double d) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.f48988zzc = d;
            loyaltyPointsBalance.f48991zzf = 2;
            return this;
        }

        @NonNull
        public Builder setInt(int i) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.f48986zza = i;
            loyaltyPointsBalance.f48991zzf = 0;
            return this;
        }

        @NonNull
        public Builder setMoney(@NonNull String str, long j2) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.f48989zzd = str;
            loyaltyPointsBalance.f48990zze = j2;
            loyaltyPointsBalance.f48991zzf = 3;
            return this;
        }

        @NonNull
        public Builder setString(@NonNull String str) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.f48987zzb = str;
            loyaltyPointsBalance.f48991zzf = 1;
            return this;
        }
    }

    public interface Type {
        public static final int DOUBLE = 2;
        public static final int INT = 0;
        public static final int MONEY = 3;
        public static final int STRING = 1;
        public static final int UNDEFINED = -1;
    }

    public LoyaltyPointsBalance() {
        this.f48991zzf = -1;
        this.f48986zza = -1;
        this.f48988zzc = -1.0d;
    }

    @NonNull
    public static Builder newBuilder() {
        return new LoyaltyPointsBalance().new Builder(null);
    }

    @NonNull
    public String getCurrencyCode() {
        return this.f48989zzd;
    }

    public long getCurrencyMicros() {
        return this.f48990zze;
    }

    public double getDouble() {
        return this.f48988zzc;
    }

    public int getInt() {
        return this.f48986zza;
    }

    @NonNull
    public String getString() {
        return this.f48987zzb;
    }

    public int getType() {
        return this.f48991zzf;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f48986zza);
        SafeParcelWriter.writeString(parcel, 3, this.f48987zzb, false);
        SafeParcelWriter.writeDouble(parcel, 4, this.f48988zzc);
        SafeParcelWriter.writeString(parcel, 5, this.f48989zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f48990zze);
        SafeParcelWriter.writeInt(parcel, 7, this.f48991zzf);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LoyaltyPointsBalance(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) double d, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) long j2, @SafeParcelable.Param(id = 7) int i2) {
        this.f48986zza = i;
        this.f48987zzb = str;
        this.f48988zzc = d;
        this.f48989zzd = str2;
        this.f48990zze = j2;
        this.f48991zzf = i2;
    }
}
