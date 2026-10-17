package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "MaskedWalletCreator")
@SafeParcelable.Reserved({1})
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new zzt();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    String f48884zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    String f48885zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    String[] f48886zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    String f48887zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    zza f48888zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    zza f48889zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    LoyaltyWalletObject[] f48890zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    OfferWalletObject[] f48891zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    UserAddress f48892zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    UserAddress f48893zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    InstrumentInfo[] f48894zzk;

    private MaskedWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48884zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48885zzb, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.f48886zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48887zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f48888zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f48889zzf, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.f48890zzg, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.f48891zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f48892zzi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f48893zzj, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 12, this.f48894zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public MaskedWallet(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String[] strArr, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) zza zzaVar, @SafeParcelable.Param(id = 7) zza zzaVar2, @SafeParcelable.Param(id = 8) LoyaltyWalletObject[] loyaltyWalletObjectArr, @SafeParcelable.Param(id = 9) OfferWalletObject[] offerWalletObjectArr, @SafeParcelable.Param(id = 10) UserAddress userAddress, @SafeParcelable.Param(id = 11) UserAddress userAddress2, @SafeParcelable.Param(id = 12) InstrumentInfo[] instrumentInfoArr) {
        this.f48884zza = str;
        this.f48885zzb = str2;
        this.f48886zzc = strArr;
        this.f48887zzd = str3;
        this.f48888zze = zzaVar;
        this.f48889zzf = zzaVar2;
        this.f48890zzg = loyaltyWalletObjectArr;
        this.f48891zzh = offerWalletObjectArr;
        this.f48892zzi = userAddress;
        this.f48893zzj = userAddress2;
        this.f48894zzk = instrumentInfoArr;
    }
}
