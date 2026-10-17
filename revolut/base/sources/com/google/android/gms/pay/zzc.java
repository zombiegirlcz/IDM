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
@SafeParcelable.Class(creator = "AnimationCreator")
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFormat", id = 1)
    private int f48348zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUrl", id = 2)
    private String f48349zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getShouldLoop", id = 3)
    private boolean f48350zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAccessibilityDescription", id = 4)
    private String f48351zzd;

    private zzc() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzc) {
            zzc zzcVar = (zzc) obj2;
            if (Objects.equal(Integer.valueOf(this.f48348zza), Integer.valueOf(zzcVar.f48348zza)) && Objects.equal(this.f48349zzb, zzcVar.f48349zzb) && Objects.equal(Boolean.valueOf(this.f48350zzc), Boolean.valueOf(zzcVar.f48350zzc)) && Objects.equal(this.f48351zzd, zzcVar.f48351zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48348zza), this.f48349zzb, Boolean.valueOf(this.f48350zzc), this.f48351zzd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48348zza);
        SafeParcelWriter.writeString(parcel, 2, this.f48349zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f48350zzc);
        SafeParcelWriter.writeString(parcel, 4, this.f48351zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) String str2) {
        this.f48348zza = i;
        this.f48349zzb = str;
        this.f48350zzc = z;
        this.f48351zzd = str2;
    }
}
