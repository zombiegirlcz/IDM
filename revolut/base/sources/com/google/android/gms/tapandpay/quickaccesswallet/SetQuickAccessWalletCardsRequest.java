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
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "SetQuickAccessWalletCardsRequestCreator")
public final class SetQuickAccessWalletCardsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SetQuickAccessWalletCardsRequest> CREATOR = new zzj();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSource", id = 1)
    private int f48722zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAccount", id = 2)
    private Account f48723zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCards", id = 3)
    private QuickAccessWalletCard[] f48724zzc;

    @ShowFirstParty
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final SetQuickAccessWalletCardsRequest f48725zza;

        public Builder() {
            this.f48725zza = new SetQuickAccessWalletCardsRequest(null);
        }

        @NonNull
        public SetQuickAccessWalletCardsRequest build() {
            return this.f48725zza;
        }

        @NonNull
        public Builder setAccount(@NonNull Account account) {
            this.f48725zza.f48723zzb = account;
            return this;
        }

        @NonNull
        public Builder setCards(@NonNull QuickAccessWalletCard[] quickAccessWalletCardArr) {
            this.f48725zza.f48724zzc = quickAccessWalletCardArr;
            return this;
        }

        @NonNull
        public Builder setSource(int i) {
            this.f48725zza.f48722zza = i;
            return this;
        }

        public Builder(@NonNull SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest) {
            SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest2 = new SetQuickAccessWalletCardsRequest(null);
            this.f48725zza = setQuickAccessWalletCardsRequest2;
            setQuickAccessWalletCardsRequest2.f48722zza = setQuickAccessWalletCardsRequest.f48722zza;
            setQuickAccessWalletCardsRequest2.f48723zzb = setQuickAccessWalletCardsRequest.f48723zzb;
            setQuickAccessWalletCardsRequest2.f48724zzc = setQuickAccessWalletCardsRequest.f48724zzc;
        }
    }

    private SetQuickAccessWalletCardsRequest() {
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof SetQuickAccessWalletCardsRequest) {
            SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest = (SetQuickAccessWalletCardsRequest) obj2;
            if (Objects.equal(Integer.valueOf(this.f48722zza), Integer.valueOf(setQuickAccessWalletCardsRequest.f48722zza)) && Objects.equal(this.f48723zzb, setQuickAccessWalletCardsRequest.f48723zzb) && Arrays.equals(this.f48724zzc, setQuickAccessWalletCardsRequest.f48724zzc)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public Account getAccount() {
        return this.f48723zzb;
    }

    @NonNull
    public QuickAccessWalletCard[] getCards() {
        return this.f48724zzc;
    }

    public int getSource() {
        return this.f48722zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48722zza), this.f48723zzb, Integer.valueOf(Arrays.hashCode(this.f48724zzc)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSource());
        SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i, false);
        SafeParcelWriter.writeTypedArray(parcel, 3, getCards(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public SetQuickAccessWalletCardsRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Account account, @SafeParcelable.Param(id = 3) QuickAccessWalletCard[] quickAccessWalletCardArr) {
        this.f48722zza = i;
        this.f48723zzb = account;
        this.f48724zzc = quickAccessWalletCardArr;
    }

    public /* synthetic */ SetQuickAccessWalletCardsRequest(zzi zziVar) {
    }
}
