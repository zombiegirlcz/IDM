package com.google.android.gms.internal.mlkit_common;

import ch.j;

/* JADX INFO: loaded from: classes16.dex */
final class zzrv extends zzsi {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private zzmu f41184zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private String f41185zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private boolean f41186zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f41187zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private j f41188zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzna f41189zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private int f41190zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private byte f41191zzh;

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zza(zzna zznaVar) {
        if (zznaVar == null) {
            throw new NullPointerException("Null downloadStatus");
        }
        this.f41189zzf = zznaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzb(zzmu zzmuVar) {
        if (zzmuVar == null) {
            throw new NullPointerException("Null errorCode");
        }
        this.f41184zza = zzmuVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzc(int i) {
        this.f41190zzg = i;
        this.f41191zzh = (byte) (this.f41191zzh | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzd(j jVar) {
        if (jVar == null) {
            throw new NullPointerException("Null modelType");
        }
        this.f41188zze = jVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zze(boolean z) {
        this.f41187zzd = z;
        this.f41191zzh = (byte) (this.f41191zzh | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsi zzf(boolean z) {
        this.f41186zzc = z;
        this.f41191zzh = (byte) (this.f41191zzh | 1);
        return this;
    }

    public final zzsi zzg(String str) {
        this.f41185zzb = "NA";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsi
    public final zzsj zzh() {
        zzmu zzmuVar;
        String str;
        j jVar;
        zzna zznaVar;
        if (this.f41191zzh == 7 && (zzmuVar = this.f41184zza) != null && (str = this.f41185zzb) != null && (jVar = this.f41188zze) != null && (zznaVar = this.f41189zzf) != null) {
            return new zzrx(zzmuVar, str, this.f41186zzc, this.f41187zzd, jVar, zznaVar, this.f41190zzg, null);
        }
        StringBuilder sb6 = new StringBuilder();
        if (this.f41184zza == null) {
            sb6.append(" errorCode");
        }
        if (this.f41185zzb == null) {
            sb6.append(" tfliteSchemaVersion");
        }
        if ((this.f41191zzh & 1) == 0) {
            sb6.append(" shouldLogRoughDownloadTime");
        }
        if ((this.f41191zzh & 2) == 0) {
            sb6.append(" shouldLogExactDownloadTime");
        }
        if (this.f41188zze == null) {
            sb6.append(" modelType");
        }
        if (this.f41189zzf == null) {
            sb6.append(" downloadStatus");
        }
        if ((this.f41191zzh & 4) == 0) {
            sb6.append(" failureStatusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb6.toString()));
    }
}
