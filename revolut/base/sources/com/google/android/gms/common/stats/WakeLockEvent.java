package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
public final class WakeLockEvent extends StatsEvent {

    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    final int f38270zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTimeMillis", id = 2)
    private final long f38271zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEventType", id = 11)
    private final int f38272zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWakeLockName", id = 4)
    private final String f38273zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", id = 10)
    private final String f38274zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCodePackage", id = 17)
    private final String f38275zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWakeLockType", id = 5)
    private final int f38276zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallingPackages", id = 6)
    private final List f38277zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEventKey", id = 12)
    private final String f38278zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getElapsedRealtime", id = 8)
    private final long f38279zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceState", id = 14)
    private final int f38280zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHostPackage", id = 13)
    private final String f38281zzl;

    @SafeParcelable.Field(getter = "getBeginPowerPercentage", id = 15)
    private final float zzm;

    @SafeParcelable.Field(getter = "getTimeout", id = 16)
    private final long zzn;

    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", id = 18)
    private final boolean zzo;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 11) int i2, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) List list, @SafeParcelable.Param(id = 12) String str2, @SafeParcelable.Param(id = 8) long j3, @SafeParcelable.Param(id = 14) int i5, @SafeParcelable.Param(id = 10) String str3, @SafeParcelable.Param(id = 13) String str4, @SafeParcelable.Param(id = 15) float f, @SafeParcelable.Param(id = 16) long j5, @SafeParcelable.Param(id = 17) String str5, @SafeParcelable.Param(id = 18) boolean z) {
        this.f38270zza = i;
        this.f38271zzb = j2;
        this.f38272zzc = i2;
        this.f38273zzd = str;
        this.f38274zze = str3;
        this.f38275zzf = str5;
        this.f38276zzg = i3;
        this.f38277zzh = list;
        this.f38278zzi = str2;
        this.f38279zzj = j3;
        this.f38280zzk = i5;
        this.f38281zzl = str4;
        this.zzm = f;
        this.zzn = j5;
        this.zzo = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f38270zza);
        SafeParcelWriter.writeLong(parcel, 2, this.f38271zzb);
        SafeParcelWriter.writeString(parcel, 4, this.f38273zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f38276zzg);
        SafeParcelWriter.writeStringList(parcel, 6, this.f38277zzh, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f38279zzj);
        SafeParcelWriter.writeString(parcel, 10, this.f38274zze, false);
        SafeParcelWriter.writeInt(parcel, 11, this.f38272zzc);
        SafeParcelWriter.writeString(parcel, 12, this.f38278zzi, false);
        SafeParcelWriter.writeString(parcel, 13, this.f38281zzl, false);
        SafeParcelWriter.writeInt(parcel, 14, this.f38280zzk);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        SafeParcelWriter.writeString(parcel, 17, this.f38275zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zza() {
        return this.f38271zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zzb() {
        return this.f38272zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @NonNull
    public final String zzc() {
        List list = this.f38277zzh;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        int i = this.f38280zzk;
        String str = this.f38274zze;
        String str2 = this.f38281zzl;
        float f = this.zzm;
        String str3 = this.f38275zzf;
        int i2 = this.f38276zzg;
        String str4 = this.f38273zzd;
        boolean z = this.zzo;
        int length = String.valueOf(i).length() + String.valueOf(i2).length() + String.valueOf(str4).length() + 2 + 1 + String.valueOf(strJoin).length() + 1;
        if (str == null) {
            str = "";
        }
        int length2 = str.length() + length + 1 + 1;
        if (str2 == null) {
            str2 = "";
        }
        int length3 = String.valueOf(f).length() + str2.length() + length2 + 1 + 1;
        String str5 = str3 != null ? str3 : "";
        StringBuilder sb6 = new StringBuilder(str5.length() + length3 + 1 + String.valueOf(z).length());
        sb6.append("\t");
        sb6.append(str4);
        sb6.append("\t");
        sb6.append(i2);
        sb6.append("\t");
        sb6.append(strJoin);
        sb6.append("\t");
        sb6.append(i);
        j6.a.D(sb6, "\t", str, "\t", str2);
        sb6.append("\t");
        sb6.append(f);
        sb6.append("\t");
        sb6.append(str5);
        sb6.append("\t");
        sb6.append(z);
        return sb6.toString();
    }
}
