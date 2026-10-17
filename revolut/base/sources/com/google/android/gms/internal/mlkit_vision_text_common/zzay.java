package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzay extends zzam {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzba f44461zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Object f44462zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f44463zzc;

    public zzay(zzba zzbaVar, int i) {
        this.f44461zza = zzbaVar;
        this.f44462zzb = zzba.zzg(zzbaVar, i);
        this.f44463zzc = i;
    }

    private final void zza() {
        int i = this.f44463zzc;
        if (i == -1 || i >= this.f44461zza.size() || !zzw.zza(this.f44462zzb, zzba.zzg(this.f44461zza, this.f44463zzc))) {
            this.f44463zzc = this.f44461zza.zzw(this.f44462zzb);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object getKey() {
        return this.f44462zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.f44461zza.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.f44462zzb);
        }
        zza();
        int i = this.f44463zzc;
        if (i == -1) {
            return null;
        }
        return zzba.zzj(this.f44461zza, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzam, java.util.Map.Entry
    public final Object setValue(Object obj2) {
        Map mapZzl = this.f44461zza.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.f44462zzb, obj2);
        }
        zza();
        int i = this.f44463zzc;
        if (i == -1) {
            this.f44461zza.put(this.f44462zzb, obj2);
            return null;
        }
        zzba zzbaVar = this.f44461zza;
        Object objZzj = zzba.zzj(zzbaVar, i);
        zzba.zzn(zzbaVar, this.f44463zzc, obj2);
        return objZzj;
    }
}
