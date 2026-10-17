package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "WalletCardIntentExtraCreator")
public final class WalletCardIntentExtra extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WalletCardIntentExtra> CREATOR = new zzn();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getKey", id = 1)
    private String f48730zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getValueType", id = 2)
    private int f48731zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getValueString", id = 3)
    private String f48732zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getValueBytes", id = 4)
    private byte[] f48733zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getValueBoolean", id = 5)
    private boolean f48734zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getValueInt", id = 6)
    private int f48735zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getValueLong", id = 7)
    private long f48736zzg;

    @ShowFirstParty
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final WalletCardIntentExtra f48737zza;

        public Builder() {
            this.f48737zza = new WalletCardIntentExtra(null);
        }

        @NonNull
        public WalletCardIntentExtra build() {
            return this.f48737zza;
        }

        @NonNull
        public Builder setKey(@NonNull String str) {
            this.f48737zza.f48730zza = str;
            return this;
        }

        @NonNull
        public Builder setValueBoolean(boolean z) {
            this.f48737zza.f48734zze = z;
            return this;
        }

        @NonNull
        public Builder setValueBytes(byte[] bArr) {
            this.f48737zza.f48733zzd = bArr;
            return this;
        }

        @NonNull
        public Builder setValueInt(int i) {
            this.f48737zza.f48735zzf = i;
            return this;
        }

        @NonNull
        public Builder setValueLong(long j2) {
            this.f48737zza.f48736zzg = j2;
            return this;
        }

        @NonNull
        public Builder setValueString(String str) {
            this.f48737zza.f48732zzc = str;
            return this;
        }

        @NonNull
        public Builder setValueType(int i) {
            this.f48737zza.f48731zzb = i;
            return this;
        }

        public Builder(@NonNull WalletCardIntentExtra walletCardIntentExtra) {
            WalletCardIntentExtra walletCardIntentExtra2 = new WalletCardIntentExtra(null);
            this.f48737zza = walletCardIntentExtra2;
            walletCardIntentExtra2.f48730zza = walletCardIntentExtra.f48730zza;
            walletCardIntentExtra2.f48731zzb = walletCardIntentExtra.f48731zzb;
            walletCardIntentExtra2.f48732zzc = walletCardIntentExtra.f48732zzc;
            walletCardIntentExtra2.f48733zzd = walletCardIntentExtra.f48733zzd;
            walletCardIntentExtra2.f48734zze = walletCardIntentExtra.f48734zze;
            walletCardIntentExtra2.f48735zzf = walletCardIntentExtra.f48735zzf;
            walletCardIntentExtra2.f48736zzg = walletCardIntentExtra.f48736zzg;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ValueType {
        public static final int BOOLEAN = 3;
        public static final int BYTES = 2;
        public static final int INT = 4;
        public static final int LONG = 5;
        public static final int STRING = 1;
        public static final int VALUE_TYPE_UNKNOWN = 0;
    }

    private WalletCardIntentExtra() {
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof WalletCardIntentExtra) {
            WalletCardIntentExtra walletCardIntentExtra = (WalletCardIntentExtra) obj2;
            if (Objects.equal(this.f48730zza, walletCardIntentExtra.f48730zza) && Objects.equal(Integer.valueOf(this.f48731zzb), Integer.valueOf(walletCardIntentExtra.f48731zzb)) && Objects.equal(this.f48732zzc, walletCardIntentExtra.f48732zzc) && Arrays.equals(this.f48733zzd, walletCardIntentExtra.f48733zzd) && Objects.equal(Boolean.valueOf(this.f48734zze), Boolean.valueOf(walletCardIntentExtra.f48734zze)) && Objects.equal(Integer.valueOf(this.f48735zzf), Integer.valueOf(walletCardIntentExtra.f48735zzf)) && Objects.equal(Long.valueOf(this.f48736zzg), Long.valueOf(walletCardIntentExtra.f48736zzg))) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getKey() {
        return this.f48730zza;
    }

    public boolean getValueBoolean() {
        return this.f48734zze;
    }

    public byte[] getValueBytes() {
        return this.f48733zzd;
    }

    public int getValueInt() {
        return this.f48735zzf;
    }

    public long getValueLong() {
        return this.f48736zzg;
    }

    public String getValueString() {
        return this.f48732zzc;
    }

    public int getValueType() {
        return this.f48731zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.f48730zza, Integer.valueOf(this.f48731zzb), this.f48732zzc, Integer.valueOf(Arrays.hashCode(this.f48733zzd)), Boolean.valueOf(this.f48734zze), Integer.valueOf(this.f48735zzf), Long.valueOf(this.f48736zzg));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getKey(), false);
        SafeParcelWriter.writeInt(parcel, 2, getValueType());
        SafeParcelWriter.writeString(parcel, 3, getValueString(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getValueBytes(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, getValueBoolean());
        SafeParcelWriter.writeInt(parcel, 6, getValueInt());
        SafeParcelWriter.writeLong(parcel, 7, getValueLong());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ WalletCardIntentExtra(zzm zzmVar) {
    }

    @SafeParcelable.Constructor
    public WalletCardIntentExtra(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) long j2) {
        this.f48730zza = str;
        this.f48731zzb = i;
        this.f48732zzc = str2;
        this.f48733zzd = bArr;
        this.f48734zze = z;
        this.f48735zzf = i2;
        this.f48736zzg = j2;
    }
}
