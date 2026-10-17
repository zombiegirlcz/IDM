package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j6.a;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "DeviceTypeCreator")
public final class zzny extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzny> CREATOR = new zznz();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getValue", id = 1)
    private final int f45537zza;

    @SafeParcelable.Constructor
    public zzny(@SafeParcelable.Param(id = 1) int i) {
        this.f45537zza = i;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof zzny) && this.f45537zza == ((zzny) obj2).f45537zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{22, Integer.valueOf(this.f45537zza)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a.l(this.f45537zza, "DataElement<type: DeviceType, value: ", ">");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f45537zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
