package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
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
@SafeParcelable.Class(creator = "OfferWalletObjectCreator")
public final class OfferWalletObject extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new zzv();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    String f48895zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    String f48896zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    CommonWalletObject f48897zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int f48898zzd;

    public final class Builder {

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final com.google.android.gms.wallet.wobs.zzb f48900zzb = CommonWalletObject.zzb();

        public /* synthetic */ Builder(zzu zzuVar) {
        }

        @NonNull
        public Builder addImageModuleDataMainImageUri(@NonNull UriData uriData) {
            this.f48900zzb.zza(uriData);
            return this;
        }

        @NonNull
        public Builder addImageModuleDataMainImageUris(@NonNull Collection<UriData> collection) {
            this.f48900zzb.zzb(collection);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRow(@NonNull LabelValueRow labelValueRow) {
            this.f48900zzb.zzc(labelValueRow);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRows(@NonNull Collection<LabelValueRow> collection) {
            this.f48900zzb.zzd(collection);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUri(@NonNull UriData uriData) {
            this.f48900zzb.zze(uriData);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUris(@NonNull Collection<UriData> collection) {
            this.f48900zzb.zzf(collection);
            return this;
        }

        @NonNull
        public Builder addLocation(@NonNull LatLng latLng) {
            this.f48900zzb.zzg(latLng);
            return this;
        }

        @NonNull
        public Builder addLocations(@NonNull Collection<LatLng> collection) {
            this.f48900zzb.zzh(collection);
            return this;
        }

        @NonNull
        public Builder addMessage(@NonNull WalletObjectMessage walletObjectMessage) {
            this.f48900zzb.zzi(walletObjectMessage);
            return this;
        }

        @NonNull
        public Builder addMessages(@NonNull Collection<WalletObjectMessage> collection) {
            this.f48900zzb.zzj(collection);
            return this;
        }

        @NonNull
        public Builder addTextModuleData(@NonNull TextModuleData textModuleData) {
            this.f48900zzb.zzk(textModuleData);
            return this;
        }

        @NonNull
        public Builder addTextModulesData(@NonNull Collection<TextModuleData> collection) {
            this.f48900zzb.zzl(collection);
            return this;
        }

        @NonNull
        public OfferWalletObject build() {
            com.google.android.gms.wallet.wobs.zzb zzbVar = this.f48900zzb;
            OfferWalletObject offerWalletObject = OfferWalletObject.this;
            offerWalletObject.f48897zzc = zzbVar.zzz();
            return offerWalletObject;
        }

        @NonNull
        public Builder setBarcodeAlternateText(@NonNull String str) {
            this.f48900zzb.zzm(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setBarcodeLabel(@NonNull String str) {
            this.f48900zzb.zzn(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeType(@NonNull String str) {
            this.f48900zzb.zzo(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeValue(@NonNull String str) {
            this.f48900zzb.zzp(str);
            return this;
        }

        @NonNull
        public Builder setClassId(@NonNull String str) {
            this.f48900zzb.zzq(str);
            return this;
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            this.f48900zzb.zzr(str);
            OfferWalletObject.this.f48895zza = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@NonNull String str) {
            this.f48900zzb.zzs(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@NonNull String str) {
            this.f48900zzb.zzt(str);
            return this;
        }

        @NonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            this.f48900zzb.zzu(z);
            return this;
        }

        @NonNull
        public Builder setIssuerName(@NonNull String str) {
            this.f48900zzb.zzv(str);
            return this;
        }

        @NonNull
        public Builder setRedemptionCode(@NonNull String str) {
            OfferWalletObject.this.f48896zzb = str;
            return this;
        }

        @NonNull
        public Builder setState(int i) {
            this.f48900zzb.zzx(i);
            return this;
        }

        @NonNull
        public Builder setTitle(@NonNull String str) {
            this.f48900zzb.zzw(str);
            return this;
        }

        @NonNull
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            this.f48900zzb.zzy(timeInterval);
            return this;
        }
    }

    public OfferWalletObject() {
        this.f48898zzd = 3;
    }

    @NonNull
    public static Builder newBuilder() {
        return new OfferWalletObject().new Builder(null);
    }

    @NonNull
    public String getBarcodeAlternateText() {
        return this.f48897zzc.zzd();
    }

    @NonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.f48897zzc.zze();
    }

    @NonNull
    public String getBarcodeType() {
        return this.f48897zzc.zzf();
    }

    @NonNull
    public String getBarcodeValue() {
        return this.f48897zzc.zzg();
    }

    @NonNull
    public String getClassId() {
        return this.f48897zzc.zzh();
    }

    @NonNull
    public String getId() {
        return this.f48897zzc.zzi();
    }

    @NonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.f48897zzc.zzn();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.f48897zzc.zzj();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.f48897zzc.zzk();
    }

    @NonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.f48897zzc.zzo();
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.f48897zzc.zzt();
    }

    @NonNull
    public String getIssuerName() {
        return this.f48897zzc.zzl();
    }

    @NonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.f48897zzc.zzp();
    }

    @NonNull
    public ArrayList<LatLng> getLocations() {
        return this.f48897zzc.zzq();
    }

    @NonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.f48897zzc.zzr();
    }

    @NonNull
    public String getRedemptionCode() {
        return this.f48896zzb;
    }

    public int getState() {
        return this.f48897zzc.zza();
    }

    @NonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.f48897zzc.zzs();
    }

    @NonNull
    public String getTitle() {
        return this.f48897zzc.zzm();
    }

    @NonNull
    public TimeInterval getValidTimeInterval() {
        return this.f48897zzc.zzc();
    }

    public int getVersionCode() {
        return this.f48898zzd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeString(parcel, 2, this.f48895zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48896zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48897zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public OfferWalletObject(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) CommonWalletObject commonWalletObject) {
        this.f48898zzd = i;
        this.f48896zzb = str2;
        if (i >= 3) {
            this.f48897zzc = commonWalletObject;
            return;
        }
        com.google.android.gms.wallet.wobs.zzb zzbVarZzb = CommonWalletObject.zzb();
        zzbVarZzb.zzr(str);
        this.f48897zzc = zzbVarZzb.zzz();
    }
}
