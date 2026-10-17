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
@SafeParcelable.Class(creator = "OpenLoopMetadataCreator")
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDialogTitle", id = 1)
    private String f48311zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDialogText", id = 2)
    private String f48312zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getActionButtonText", id = 3)
    private String f48313zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAnimation", id = 4)
    private zzc f48314zzd;

    private zzbe() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj2;
            if (Objects.equal(this.f48311zza, zzbeVar.f48311zza) && Objects.equal(this.f48312zzb, zzbeVar.f48312zzb) && Objects.equal(this.f48313zzc, zzbeVar.f48313zzc) && Objects.equal(this.f48314zzd, zzbeVar.f48314zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48311zza, this.f48312zzb, this.f48313zzc, this.f48314zzd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48311zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f48312zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48313zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48314zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) zzc zzcVar) {
        this.f48311zza = str;
        this.f48312zzb = str2;
        this.f48313zzc = str3;
        this.f48314zzd = zzcVar;
    }
}
