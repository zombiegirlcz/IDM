package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes16.dex */
final class zzly extends zzmd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private String f43378zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f43379zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f43380zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private byte f43381zzd;

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzmd zza(boolean z) {
        this.f43379zzb = true;
        this.f43381zzd = (byte) (1 | this.f43381zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzmd zzb(int i) {
        this.f43380zzc = 1;
        this.f43381zzd = (byte) (this.f43381zzd | 2);
        return this;
    }

    public final zzmd zzc(String str) {
        this.f43378zza = "vision-common";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmd
    public final zzme zzd() {
        String str;
        if (this.f43381zzd == 3 && (str = this.f43378zza) != null) {
            return new zzma(str, this.f43379zzb, this.f43380zzc, null);
        }
        StringBuilder sb6 = new StringBuilder();
        if (this.f43378zza == null) {
            sb6.append(" libraryName");
        }
        if ((this.f43381zzd & 1) == 0) {
            sb6.append(" enableFirelog");
        }
        if ((this.f43381zzd & 2) == 0) {
            sb6.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb6.toString()));
    }
}
