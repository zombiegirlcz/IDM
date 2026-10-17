package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "UserChallengeRequestCreator")
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    final int f38891zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final String f38892zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final PendingIntent f38893zzc;

    @SafeParcelable.Constructor
    public zzbb(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) PendingIntent pendingIntent) {
        this.f38891zza = 1;
        this.f38892zzb = (String) Preconditions.checkNotNull(str);
        this.f38893zzc = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f38891zza);
        SafeParcelWriter.writeString(parcel, 2, this.f38892zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f38893zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }
}
