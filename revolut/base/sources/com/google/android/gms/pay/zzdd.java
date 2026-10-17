package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TransitPaymentOptionCreator")
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPaymentType", id = 1)
    private int f48395zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsGeneric", id = 2)
    private boolean f48396zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransitAgencyMapfactsId", id = 3)
    private String f48397zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransitAgencyIdentifier", id = 4)
    private String f48398zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTicketOption", id = 5)
    private zzcv f48399zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getOpenLoopMetadata", id = 6)
    private zzbe f48400zzf;

    private zzdd() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzdd) {
            zzdd zzddVar = (zzdd) obj2;
            if (Objects.equal(Integer.valueOf(this.f48395zza), Integer.valueOf(zzddVar.f48395zza)) && Objects.equal(Boolean.valueOf(this.f48396zzb), Boolean.valueOf(zzddVar.f48396zzb)) && Objects.equal(this.f48397zzc, zzddVar.f48397zzc) && Objects.equal(this.f48398zzd, zzddVar.f48398zzd) && Objects.equal(this.f48399zze, zzddVar.f48399zze) && Objects.equal(this.f48400zzf, zzddVar.f48400zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48395zza), Boolean.valueOf(this.f48396zzb), this.f48397zzc, this.f48398zzd, this.f48399zze, this.f48400zzf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48395zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f48396zzb);
        SafeParcelWriter.writeString(parcel, 3, this.f48397zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48398zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f48399zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f48400zzf, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzdd(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) zzcv zzcvVar, @SafeParcelable.Param(id = 6) zzbe zzbeVar) {
        this.f48395zza = i;
        this.f48396zzb = z;
        this.f48397zzc = str;
        this.f48398zzd = str2;
        this.f48399zze = zzcvVar;
        this.f48400zzf = zzbeVar;
    }
}
