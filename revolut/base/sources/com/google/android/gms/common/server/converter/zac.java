package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "StringToIntConverterEntryCreator")
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new zae();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final String f38229zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final int f38230zac;

    @SafeParcelable.Constructor
    public zac(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2) {
        this.zaa = i;
        this.f38229zab = str;
        this.f38230zac = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeString(parcel, 2, this.f38229zab, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f38230zac);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zac(String str, int i) {
        this.zaa = 1;
        this.f38229zab = str;
        this.f38230zac = i;
    }
}
