package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j6.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PresenceActionCreator")
public final class zzoa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoa> CREATOR = new zzob();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getActionIdentifier", id = 1)
    private final int f45542zza;

    @SafeParcelable.Constructor
    public zzoa(@SafeParcelable.Param(id = 1) int i) {
        this.f45542zza = i;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof zzoa) && this.f45542zza == ((zzoa) obj2).f45542zza;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f45542zza));
    }

    public final String toString() {
        return a.t(new StringBuilder("PresenceAction[action="), this.f45542zza, ']');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f45542zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
