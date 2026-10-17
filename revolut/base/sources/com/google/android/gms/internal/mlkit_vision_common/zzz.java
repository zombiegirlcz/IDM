package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes16.dex */
final class zzz extends zzr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzr f43444zza = new zzz(null, new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f43445zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f43446zzc;

    private zzz(Object obj2, Object[] objArr, int i) {
        this.f43445zzb = objArr;
        this.f43446zzc = i;
    }

    public static zzz zzg(int i, Object[] objArr, zzq zzqVar) {
        Object obj2 = objArr[0];
        obj2.getClass();
        Object obj3 = objArr[1];
        obj3.getClass();
        zzi.zza(obj2, obj3);
        return new zzz(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f43445zzb
            int r1 = r4.f43446zzc
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzz.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f43446zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    public final zzl zza() {
        return new zzy(this.f43445zzb, 1, this.f43446zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    public final zzs zzd() {
        return new zzw(this, this.f43445zzb, 0, this.f43446zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzr
    public final zzs zze() {
        return new zzx(this, new zzy(this.f43445zzb, 0, this.f43446zzc));
    }
}
