package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9, 16})
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzm();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final Scope[] f38051zza = new Scope[0];

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final Feature[] f38052zzb = new Feature[0];

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    final int f38053zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final int f38054zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final int f38055zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    String f38056zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    IBinder f38057zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", id = 6)
    Scope[] f38058zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", id = 7)
    Bundle f38059zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    Account f38060zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 10)
    Feature[] f38061zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 11)
    Feature[] f38062zzl;

    @SafeParcelable.Field(id = 12)
    final boolean zzm;

    @SafeParcelable.Field(defaultValue = "0", id = 13)
    final int zzn;

    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", id = 14)
    boolean zzo;

    @SafeParcelable.Field(getter = "getAttributionTag", id = 15)
    private final String zzp;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) Scope[] scopeArr, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 10) Feature[] featureArr, @SafeParcelable.Param(id = 11) Feature[] featureArr2, @SafeParcelable.Param(id = 12) boolean z, @SafeParcelable.Param(id = 13) int i5, @SafeParcelable.Param(id = 14) boolean z3, @SafeParcelable.Param(id = 15) String str2) {
        scopeArr = scopeArr == null ? f38051zza : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f38052zzb : featureArr;
        featureArr2 = featureArr2 == null ? f38052zzb : featureArr2;
        this.f38053zzc = i;
        this.f38054zzd = i2;
        this.f38055zze = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f38056zzf = "com.google.android.gms";
        } else {
            this.f38056zzf = str;
        }
        if (i < 2) {
            this.f38060zzj = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.f38057zzg = iBinder;
            this.f38060zzj = account;
        }
        this.f38058zzh = scopeArr;
        this.f38059zzi = bundle;
        this.f38061zzk = featureArr;
        this.f38062zzl = featureArr2;
        this.zzm = z;
        this.zzn = i5;
        this.zzo = z3;
        this.zzp = str2;
    }

    @KeepForSdk
    public String getAttributionTag() {
        return this.zzp;
    }

    @NonNull
    @KeepForSdk
    public String getCallingPackage() {
        return this.f38056zzf;
    }

    @NonNull
    @KeepForSdk
    public Feature[] getClientApiFeatures() {
        return this.f38062zzl;
    }

    @KeepForSdk
    public int getClientLibraryVersion() {
        return this.f38055zze;
    }

    @NonNull
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.f38059zzi;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }
}
