package com.google.android.gms.internal.mlkit_common;

import j6.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzru extends zzsb {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f41181zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final boolean f41182zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f41183zzc;

    public /* synthetic */ zzru(String str, boolean z, int i, zzrt zzrtVar) {
        this.f41181zza = str;
        this.f41182zzb = z;
        this.f41183zzc = i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzsb) {
            zzsb zzsbVar = (zzsb) obj2;
            if (this.f41181zza.equals(zzsbVar.zzb()) && this.f41182zzb == zzsbVar.zzc() && this.f41183zzc == zzsbVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f41181zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.f41182zzb ? 1237 : 1231)) * 1000003) ^ this.f41183zzc;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb6.append(this.f41181zza);
        sb6.append(", enableFirelog=");
        sb6.append(this.f41182zzb);
        sb6.append(", firelogEventType=");
        return a.v(sb6, "}", this.f41183zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final int zza() {
        return this.f41183zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final String zzb() {
        return this.f41181zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsb
    public final boolean zzc() {
        return this.f41182zzb;
    }
}
