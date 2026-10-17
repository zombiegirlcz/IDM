package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "ContactlessSetupItemCreator")
public final class ContactlessSetupItem extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ContactlessSetupItem> CREATOR = new zzi();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final int f48489zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final int f48490zzb;

    @SafeParcelable.Constructor
    public ContactlessSetupItem(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.f48489zza = i;
        this.f48490zzb = i2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof ContactlessSetupItem) {
            ContactlessSetupItem contactlessSetupItem = (ContactlessSetupItem) obj2;
            if (this.f48489zza == contactlessSetupItem.f48489zza && this.f48490zzb == contactlessSetupItem.f48490zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48489zza), Integer.valueOf(this.f48490zzb));
    }

    @NonNull
    public final String toString() {
        return Objects.toStringHelper(this).add("type", Integer.valueOf(this.f48489zza)).add("status", Integer.valueOf(this.f48490zzb)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48489zza);
        SafeParcelWriter.writeInt(parcel, 2, this.f48490zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
