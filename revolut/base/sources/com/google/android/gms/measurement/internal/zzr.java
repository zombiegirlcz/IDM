package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1, 13, 17, 20, 33})
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    @SafeParcelable.Field(defaultValue = "", id = 31)
    public final String zzA;

    @SafeParcelable.Field(id = 32)
    public final int zzB;

    @SafeParcelable.Field(id = 34)
    public final long zzC;

    @SafeParcelable.Field(id = 35)
    public final String zzD;

    @SafeParcelable.Field(defaultValue = "", id = 36)
    public final String zzE;

    @SafeParcelable.Field(id = 37)
    public final long zzF;

    @SafeParcelable.Field(id = 38)
    public final int zzG;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final String f47736zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final String f47737zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public final String f47738zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    public final String f47739zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public final long f47740zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    public final long f47741zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    public final String f47742zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "true", id = 9)
    public final boolean f47743zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    public final boolean f47744zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    public final long f47745zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    public final String f47746zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(id = 14)
    public final long f47747zzl;

    @SafeParcelable.Field(id = 15)
    public final int zzm;

    @SafeParcelable.Field(defaultValue = "true", id = 16)
    public final boolean zzn;

    @SafeParcelable.Field(id = 18)
    public final boolean zzo;

    @SafeParcelable.Field(id = 19)
    public final String zzp;

    @SafeParcelable.Field(id = 21)
    public final Boolean zzq;

    @SafeParcelable.Field(id = 22)
    public final long zzr;

    @SafeParcelable.Field(id = 23)
    public final List zzs;

    @SafeParcelable.Field(id = 24)
    public final String zzt;

    @SafeParcelable.Field(defaultValue = "", id = 25)
    public final String zzu;

    @SafeParcelable.Field(defaultValue = "", id = 26)
    public final String zzv;

    @SafeParcelable.Field(id = 27)
    public final String zzw;

    @SafeParcelable.Field(defaultValue = "false", id = 28)
    public final boolean zzx;

    @SafeParcelable.Field(id = 29)
    public final long zzy;

    @SafeParcelable.Field(defaultValue = "100", id = 30)
    public final int zzz;

    public zzr(String str, String str2, String str3, long j2, String str4, long j3, long j5, String str5, boolean z, boolean z3, String str6, long j16, int i, boolean z4, boolean z6, String str7, Boolean bool, long j22, List list, String str8, String str9, String str10, String str11, boolean z11, long j42, int i2, String str12, int i3, long j46, String str13, String str14, long j47, int i5) {
        Preconditions.checkNotEmpty(str);
        this.f47736zza = str;
        this.f47737zzb = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f47738zzc = str3;
        this.f47745zzj = j2;
        this.f47739zzd = str4;
        this.f47740zze = j3;
        this.f47741zzf = j5;
        this.f47742zzg = str5;
        this.f47743zzh = z;
        this.f47744zzi = z3;
        this.f47746zzk = str6;
        this.f47747zzl = j16;
        this.zzm = i;
        this.zzn = z4;
        this.zzo = z6;
        this.zzp = str7;
        this.zzq = bool;
        this.zzr = j22;
        this.zzs = list;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = str10;
        this.zzw = str11;
        this.zzx = z11;
        this.zzy = j42;
        this.zzz = i2;
        this.zzA = str12;
        this.zzB = i3;
        this.zzC = j46;
        this.zzD = str13;
        this.zzE = str14;
        this.zzF = j47;
        this.zzG = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f47736zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.f47737zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.f47738zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.f47739zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f47740zze);
        SafeParcelWriter.writeLong(parcel, 7, this.f47741zzf);
        SafeParcelWriter.writeString(parcel, 8, this.f47742zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f47743zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f47744zzi);
        SafeParcelWriter.writeLong(parcel, 11, this.f47745zzj);
        SafeParcelWriter.writeString(parcel, 12, this.f47746zzk, false);
        SafeParcelWriter.writeLong(parcel, 14, this.f47747zzl);
        SafeParcelWriter.writeInt(parcel, 15, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.writeString(parcel, 19, this.zzp, false);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.zzq, false);
        SafeParcelWriter.writeLong(parcel, 22, this.zzr);
        SafeParcelWriter.writeStringList(parcel, 23, this.zzs, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzt, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzu, false);
        SafeParcelWriter.writeString(parcel, 26, this.zzv, false);
        SafeParcelWriter.writeString(parcel, 27, this.zzw, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.zzx);
        SafeParcelWriter.writeLong(parcel, 29, this.zzy);
        SafeParcelWriter.writeInt(parcel, 30, this.zzz);
        SafeParcelWriter.writeString(parcel, 31, this.zzA, false);
        SafeParcelWriter.writeInt(parcel, 32, this.zzB);
        SafeParcelWriter.writeLong(parcel, 34, this.zzC);
        SafeParcelWriter.writeString(parcel, 35, this.zzD, false);
        SafeParcelWriter.writeString(parcel, 36, this.zzE, false);
        SafeParcelWriter.writeLong(parcel, 37, this.zzF);
        SafeParcelWriter.writeInt(parcel, 38, this.zzG);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) long j2, @SafeParcelable.Param(id = 7) long j3, @SafeParcelable.Param(id = 8) String str5, @SafeParcelable.Param(id = 9) boolean z, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) long j5, @SafeParcelable.Param(id = 12) String str6, @SafeParcelable.Param(id = 14) long j16, @SafeParcelable.Param(id = 15) int i, @SafeParcelable.Param(id = 16) boolean z4, @SafeParcelable.Param(id = 18) boolean z6, @SafeParcelable.Param(id = 19) String str7, @SafeParcelable.Param(id = 21) Boolean bool, @SafeParcelable.Param(id = 22) long j22, @SafeParcelable.Param(id = 23) List list, @SafeParcelable.Param(id = 24) String str8, @SafeParcelable.Param(id = 25) String str9, @SafeParcelable.Param(id = 26) String str10, @SafeParcelable.Param(id = 27) String str11, @SafeParcelable.Param(id = 28) boolean z11, @SafeParcelable.Param(id = 29) long j42, @SafeParcelable.Param(id = 30) int i2, @SafeParcelable.Param(id = 31) String str12, @SafeParcelable.Param(id = 32) int i3, @SafeParcelable.Param(id = 34) long j46, @SafeParcelable.Param(id = 35) String str13, @SafeParcelable.Param(id = 36) String str14, @SafeParcelable.Param(id = 37) long j47, @SafeParcelable.Param(id = 38) int i5) {
        this.f47736zza = str;
        this.f47737zzb = str2;
        this.f47738zzc = str3;
        this.f47745zzj = j5;
        this.f47739zzd = str4;
        this.f47740zze = j2;
        this.f47741zzf = j3;
        this.f47742zzg = str5;
        this.f47743zzh = z;
        this.f47744zzi = z3;
        this.f47746zzk = str6;
        this.f47747zzl = j16;
        this.zzm = i;
        this.zzn = z4;
        this.zzo = z6;
        this.zzp = str7;
        this.zzq = bool;
        this.zzr = j22;
        this.zzs = list;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = str10;
        this.zzw = str11;
        this.zzx = z11;
        this.zzy = j42;
        this.zzz = i2;
        this.zzA = str12;
        this.zzB = i3;
        this.zzC = j46;
        this.zzD = str13;
        this.zzE = str14;
        this.zzF = j47;
        this.zzG = i5;
    }
}
