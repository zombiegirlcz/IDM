package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
final class zzno extends zzns {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private String f44339zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f44340zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f44341zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private byte f44342zzd;

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzns
    public final zzns zza(boolean z) {
        this.f44340zzb = true;
        this.f44342zzd = (byte) (1 | this.f44342zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzns
    public final zzns zzb(int i) {
        this.f44341zzc = 1;
        this.f44342zzd = (byte) (this.f44342zzd | 2);
        return this;
    }

    public final zzns zzc(String str) {
        this.f44339zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzns
    public final zznt zzd() {
        String str;
        if (this.f44342zzd == 3 && (str = this.f44339zza) != null) {
            return new zznq(str, this.f44340zzb, this.f44341zzc, null);
        }
        StringBuilder sb6 = new StringBuilder();
        if (this.f44339zza == null) {
            sb6.append(" libraryName");
        }
        if ((this.f44342zzd & 1) == 0) {
            sb6.append(" enableFirelog");
        }
        if ((this.f44342zzd & 2) == 0) {
            sb6.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb6.toString()));
    }
}
