package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "TokenStatusCreator")
@SafeParcelable.Reserved({1})
public final class TokenStatus extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenStatus> CREATOR = new zzl();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final String f48668zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final int f48669zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final boolean f48670zzc;

    @SafeParcelable.Constructor
    public TokenStatus(@NonNull @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) boolean z) {
        this.f48668zza = str;
        this.f48669zzb = i;
        this.f48670zzc = z;
    }

    public int getTokenState() {
        return this.f48669zzb;
    }

    public boolean isSelected() {
        return this.f48670zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48668zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f48669zzb);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f48670zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
