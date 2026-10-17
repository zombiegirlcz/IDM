package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "CardInfoCreator")
public final class CardInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CardInfo> CREATOR = new zze();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    String f48823zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    String f48824zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    String f48825zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    int f48826zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    UserAddress f48827zze;

    private CardInfo() {
    }

    public UserAddress getBillingAddress() {
        return this.f48827zze;
    }

    public int getCardClass() {
        int i = this.f48826zzd;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 0;
    }

    @NonNull
    public String getCardDescription() {
        return this.f48823zza;
    }

    @NonNull
    public String getCardDetails() {
        return this.f48825zzc;
    }

    @NonNull
    public String getCardNetwork() {
        return this.f48824zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48823zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f48824zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48825zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f48826zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f48827zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CardInfo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) UserAddress userAddress) {
        this.f48823zza = str;
        this.f48824zzb = str2;
        this.f48825zzc = str3;
        this.f48826zzd = i;
        this.f48827zze = userAddress;
    }
}
