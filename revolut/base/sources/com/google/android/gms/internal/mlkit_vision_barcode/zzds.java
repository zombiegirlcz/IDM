package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
final class zzds extends zzcx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzcx f41346zza = new zzds(null, new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f41347zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f41348zzc;

    private zzds(Object obj2, Object[] objArr, int i) {
        this.f41347zzb = objArr;
        this.f41348zzc = i;
    }

    public static zzds zzg(int i, Object[] objArr, zzcw zzcwVar) {
        Object obj2 = objArr[0];
        obj2.getClass();
        Object obj3 = objArr[1];
        obj3.getClass();
        zzcb.zzb(obj2, obj3);
        return new zzds(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcx, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f41347zzb
            int r1 = r4.f41348zzc
            r2 = 0
            if (r5 != 0) goto L9
        L7:
            r5 = r2
            goto L1d
        L9:
            r3 = 1
            if (r1 != r3) goto L7
            r1 = 0
            r1 = r0[r1]
            r1.getClass()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L7
            r5 = r0[r3]
            r5.getClass()
        L1d:
            if (r5 != 0) goto L20
            return r2
        L20:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode.zzds.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f41348zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcx
    public final zzcq zza() {
        return new zzdr(this.f41347zzb, 1, this.f41348zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcx
    public final zzcy zzd() {
        return new zzdp(this, this.f41347zzb, 0, this.f41348zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcx
    public final zzcy zze() {
        return new zzdq(this, new zzdr(this.f41347zzb, 0, this.f41348zzc));
    }
}
