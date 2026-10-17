package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "MethodInvocationCreator")
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();

    @SafeParcelable.Field(getter = "getMethodKey", id = 1)
    private final int zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultStatusCode", id = 2)
    private final int f38078zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionResultStatusCode", id = 3)
    private final int f38079zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 4)
    private final long f38080zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 5)
    private final long f38081zae;

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallingModuleId", id = 6)
    private final String f38082zaf;

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallingEntryPoint", id = 7)
    private final String f38083zag;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getServiceId", id = 8)
    private final int f38084zah;

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLatencyMillis", id = 9)
    private final int f38085zai;

    @KeepForSdk
    @Deprecated
    public MethodInvocation(int i, int i2, int i3, long j2, long j3, String str, String str2, int i5) {
        this(i, i2, i3, j2, j3, str, str2, i5, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.f38078zab);
        SafeParcelWriter.writeInt(parcel, 3, this.f38079zac);
        SafeParcelWriter.writeLong(parcel, 4, this.f38080zad);
        SafeParcelWriter.writeLong(parcel, 5, this.f38081zae);
        SafeParcelWriter.writeString(parcel, 6, this.f38082zaf, false);
        SafeParcelWriter.writeString(parcel, 7, this.f38083zag, false);
        SafeParcelWriter.writeInt(parcel, 8, this.f38084zah);
        SafeParcelWriter.writeInt(parcel, 9, this.f38085zai);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) long j2, @SafeParcelable.Param(id = 5) long j3, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) int i5, @SafeParcelable.Param(id = 9) int i6) {
        this.zaa = i;
        this.f38078zab = i2;
        this.f38079zac = i3;
        this.f38080zad = j2;
        this.f38081zae = j3;
        this.f38082zaf = str;
        this.f38083zag = str2;
        this.f38084zah = i5;
        this.f38085zai = i6;
    }
}
