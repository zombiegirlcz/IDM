package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "UwbConnectivityCapabilityCreator")
public final class zzog extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isStaticStsSupported", id = 1)
    private final boolean f45557zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isProvisionedStsSupported", id = 2)
    private final boolean f45558zzc;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzog f45556zza = new zzog(false, false);
    public static final Parcelable.Creator<zzog> CREATOR = new zzoh();

    @SafeParcelable.Constructor
    public zzog(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z3) {
        this.f45557zzb = z;
        this.f45558zzc = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzog)) {
            return false;
        }
        zzog zzogVar = (zzog) obj2;
        return this.f45557zzb == zzogVar.f45557zzb && this.f45558zzc == zzogVar.f45558zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f45557zzb), Boolean.valueOf(this.f45558zzc)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UwbConnectivityCapability<S-STS: " + this.f45557zzb + ", P-STS: " + this.f45558zzc + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.f45557zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f45558zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
