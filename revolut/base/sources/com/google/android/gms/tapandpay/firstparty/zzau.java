package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TokenInfoCreator")
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final String f48535zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final String f48536zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final int f48537zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final TokenStatus f48538zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final String f48539zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    final Uri f48540zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    final byte[] f48541zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    final zzan[] f48542zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    final int f48543zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    final boolean f48544zzj;

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) TokenStatus tokenStatus, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) Uri uri2, @SafeParcelable.Param(id = 7) byte[] bArr, @SafeParcelable.Param(id = 8) zzan[] zzanVarArr, @SafeParcelable.Param(id = 9) int i2, @SafeParcelable.Param(id = 10) boolean z) {
        this.f48535zza = str;
        this.f48536zzb = str2;
        this.f48537zzc = i;
        this.f48538zzd = tokenStatus;
        this.f48539zze = str3;
        this.f48540zzf = uri2;
        this.f48541zzg = bArr;
        this.f48542zzh = zzanVarArr;
        this.f48543zzi = i2;
        this.f48544zzj = z;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzau) {
            zzau zzauVar = (zzau) obj2;
            if (Objects.equal(this.f48535zza, zzauVar.f48535zza) && Objects.equal(this.f48536zzb, zzauVar.f48536zzb) && this.f48537zzc == zzauVar.f48537zzc && Objects.equal(this.f48538zzd, zzauVar.f48538zzd) && Objects.equal(this.f48539zze, zzauVar.f48539zze) && Objects.equal(this.f48540zzf, zzauVar.f48540zzf) && Arrays.equals(this.f48541zzg, zzauVar.f48541zzg) && Arrays.equals(this.f48542zzh, zzauVar.f48542zzh) && this.f48543zzi == zzauVar.f48543zzi && this.f48544zzj == zzauVar.f48544zzj) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48535zza, this.f48536zzb, Integer.valueOf(this.f48537zzc), this.f48538zzd, this.f48539zze, this.f48540zzf, this.f48541zzg, this.f48542zzh, Integer.valueOf(this.f48543zzi), Boolean.valueOf(this.f48544zzj));
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("billingCardId", this.f48535zza).add("displayName", this.f48536zzb).add("cardNetwork", Integer.valueOf(this.f48537zzc)).add("tokenStatus", this.f48538zzd).add("panLastDigits", this.f48539zze).add("cardImageUrl", this.f48540zzf);
        byte[] bArr = this.f48541zzg;
        Objects.ToStringHelper toStringHelperAdd2 = toStringHelperAdd.add("inAppCardToken", bArr == null ? null : Arrays.toString(bArr));
        zzan[] zzanVarArr = this.f48542zzh;
        return toStringHelperAdd2.add("onlineAccountCardLinkInfos", zzanVarArr != null ? Arrays.toString(zzanVarArr) : null).add("tokenType", Integer.valueOf(this.f48543zzi)).add("supportsOdaTransit", Boolean.valueOf(this.f48544zzj)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48535zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f48536zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f48537zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48538zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48539zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f48540zzf, i, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.f48541zzg, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.f48542zzh, i, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f48543zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f48544zzj);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
