package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "GetSeFeatureReadinessStatusResponseCreator")
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new zzaj();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSeFeatureReadinessStatus", id = 1)
    private int f48293zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPendingIntent", id = 2)
    private PendingIntent f48294zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSeCards", id = 4)
    private byte[][] f48295zzc;

    private zzai() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzai) {
            zzai zzaiVar = (zzai) obj2;
            if (Objects.equal(Integer.valueOf(this.f48293zza), Integer.valueOf(zzaiVar.f48293zza)) && Objects.equal(this.f48294zzb, zzaiVar.f48294zzb) && Arrays.equals(this.f48295zzc, zzaiVar.f48295zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48293zza), this.f48294zzb, Integer.valueOf(Arrays.hashCode(this.f48295zzc)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48293zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48294zzb, i, false);
        SafeParcelWriter.writeByteArrayArray(parcel, 4, this.f48295zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzai(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) PendingIntent pendingIntent, @SafeParcelable.Param(id = 4) byte[][] bArr) {
        this.f48293zza = i;
        this.f48294zzb = pendingIntent;
        this.f48295zzc = bArr;
    }
}
