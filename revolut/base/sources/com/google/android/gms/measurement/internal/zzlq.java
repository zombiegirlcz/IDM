package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes16.dex */
final class zzlq implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzba f47379zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzlw f47380zzb;

    public zzlq(zzlw zzlwVar, zzba zzbaVar) {
        this.f47379zza = zzbaVar;
        this.f47380zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlw zzlwVar = this.f47380zzb;
        zzio zzioVar = zzlwVar.zzu;
        zzht zzhtVarZzm = zzioVar.zzm();
        zzio zzioVar2 = zzhtVarZzm.zzu;
        zzhtVarZzm.zzg();
        zzba zzbaVarZzf = zzhtVarZzm.zzf();
        zzba zzbaVar = this.f47379zza;
        if (!zzjx.zzs(zzbaVar.zza(), zzbaVarZzf.zza())) {
            zzioVar.zzaW().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzbaVar.zza()));
            return;
        }
        SharedPreferences.Editor editorEdit = zzhtVarZzm.zzb().edit();
        editorEdit.putString("dma_consent_settings", zzbaVar.zzj());
        editorEdit.apply();
        zzioVar.zzaW().zzj().zzb("Setting DMA consent(FE)", zzbaVar);
        zzio zzioVar3 = zzlwVar.zzu;
        if (zzioVar3.zzu().zzac()) {
            zzioVar3.zzu().zzU();
        } else {
            zzioVar3.zzu().zzR(false);
        }
    }
}
