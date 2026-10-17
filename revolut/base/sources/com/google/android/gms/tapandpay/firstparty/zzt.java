package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "GetContactlessSetupStatusResponseCreator")
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final ContactlessSetupItem[] f48574zza;

    @SafeParcelable.Constructor
    public zzt(@SafeParcelable.Param(id = 1) ContactlessSetupItem[] contactlessSetupItemArr) {
        this.f48574zza = contactlessSetupItemArr;
    }

    public final String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        for (ContactlessSetupItem contactlessSetupItem : this.f48574zza) {
            stringHelper.add("type", Integer.valueOf(contactlessSetupItem.f48489zza));
            stringHelper.add("status", Integer.valueOf(contactlessSetupItem.f48490zzb));
        }
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 1, this.f48574zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
