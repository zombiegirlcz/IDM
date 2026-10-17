package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzcj extends zzbv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcl f41297zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Object f41298zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f41299zzc;

    public zzcj(zzcl zzclVar, int i) {
        this.f41297zza = zzclVar;
        Object[] objArr = zzclVar.f41303zzb;
        objArr.getClass();
        this.f41298zzb = objArr[i];
        this.f41299zzc = i;
    }

    private final void zza() {
        int i = this.f41299zzc;
        if (i != -1 && i < this.f41297zza.size()) {
            Object obj2 = this.f41298zzb;
            zzcl zzclVar = this.f41297zza;
            int i2 = this.f41299zzc;
            Object[] objArr = zzclVar.f41303zzb;
            objArr.getClass();
            if (zzay.zza(obj2, objArr[i2])) {
                return;
            }
        }
        this.f41299zzc = this.f41297zza.zzq(this.f41298zzb);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv, java.util.Map.Entry
    public final Object getKey() {
        return this.f41298zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzj = this.f41297zza.zzj();
        if (mapZzj != null) {
            return mapZzj.get(this.f41298zzb);
        }
        zza();
        int i = this.f41299zzc;
        if (i == -1) {
            return null;
        }
        Object[] objArr = this.f41297zza.f41304zzc;
        objArr.getClass();
        return objArr[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbv, java.util.Map.Entry
    public final Object setValue(Object obj2) {
        Map mapZzj = this.f41297zza.zzj();
        if (mapZzj != null) {
            return mapZzj.put(this.f41298zzb, obj2);
        }
        zza();
        int i = this.f41299zzc;
        if (i == -1) {
            this.f41297zza.put(this.f41298zzb, obj2);
            return null;
        }
        Object[] objArr = this.f41297zza.f41304zzc;
        objArr.getClass();
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }
}
