package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* JADX INFO: loaded from: classes16.dex */
final class zzlv extends zzlz {
    @Override // com.google.android.gms.internal.nearby.zzlz, android.os.Parcelable.Creator
    /* JADX INFO: renamed from: zza */
    public final zzly createFromParcel(Parcel parcel) {
        zzly zzlyVarCreateFromParcel = super.createFromParcel(parcel);
        if (zzlyVarCreateFromParcel.f45436zzb != null) {
            zzlyVarCreateFromParcel.f45435zza = zzly.zzd(zzlyVarCreateFromParcel.f45436zzb);
        }
        return zzlyVarCreateFromParcel;
    }
}
