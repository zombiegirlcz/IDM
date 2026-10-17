package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Supplier;
import j6.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzjj extends zzkg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Context f40319zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Supplier f40320zzb;

    public zzjj(Context context, Supplier supplier) {
        this.f40319zza = context;
        this.f40320zzb = supplier;
    }

    public final boolean equals(Object obj2) {
        Supplier supplier;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj2;
            if (this.f40319zza.equals(zzkgVar.zza()) && ((supplier = this.f40320zzb) != null ? supplier.equals(zzkgVar.zzb()) : zzkgVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f40319zza.hashCode() ^ 1000003;
        Supplier supplier = this.f40320zzb;
        return (iHashCode * 1000003) ^ (supplier == null ? 0 : supplier.hashCode());
    }

    public final String toString() {
        return a.s("FlagsContext{context=", this.f40319zza.toString(), ", hermeticFileOverrides=", String.valueOf(this.f40320zzb), "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final Context zza() {
        return this.f40319zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkg
    public final Supplier zzb() {
        return this.f40320zzb;
    }
}
