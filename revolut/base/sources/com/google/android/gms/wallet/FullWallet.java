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
@SafeParcelable.Class(creator = "FullWalletCreator")
@SafeParcelable.Reserved({1})
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<FullWallet> CREATOR = new zzl();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    String f48840zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    String f48841zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    zzaj f48842zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    String f48843zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    zza f48844zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    zza f48845zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    String[] f48846zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    UserAddress f48847zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    UserAddress f48848zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    InstrumentInfo[] f48849zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    PaymentMethodToken f48850zzk;

    private FullWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48840zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48841zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48842zzc, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48843zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f48844zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f48845zzf, i, false);
        SafeParcelWriter.writeStringArray(parcel, 8, this.f48846zzg, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f48847zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f48848zzi, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 11, this.f48849zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f48850zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public FullWallet(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzaj zzajVar, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) zza zzaVar, @SafeParcelable.Param(id = 7) zza zzaVar2, @SafeParcelable.Param(id = 8) String[] strArr, @SafeParcelable.Param(id = 9) UserAddress userAddress, @SafeParcelable.Param(id = 10) UserAddress userAddress2, @SafeParcelable.Param(id = 11) InstrumentInfo[] instrumentInfoArr, @SafeParcelable.Param(id = 12) PaymentMethodToken paymentMethodToken) {
        this.f48840zza = str;
        this.f48841zzb = str2;
        this.f48842zzc = zzajVar;
        this.f48843zzd = str3;
        this.f48844zze = zzaVar;
        this.f48845zzf = zzaVar2;
        this.f48846zzg = strArr;
        this.f48847zzh = userAddress;
        this.f48848zzi = userAddress2;
        this.f48849zzj = instrumentInfoArr;
        this.f48850zzk = paymentMethodToken;
    }
}
