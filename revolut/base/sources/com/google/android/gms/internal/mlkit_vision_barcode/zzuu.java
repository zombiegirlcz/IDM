package com.google.android.gms.internal.mlkit_vision_barcode;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzuu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzuu f42532zza = zzm().zzm();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final zzuu f42533zzb;

    static {
        zzut zzutVarZzm = zzm();
        zzutVarZzm.zzi(false);
        f42533zzb = zzutVarZzm.zzm();
    }

    public static zzut zzm() {
        zzul zzulVar = new zzul();
        zzulVar.zzg(10);
        zzulVar.zze(5);
        zzulVar.zzf(0.25f);
        zzulVar.zzd(0.8f);
        zzulVar.zzi(true);
        zzulVar.zzc(0.5f);
        zzulVar.zzb(0.8f);
        zzulVar.zzk(1500L);
        zzulVar.zzh(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS);
        zzulVar.zza(true);
        zzulVar.zzj(0.1f);
        zzulVar.zzl(0.05f);
        return zzulVar;
    }

    public abstract float zza();

    public abstract float zzb();

    public abstract float zzc();

    public abstract float zzd();

    public abstract float zze();

    public abstract float zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract long zzi();

    public abstract long zzj();

    public abstract boolean zzk();

    public abstract boolean zzl();
}
