package com.google.android.gms.internal.mlkit_vision_common;

import j6.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzma extends zzme {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f43382zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final boolean f43383zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f43384zzc;

    public /* synthetic */ zzma(String str, boolean z, int i, zzlz zzlzVar) {
        this.f43382zza = str;
        this.f43383zzb = z;
        this.f43384zzc = i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zzme) {
            zzme zzmeVar = (zzme) obj2;
            if (this.f43382zza.equals(zzmeVar.zzb()) && this.f43383zzb == zzmeVar.zzc() && this.f43384zzc == zzmeVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f43382zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.f43383zzb ? 1237 : 1231)) * 1000003) ^ this.f43384zzc;
    }

    public final String toString() {
        String str = this.f43382zza;
        boolean z = this.f43383zzb;
        int i = this.f43384zzc;
        StringBuilder sb6 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb6.append(str);
        sb6.append(", enableFirelog=");
        sb6.append(z);
        sb6.append(", firelogEventType=");
        return a.v(sb6, "}", i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final int zza() {
        return this.f43384zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final String zzb() {
        return this.f43382zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final boolean zzc() {
        return this.f43383zzb;
    }
}
