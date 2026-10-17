package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
@KeepName
@SafeParcelable.Class(creator = "CommonWalletObjectCreator")
@SafeParcelable.Reserved({1})
public class CommonWalletObject extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new zzc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    String f48964zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    String f48965zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    String f48966zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    String f48967zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    String f48968zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    String f48969zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    String f48970zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    @Deprecated
    String f48971zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    int f48972zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 11)
    final ArrayList f48973zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    TimeInterval f48974zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 13)
    final ArrayList f48975zzl;

    @SafeParcelable.Field(id = 14)
    @Deprecated
    String zzm;

    @SafeParcelable.Field(id = 15)
    @Deprecated
    String zzn;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 16)
    final ArrayList zzo;

    @SafeParcelable.Field(id = 17)
    boolean zzp;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 18)
    final ArrayList zzq;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 19)
    final ArrayList zzr;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", id = 20)
    final ArrayList zzs;

    public CommonWalletObject() {
        this.f48973zzj = ArrayUtils.newArrayList();
        this.f48975zzl = ArrayUtils.newArrayList();
        this.zzo = ArrayUtils.newArrayList();
        this.zzq = ArrayUtils.newArrayList();
        this.zzr = ArrayUtils.newArrayList();
        this.zzs = ArrayUtils.newArrayList();
    }

    public static zzb zzb() {
        return new zzb(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48964zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48965zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48966zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48967zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.f48968zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.f48969zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.f48970zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.f48971zzh, false);
        SafeParcelWriter.writeInt(parcel, 10, this.f48972zzi);
        SafeParcelWriter.writeTypedList(parcel, 11, this.f48973zzj, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f48974zzk, i, false);
        SafeParcelWriter.writeTypedList(parcel, 13, this.f48975zzl, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeTypedList(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.writeTypedList(parcel, 18, this.zzq, false);
        SafeParcelWriter.writeTypedList(parcel, 19, this.zzr, false);
        SafeParcelWriter.writeTypedList(parcel, 20, this.zzs, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f48972zzi;
    }

    @NonNull
    public final TimeInterval zzc() {
        return this.f48974zzk;
    }

    @NonNull
    public final String zzd() {
        return this.f48968zze;
    }

    @NonNull
    @Deprecated
    public final String zze() {
        return this.f48971zzh;
    }

    @NonNull
    public final String zzf() {
        return this.f48969zzf;
    }

    @NonNull
    public final String zzg() {
        return this.f48970zzg;
    }

    @NonNull
    public final String zzh() {
        return this.f48965zzb;
    }

    @NonNull
    public final String zzi() {
        return this.f48964zza;
    }

    @NonNull
    @Deprecated
    public final String zzj() {
        return this.zzn;
    }

    @NonNull
    @Deprecated
    public final String zzk() {
        return this.zzm;
    }

    @NonNull
    public final String zzl() {
        return this.f48967zzd;
    }

    @NonNull
    public final String zzm() {
        return this.f48966zzc;
    }

    @NonNull
    public final ArrayList zzn() {
        return this.zzq;
    }

    @NonNull
    public final ArrayList zzo() {
        return this.zzo;
    }

    @NonNull
    public final ArrayList zzp() {
        return this.zzs;
    }

    @NonNull
    public final ArrayList zzq() {
        return this.f48975zzl;
    }

    @NonNull
    public final ArrayList zzr() {
        return this.f48973zzj;
    }

    @NonNull
    public final ArrayList zzs() {
        return this.zzr;
    }

    public final boolean zzt() {
        return this.zzp;
    }

    @SafeParcelable.Constructor
    public CommonWalletObject(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) String str8, @SafeParcelable.Param(id = 10) int i, @SafeParcelable.Param(id = 11) ArrayList arrayList, @SafeParcelable.Param(id = 12) TimeInterval timeInterval, @SafeParcelable.Param(id = 13) ArrayList arrayList2, @SafeParcelable.Param(id = 14) String str9, @SafeParcelable.Param(id = 15) String str10, @SafeParcelable.Param(id = 16) ArrayList arrayList3, @SafeParcelable.Param(id = 17) boolean z, @SafeParcelable.Param(id = 18) ArrayList arrayList4, @SafeParcelable.Param(id = 19) ArrayList arrayList5, @SafeParcelable.Param(id = 20) ArrayList arrayList6) {
        this.f48964zza = str;
        this.f48965zzb = str2;
        this.f48966zzc = str3;
        this.f48967zzd = str4;
        this.f48968zze = str5;
        this.f48969zzf = str6;
        this.f48970zzg = str7;
        this.f48971zzh = str8;
        this.f48972zzi = i;
        this.f48973zzj = arrayList;
        this.f48974zzk = timeInterval;
        this.f48975zzl = arrayList2;
        this.zzm = str9;
        this.zzn = str10;
        this.zzo = arrayList3;
        this.zzp = z;
        this.zzq = arrayList4;
        this.zzr = arrayList5;
        this.zzs = arrayList6;
    }
}
