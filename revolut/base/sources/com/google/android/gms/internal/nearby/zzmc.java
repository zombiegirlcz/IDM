package com.google.android.gms.internal.nearby;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ParcelablePayloadCreator")
@SafeParcelable.Reserved({1000})
public final class zzmc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmc> CREATOR = new zzmd();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getId", id = 1)
    private long f45438zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getType", id = 2)
    private int f45439zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBytes", id = 3)
    private byte[] f45440zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDataPfd", id = 4)
    private ParcelFileDescriptor f45441zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getJavaFilePath", id = 5)
    private String f45442zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "-1", getter = "getJavaFileSize", id = 6)
    private long f45443zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusPfd", id = 7)
    private ParcelFileDescriptor f45444zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUri", id = 8)
    private Uri f45445zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getOffset", id = 9)
    private long f45446zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "getIsSensitive", id = 10)
    private boolean f45447zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSharedBytes", id = 11)
    private zzly f45448zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getPayloadSize", id = 12)
    private long f45449zzl;

    @SafeParcelable.Field(getter = "getFileName", id = 13)
    private String zzm;

    @SafeParcelable.Field(getter = "getParentFolder", id = 14)
    private String zzn;

    private zzmc() {
        this.f45443zzf = -1L;
        this.f45446zzi = 0L;
        this.f45447zzj = false;
        this.f45449zzl = 0L;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzmc) {
            zzmc zzmcVar = (zzmc) obj2;
            if (Objects.equal(Long.valueOf(this.f45438zza), Long.valueOf(zzmcVar.f45438zza)) && Objects.equal(Integer.valueOf(this.f45439zzb), Integer.valueOf(zzmcVar.f45439zzb)) && Arrays.equals(this.f45440zzc, zzmcVar.f45440zzc) && Objects.equal(this.f45441zzd, zzmcVar.f45441zzd) && Objects.equal(this.f45442zze, zzmcVar.f45442zze) && Objects.equal(Long.valueOf(this.f45443zzf), Long.valueOf(zzmcVar.f45443zzf)) && Objects.equal(this.f45444zzg, zzmcVar.f45444zzg) && Objects.equal(this.f45445zzh, zzmcVar.f45445zzh) && Objects.equal(Long.valueOf(this.f45446zzi), Long.valueOf(zzmcVar.f45446zzi)) && Objects.equal(Boolean.valueOf(this.f45447zzj), Boolean.valueOf(zzmcVar.f45447zzj)) && Objects.equal(this.f45448zzk, zzmcVar.f45448zzk) && Objects.equal(Long.valueOf(this.f45449zzl), Long.valueOf(zzmcVar.f45449zzl)) && Objects.equal(this.zzm, zzmcVar.zzm) && Objects.equal(this.zzn, zzmcVar.zzn)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f45438zza), Integer.valueOf(this.f45439zzb), Integer.valueOf(Arrays.hashCode(this.f45440zzc)), this.f45441zzd, this.f45442zze, Long.valueOf(this.f45443zzf), this.f45444zzg, this.f45445zzh, Long.valueOf(this.f45446zzi), Boolean.valueOf(this.f45447zzj), this.f45448zzk, Long.valueOf(this.f45449zzl), this.zzm, this.zzn);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f45438zza);
        SafeParcelWriter.writeInt(parcel, 2, this.f45439zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f45440zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f45441zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f45442zze, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f45443zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f45444zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f45445zzh, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.f45446zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f45447zzj);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f45448zzk, i, false);
        SafeParcelWriter.writeLong(parcel, 12, this.f45449zzl);
        SafeParcelWriter.writeString(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzn, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f45439zzb;
    }

    public final long zzb() {
        return this.f45438zza;
    }

    public final long zzc() {
        return this.f45443zzf;
    }

    public final Uri zzd() {
        return this.f45445zzh;
    }

    public final ParcelFileDescriptor zze() {
        return this.f45441zzd;
    }

    public final ParcelFileDescriptor zzf() {
        return this.f45444zzg;
    }

    public final zzly zzg() {
        return this.f45448zzk;
    }

    public final String zzh() {
        return this.f45442zze;
    }

    public final byte[] zzv() {
        return this.f45440zzc;
    }

    @SafeParcelable.Constructor
    public zzmc(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) long j3, @SafeParcelable.Param(id = 7) ParcelFileDescriptor parcelFileDescriptor2, @SafeParcelable.Param(id = 8) Uri uri2, @SafeParcelable.Param(id = 9) long j5, @SafeParcelable.Param(id = 10) boolean z, @SafeParcelable.Param(id = 11) zzly zzlyVar, @SafeParcelable.Param(id = 12) long j16, @SafeParcelable.Param(id = 13) String str2, @SafeParcelable.Param(id = 14) String str3) {
        this.f45438zza = j2;
        this.f45439zzb = i;
        this.f45440zzc = bArr;
        this.f45441zzd = parcelFileDescriptor;
        this.f45442zze = str;
        this.f45443zzf = j3;
        this.f45444zzg = parcelFileDescriptor2;
        this.f45445zzh = uri2;
        this.f45446zzi = j5;
        this.f45447zzj = z;
        this.f45448zzk = zzlyVar;
        this.f45449zzl = j16;
        this.zzm = str2;
        this.zzn = str3;
    }

    public /* synthetic */ zzmc(zzmb zzmbVar) {
        this.f45443zzf = -1L;
        this.f45446zzi = 0L;
        this.f45447zzj = false;
        this.f45449zzl = 0L;
    }
}
