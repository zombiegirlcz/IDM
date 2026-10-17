package com.google.android.gms.tapandpay.quickaccesswallet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "GetQuickAccessWalletConfigRequestCreator")
public final class GetQuickAccessWalletConfigRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetQuickAccessWalletConfigRequest> CREATOR = new zzd();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSource", id = 1)
    private int f48705zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAccount", id = 2)
    private Account f48706zzb;

    @ShowFirstParty
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final GetQuickAccessWalletConfigRequest f48707zza;

        public Builder() {
            this.f48707zza = new GetQuickAccessWalletConfigRequest(null);
        }

        @NonNull
        public GetQuickAccessWalletConfigRequest build() {
            return this.f48707zza;
        }

        @NonNull
        public Builder setAccount(@NonNull Account account) {
            this.f48707zza.f48706zzb = account;
            return this;
        }

        @NonNull
        public Builder setSource(int i) {
            this.f48707zza.f48705zza = i;
            return this;
        }

        public Builder(@NonNull GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest) {
            GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest2 = new GetQuickAccessWalletConfigRequest(null);
            this.f48707zza = getQuickAccessWalletConfigRequest2;
            getQuickAccessWalletConfigRequest2.f48705zza = getQuickAccessWalletConfigRequest.f48705zza;
            getQuickAccessWalletConfigRequest2.f48706zzb = getQuickAccessWalletConfigRequest.f48706zzb;
        }
    }

    private GetQuickAccessWalletConfigRequest() {
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof GetQuickAccessWalletConfigRequest) {
            GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest = (GetQuickAccessWalletConfigRequest) obj2;
            if (Objects.equal(Integer.valueOf(this.f48705zza), Integer.valueOf(getQuickAccessWalletConfigRequest.f48705zza)) && Objects.equal(this.f48706zzb, getQuickAccessWalletConfigRequest.f48706zzb)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public Account getAccount() {
        return this.f48706zzb;
    }

    public int getSource() {
        return this.f48705zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48705zza), this.f48706zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSource());
        SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public GetQuickAccessWalletConfigRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Account account) {
        this.f48705zza = i;
        this.f48706zzb = account;
    }

    public /* synthetic */ GetQuickAccessWalletConfigRequest(zzc zzcVar) {
    }
}
