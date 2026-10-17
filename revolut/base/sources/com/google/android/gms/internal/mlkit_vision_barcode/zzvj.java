package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "BarcodeParcelCreator")
public final class zzvj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvj> CREATOR = new zzvk();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFormat", id = 1)
    private final int f42592zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDisplayValue", id = 2)
    private final String f42593zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRawValue", id = 3)
    private final String f42594zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRawBytes", id = 4)
    private final byte[] f42595zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCornerPoints", id = 5)
    private final Point[] f42596zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getValueType", id = 6)
    private final int f42597zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEmailParcel", id = 7)
    private final zzvc f42598zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPhoneParcel", id = 8)
    private final zzvf f42599zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSmsParcel", id = 9)
    private final zzvg f42600zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWiFiParcel", id = 10)
    private final zzvi f42601zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUrlBookmarkParcel", id = 11)
    private final zzvh f42602zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGeoPointParcel", id = 12)
    private final zzvd f42603zzl;

    @SafeParcelable.Field(getter = "getCalendarEventParcel", id = 13)
    private final zzuz zzm;

    @SafeParcelable.Field(getter = "getContactInfoParcel", id = 14)
    private final zzva zzn;

    @SafeParcelable.Field(getter = "getDriverLicenseParcel", id = 15)
    private final zzvb zzo;

    @SafeParcelable.Constructor
    public zzvj(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) Point[] pointArr, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) zzvc zzvcVar, @SafeParcelable.Param(id = 8) zzvf zzvfVar, @SafeParcelable.Param(id = 9) zzvg zzvgVar, @SafeParcelable.Param(id = 10) zzvi zzviVar, @SafeParcelable.Param(id = 11) zzvh zzvhVar, @SafeParcelable.Param(id = 12) zzvd zzvdVar, @SafeParcelable.Param(id = 13) zzuz zzuzVar, @SafeParcelable.Param(id = 14) zzva zzvaVar, @SafeParcelable.Param(id = 15) zzvb zzvbVar) {
        this.f42592zza = i;
        this.f42593zzb = str;
        this.f42594zzc = str2;
        this.f42595zzd = bArr;
        this.f42596zze = pointArr;
        this.f42597zzf = i2;
        this.f42598zzg = zzvcVar;
        this.f42599zzh = zzvfVar;
        this.f42600zzi = zzvgVar;
        this.f42601zzj = zzviVar;
        this.f42602zzk = zzvhVar;
        this.f42603zzl = zzvdVar;
        this.zzm = zzuzVar;
        this.zzn = zzvaVar;
        this.zzo = zzvbVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f42592zza);
        SafeParcelWriter.writeString(parcel, 2, this.f42593zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f42594zzc, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f42595zzd, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f42596zze, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f42597zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f42598zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f42599zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f42600zzi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f42601zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f42602zzk, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f42603zzl, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzm, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzn, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzo, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f42592zza;
    }

    public final int zzb() {
        return this.f42597zzf;
    }

    public final zzuz zzc() {
        return this.zzm;
    }

    public final zzva zzd() {
        return this.zzn;
    }

    public final zzvb zze() {
        return this.zzo;
    }

    public final zzvc zzf() {
        return this.f42598zzg;
    }

    public final zzvd zzg() {
        return this.f42603zzl;
    }

    public final zzvf zzh() {
        return this.f42599zzh;
    }

    public final zzvg zzi() {
        return this.f42600zzi;
    }

    public final zzvh zzj() {
        return this.f42602zzk;
    }

    public final zzvi zzk() {
        return this.f42601zzj;
    }

    public final String zzl() {
        return this.f42593zzb;
    }

    public final String zzm() {
        return this.f42594zzc;
    }

    public final byte[] zzn() {
        return this.f42595zzd;
    }

    public final Point[] zzo() {
        return this.f42596zze;
    }
}
