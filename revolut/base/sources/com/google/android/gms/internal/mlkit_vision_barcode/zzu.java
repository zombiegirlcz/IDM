package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "BarcodeCreator")
@SafeParcelable.Reserved({1})
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public int f42462zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public String f42463zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public String f42464zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    public int f42465zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public Point[] f42466zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    public zzn f42467zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    public zzq f42468zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    public zzr f42469zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    public zzt f42470zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    public zzs f42471zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    public zzo f42472zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(id = 13)
    public zzk f42473zzl;

    @SafeParcelable.Field(id = 14)
    public zzl zzm;

    @SafeParcelable.Field(id = 15)
    public zzm zzn;

    @SafeParcelable.Field(id = 16)
    public byte[] zzo;

    @SafeParcelable.Field(id = 17)
    public boolean zzp;

    @SafeParcelable.Field(id = 18)
    public double zzq;

    public zzu() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f42462zza);
        SafeParcelWriter.writeString(parcel, 3, this.f42463zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.f42464zzc, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f42465zzd);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.f42466zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f42467zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f42468zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f42469zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f42470zzi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f42471zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f42472zzk, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.f42473zzl, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzn, i, false);
        SafeParcelWriter.writeByteArray(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.writeDouble(parcel, 18, this.zzq);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzu(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) int i2, @SafeParcelable.Param(id = 6) Point[] pointArr, @SafeParcelable.Param(id = 7) zzn zznVar, @SafeParcelable.Param(id = 8) zzq zzqVar, @SafeParcelable.Param(id = 9) zzr zzrVar, @SafeParcelable.Param(id = 10) zzt zztVar, @SafeParcelable.Param(id = 11) zzs zzsVar, @SafeParcelable.Param(id = 12) zzo zzoVar, @SafeParcelable.Param(id = 13) zzk zzkVar, @SafeParcelable.Param(id = 14) zzl zzlVar, @SafeParcelable.Param(id = 15) zzm zzmVar, @SafeParcelable.Param(id = 16) byte[] bArr, @SafeParcelable.Param(id = 17) boolean z, @SafeParcelable.Param(id = 18) double d) {
        this.f42462zza = i;
        this.f42463zzb = str;
        this.zzo = bArr;
        this.f42464zzc = str2;
        this.f42465zzd = i2;
        this.f42466zze = pointArr;
        this.zzp = z;
        this.zzq = d;
        this.f42467zzf = zznVar;
        this.f42468zzg = zzqVar;
        this.f42469zzh = zzrVar;
        this.f42470zzi = zztVar;
        this.f42471zzj = zzsVar;
        this.f42472zzk = zzoVar;
        this.f42473zzl = zzkVar;
        this.zzm = zzlVar;
        this.zzn = zzmVar;
    }
}
