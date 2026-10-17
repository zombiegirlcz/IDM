package com.google.android.gms.internal.mlkit_vision_barcode;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;

/* JADX INFO: loaded from: classes16.dex */
final class zzul extends zzut {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private int f42486zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f42487zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private float f42488zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private float f42489zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private boolean f42490zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private float f42491zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private float f42492zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private long f42493zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private long f42494zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private boolean f42495zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private float f42496zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private float f42497zzl;
    private short zzm;

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zza(boolean z) {
        this.f42495zzj = true;
        this.zzm = (short) (this.zzm | 512);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzb(float f) {
        this.f42492zzg = 0.8f;
        this.zzm = (short) (this.zzm | 64);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzc(float f) {
        this.f42491zzf = 0.5f;
        this.zzm = (short) (this.zzm | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzd(float f) {
        this.f42489zzd = 0.8f;
        this.zzm = (short) (this.zzm | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zze(int i) {
        this.f42487zzb = 5;
        this.zzm = (short) (this.zzm | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzf(float f) {
        this.f42488zzc = 0.25f;
        this.zzm = (short) (this.zzm | 4);
        return this;
    }

    public final zzut zzg(int i) {
        this.f42486zza = 10;
        this.zzm = (short) (this.zzm | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzh(long j2) {
        this.f42494zzi = CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
        this.zzm = (short) (this.zzm | 256);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzi(boolean z) {
        this.f42490zze = z;
        this.zzm = (short) (this.zzm | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzj(float f) {
        this.f42496zzk = 0.1f;
        this.zzm = (short) (this.zzm | 1024);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzk(long j2) {
        this.f42493zzh = 1500L;
        this.zzm = (short) (this.zzm | 128);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzut zzl(float f) {
        this.f42497zzl = 0.05f;
        this.zzm = (short) (this.zzm | 2048);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzut
    public final zzuu zzm() {
        if (this.zzm == 4095) {
            return new zzun(this.f42486zza, this.f42487zzb, this.f42488zzc, this.f42489zzd, this.f42490zze, this.f42491zzf, this.f42492zzg, this.f42493zzh, this.f42494zzi, this.f42495zzj, this.f42496zzk, this.f42497zzl, null);
        }
        StringBuilder sb6 = new StringBuilder();
        if ((this.zzm & 1) == 0) {
            sb6.append(" recentFramesToCheck");
        }
        if ((this.zzm & 2) == 0) {
            sb6.append(" recentFramesContainingPredictedArea");
        }
        if ((this.zzm & 4) == 0) {
            sb6.append(" recentFramesIou");
        }
        if ((this.zzm & 8) == 0) {
            sb6.append(" maxCoverage");
        }
        if ((this.zzm & 16) == 0) {
            sb6.append(" useConfidenceScore");
        }
        if ((this.zzm & 32) == 0) {
            sb6.append(" lowerConfidenceScore");
        }
        if ((this.zzm & 64) == 0) {
            sb6.append(" higherConfidenceScore");
        }
        if ((this.zzm & 128) == 0) {
            sb6.append(" zoomIntervalInMillis");
        }
        if ((this.zzm & 256) == 0) {
            sb6.append(" resetIntervalInMillis");
        }
        if ((this.zzm & 512) == 0) {
            sb6.append(" enableZoomThreshold");
        }
        if ((this.zzm & 1024) == 0) {
            sb6.append(" zoomInThreshold");
        }
        if ((this.zzm & 2048) == 0) {
            sb6.append(" zoomOutThreshold");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb6.toString()));
    }
}
