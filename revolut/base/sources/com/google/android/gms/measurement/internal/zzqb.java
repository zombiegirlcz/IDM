package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
public final class zzqb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqb> CREATOR = new zzqc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    public final int f47715zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final String f47716zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final long f47717zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public final Long f47718zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public final String f47719zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    public final String f47720zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    public final Double f47721zzg;

    @SafeParcelable.Constructor
    public zzqb(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j2, @SafeParcelable.Param(id = 4) Long l2, @SafeParcelable.Param(id = 5) Float f, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) Double d) {
        this.f47715zza = i;
        this.f47716zzb = str;
        this.f47717zzc = j2;
        this.f47718zzd = l2;
        this.f47721zzg = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.f47719zze = str2;
        this.f47720zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzqc.zza(this, parcel, i);
    }

    public final Object zza() {
        Long l2 = this.f47718zzd;
        if (l2 != null) {
            return l2;
        }
        Double d = this.f47721zzg;
        if (d != null) {
            return d;
        }
        String str = this.f47719zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzqb(zzqd zzqdVar) {
        this(zzqdVar.f47724zzc, zzqdVar.f47725zzd, zzqdVar.f47726zze, zzqdVar.f47723zzb);
    }

    public zzqb(String str, long j2, Object obj2, String str2) {
        Preconditions.checkNotEmpty(str);
        this.f47715zza = 2;
        this.f47716zzb = str;
        this.f47717zzc = j2;
        this.f47720zzf = str2;
        if (obj2 == null) {
            this.f47718zzd = null;
            this.f47721zzg = null;
            this.f47719zze = null;
            return;
        }
        if (obj2 instanceof Long) {
            this.f47718zzd = (Long) obj2;
            this.f47721zzg = null;
            this.f47719zze = null;
        } else if (obj2 instanceof String) {
            this.f47718zzd = null;
            this.f47721zzg = null;
            this.f47719zze = (String) obj2;
        } else {
            if (obj2 instanceof Double) {
                this.f47718zzd = null;
                this.f47721zzg = (Double) obj2;
                this.f47719zze = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
