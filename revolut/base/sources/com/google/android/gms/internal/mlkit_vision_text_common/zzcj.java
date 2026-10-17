package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzcj extends zzbm {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient Object[] f44514zza;

    private zzcj(Object obj2, Object[] objArr, int i) {
        this.f44514zza = objArr;
    }

    public static zzcj zzg(int i, Object[] objArr, zzbl zzblVar) {
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        Object obj3 = objArr[1];
        Objects.requireNonNull(obj3);
        zzaq.zzb(obj2, obj3);
        return new zzcj(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L5
        L3:
            r4 = r0
            goto L19
        L5:
            java.lang.Object[] r1 = r3.f44514zza
            r2 = 0
            r2 = r1[r2]
            java.util.Objects.requireNonNull(r2)
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L3
            r4 = 1
            r4 = r1[r4]
            java.util.Objects.requireNonNull(r4)
        L19:
            if (r4 != 0) goto L1c
            return r0
        L1c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_text_common.zzcj.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm
    public final zzbf zza() {
        return new zzci(this.f44514zza, 1, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm
    public final zzbn zzd() {
        return new zzcg(this, this.f44514zza, 0, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm
    public final zzbn zze() {
        return new zzch(this, new zzci(this.f44514zza, 0, 1));
    }
}
