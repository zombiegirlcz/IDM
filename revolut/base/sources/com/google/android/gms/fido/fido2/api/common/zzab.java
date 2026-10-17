package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "GoogleSessionIdExtensionCreator")
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new zzac();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSessionId", id = 1)
    private final long f38617zza;

    @SafeParcelable.Constructor
    public zzab(@SafeParcelable.Param(id = 1) long j2) {
        this.f38617zza = ((Long) Preconditions.checkNotNull(Long.valueOf(j2))).longValue();
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof zzab) && this.f38617zza == ((zzab) obj2).f38617zza;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f38617zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j2 = this.f38617zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j2);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
