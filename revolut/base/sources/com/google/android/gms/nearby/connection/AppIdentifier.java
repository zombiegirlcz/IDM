package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AppIdentifierCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
public final class AppIdentifier extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AppIdentifier> CREATOR = new zzc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIdentifier", id = 1)
    private final String f47784zza;

    @SafeParcelable.Constructor
    public AppIdentifier(@NonNull @SafeParcelable.Param(id = 1) String str) {
        this.f47784zza = Preconditions.checkNotEmpty(str, "Missing application identifier value");
    }

    @NonNull
    public String getIdentifier() {
        return this.f47784zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getIdentifier(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
