package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzbb extends zzaq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzbd f43486zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Object f43487zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f43488zzc;

    public zzbb(zzbd zzbdVar, int i) {
        this.f43486zza = zzbdVar;
        this.f43487zzb = zzbd.zzg(zzbdVar, i);
        this.f43488zzc = i;
    }

    private final void zza() {
        int i = this.f43488zzc;
        if (i == -1 || i >= this.f43486zza.size() || !zzx.zza(this.f43487zzb, zzbd.zzg(this.f43486zza, this.f43488zzc))) {
            this.f43488zzc = this.f43486zza.zzv(this.f43487zzb);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object getKey() {
        return this.f43487zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.f43486zza.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.f43487zzb);
        }
        zza();
        int i = this.f43488zzc;
        if (i == -1) {
            return null;
        }
        return zzbd.zzj(this.f43486zza, i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object setValue(Object obj2) {
        Map mapZzl = this.f43486zza.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.f43487zzb, obj2);
        }
        zza();
        int i = this.f43488zzc;
        if (i == -1) {
            this.f43486zza.put(this.f43487zzb, obj2);
            return null;
        }
        Object objZzj = zzbd.zzj(this.f43486zza, i);
        zzbd.zzm(this.f43486zza, this.f43488zzc, obj2);
        return objZzj;
    }
}
