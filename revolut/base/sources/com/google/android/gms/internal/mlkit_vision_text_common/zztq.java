package com.google.android.gms.internal.mlkit_vision_text_common;

import j6.a;

/* JADX INFO: loaded from: classes16.dex */
final class zztq extends zztu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f44978zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final boolean f44979zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f44980zzc;

    public /* synthetic */ zztq(String str, boolean z, int i, zztp zztpVar) {
        this.f44978zza = str;
        this.f44979zzb = z;
        this.f44980zzc = i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zztu) {
            zztu zztuVar = (zztu) obj2;
            if (this.f44978zza.equals(zztuVar.zzb()) && this.f44979zzb == zztuVar.zzc() && this.f44980zzc == zztuVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f44978zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.f44979zzb ? 1237 : 1231)) * 1000003) ^ this.f44980zzc;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb6.append(this.f44978zza);
        sb6.append(", enableFirelog=");
        sb6.append(this.f44979zzb);
        sb6.append(", firelogEventType=");
        return a.v(sb6, "}", this.f44980zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztu
    public final int zza() {
        return this.f44980zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztu
    public final String zzb() {
        return this.f44978zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztu
    public final boolean zzc() {
        return this.f44979zzb;
    }
}
