package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
final class zznq extends zznt {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f44343zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final boolean f44344zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f44345zzc;

    public /* synthetic */ zznq(String str, boolean z, int i, zznp zznpVar) {
        this.f44343zza = str;
        this.f44344zzb = z;
        this.f44345zzc = i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zznt) {
            zznt zzntVar = (zznt) obj2;
            if (this.f44343zza.equals(zzntVar.zzb()) && this.f44344zzb == zzntVar.zzc() && this.f44345zzc == zzntVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f44343zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.f44344zzb ? 1237 : 1231)) * 1000003) ^ this.f44345zzc;
    }

    public final String toString() {
        String str = this.f44343zza;
        boolean z = this.f44344zzb;
        int i = this.f44345zzc;
        StringBuilder sb6 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb6.append(str);
        sb6.append(", enableFirelog=");
        sb6.append(z);
        sb6.append(", firelogEventType=");
        return j6.a.v(sb6, "}", i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final int zza() {
        return this.f44345zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final String zzb() {
        return this.f44343zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznt
    public final boolean zzc() {
        return this.f44344zzb;
    }
}
