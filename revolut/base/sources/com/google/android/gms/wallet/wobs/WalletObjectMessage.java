package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "WalletObjectMessageCreator")
@SafeParcelable.Reserved({1})
public final class WalletObjectMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new zzo();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    String f48999zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    String f49000zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    TimeInterval f49001zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    @Deprecated
    UriData f49002zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    @Deprecated
    UriData f49003zze;

    public final class Builder {
        public /* synthetic */ Builder(zzn zznVar) {
        }

        @NonNull
        public WalletObjectMessage build() {
            return WalletObjectMessage.this;
        }

        @NonNull
        @Deprecated
        public Builder setActionUri(@NonNull UriData uriData) {
            WalletObjectMessage.this.f49002zzd = uriData;
            return this;
        }

        @NonNull
        public Builder setBody(@NonNull String str) {
            WalletObjectMessage.this.f49000zzb = str;
            return this;
        }

        @NonNull
        public Builder setDisplayInterval(@NonNull TimeInterval timeInterval) {
            WalletObjectMessage.this.f49001zzc = timeInterval;
            return this;
        }

        @NonNull
        public Builder setHeader(@NonNull String str) {
            WalletObjectMessage.this.f48999zza = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setImageUri(@NonNull UriData uriData) {
            WalletObjectMessage.this.f49003zze = uriData;
            return this;
        }
    }

    public WalletObjectMessage() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new WalletObjectMessage().new Builder(null);
    }

    @NonNull
    @Deprecated
    public UriData getActionUri() {
        return this.f49002zzd;
    }

    @NonNull
    public String getBody() {
        return this.f49000zzb;
    }

    @NonNull
    public TimeInterval getDisplayInterval() {
        return this.f49001zzc;
    }

    @NonNull
    public String getHeader() {
        return this.f48999zza;
    }

    @NonNull
    @Deprecated
    public UriData getImageUri() {
        return this.f49003zze;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48999zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f49000zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f49001zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f49002zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f49003zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public WalletObjectMessage(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) TimeInterval timeInterval, @SafeParcelable.Param(id = 5) UriData uriData, @SafeParcelable.Param(id = 6) UriData uriData2) {
        this.f48999zza = str;
        this.f49000zzb = str2;
        this.f49001zzc = timeInterval;
        this.f49002zzd = uriData;
        this.f49003zze = uriData2;
    }
}
