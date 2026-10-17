package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes16.dex */
final class zzrs extends zzsa {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private String f41177zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f41178zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f41179zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private byte f41180zzd;

    @Override // com.google.android.gms.internal.mlkit_common.zzsa
    public final zzsa zza(boolean z) {
        this.f41178zzb = true;
        this.f41180zzd = (byte) (1 | this.f41180zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsa
    public final zzsa zzb(int i) {
        this.f41179zzc = 1;
        this.f41180zzd = (byte) (this.f41180zzd | 2);
        return this;
    }

    public final zzsa zzc(String str) {
        this.f41177zza = "common";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsa
    public final zzsb zzd() {
        String str;
        if (this.f41180zzd == 3 && (str = this.f41177zza) != null) {
            return new zzru(str, this.f41178zzb, this.f41179zzc, null);
        }
        StringBuilder sb6 = new StringBuilder();
        if (this.f41177zza == null) {
            sb6.append(" libraryName");
        }
        if ((this.f41180zzd & 1) == 0) {
            sb6.append(" enableFirelog");
        }
        if ((this.f41180zzd & 2) == 0) {
            sb6.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb6.toString()));
    }
}
