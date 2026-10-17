package com.google.android.gms.internal.measurement;

import v0.a;

/* JADX INFO: loaded from: classes.dex */
final class zzbw extends zzcc {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f39879zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final int f39880zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final int f39881zze;

    public /* synthetic */ zzbw(String str, boolean z, int i, zzbs zzbsVar, zzbt zzbtVar, int i2, zzbv zzbvVar) {
        this.f39879zzc = str;
        this.f39880zzd = i;
        this.f39881zze = i2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzcc) {
            zzcc zzccVar = (zzcc) obj2;
            if (this.f39879zzc.equals(zzccVar.zzc())) {
                zzccVar.zzd();
                int i = this.f39880zzd;
                int iZze = zzccVar.zze();
                if (i == 0) {
                    throw null;
                }
                if (i == iZze) {
                    zzccVar.zza();
                    zzccVar.zzb();
                    int i2 = this.f39881zze;
                    int iZzf = zzccVar.zzf();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (iZzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f39879zzc.hashCode() ^ 1000003;
        int i = this.f39880zzd;
        if (i == 0) {
            throw null;
        }
        int i2 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.f39881zze != 0) {
            return (i2 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.f39880zzd;
        return a.i(a.m("FileComplianceOptions{fileOwner=", this.f39879zzc, ", hasDifferentDmaOwner=false, fileChecks=", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS", ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose="), this.f39881zze == 1 ? "READ_AND_WRITE" : "null", "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final zzbs zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final zzbt zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final String zzc() {
        return this.f39879zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final int zze() {
        return this.f39880zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final int zzf() {
        return this.f39881zze;
    }
}
