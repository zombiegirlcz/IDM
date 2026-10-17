package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j6.a;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "SequenceNumberCreator")
public final class zzoe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoe> CREATOR = new zzof();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getValue", id = 1)
    private final int f45555zza;

    @SafeParcelable.Constructor
    public zzoe(@SafeParcelable.Param(id = 1) int i) {
        boolean z = false;
        if (i >= 0 && i <= 15) {
            z = true;
        }
        Preconditions.checkArgument(z, "Sequence number should be 4 bits.");
        this.f45555zza = i;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof zzoe) && this.f45555zza == ((zzoe) obj2).f45555zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{19, Integer.valueOf(this.f45555zza)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a.l(this.f45555zza, "DataElement<type: ContextSequenceNumber, value: ", ">");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f45555zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
