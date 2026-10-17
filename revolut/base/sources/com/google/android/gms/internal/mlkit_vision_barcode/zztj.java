package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
final class zztj extends zzto {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private String f42424zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f42425zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f42426zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private byte f42427zzd;

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzto
    public final zzto zza(boolean z) {
        this.f42425zzb = true;
        this.f42427zzd = (byte) (1 | this.f42427zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzto
    public final zzto zzb(int i) {
        this.f42426zzc = 1;
        this.f42427zzd = (byte) (this.f42427zzd | 2);
        return this;
    }

    public final zzto zzc(String str) {
        this.f42424zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzto
    public final zztp zzd() {
        String str;
        if (this.f42427zzd == 3 && (str = this.f42424zza) != null) {
            return new zztl(str, this.f42425zzb, this.f42426zzc, null);
        }
        StringBuilder sb6 = new StringBuilder();
        if (this.f42424zza == null) {
            sb6.append(" libraryName");
        }
        if ((this.f42427zzd & 1) == 0) {
            sb6.append(" enableFirelog");
        }
        if ((this.f42427zzd & 2) == 0) {
            sb6.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb6.toString()));
    }
}
