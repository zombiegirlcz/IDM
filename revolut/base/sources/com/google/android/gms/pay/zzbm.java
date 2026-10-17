package com.google.android.gms.pay;

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
@SafeParcelable.Class(creator = "PayApiErrorCreator")
public final class zzbm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbm> CREATOR = new zzbn();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTitle", id = 1)
    private String f48326zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getContent", id = 2)
    private String f48327zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRetryable", id = 3)
    private boolean f48328zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getErrorPayload", id = 4)
    private byte[] f48329zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCardCentricPassesErrorCode", id = 5)
    private int f48330zze;

    private zzbm() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzbm) {
            zzbm zzbmVar = (zzbm) obj2;
            if (Objects.equal(this.f48326zza, zzbmVar.f48326zza) && Objects.equal(this.f48327zzb, zzbmVar.f48327zzb) && Objects.equal(Boolean.valueOf(this.f48328zzc), Boolean.valueOf(zzbmVar.f48328zzc)) && Arrays.equals(this.f48329zzd, zzbmVar.f48329zzd) && Objects.equal(Integer.valueOf(this.f48330zze), Integer.valueOf(zzbmVar.f48330zze))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48326zza, this.f48327zzb, Boolean.valueOf(this.f48328zzc), Integer.valueOf(Arrays.hashCode(this.f48329zzd)), Integer.valueOf(this.f48330zze));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48326zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f48327zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f48328zzc);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f48329zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f48330zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbm(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) int i) {
        this.f48326zza = str;
        this.f48327zzb = str2;
        this.f48328zzc = z;
        this.f48329zzd = bArr;
        this.f48330zze = i;
    }
}
