package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
final class zztl extends zztp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f42428zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final boolean f42429zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final int f42430zzc;

    public /* synthetic */ zztl(String str, boolean z, int i, zztk zztkVar) {
        this.f42428zza = str;
        this.f42429zzb = z;
        this.f42430zzc = i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof zztp) {
            zztp zztpVar = (zztp) obj2;
            if (this.f42428zza.equals(zztpVar.zzb()) && this.f42429zzb == zztpVar.zzc() && this.f42430zzc == zztpVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f42428zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.f42429zzb ? 1237 : 1231)) * 1000003) ^ this.f42430zzc;
    }

    public final String toString() {
        String str = this.f42428zza;
        boolean z = this.f42429zzb;
        int i = this.f42430zzc;
        StringBuilder sb6 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb6.append(str);
        sb6.append(", enableFirelog=");
        sb6.append(z);
        sb6.append(", firelogEventType=");
        return j6.a.v(sb6, "}", i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztp
    public final int zza() {
        return this.f42430zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztp
    public final String zzb() {
        return this.f42428zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztp
    public final boolean zzc() {
        return this.f42429zzb;
    }
}
