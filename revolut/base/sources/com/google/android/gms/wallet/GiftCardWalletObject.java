package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "GiftCardWalletObjectCreator")
@SafeParcelable.Reserved({1})
public final class GiftCardWalletObject extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new zzn();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    CommonWalletObject f48851zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    String f48852zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    String f48853zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    @Deprecated
    String f48854zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    long f48855zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    String f48856zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    long f48857zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    String f48858zzh;

    public final class Builder {

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final com.google.android.gms.wallet.wobs.zzb f48860zzb = CommonWalletObject.zzb();

        public /* synthetic */ Builder(zzm zzmVar) {
        }

        @NonNull
        public Builder addImageModuleDataMainImageUri(@NonNull UriData uriData) {
            this.f48860zzb.zza(uriData);
            return this;
        }

        @NonNull
        public Builder addImageModuleDataMainImageUris(@NonNull Collection<UriData> collection) {
            this.f48860zzb.zzb(collection);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRow(@NonNull LabelValueRow labelValueRow) {
            this.f48860zzb.zzc(labelValueRow);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRows(@NonNull Collection<LabelValueRow> collection) {
            this.f48860zzb.zzd(collection);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUri(@NonNull UriData uriData) {
            this.f48860zzb.zze(uriData);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUris(@NonNull Collection<UriData> collection) {
            this.f48860zzb.zzf(collection);
            return this;
        }

        @NonNull
        public Builder addLocation(@NonNull LatLng latLng) {
            this.f48860zzb.zzg(latLng);
            return this;
        }

        @NonNull
        public Builder addLocations(@NonNull Collection<LatLng> collection) {
            this.f48860zzb.zzh(collection);
            return this;
        }

        @NonNull
        public Builder addMessage(@NonNull WalletObjectMessage walletObjectMessage) {
            this.f48860zzb.zzi(walletObjectMessage);
            return this;
        }

        @NonNull
        public Builder addMessages(@NonNull Collection<WalletObjectMessage> collection) {
            this.f48860zzb.zzj(collection);
            return this;
        }

        @NonNull
        public Builder addTextModuleData(@NonNull TextModuleData textModuleData) {
            this.f48860zzb.zzk(textModuleData);
            return this;
        }

        @NonNull
        public Builder addTextModulesData(@NonNull Collection<TextModuleData> collection) {
            this.f48860zzb.zzl(collection);
            return this;
        }

        @NonNull
        public GiftCardWalletObject build() {
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.f48852zzb), "Card number is required.");
            com.google.android.gms.wallet.wobs.zzb zzbVar = this.f48860zzb;
            GiftCardWalletObject giftCardWalletObject = GiftCardWalletObject.this;
            giftCardWalletObject.f48851zza = zzbVar.zzz();
            Preconditions.checkArgument(!TextUtils.isEmpty(r0.zzm()), "Card name is required.");
            Preconditions.checkArgument(!TextUtils.isEmpty(GiftCardWalletObject.this.f48851zza.zzl()), "Card issuer name is required.");
            return GiftCardWalletObject.this;
        }

        @NonNull
        public Builder setBalanceCurrencyCode(@NonNull String str) {
            GiftCardWalletObject.this.f48856zzf = str;
            return this;
        }

        @NonNull
        public Builder setBalanceMicros(long j2) {
            GiftCardWalletObject.this.f48855zze = j2;
            return this;
        }

        @NonNull
        public Builder setBalanceUpdateTime(long j2) {
            GiftCardWalletObject.this.f48857zzg = j2;
            return this;
        }

        @NonNull
        public Builder setBarcodeAlternateText(@NonNull String str) {
            this.f48860zzb.zzm(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setBarcodeLabel(@NonNull String str) {
            this.f48860zzb.zzn(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeType(@NonNull String str) {
            this.f48860zzb.zzo(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeValue(@NonNull String str) {
            this.f48860zzb.zzp(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setCardIdentifier(@NonNull String str) {
            GiftCardWalletObject.this.f48854zzd = str;
            return this;
        }

        @NonNull
        public Builder setCardNumber(@NonNull String str) {
            GiftCardWalletObject.this.f48852zzb = str;
            return this;
        }

        @NonNull
        public Builder setClassId(@NonNull String str) {
            this.f48860zzb.zzq(str);
            return this;
        }

        @NonNull
        public Builder setEventNumber(@NonNull String str) {
            GiftCardWalletObject.this.f48858zzh = str;
            return this;
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            this.f48860zzb.zzr(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@NonNull String str) {
            this.f48860zzb.zzs(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@NonNull String str) {
            this.f48860zzb.zzt(str);
            return this;
        }

        @NonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            this.f48860zzb.zzu(z);
            return this;
        }

        @NonNull
        public Builder setIssuerName(@NonNull String str) {
            this.f48860zzb.zzv(str);
            return this;
        }

        @NonNull
        public Builder setPin(@NonNull String str) {
            GiftCardWalletObject.this.f48853zzc = str;
            return this;
        }

        @NonNull
        public Builder setState(int i) {
            this.f48860zzb.zzx(i);
            return this;
        }

        @NonNull
        public Builder setTitle(@NonNull String str) {
            this.f48860zzb.zzw(str);
            return this;
        }

        @NonNull
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            this.f48860zzb.zzy(timeInterval);
            return this;
        }
    }

    public GiftCardWalletObject() {
        this.f48851zza = CommonWalletObject.zzb().zzz();
    }

    @NonNull
    public static Builder newBuilder() {
        return new GiftCardWalletObject().new Builder(null);
    }

    @NonNull
    public String getBalanceCurrencyCode() {
        return this.f48856zzf;
    }

    public long getBalanceMicros() {
        return this.f48855zze;
    }

    public long getBalanceUpdateTime() {
        return this.f48857zzg;
    }

    @NonNull
    public String getBarcodeAlternateText() {
        return this.f48851zza.zzd();
    }

    @NonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.f48851zza.zze();
    }

    @NonNull
    public String getBarcodeType() {
        return this.f48851zza.zzf();
    }

    @NonNull
    public String getBarcodeValue() {
        return this.f48851zza.zzg();
    }

    @NonNull
    @Deprecated
    public String getCardIdentifier() {
        return this.f48854zzd;
    }

    @NonNull
    public String getCardNumber() {
        return this.f48852zzb;
    }

    @NonNull
    public String getClassId() {
        return this.f48851zza.zzh();
    }

    @NonNull
    public String getEventNumber() {
        return this.f48858zzh;
    }

    @NonNull
    public String getId() {
        return this.f48851zza.zzi();
    }

    @NonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.f48851zza.zzn();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.f48851zza.zzj();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.f48851zza.zzk();
    }

    @NonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.f48851zza.zzo();
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.f48851zza.zzt();
    }

    @NonNull
    public String getIssuerName() {
        return this.f48851zza.zzl();
    }

    @NonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.f48851zza.zzp();
    }

    @NonNull
    public ArrayList<LatLng> getLocations() {
        return this.f48851zza.zzq();
    }

    @NonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.f48851zza.zzr();
    }

    @NonNull
    public String getPin() {
        return this.f48853zzc;
    }

    public int getState() {
        return this.f48851zza.zza();
    }

    @NonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.f48851zza.zzs();
    }

    @NonNull
    public String getTitle() {
        return this.f48851zza.zzm();
    }

    @NonNull
    public TimeInterval getValidTimeInterval() {
        return this.f48851zza.zzc();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48851zza, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48852zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48853zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48854zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f48855zze);
        SafeParcelWriter.writeString(parcel, 7, this.f48856zzf, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f48857zzg);
        SafeParcelWriter.writeString(parcel, 9, this.f48858zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public GiftCardWalletObject(@SafeParcelable.Param(id = 2) CommonWalletObject commonWalletObject, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) long j2, @SafeParcelable.Param(id = 7) String str4, @SafeParcelable.Param(id = 8) long j3, @SafeParcelable.Param(id = 9) String str5) {
        CommonWalletObject.zzb();
        this.f48851zza = commonWalletObject;
        this.f48852zzb = str;
        this.f48853zzc = str2;
        this.f48855zze = j2;
        this.f48856zzf = str4;
        this.f48857zzg = j3;
        this.f48858zzh = str5;
        this.f48854zzd = str3;
    }
}
