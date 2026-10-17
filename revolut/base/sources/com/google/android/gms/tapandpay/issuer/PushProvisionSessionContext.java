package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PushProvisionSessionContextCreator")
public final class PushProvisionSessionContext extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PushProvisionSessionContext> CREATOR = new zzf();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServerSessionId", id = 1)
    private final String f48623zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceId", id = 2)
    private final String f48624zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWalletId", id = 3)
    private final String f48625zzc;

    @SafeParcelable.Constructor
    public PushProvisionSessionContext(@NonNull @SafeParcelable.Param(id = 1) String str, @NonNull @SafeParcelable.Param(id = 2) String str2, @NonNull @SafeParcelable.Param(id = 3) String str3) {
        this.f48623zza = str;
        this.f48624zzb = str2;
        this.f48625zzc = str3;
    }

    @NonNull
    public String getDeviceId() {
        return this.f48624zzb;
    }

    @NonNull
    public String getServerSessionId() {
        return this.f48623zza;
    }

    @NonNull
    public String getWalletId() {
        return this.f48625zzc;
    }

    @NonNull
    public String toString() {
        String str = this.f48623zza;
        String str2 = this.f48624zzb;
        return a.i(a.m("PushProvisionSessionContext{serverSessionId=", str, ", deviceId=", str2, ", walletId="), this.f48625zzc, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getServerSessionId(), false);
        SafeParcelWriter.writeString(parcel, 2, getDeviceId(), false);
        SafeParcelWriter.writeString(parcel, 3, getWalletId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
