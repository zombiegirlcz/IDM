package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "FidoAppIdExtensionCreator")
@SafeParcelable.Reserved({1})
public class FidoAppIdExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new zzx();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getAppId", id = 2)
    private final String f38512zza;

    @SafeParcelable.Constructor
    public FidoAppIdExtension(@NonNull @SafeParcelable.Param(id = 2) String str) {
        this.f38512zza = (String) Preconditions.checkNotNull(str);
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof FidoAppIdExtension) {
            return this.f38512zza.equals(((FidoAppIdExtension) obj2).f38512zza);
        }
        return false;
    }

    @NonNull
    public String getAppId() {
        return this.f38512zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.f38512zza);
    }

    @NonNull
    public final String toString() {
        return a.i(new StringBuilder("FidoAppIdExtension{appid='"), this.f38512zza, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getAppId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
