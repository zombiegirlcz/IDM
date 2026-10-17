package com.google.android.gms.tapandpay.quickaccesswallet;

import android.graphics.Bitmap;
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
@SafeParcelable.Class(creator = "QuickAccessWalletCardCreator")
public final class QuickAccessWalletCard extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<QuickAccessWalletCard> CREATOR = new zzf();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardId", id = 1)
    private String f48708zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardImage", id = 2)
    private Bitmap f48709zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getContentDescription", id = 3)
    private String f48710zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIntents", id = 4)
    private WalletCardIntent[] f48711zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIconMessages", id = 5)
    private CardIconMessage[] f48712zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAvailableTimestamp", id = 6)
    private long f48713zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExpirationTimestamp", id = 7)
    private long f48714zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAvailableBalance", id = 8)
    private String f48715zzh;

    @ShowFirstParty
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final QuickAccessWalletCard f48716zza;

        public Builder() {
            this.f48716zza = new QuickAccessWalletCard(null);
        }

        @NonNull
        public QuickAccessWalletCard build() {
            return this.f48716zza;
        }

        @NonNull
        public Builder setAvailableBalance(String str) {
            this.f48716zza.f48715zzh = str;
            return this;
        }

        @NonNull
        public Builder setAvailableTimestamp(long j2) {
            this.f48716zza.f48713zzf = j2;
            return this;
        }

        @NonNull
        public Builder setCardId(@NonNull String str) {
            this.f48716zza.f48708zza = str;
            return this;
        }

        @NonNull
        public Builder setCardImage(@NonNull Bitmap bitmap) {
            this.f48716zza.f48709zzb = bitmap;
            return this;
        }

        @NonNull
        public Builder setContentDescription(@NonNull String str) {
            this.f48716zza.f48710zzc = str;
            return this;
        }

        @NonNull
        public Builder setExpirationTimestamp(long j2) {
            this.f48716zza.f48714zzg = j2;
            return this;
        }

        @NonNull
        public Builder setIconMessages(@NonNull CardIconMessage[] cardIconMessageArr) {
            this.f48716zza.f48712zze = cardIconMessageArr;
            return this;
        }

        @NonNull
        public Builder setIntents(@NonNull WalletCardIntent[] walletCardIntentArr) {
            this.f48716zza.f48711zzd = walletCardIntentArr;
            return this;
        }

        public Builder(@NonNull QuickAccessWalletCard quickAccessWalletCard) {
            QuickAccessWalletCard quickAccessWalletCard2 = new QuickAccessWalletCard(null);
            this.f48716zza = quickAccessWalletCard2;
            quickAccessWalletCard2.f48708zza = quickAccessWalletCard.f48708zza;
            quickAccessWalletCard2.f48709zzb = quickAccessWalletCard.f48709zzb;
            quickAccessWalletCard2.f48710zzc = quickAccessWalletCard.f48710zzc;
            quickAccessWalletCard2.f48711zzd = quickAccessWalletCard.f48711zzd;
            quickAccessWalletCard2.f48712zze = quickAccessWalletCard.f48712zze;
            quickAccessWalletCard2.f48713zzf = quickAccessWalletCard.f48713zzf;
            quickAccessWalletCard2.f48714zzg = quickAccessWalletCard.f48714zzg;
            quickAccessWalletCard2.f48715zzh = quickAccessWalletCard.f48715zzh;
        }
    }

    private QuickAccessWalletCard() {
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof QuickAccessWalletCard) {
            QuickAccessWalletCard quickAccessWalletCard = (QuickAccessWalletCard) obj2;
            if (Objects.equal(this.f48708zza, quickAccessWalletCard.f48708zza) && Objects.equal(this.f48709zzb, quickAccessWalletCard.f48709zzb) && Objects.equal(this.f48710zzc, quickAccessWalletCard.f48710zzc) && Arrays.equals(this.f48711zzd, quickAccessWalletCard.f48711zzd) && Arrays.equals(this.f48712zze, quickAccessWalletCard.f48712zze) && Objects.equal(Long.valueOf(this.f48713zzf), Long.valueOf(quickAccessWalletCard.f48713zzf)) && Objects.equal(Long.valueOf(this.f48714zzg), Long.valueOf(quickAccessWalletCard.f48714zzg)) && Objects.equal(this.f48715zzh, quickAccessWalletCard.f48715zzh)) {
                return true;
            }
        }
        return false;
    }

    public String getAvailableBalance() {
        return this.f48715zzh;
    }

    public long getAvailableTimestamp() {
        return this.f48713zzf;
    }

    @NonNull
    public String getCardId() {
        return this.f48708zza;
    }

    @NonNull
    public Bitmap getCardImage() {
        return this.f48709zzb;
    }

    @NonNull
    public String getContentDescription() {
        return this.f48710zzc;
    }

    public long getExpirationTimestamp() {
        return this.f48714zzg;
    }

    @NonNull
    public CardIconMessage[] getIconMessages() {
        return this.f48712zze;
    }

    @NonNull
    public WalletCardIntent[] getIntents() {
        return this.f48711zzd;
    }

    public int hashCode() {
        return Objects.hashCode(this.f48708zza, this.f48709zzb, this.f48710zzc, Integer.valueOf(Arrays.hashCode(this.f48711zzd)), Integer.valueOf(Arrays.hashCode(this.f48712zze)), Long.valueOf(this.f48713zzf), Long.valueOf(this.f48714zzg), this.f48715zzh);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getCardId(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, getCardImage(), i, false);
        SafeParcelWriter.writeString(parcel, 3, getContentDescription(), false);
        SafeParcelWriter.writeTypedArray(parcel, 4, getIntents(), i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, getIconMessages(), i, false);
        SafeParcelWriter.writeLong(parcel, 6, getAvailableTimestamp());
        SafeParcelWriter.writeLong(parcel, 7, getExpirationTimestamp());
        SafeParcelWriter.writeString(parcel, 8, getAvailableBalance(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ QuickAccessWalletCard(zze zzeVar) {
    }

    @SafeParcelable.Constructor
    public QuickAccessWalletCard(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bitmap bitmap, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) WalletCardIntent[] walletCardIntentArr, @SafeParcelable.Param(id = 5) CardIconMessage[] cardIconMessageArr, @SafeParcelable.Param(id = 6) long j2, @SafeParcelable.Param(id = 7) long j3, @SafeParcelable.Param(id = 8) String str3) {
        this.f48708zza = str;
        this.f48709zzb = bitmap;
        this.f48710zzc = str2;
        this.f48711zzd = walletCardIntentArr;
        this.f48712zze = cardIconMessageArr;
        this.f48713zzf = j2;
        this.f48714zzg = j3;
        this.f48715zzh = str3;
    }
}
