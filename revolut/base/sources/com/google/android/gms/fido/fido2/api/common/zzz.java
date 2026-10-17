package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "GoogleMultiAssertionExtensionCreator")
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new zzaa();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRequestForMultiAssertion", id = 1)
    private final boolean f38640zza;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param(id = 1) boolean z) {
        this.f38640zza = ((Boolean) Preconditions.checkNotNull(Boolean.valueOf(z))).booleanValue();
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof zzz) && this.f38640zza == ((zzz) obj2).f38640zza;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f38640zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.f38640zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
