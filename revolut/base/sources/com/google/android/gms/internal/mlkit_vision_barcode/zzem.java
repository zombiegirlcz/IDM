package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes16.dex */
public final class zzem extends zzeo {
    public static zzev zza(Object obj2) {
        return new zzep(obj2);
    }

    public static void zzb(zzev zzevVar, zzek zzekVar, Executor executor) {
        zzevVar.zzj(new zzel(zzevVar, zzekVar), executor);
    }

    public static zzev zzc(zzup zzupVar, Executor executor) {
        zzey zzeyVar = new zzey(zzupVar);
        zzeyVar.run();
        return zzeyVar;
    }
}
