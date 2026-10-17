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
@SafeParcelable.Class(creator = "PayGlobalActionCardCreator")
public final class zzbt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbt> CREATOR = new zzbu();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardType", id = 1)
    private int f48336zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardId", id = 2)
    private String f48337zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardImage", id = 3)
    private Bitmap f48338zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getContentDescription", id = 4)
    private String f48339zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMessageText", id = 5)
    private String f48340zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceLockedMessageText", id = 8)
    private String f48341zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMessageIcon", id = 6)
    private Bitmap f48342zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPendingIntent", id = 7)
    private PendingIntent f48343zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPriority", id = 9)
    private int f48344zzi;

    private zzbt() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzbt) {
            zzbt zzbtVar = (zzbt) obj2;
            if (Objects.equal(Integer.valueOf(this.f48336zza), Integer.valueOf(zzbtVar.f48336zza)) && Objects.equal(this.f48337zzb, zzbtVar.f48337zzb) && Objects.equal(this.f48338zzc, zzbtVar.f48338zzc) && Objects.equal(this.f48339zzd, zzbtVar.f48339zzd) && Objects.equal(this.f48340zze, zzbtVar.f48340zze) && Objects.equal(this.f48341zzf, zzbtVar.f48341zzf) && Objects.equal(this.f48342zzg, zzbtVar.f48342zzg) && Objects.equal(this.f48343zzh, zzbtVar.f48343zzh) && Objects.equal(Integer.valueOf(this.f48344zzi), Integer.valueOf(zzbtVar.f48344zzi))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48336zza), this.f48337zzb, this.f48338zzc, this.f48339zzd, this.f48340zze, this.f48341zzf, this.f48342zzg, this.f48343zzh, Integer.valueOf(this.f48344zzi));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48336zza);
        SafeParcelWriter.writeString(parcel, 2, this.f48337zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48338zzc, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48339zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48340zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f48342zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f48343zzh, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.f48341zzf, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f48344zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbt(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) Bitmap bitmap, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 8) String str4, @SafeParcelable.Param(id = 6) Bitmap bitmap2, @SafeParcelable.Param(id = 7) PendingIntent pendingIntent, @SafeParcelable.Param(id = 9) int i2) {
        this.f48336zza = i;
        this.f48337zzb = str;
        this.f48338zzc = bitmap;
        this.f48339zzd = str2;
        this.f48340zze = str3;
        this.f48341zzf = str4;
        this.f48342zzg = bitmap2;
        this.f48343zzh = pendingIntent;
        this.f48344zzi = i2;
    }
}
