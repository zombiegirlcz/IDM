package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes16.dex */
final class zzto extends zztt {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private String f44974zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f44975zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f44976zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private byte f44977zzd;

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztt zza(boolean z) {
        this.f44975zzb = true;
        this.f44977zzd = (byte) (1 | this.f44977zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztt zzb(int i) {
        this.f44976zzc = 1;
        this.f44977zzd = (byte) (this.f44977zzd | 2);
        return this;
    }

    public final zztt zzc(String str) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f44974zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztu zzd() {
        String str;
        if (this.f44977zzd == 3 && (str = this.f44974zza) != null) {
            return new zztq(str, this.f44975zzb, this.f44976zzc, null);
        }
        StringBuilder sb6 = new StringBuilder();
        if (this.f44974zza == null) {
            sb6.append(" libraryName");
        }
        if ((this.f44977zzd & 1) == 0) {
            sb6.append(" enableFirelog");
        }
        if ((this.f44977zzd & 2) == 0) {
            sb6.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb6.toString()));
    }
}
