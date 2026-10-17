package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TransitCardCreator")
public final class zzcz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcz> CREATOR = new zzda();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardType", id = 1)
    private int f48378zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransitAgencyMapfactsId", id = 2)
    private String f48379zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMainImage", id = 3)
    private Bitmap f48380zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusImage", id = 4)
    private Bitmap f48381zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPrimaryText", id = 5)
    private String f48382zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSecondaryText", id = 6)
    private String f48383zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPendingIntent", id = 7)
    private PendingIntent f48384zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransitCardDialog", id = 8)
    private zzdb f48385zzh;

    private zzcz() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzcz) {
            zzcz zzczVar = (zzcz) obj2;
            if (Objects.equal(Integer.valueOf(this.f48378zza), Integer.valueOf(zzczVar.f48378zza)) && Objects.equal(this.f48379zzb, zzczVar.f48379zzb) && Objects.equal(this.f48380zzc, zzczVar.f48380zzc) && Objects.equal(this.f48381zzd, zzczVar.f48381zzd) && Objects.equal(this.f48382zze, zzczVar.f48382zze) && Objects.equal(this.f48383zzf, zzczVar.f48383zzf) && Objects.equal(this.f48384zzg, zzczVar.f48384zzg) && Objects.equal(this.f48385zzh, zzczVar.f48385zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48378zza), this.f48379zzb, this.f48380zzc, this.f48381zzd, this.f48382zze, this.f48383zzf, this.f48384zzg, this.f48385zzh);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48378zza);
        SafeParcelWriter.writeString(parcel, 2, this.f48379zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48380zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48381zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48382zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.f48383zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f48384zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f48385zzh, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzcz(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) Bitmap bitmap, @SafeParcelable.Param(id = 4) Bitmap bitmap2, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) String str3, @SafeParcelable.Param(id = 7) PendingIntent pendingIntent, @SafeParcelable.Param(id = 8) zzdb zzdbVar) {
        this.f48378zza = i;
        this.f48379zzb = str;
        this.f48380zzc = bitmap;
        this.f48381zzd = bitmap2;
        this.f48382zze = str2;
        this.f48383zzf = str3;
        this.f48384zzg = pendingIntent;
        this.f48385zzh = zzdbVar;
    }
}
